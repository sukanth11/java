package com.voya.sample;

import org.junit.jupiter.api.Tag;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.voya.testcases.CalculatorTest;
import com.voya.training.Calculator;
import com.voya.training.Student;

//@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.voya.testcases"})
//@IncludePackages({"com.voya.testcases.trail"})
//@ExcludePackages({"com.voya.testcases.trail"})
//@SelectClasses({CalculatorTest.class})
//@ExcludeTags({"first"})
public class AllTests {

}
