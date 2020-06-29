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
        int count = 1;
        for (String item:list) {
            stringList = new ArrayList<>();

            s = item.split(":::");
            //System.out.println(s[2]);
            Collections.addAll(stringList,s[3].split("--"));
            System.out.println(count + " " + s[2].equals(stringList.get(0)));
            count++;
            questionList.add(new Question(s[0],s[1],s[2],stringList));
        }
        return questionList;
    }
}
