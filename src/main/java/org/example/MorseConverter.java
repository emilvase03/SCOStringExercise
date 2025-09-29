package org.example;

import java.util.*;

public class MorseConverter {
    private static final Map<Character, String> MORSE_MAP = createMorseMap();

    public static String textToMorse(String text) {
        // better at word splitting than split(" ")
        String[] words = text.toUpperCase(Locale.ROOT).split("\\s+");
        List<String> morseWords = new ArrayList<>();

        for (String word : words) {
            List<String> morseChars = new ArrayList<>();
            for (char c : word.toCharArray()) {
                String code = MORSE_MAP.get(c);
                if (code != null) morseChars.add(code);
            }
            morseWords.add(String.join(" ", morseChars));
        }

        return String.join(" / ", morseWords);
    }

    // morse mapper
    private static Map<Character, String> createMorseMap() {
        Map<Character, String> m = new HashMap<>();
        m.put('A', ".-");    m.put('B', "-...");  m.put('C', "-.-.");
        m.put('D', "-..");   m.put('E', ".");     m.put('F', "..-.");
        m.put('G', "--.");   m.put('H', "....");  m.put('I', "..");
        m.put('J', ".---");  m.put('K', "-.-");   m.put('L', ".-..");
        m.put('M', "--");    m.put('N', "-.");    m.put('O', "---");
        m.put('P', ".--.");  m.put('Q', "--.-");  m.put('R', ".-.");
        m.put('S', "...");   m.put('T', "-");     m.put('U', "..-");
        m.put('V', "...-");  m.put('W', ".--");   m.put('X', "-..-");
        m.put('Y', "-.--");  m.put('Z', "--..");
        m.put('0', "-----"); m.put('1', ".----"); m.put('2', "..---");
        m.put('3', "...--"); m.put('4', "....-"); m.put('5', ".....");
        m.put('6', "-...."); m.put('7', "--..."); m.put('8', "---..");
        m.put('9', "----.");
        return m;
    }
}
