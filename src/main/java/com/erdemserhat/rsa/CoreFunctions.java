package com.erdemserhat.rsa;

import java.util.Random;

public class CoreFunctions {
    /**
     *
     * @param level :
     * @return
     */
    public static int getRandomNumber(RandomNumberGetterLevel level){


        return 0;
    }
    public static int getRandomNumber(int minRange, int maxRange){
        Random random = new Random();
        int x = random.nextInt(maxRange-minRange+1)+minRange;

        return x;
    }
}
