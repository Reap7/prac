package com.simpleFactory.factory;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Annotation.class, JUnitFlowTest.class, SimpleFactoryTest.class })
public class AllTests {

}
