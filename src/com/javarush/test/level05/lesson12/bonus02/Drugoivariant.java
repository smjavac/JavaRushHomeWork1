package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by admin on 06.06.2016.
 */
public class Drugoivariant
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(min(min(a, b), min(c, d)), min(min(e, b), min(c, d)));

        //minimum = min(minimum,min(c,d));
        //minimum = min(minimum,e);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b){
        return a<b?a:b;
    }
}
