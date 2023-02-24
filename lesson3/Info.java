package opp_lesson1;

import java.io.IOException;
import java.util.ArrayList;
import oop_lesson1.Person;

public interface Info {
    default void print(ArrayList<String> PersonArrayList){
        System.out.println(PersonArrayList);
    }
}
