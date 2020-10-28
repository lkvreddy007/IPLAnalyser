package com.capg;

import org.junit.Test;

import com.capg.dto.IPLAnalyserException;
import com.capg.service.IPLAnalyser;

import junit.framework.Assert;

public class IPLAnalyserTest {
	
	private static final String BATSMAN_CSV_FILE_PATH = "./src/test/resources/MostRuns.csv";
	IPLAnalyser iplAnalyser = new IPLAnalyser();
	
	@Test
	public void givenBatsmenData_ShouldReturnNoOfBatsman() {
		try {
			int numOfBatsmen = iplAnalyser.loadBatsmanData(BATSMAN_CSV_FILE_PATH);
			Assert.assertEquals(101, numOfBatsmen);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
}
