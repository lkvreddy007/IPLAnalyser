package com.capg.service;

import java.util.Comparator;

import com.capg.dto.Batsman;

public class SorterComparators {

	public Comparator<Batsman> sortByBattingAverage() {
		return Comparator.comparing(batsman->batsman.average);
	}

	public Comparator<Batsman> sortByStrikeRate() {
		return Comparator.comparing(batsman->batsman.strikeRate);
	}

	public Comparator<Batsman> sortByMax4sAnd6s() {
		return Comparator.comparing(batsman->batsman.fours+batsman.sixes);
	}

	public Comparator sortByMax4sAnd6sAndHighStrikeRate() {
		return this.sortByMax4sAnd6s().thenComparing(this.sortByStrikeRate());
	}

	public Comparator sortByAverageAndHighStrikeRate() {
		return this.sortByBattingAverage().thenComparing(this.sortByStrikeRate());
	}
	
}
