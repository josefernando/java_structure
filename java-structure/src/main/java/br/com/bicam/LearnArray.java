package br.com.bicam;

import java.util.Arrays;

public class LearnArray {

    public static void main(String[] args) {

    String[] colors = new String[]{"yellow", "blue", null,null,null};
    // String[] colors = new String[5];

    // colors[0] = "purple";

    for(String s : colors) {
        System.out.println(s);
    }

    for(String s : Arrays.asList(colors)) {
        System.out.println(s);
    }

    for(int i=0; i < colors.length ; i++){
        System.out.println("for " + colors[i]);
    }

    Arrays.stream(colors).forEach( x -> System.out.println(x));

    System.out.println(Arrays.toString(colors));
    System.out.println(Arrays.deepToString(colors));    }
}
