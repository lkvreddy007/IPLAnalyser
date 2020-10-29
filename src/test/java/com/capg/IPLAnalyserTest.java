package com.capg;

import java.util.List;

import org.junit.Test;

import com.capg.dto.AllRounder;
import com.capg.dto.Batsman;
import com.capg.dto.Bowler;
import com.capg.dto.IPLAnalyserException;
import com.capg.service.AllRounderComparator;
import com.capg.service.BatsmanSorterComparators;
import com.capg.service.BowlerSorterComparators;
import com.capg.service.IPLAnalyser;

import junit.framework.Assert;

public class IPLAnalyserTest {
	
	private static final String BATSMAN_CSV_FILE_PATH = "./src/test/resources/MostRuns.csv";
	private static final String BOWLER_CSV_FILE_PATH = "./src/test/resources/MostWkts.csv";
	IPLAnalyser iplAnalyser = new IPLAnalyser();
	BatsmanSorterComparators batsmenComparator = new BatsmanSorterComparators();
	BowlerSorterComparators bowlerComparator = new BowlerSorterComparators();
	AllRounderComparator allRounderComparator = new AllRounderComparator();
	
	@Test
	public void givenBatsmenData_ShouldReturnNoOfBatsman() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			Assert.assertEquals(101, batsmenList.size());
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC1
	@Test
	public void givenBatsmenData_ShouldSortBatsmenByBattingAverages() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sort(batsmenComparator.sortByBattingAverage(), batsmenList);
			Assert.assertEquals("MS Dhoni", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC2
	@Test
	public void givenBatsmenData_ShouldSortBatsmenByStrikeRate() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sort(batsmenComparator.sortByStrikeRate(), batsmenList);
			Assert.assertEquals("Ishant Sharma", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC3
	@Test
	public void givenBatsmenData_ShouldSortBatsmenByNumberofSixesAndFours() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sort(batsmenComparator.sortByMax4sAnd6s(), batsmenList);
			Assert.assertEquals("Andre Russell", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC4
	@Test
	public void givenBatsmenData_ShouldSortBatsmenByMaximumNumberofSixesAndFoursAndMaxStrikeRate() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sort(batsmenComparator.sortByMax4sAnd6sAndHighStrikeRate(), batsmenList);
			Assert.assertEquals("Andre Russell", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC5
	@Test
	public void givenBatsmenData_ShouldSortBatsmenByMaxAverageAndMaxStrikeRate() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sort(batsmenComparator.sortByAverageAndHighStrikeRate(), batsmenList);
			Assert.assertEquals("MS Dhoni", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC6
	@Test
	public void givenBatsmenData_ShouldSortBatsmenByRunsAndBestAverage() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sort(batsmenComparator.sortByRunsAndAverage(), batsmenList);
			Assert.assertEquals("David Warner", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC7
	@Test
	public void givenBowlerData_ShouldSortBowlersByAverage() {
		try {
			List<Bowler> bowlerList = iplAnalyser.loadCsvFile(BOWLER_CSV_FILE_PATH, Bowler.class);
			List<Bowler> sortedList = iplAnalyser.sort(bowlerComparator.sortByBowlingAverage(), bowlerList);
			Assert.assertEquals("Krishnappa Gowtham", sortedList.get(98).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC8
	@Test
	public void givenBowlerData_ShouldSortBowlersByStrikeRate() {
		try {
			List<Bowler> bowlerList = iplAnalyser.loadCsvFile(BOWLER_CSV_FILE_PATH, Bowler.class);
			List<Bowler> sortedList = iplAnalyser.sort(bowlerComparator.sortByBowlerStrikeRate(), bowlerList);
			Assert.assertEquals("Krishnappa Gowtham", sortedList.get(98).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC9
	@Test
	public void givenBowlerData_ShouldSortBowlersByEconomy() {
		try {
			List<Bowler> bowlerList = iplAnalyser.loadCsvFile(BOWLER_CSV_FILE_PATH, Bowler.class);
			List<Bowler> sortedList = iplAnalyser.sort(bowlerComparator.sortByBowlerEconomy(), bowlerList);
			Assert.assertEquals("Shivam Dube", sortedList.get(0).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC10
	@Test
	public void givenBowlerData_ShouldSortBowlersByStrikeRatesAnd4wAnd5w() {
		try {
			List<Bowler> bowlerList = iplAnalyser.loadCsvFile(BOWLER_CSV_FILE_PATH, Bowler.class);
			List<Bowler> sortedList = iplAnalyser.sort(bowlerComparator.sortByBowlerStrikeRateAnd4wAnd5w(), bowlerList);
			Assert.assertEquals("Krishnappa Gowtham", sortedList.get(98).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC11
	@Test
	public void givenBowlerData_ShouldSortBowlersByBowlingAverageAndStrikeRates() {
		try {
			List<Bowler> bowlerList = iplAnalyser.loadCsvFile(BOWLER_CSV_FILE_PATH, Bowler.class);
			List<Bowler> sortedList = iplAnalyser.sort(bowlerComparator.sortByBowlerAverageAndStrikeRate(), bowlerList);
			Assert.assertEquals("Krishnappa Gowtham", sortedList.get(98).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC12
	@Test
	public void givenBowlerData_ShouldSortBowlersByNumOfWicketsAndAverages() {
		try {
			List<Bowler> bowlerList = iplAnalyser.loadCsvFile(BOWLER_CSV_FILE_PATH, Bowler.class);
			List<Bowler> sortedList = iplAnalyser.sort(bowlerComparator.sortByBowlerNumOfWicketsAndAverages(), bowlerList);
			Assert.assertEquals("Imran Tahir", sortedList.get(98).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC13
	@Test
	public void givenBothBatsmanAndBowlerData_ShouldSortCricketersByBothBattingAnBowlingAverages() {
		try {
			List<AllRounder> allRounderList = iplAnalyser.loadAllRounders();
			List<AllRounder> sortedList = iplAnalyser.sort(allRounderComparator.sortByCricketersBattingAnBowlingAverages(), allRounderList);
			Assert.assertEquals("Marcus Stoinis", sortedList.get(sortedList.size()-1).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC14
	@Test
	public void givenBothBatsmanAndBowlerData_ShouldSortCricketersByRunsAndWickets() {
		try {
			List<AllRounder> allRounderList = iplAnalyser.loadAllRounders();
			List<AllRounder> sortedList = iplAnalyser.sort(allRounderComparator.sortByAllRounderRunsAndWickets(), allRounderList);
			Assert.assertEquals("Hardik Pandya", sortedList.get(sortedList.size()-1).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	//UC15
	@Test
	public void givenBatsmandData_ShouldSortCricketersByHundredsAndBattingAverages() {
		try {
			List<Batsman> batsmenList = iplAnalyser.loadCsvFile(BATSMAN_CSV_FILE_PATH, Batsman.class);
			List<Batsman> sortedList = iplAnalyser.sort(batsmenComparator.sortByCenturiesAndAverage(), batsmenList);
			Assert.assertEquals("David Warner", sortedList.get(100).player);
		} catch (IPLAnalyserException e) {
			e.printStackTrace();
		}
	}

}
