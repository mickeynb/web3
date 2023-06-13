package org.example;
public class Test3 {
    public void endless(boolean t) {
        t = true;
        int a=0;
        while(t){
            a++;
        }
    }

    public void unreach(boolean t) {
        t = true;
        if(t){
            return;
        }
        System.out.println("False");
    }




}

