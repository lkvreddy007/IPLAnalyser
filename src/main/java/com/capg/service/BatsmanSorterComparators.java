package com.capg.service;

import java.util.Comparator;

import com.capg.dto.Batsman;

public class BatsmanSorterComparators {

	public Comparator<Batsman> sortByBattingAverage() {
		return Comparator.comparing(batsman->batsman.average);
	}

	public Comparator<Batsman> sortByStrikeRate() {
		return Comparator.comparing(batsman->batsman.strikeRate);
	}

	public Comparator<Batsman> sortByMax4sAnd6s() {
		return Comparator.comparing(batsman->batsman.fours+batsman.sixes);
	}
	
}
