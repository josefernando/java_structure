package br.com.bicam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnLists {

    public static void main(String[] args){

        List<String> unModifiable = List.of(
            "blue",
            "red"
        );

        System.out.println(unModifiable);

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");

        colors.forEach( x -> System.out.println(x));

        for(int i =0; i < colors.size() ; i++){
            System.out.printf("for each  index %02d, color: %s%n", i, colors.get(i));
        }

        System.out.println(colors.toString());

    }
    
}
