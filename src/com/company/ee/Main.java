package com.company.ee;

import com.company.ee.model.Question;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Question question = new Question("Выберите вариант с цифрой 1","1",list);
        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<Question> jsonAdapter = moshi.adapter(Question.class);

        String st = jsonAdapter.toJson(question);
        try {
            FileWriter fileWriter = new FileWriter("filejson/question.json",false);
            fileWriter.write(st);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
