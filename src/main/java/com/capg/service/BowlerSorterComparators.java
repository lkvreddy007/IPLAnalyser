package com.capg.service;

import java.util.Comparator;

import com.capg.dto.Bowler;

public class BowlerSorterComparators {

	public Comparator<Bowler> sortByBowlingAverages() {
		return Comparator.comparing(bowler->bowler.average);
	}

}
