package com.Samalotajava.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
    try{
        CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
        printer.printRecord("Alex", "Sam", 5, "Great");
        printer.printRecord("Alex", "Jam", 3, "Okay");
    } catch(IOException e){
        e.printStackTrace();
        }
    }
}
