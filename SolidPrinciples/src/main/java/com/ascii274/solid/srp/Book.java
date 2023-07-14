/**
 * srp = single responsibiltiy principles
 */
package com.ascii274.solid.srp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    private String text;


    public String replaceWordInText(String word){
        return text.replaceAll(word,text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

}
