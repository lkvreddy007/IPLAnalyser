package com.capg.service;

import java.util.Comparator;

import com.capg.dto.Batsman;

public class BatsmanSorterComparators {

	public Comparator<Batsman> sortByBattingAverage() {
		return Comparator.comparing(batsman->batsman.average);
	}
	
}
