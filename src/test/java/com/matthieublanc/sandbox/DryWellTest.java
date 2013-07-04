package com.matthieublanc.sandbox;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DryWellTest {

	private DryWell dryWell;

	@Before
	public void setUp() {
		dryWell = new DryWell();
	}

	@Test
	public void test1() {
		int [] well = new  int[] {5, 6, 4, 3, 6, 2, 3};
		int [] disks = new  int[] {2, 3, 5, 2, 4};
		int solution = dryWell.solution(well, disks);
		assertThat(solution, equalTo(4));
	}
	
	@Test
	public void test2() {
		int [] well = new  int[] {5, 6, 4, 3, 6, 2, 3};
		int [] disks = new  int[] {6, 3, 5, 2, 4};
		int solution = dryWell.solution(well, disks);
		assertThat(solution, equalTo(0));
	}

}
