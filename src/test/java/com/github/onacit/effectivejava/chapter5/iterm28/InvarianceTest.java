package com.github.onacit.effectivejava.chapter5.iterm28;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InvarianceTest {

    @Test
    void test() {
        List<Mammal> mammals = new ArrayList<>();
        //List<Animal> animals = mammals; // Won't compile!!!
    }
}