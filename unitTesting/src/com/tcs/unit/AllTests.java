package com.tcs.unit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestCalculator.class,TestCalculator2.class,TestCalculator3.class,TestCalculator4.class
	,TestCalculator5.class})
public class AllTests {

}
