package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Phone {
    private String mob;

    public String getMob() {
        return mob;
    }
    @Autowired
    public Phone(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "# - '" + mob + '\'' +
                '}';
    }
}
