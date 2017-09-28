package com.ubs.opsit.interviews;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MyConverterTest {
	MyConverter converter = new MyConverter();
	
	@Test
	public void test_isValidTime_ForCorrectValue(){
		//Given
		String input ="05:45:34";
		
		//When
		boolean actualValid = converter.isValidTime(input);
		
		//then
		assertThat(actualValid).isEqualTo(true);
		
	}
	
	@Test
	public void test_isValidTime_ForInvalidValue(){
		//Given
		String input ="05:45:";
		
		//When
		boolean actualValid = converter.isValidTime(input);
		
		//then
		assertThat(actualValid).isEqualTo(false);
		
	}
	
	@Test
	public void test_getRowString_ForHourRow_withOneLampIluminated(){
		//Given
		int maxLampCount = 4;
		String colorCode = "R";
		int noOfIluminatedLamp = 1;
		
		//When
		String actualString = converter.getRowString(noOfIluminatedLamp, maxLampCount, colorCode);
		
		//then
		assertThat(actualString).isEqualTo("ROOO");
		
	}
	
	@Test
	public void test_getRowString_ForHourRow_withTwoLampIluminated(){
		//Given
		int maxLampCount = 4;
		String colorCode = "R";
		int noOfIluminatedLamp = 2;
		
		//When
		String actualString = converter.getRowString(noOfIluminatedLamp, maxLampCount, colorCode);
		
		//then
		assertThat(actualString).isEqualTo("RROO");
		
	}
	
	@Test
	public void test_getRowString_ForHourRow_withThreeLampIluminated(){
		//Given
		int maxLampCount = 4;
		String colorCode = "R";
		int noOfIluminatedLamp = 3;
		
		//When
		String actualString = converter.getRowString(noOfIluminatedLamp, maxLampCount, colorCode);
		
		//then
		assertThat(actualString).isEqualTo("RRRO");
		
	}
	
	@Test
	public void test_getRowString_ForHourRow_withFourLampIluminated(){
		//Given
		int maxLampCount = 4;
		String colorCode = "R";
		int noOfIluminatedLamp = 4;
		
		//When
		String actualString = converter.getRowString(noOfIluminatedLamp, maxLampCount, colorCode);
		
		//then
		assertThat(actualString).isEqualTo("RRRR");
		
	}
	
	@Test
	public void test_getRowString_ForMinTopRow_withFirstLampIluminated(){
		//Given
		int maxLampCount = 11;
		String colorCode = "Y";
		int noOfIluminatedLamp = 1;
		
		//When
		String actualString = converter.getRowString(noOfIluminatedLamp, maxLampCount, colorCode);
		
		//then
		assertThat(actualString).isEqualTo("YOOOOOOOOOO");
		
	}
	
	@Test
	public void test_getRowString_ForMinTopRow_withFiveLampIluminated(){
		//Given
		int maxLampCount = 11;
		String colorCode = "Y";
		int noOfIluminatedLamp = 5;
		
		//When
		String actualString = converter.getRowString(noOfIluminatedLamp, maxLampCount, colorCode);
		
		//then
		assertThat(actualString).isEqualTo("YYYYYOOOOOO");
		
	}
	
	@Test
	public void test_getRowString_ForMinTopRow_withElevenLampIluminated(){
		//Given
		int maxLampCount = 11;
		String colorCode = "Y";
		int noOfIluminatedLamp = 11;
		
		//When
		String actualString = converter.getRowString(noOfIluminatedLamp, maxLampCount, colorCode);
		
		//then
		assertThat(actualString).isEqualTo("YYYYYYYYYYY");
		
	}
	

	@Test
	public void test_getRowString_ForSecond_withOddValue(){
		//Given
		int second = 3;
		
		//When
		String actualString = converter.getSecondString(second);
		
		//then
		assertThat(actualString).isEqualTo("O");
		
	}
	
	@Test
	public void test_getRowString_ForSecond_withEvenValue(){
		//Given
		int second = 28;
		
		//When
		String actualString = converter.getSecondString(second);
		
		//then
		assertThat(actualString).isEqualTo("Y");
		
	}
	

}
