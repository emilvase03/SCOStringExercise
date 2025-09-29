package org.example;

import java.util.*;

public class WordCensor {
    private static final Set<String> TARGET_WORDS = Set.of("horse", "saddle", "spores");

    public static String censorWords(String text) {
        for (String word : TARGET_WORDS) {
            text = text.replaceAll("\\b" + word + "\\b", "*".repeat(word.length()));
        }
        return text;
    }
}
