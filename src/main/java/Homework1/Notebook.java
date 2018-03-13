package Homework1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

public class Notebook {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    private String producer;
    private String model;
    private String price;

    public Notebook(String producer, String model, String price) {

        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    public void showNotebook() {
        System.out.println(producer + " " + model + " " + price);
    }

    public static String writer (BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return line;

    }


    }



