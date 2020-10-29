package com.capg.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.capg.dto.IPLAnalyserException;
import com.capg.dto.AllRounder;
import com.capg.dto.Batsman;
import com.capg.dto.Bowler;
import com.capg.dto.CsvLoader;

public class IPLAnalyser<E> {
	
	public static void main(String[] args) {
		System.out.println("Welcome to IPL Analyser");
	}

	public List<E> loadCsvFile(String csvFilePath, Class<E> csvClass) throws IPLAnalyserException {
		return new CsvLoader<E>().csvFileLoader(csvFilePath, csvClass);
	}
	
	public List<E> sort(Comparator<E> comparator, List<E> csvList){
		for(int j = 0;j<csvList.size();j++) {
			for(int i = 0;i<csvList.size()-1;i++) {
				E player1 = csvList.get(i);
				E player2 = csvList.get(i+1);
				if(comparator.compare(player1, player2)>0) {
					csvList.set(i, player2);
					csvList.set(i+1, player1);
				}
			}
		}
		return csvList;
	}

	public List<AllRounder> loadAllRounders() throws IPLAnalyserException {
		String batsmanCsvFile = "./src/test/resources/MostRuns.csv";
		String bowlerCsvFile = "./src/test/resources/MostWkts.csv";
		IPLAnalyser iplAnalyser = new IPLAnalyser();
		List<Batsman> batsmanList = iplAnalyser.loadCsvFile(batsmanCsvFile, Batsman.class);
		List<Bowler> bowlerList = iplAnalyser.loadCsvFile(bowlerCsvFile, Bowler.class);
		List<AllRounder> allRounderList = new ArrayList<AllRounder>();
		for(Batsman bat : batsmanList) {
			for(Bowler bow : bowlerList) {
				if(bat.player.equals(bow.player)) {
					allRounderList.add(new AllRounder(bat.player, bat.average, bow.average, bat.runs, bow.wickets));
				}
			}
		}
		return allRounderList;
	}
	
}
