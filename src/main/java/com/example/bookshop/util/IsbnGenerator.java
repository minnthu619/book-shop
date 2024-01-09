package com.example.bookshop.util;

import java.util.Random;

public class IsbnGenerator { //for auto generating isbn PK

    public static String generate(){
        return "ISBN-"+( new Random().nextInt(1000) + 1000);
    }
}
