package com.capg;

import java.util.List;

import org.junit.Test;

import com.capg.dto.Batsman;
import com.capg.dto.IPLAnalyserException;
import com.capg.service.BatsmanSorterComparators;
import com.capg.service.IPLAnalyser;

import junit.framework.Assert;

public class IPLAnalyserTest {
	
	private static final String BATSMAN_CSV_FILE_PATH = "./src/test/resources/MostRuns.csv";
	IPLAnalyser iplAnalyser = new IPLAnalyser();
	BatsmanSorterComparators batsmenComparator = new BatsmanSorterComparators();
	
	@Test
	public void givenBatsmenData_ShouldReturnNoOfBatsman() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			Assert.assertEquals(101, batsmenList.size());
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenBatsmenData_ShouldReturnHighestBattingAverage() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sortBatsmenData(batsmenComparator.sortByBattingAverage(), batsmenList);
			Assert.assertEquals("MS Dhoni", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenBatsmenData_ShouldReturnHighestStrikeRate() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sortBatsmenData(batsmenComparator.sortByStrikeRate(), batsmenList);
			Assert.assertEquals("Ishant Sharma", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenBatsmenData_ShouldReturnMaximumNumberofSixesAndFours() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sortBatsmenData(batsmenComparator.sortByMax4sAnd6s(), batsmenList);
			Assert.assertEquals("Andre Russell", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
}
