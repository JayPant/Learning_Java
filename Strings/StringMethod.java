package Strings;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String sen= s.next();

        System.out.println("Length of the string is " + sen.length());
        System.out.println("Is the sentence empty? "+ sen.isEmpty());
        System.out.println("After Trimming the sentence "+sen.trim());

        System.out.println("Enter Another String: ");
        String sen1= s.next();

        System.out.println("Is string1 and string2 equal? (including the case): "+ sen.equals(sen1));
        System.out.println("Is string1 and string2 equal? (ignoring the case): "+ sen.equalsIgnoreCase(sen1));

        System.out.println("Comparing string1 and string2 lexicographically (including the case): "+ sen.compareTo(sen1));
        System.out.println("Comparing string1 and string2 lexicographically (ignoring the case): "+ sen.compareToIgnoreCase(sen1));

        System.out.println("Concatenating string 1 and string two: "+ sen.concat(sen1));
    
        System.out.println("After joing the string: " + String.join(" ",sen,sen1));

        System.out.println("Subsequence in the string: "+ sen.subSequence(6, 9));

        System.out.println("Using substring :"+ sen.substring(6, 9));

        System.out.println("Using Replace: "+ sen.replace("jay", "Jay"));

        System.out.println("Using replace first: "+ sen.replaceFirst("an", "An"));

        System.out.println("Using replace all: "+ sen.replaceAll("an", "AN"));

        System.out.println("Using index of method: "+sen.indexOf("D"));

        System.out.println("Using last indes of method: "+ sen.lastIndexOf("a"));

        System.out.println("Using charAt function: "+ sen1.charAt(3));

        System.out.println("Using starts with method: "+ sen.startsWith("D"));

        System.out.println("Ends with method: "+ sen1.endsWith("t"));

        System.out.println("Contains with method: "+sen1.contains("ant"));

        System.out.println("to upper case method: "+ sen.toUpperCase());

        System.out.println(" to Lowercase method: "+ sen.toLowerCase());


        int now =1234;
        System.out.println("Using value of method: "+ String.valueOf(now));

        // System.out.println(" to char array method: "+ sen1.toCharArray());
        s.close();
    }
}
