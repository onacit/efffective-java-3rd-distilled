package com.github.onacit.effectivejava.chapter5.iterm28;

import org.junit.jupiter.api.Test;

class CovarianceTest {

    @Test
    void test() {
        Animal animal = new Mammal();
        Animal[] animals = new Mammal[0];
    }
}