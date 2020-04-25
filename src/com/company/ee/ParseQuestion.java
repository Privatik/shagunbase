package com.company.ee;

import com.company.ee.model.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParseQuestion {

    List<Question> toListQuestion(List<String> list)
    {
        List<String> stringList;
        List<Question> questionList = new ArrayList<>();

        String[] s;
        for (String item:list) {
            stringList = new ArrayList<>();

            s = item.split(":::");
            Collections.addAll(stringList,s[3].split("::"));

            questionList.add(new Question(s[0],s[1],s[2],stringList));
        }
        return questionList;
    }
}
