package com.zemoso.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import javax.sound.sampled.AudioInputStream;

@RunWith(Suite.class)
@Suite.SuiteClasses({ArraysCompareTest.class,QuickBeforeAfter.class,QuickBeforeAfterClass.class})
public class TestSuit2 {
}
