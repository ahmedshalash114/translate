/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gtranslate;

import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;

public class Main {
        public static void main(String[] args) throws JavaLayerException, IOException {
                Translator translate = Translator.getInstance();
                Language language = Language.getInstance();
                String text = "apple";
                System.out.println(translate.translate(text, Language.ENGLISH,
                                Language.ARABIC)
                                + " "); 
                System.out.println(translate.detect(text));
                System.out.println(language.getNameLanguage(translate.detect(text),
                                Language.CHINESE_SIMPLIFIED));
                           
        }
}
