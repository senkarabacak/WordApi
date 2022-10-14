package com.example.wordapi;

import org.springframework.web.bind.annotation.*;


@RestController
public class WordApiController {

    @GetMapping("api/words")
    //@ResponseBody
    public int words(@RequestParam String text) {

        int count = 1;
        for (int i = 0; i < text.length() - 1; i++)
        {
            if ((text.charAt(i) == '+') && (text.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        return count;
    }


    @GetMapping("api/letters")
    //@ResponseBody
    public int letters(@RequestParam String text) {

        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                count++;
        }
        return count;
    }


    @GetMapping("api/characters")
    //@ResponseBody
    public int characters(@RequestParam String text) {

        int count = 1;
        for(int i=0; i<text.length(); i++) {
            count++;
        }
        return count;
    }
}
