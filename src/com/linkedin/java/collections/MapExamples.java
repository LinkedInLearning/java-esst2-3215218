package com.linkedin.java.collections;

import java.util.HashMap;

public class MapExamples {

    public static void main(String[] args) {
        var animalSounds = new HashMap<String, String>();

        animalSounds.put("Dog", "Bark");
        animalSounds.put("Cat", "Meow");
        animalSounds.put("Mouse", "Squeak");

        System.out.println(animalSounds);

        animalSounds.put("Cat", "Purr");
        System.out.println(animalSounds);

        System.out.println(animalSounds.get("Cat"));
        System.out.println(animalSounds.get("Tiger"));

        System.out.println(animalSounds.containsKey("Cat"));
        System.out.println(animalSounds.containsKey("Tiger"));

        System.out.println(animalSounds.containsValue("Bark"));

        for (var animal : animalSounds.keySet()) {
            System.out.println("Found animal " + animal + " with sound " + animalSounds.get(animal));
        }

    }

}
