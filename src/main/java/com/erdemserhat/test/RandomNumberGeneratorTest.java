package com.erdemserhat.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.erdemserhat.rsa.CoreFunctions;

public class RandomNumberGeneratorTest {

    @Test
    public void testGetRandomForLevel_1(){
        int minRange=500;
        int maxRange=1000;

        int randomNumber = CoreFunctions.getRandomNumber(minRange,maxRange);
        assert (randomNumber>=minRange && randomNumber<=maxRange);
    }

    @Test
    public void testGetRandomForLevel_2(){
        int minRange=1000;
        int maxRange=2000;

        int randomNumber=CoreFunctions.getRandomNumber(minRange,maxRange);
        assert (randomNumber>=minRange && randomNumber<=maxRange);
    }



}
