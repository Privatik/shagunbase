package com.company.ee;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReaderFile {

    List<String> read(){
        List<String> list = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream("base.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "Cp1251"));

            String s;
            while ((s = bufferedReader.readLine()) != null) {
                list.add(s);
            }

            bufferedReader.close();
        }catch (IOException ignored) { }

        return list;
    }

    void write(String st){
       try {
           FileWriter fileWriter = new FileWriter("filejson/question.json", false);
           fileWriter.write(st);
           fileWriter.flush();
       }catch (IOException ignored) { }
    }
}
