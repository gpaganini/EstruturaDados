package com.paganini.ed;

public class FAT {
    long calcfat(long x) {
        if (x == 0) {
            return 1;
        }
        return(x*calcfat(x-1));
    }
}
