package com.example.animals;

public class Animal {
    protected String name = "Generic Animal";
    String species = "Unknown"; // package-private

    protected void makeSound() {
        System.out.println(name + " makes a sound");
    }

    void habitat() {  // package-private
        System.out.println("This animal lives somewhere.");
    }
}

package com.example.animals;

public class Dog extends Animal {
    void bark() {
        makeSound();         // Accessible due to protected
        System.out.println(name + " barks");
        System.out.println(species);  // Accessible within the same package
    }
}

package com.example.zoo;

import com.example.animals.Animal;

public class ZooKeeper extends Animal {
    void manage() {
        System.out.println(name);    // Accessible due to protected
        makeSound();                 // Accessible due to protected
        // habitat();  // Not accessible, package-private in a different package
    }
}