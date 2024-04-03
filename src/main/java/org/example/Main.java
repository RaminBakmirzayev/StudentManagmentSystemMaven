package org.example;

import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

    }
    @SneakyThrows(Exception.class)
    public void foo(String filename,String text){

        FileWriter fileWriter=new FileWriter(filename);
        BufferedWriter b=new BufferedWriter(fileWriter);
        b.write(text);
    }



}