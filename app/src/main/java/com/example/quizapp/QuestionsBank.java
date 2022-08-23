package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionList> javaQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("What is the size of a int variable?", "16 bit", "8 bit", "32 bit", "64 bit", "32 bit", "");
        final QuestionList question2 = new QuestionList("What is the default value of Boolean variable?", "true", "false", "null", "not defined", "false", "");
        final QuestionList question3 = new QuestionList("What of the following is the default value of an instance variable?", "Depends upon the type of variable", "null", "0", "not assigned", "Depends upon the type of variable", "" );
        final QuestionList question4 = new QuestionList("Which is a reserved word in the Java programming language?", "method", "native", "reference", "array", "native", "" );
        final QuestionList question5 = new QuestionList("Which of the following is NOT a keywords or reserved words in Java?", "if", "then", "goto", "while", "then", "" );
        final QuestionList question6 = new QuestionList("Which is the valid declarations within an interface definition?", "public double method();", "public final double method();", "static void method(double d1);", "protected void method(double d1);", "public double method();", "" );

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    private static List<QuestionList> phpQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("What does PHP stand for?", "Professional Home Page", "Hypertext Preprocessor", "Pretext Hypertext Processor", "Preprocessor Home Page", "Hypertext Preprocessor", "");
        final QuestionList question2 = new QuestionList("Who is the father of PHP?", "Rasmus Lerdorf", "William Makepiece", "Drek Kolkevi", "List Barely", "Rasmus Lerdorf", "");
        final QuestionList question3 = new QuestionList("PHP files have a default file extension of. ", ".html", ".php", ".xml", ".json", ".php", "" );
        final QuestionList question4 = new QuestionList("A PHP script should start with ___ and end with ___:", "<php>", "<php/>", "<??>", "<?php?>", "<?php?>", "" );
        final QuestionList question5 = new QuestionList("Which version  of PHP introduced Try/catch Exception?", "PHP 4", "PHP 5 ", "PHP 6", "PHP 5.3", "PHP 5", "" );
        final QuestionList question6 = new QuestionList("If $a = 12 what will be returned when ($a == 12) ? 5 : 1 is executed?", "12", "1", "5", "error", "5", "" );

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;

    }

    private static List<QuestionList> htmlQuestions() {

        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("HTML stands for?", "Hypertext Markup Language", "High Text Markup Language", "Hyper Tabular Markup Language", "None of these", "Hypertext Markup Language", "");
        final QuestionList question2 = new QuestionList("Which of the following tag is used to mark a beginning of paragraph", "<td>", "<br>", "<P>", "<TR>", "<P>", "");
        final QuestionList question3 = new QuestionList("From which tag descriptive list starts?", "<LL>", "<DD>", "<DL>", "<DS>", "<DL>", "");
        final QuestionList question4 = new QuestionList("Correct HTML tag for the largest heading is", "<head>", "<large>", "<h1>", "<heading>", "<h1>", "");
        final QuestionList question5 = new QuestionList("The attribute of <form> tag", "Method", "Action", "Both (a)&(b)", "None of these", "Both (a)&(b)", "");
        final QuestionList question6 = new QuestionList("Markup tags tell the web browser", "How to organise the page", "How to display the page", "How to display message box on page", "None of these", "How to display the page", "");

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    private static List<QuestionList> androidQuestions() {

        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("Select a component which is NOT part of Android Architecture", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel", "");
        final QuestionList question2 = new QuestionList("A _____ makes a specific set of the application data available to other applications", "Content Provider", "Broadcast receivers", "Intent", "None of these", "", "");
        final QuestionList question3 = new QuestionList("Which among these are not a PART of Android's native libraries?", "Webkit", "Dalvik", "OpenGL", "SQLite", "Dalvik", "");
        final QuestionList question4 = new QuestionList("During an Activity life-cycle, what is the first callback method invoked by the system?", "onStop()", "onStart()", "onCreate()", "onRestore()", "onCreate()", "");
        final QuestionList question5 = new QuestionList("What Activity method you use to retrieve a reference to an Android view by using the id attribute of a resource XML?", "", "findViewById(int id)", "findViewById(String id)", "retrieveResourceById(ind id)", "findViewById(int id)", "");
        final QuestionList question6 = new QuestionList("The request from Content Provider class is handled by method", "onCreate", "onSelect", "ContentResolver", "onClick", "ContentResolver", "");

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    public static List<QuestionList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }
}
