package com.kelderos;

import com.kelderos.service.StringService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringServiceTest {
    StringService stringProcessorService;

    @Test
    void concatenate() {
        String result = stringProcessorService.concatenate("Anton", " top");
        Assertions.assertEquals("Anton top", result);
    }

    @Test
    void repeat() {
        String result = stringProcessorService.repeatString("abc ", 5);
        Assertions.assertEquals("abc abc abc abc abc ", result);
    }
}