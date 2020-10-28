package com.capg.service;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.capg.CSVBuilderFactory;
import com.capg.CSVException;
import com.capg.ICSVBuilder;
import com.capg.dto.Batsman;
import com.capg.dto.IPLAnalyserException;
import com.capg.dto.IPLAnalyserException.ExceptionType;

public class IPLAnalyser {
	
	List<Batsman> csvBatsmanFileList = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Welcome to IPL Analyser");
	}

	public int loadBatsmanData(String csvFilePath) throws IPLAnalyserException {
		if(!csvFilePath.contains(".csv")) {
			throw new IPLAnalyserException("Invalid File Type(.csv required)", ExceptionType.INVALID_FILE_FORMAT);
		}
		try(Reader reader = Files.newBufferedReader(Paths.get(csvFilePath))) {
			ICSVBuilder csvBuilder=CSVBuilderFactory.createCSVBuilder();
			csvBatsmanFileList = csvBuilder.getCSVList(reader,Batsman.class);
			return this.csvBatsmanFileList.size();
		}
		catch (IOException e) {
			throw new IPLAnalyserException("Census File Problem", ExceptionType.CENSUS_FILE_PROBLEM);
		}
		catch (NullPointerException e) {
			throw new IPLAnalyserException("Null Data", ExceptionType.NULL_VALUES_ENCOUNTERED);
		}
		catch(RuntimeException e) {
			throw new IPLAnalyserException("Invalid Delimiter", ExceptionType.ERROR_IN_FILE);
		}
		catch(CSVException e) {
			throw new IPLAnalyserException("Unable to parse", ExceptionType.UNABLE_TO_PARSE);
		}		
	}
}
