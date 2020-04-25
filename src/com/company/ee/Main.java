package com.company.ee;

import com.company.ee.model.ListQuestion;
import com.company.ee.model.Question;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ReaderFile readerFile = new ReaderFile();

        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<Question> jsonAdapter = moshi.adapter(Question.class);

        List<Question> questionList = new ParseQuestion().toListQuestion(readerFile.read());

        String st = "[";
        int size = questionList.size() - 1;
        for (int i = 0; i < questionList.size(); i++) {
            st = st.concat(jsonAdapter.toJson(questionList.get(i)));
            st = st.concat(size == i? "]":",");
        }

       readerFile.write(st);

    }
}
