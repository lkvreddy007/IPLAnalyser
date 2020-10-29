package com.capg.service;

import java.util.Comparator;

import com.capg.dto.Batsman;

public class BatsmanSorterComparators {

	public Comparator<Batsman> sortByBattingAverage() {
		return Comparator.comparing(batsman -> batsman.average);
	}

	public Comparator<Batsman> sortByStrikeRate() {
		return Comparator.comparing(batsman -> batsman.strikeRate);
	}

	public Comparator<Batsman> sortByMax4sAnd6s() {
		return Comparator.comparing(batsman -> batsman.fours + batsman.sixes);
	}

	public Comparator<Batsman> sortByMax4sAnd6sAndHighStrikeRate() {
		return this.sortByMax4sAnd6s().thenComparing(this.sortByStrikeRate());
	}

	public Comparator<Batsman> sortByAverageAndHighStrikeRate() {
		return this.sortByBattingAverage().thenComparing(this.sortByStrikeRate());
	}

	public Comparator<Batsman> sortByRuns() {
		return Comparator.comparing(batsman -> batsman.runs);
	}

	public Comparator<Batsman> sortByRunsAndAverage() {
		return this.sortByRuns().thenComparing(this.sortByBattingAverage());
	}

	public Comparator<Batsman> sortByCenturiesAndAverage() {
		return Comparator.comparing(batsman -> batsman.centuries * batsman.average);
	}
	
}
