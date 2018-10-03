package be.pxl.ja.week4.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static ArrayList<String> words = new ArrayList<>();
    public static ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {
            initData();

            filterWords(w -> w.contains("e"));

            roundNumbers(d -> new Double(Math.floor(d)).intValue());

            printNumbers(n -> {
                String formatted = String.format("%.02f", n);
                System.out.println(formatted);
            });

            printNumber(n -> String.format("[%d]", n));
    }

    public static void initData() {
        String[] wordList = new String[] {"België", "Nederland", "Frankrijk", "Duitsland", "Engeland", "Spanje"};
        Double[] numberList = new Double[] {0.45612, 1.2563, 0.022, 1.1, 3.6587452145, 2.22231, 0.45127, 23.147};

        words.addAll(Arrays.asList(wordList));
        numbers.addAll(Arrays.asList(numberList));
    }


    public static void filterWords(Predicate<String> filter) {
        for(String word:words) {
            if(filter.test(word)) {
                System.out.println(word + " is a valid word!");
            }
        }
    }


    public static void roundNumbers(Function<Double, Integer> rounder) {
        for(double number:numbers) {
            int intValue = rounder.apply(number);
            System.out.println("Rounded " + number + ": " + intValue);
        }
    }

    public static void printNumbers(Consumer<Double> printer) {
        numbers.add(0.458752);
        numbers.add(0.854587);
        for(double number:numbers) {
            printer.accept(number);
        }
    }

    public interface NumberPlotter {
        String plot(int number);
    }

    public static void printNumber(NumberPlotter p) {
        int number = 23;
        System.out.println(p.plot(number));
    }
}
