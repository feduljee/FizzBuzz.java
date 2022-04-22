package com.lowes;
import org.junit.jupiter.api.Test;
// my test
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void shouldReturnInputValueAsString(){
        assertEquals("1", new FizzBuzz().convert(1));
        assertEquals("2", new FizzBuzz().convert(2));
    }

    @Test
    void shouldReturnFizz(){
        assertEquals("Fizz", new FizzBuzz().convert(3));
    }

    @Test
    void shouldReturnBuzz(){
        assertEquals("Buzz", new FizzBuzz().convert(5));
    }

    @Test
    void shouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().convert(15));
    }

    @Test
    void visualVerification(){
        for(int i=1; i <= 100; i++) {
            System.out.println(new FizzBuzz().convert(i));
        }
            
    }
}
