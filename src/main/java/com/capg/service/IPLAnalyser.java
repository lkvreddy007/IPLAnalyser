package com.capg.service;

import java.util.Comparator;
import java.util.List;

import com.capg.dto.IPLAnalyserException;
import com.capg.dto.Batsman;
import com.capg.dto.CsvLoader;

public class IPLAnalyser<E> {
	
	public static void main(String[] args) {
		System.out.println("Welcome to IPL Analyser");
	}

	public List<E> loadCsvFile(String csvFilePath, Class<E> csvClass) throws IPLAnalyserException {
		return new CsvLoader<E>().csvFileLoader(csvFilePath, csvClass);
	}
	
	public List<Batsman> sortBatsmenData(Comparator<Batsman> comparator, List<Batsman> csvList){
		for(int j=0;j<csvList.size();j++) {
			for(int i=0;i<csvList.size()-1;i++) {
				Batsman player1 = csvList.get(i);
				Batsman player2 = csvList.get(i+1);
				if(comparator.compare(player1, player2)>0) {
					csvList.set(i, player2);
					csvList.set(i+1, player1);
				}
			}
		}
		return csvList;
	}
	
}
