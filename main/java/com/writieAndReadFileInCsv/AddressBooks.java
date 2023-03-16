package com.writieAndReadFileInCsv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBooks {
    public static void main(String[] args) {
        List<NewContact> persons = new ArrayList<>();
        persons.add(new NewContact("Satya", "yadav", "up", "12344", "7065434", "sspra123@gmail"));
        persons.add(new NewContact("kundan", "kumar", "bihar", "12334", "34065434", "kund123@gmail"));
        persons.add(new NewContact("praveen", "singh", "karnataka", "1232344", "7234065434", "pra123@gmail"));
        persons.add(new NewContact("pallavi", "parteti", "pune", "12322344", "723434065434", "pall123@gmail"));
        System.out.println("writing a file of csv");

        try {
            FileWriter file = new FileWriter("sample.csv");
            PrintWriter write = new PrintWriter(file);
            for (NewContact name : persons) {
                write.println(name);
            }
            write.close();
        } catch (IOException exe) {
            System.out.println("Cannot create file");
        }
    }
}


