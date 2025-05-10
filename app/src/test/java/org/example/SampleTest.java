package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @BeforeEach
    public void beforEach(){
        System.out.println("beforeeach");
    }

    @Test
    public void one(){
        System.out.println("11111");
    }
     @Test
    public void tow(){
        System.out.println("2222");
    }

}
