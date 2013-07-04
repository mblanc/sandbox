package com.matthieublanc.sandbox;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.matthieublanc.sandbox.codility.CannonBalls;

public class CannonBallsTest {

	// ([1, 2, 0, 4, 3, 2, 1, 5, 7], [2, 8, 0, 7, 6, 5, 3, 4, 5, 6, 5]) 2, 2, 2, 4, 3, 3, 5, 6, 7

	private CannonBalls cannonBalls;

	@Before
	public void setUp() {
		cannonBalls = new CannonBalls();
	}

	@Test
	public void test1() {
		int[] ground = new int[] { 1, 2, 0, 4, 3, 2, 1, 5, 7 };
		int[] diskcannonHeights = new int[] { 2, 8, 0, 7, 6, 5, 3, 4, 5, 6, 5 };
		int[] solution = cannonBalls.solution(ground, diskcannonHeights);
		System.out.println(Arrays.asList(solution));
		assertThat(solution, equalTo(new int[] { 2, 2, 2, 4, 3, 3, 5, 6, 7 }));
	}

}
