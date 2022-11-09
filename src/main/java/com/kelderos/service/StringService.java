package com.kelderos.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {
    public String concatenate(String str1, String str2)
    {
        return str1.concat(str2);
    }

    public String repeatString(String str, int count)
    {
        return str.repeat(count);
    }
}
