package be.pxl.ja.week4.demos.demo2;

public class NumberPlotterApp {
    public static void main (String[] args) {

//        //with anonymous class
//        printNumber(new NumberPlotter() {
//            @Override
//            public String plot(int number) {
//                return String.format("[%d]", number);
//            }
//        });
//    }

    // with lambda
    printNumber(number -> String.format("[%d]", number));
}




    private static void printNumber (NumberPlotter p) {
        int number = 23;
        System.out.println(p.plot(number));
    }
}
