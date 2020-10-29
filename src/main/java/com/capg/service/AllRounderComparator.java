package com.capg.service;

import java.util.Comparator;

import com.capg.dto.AllRounder;

public class AllRounderComparator {

	public Comparator<AllRounder> sortByCricketersBattingAnBowlingAverages() {
		return Comparator.comparing(allrounder->allrounder.battingAverage*allrounder.bowlingAverage);
	}

}
