package com.matthieublanc.sandbox;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class OpenedShopTest {

    private OpenedShop openedShop;
	
	@Before
    public void setUp() {
		openedShop = new OpenedShop();
    }

    @Test
    public void test1() {
    	int[] A = new int[] { 9, 4, 3, 1, 7, 0, 5, 10, 8, 6, 2, 10, 2, 5, 1, 10, 2, 6, 1, 6, 3, 3, 0, 8, 6, 9, 4, 6, 2, 4 };
    	int[] B = new int[] { 5, 1, 8, 9, 6, 4, 8, 8, 10, 6, 3, 10, 4, 6, 7, 7, 6, 3, 1, 4, 4, 8, 7, 7, 1, 1, 4, 6, 4, 8 };
    	int[] C = new int[] { 10, 11, 5, 11, 3, 9, 1, 2, 2, 5, 7, 5, 7, 1, 5, 12, 5, 9, 11, 2, 3, 8, 6, 10, 7, 9, 12, 7, 4, 4 };
    	int[] D = new int[] { -1, 977, 999999999, 17, 8, 683, 8, 5, 12, 808, 191 };
        assertThat(openedShop.solution(A, B, C, D), equalTo(10));
    }
    
    @Test
    public void test2() {
    	int[] A = new int[] { 0, 1, 2, 1 };
    	int[] B = new int[] { 1, 2, 3, 3 };
    	int[] C = new int[] { 2, 3, 4, 5 };
    	int[] D = new int[] { -1, 1, -1, 8 };
        assertThat(openedShop.solution(A, B, C, D), equalTo(7));
    }

}
