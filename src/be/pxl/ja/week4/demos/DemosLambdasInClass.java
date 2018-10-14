package be.pxl.ja.week4.demos;

import java.sql.SQLOutput;

public class DemosLambdasInClass {
    public static void main (String[] args) {

//        Example for android
//        saveButton.setOnClickListener(new OnClickListener() {
//          @Override
//            public void OnClick (View view) {
//                TODO: Save current state
//            System.out.println("Saved...");
//        }
//        });


        //Interface has only ONE method
        // One abstract method => @Functional Interface annotation
//        public interface OnClickListener {
//            void onClick(android.view.View view);
//        }


//        @FunctionalInterface
//                public interface Rounder {
//            public int round(double target);
//        }


//          lambda expression (this is ok with one method!)
//           left = parameter (new OnClickListener)
//           right = implementation
//            saveButton.setOnClickListener (view -> {
//                System.out.println("Saved...");
//            });


//        public interface NumberPlotter {
//            String plot(int number);
//        }
//        public static void printNumber(NumberPlotter p) { int number = 23;
//            System.out.println(p.plot(number)); }
//
//        public static void main(String[] args) {
//            printNumber(n -> String.format("[%d]", n)); }


//        @FunctionalInterface - examples of lambda syntax
//        text.printFilteredWords(word -> word.contains("e"));
//        WordFilter filter = word -> word.charAt(2) == 'i';
//        WordFilter filter = word -> {
//              return word.charAt(2) == 'i';
//         };

//        more than one parameter => ()

    }
}
