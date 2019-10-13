package com.mustafauysal.methodsandclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("application started");
        test();
        System.out.println(math(3,4));

    }

    public void test() {

        int x = 4 + 4;
        System.out.println("value of x:" + x);


    }

    public int math(int a, int b) {

        return a + b;
    }
    public void makeMusicians() {

        Musician james = new Musician("James Hetfield","Guitar", "50");




    }
}
