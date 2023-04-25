package com.vikash.Basics;

import java.io.*;

class MyClass {
    String str;
    int num;

    private void getData() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter name: ");
        str = br.readLine();
        System.out.print("\nEnter Number: ");
        num = Integer.parseInt(br.readLine());
    }

    public void display() throws IOException {
        getData();
        System.out.println("Hello" + str + "!");
        System.out.println(num);
    }
}

class MyClassDemo {
    public static void main(String args[]) throws IOException {
        MyClass ob = new MyClass();
        ob.display();
    }
}