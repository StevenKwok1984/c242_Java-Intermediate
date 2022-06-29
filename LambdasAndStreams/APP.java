package LambdasAndStreams;

import java.util.List;

public class APP {

    public static void main(String[] args) {
        Person people = new Person();
        people.stream()
                .filter((p) -> people.getAge() >= 18);
    }
}
