package my.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class abb {
    public static boolean check_for_word(String word) {
        // System.out.println(word);
        try {
            BufferedReader in = new BufferedReader(new FileReader(
                    "words"));
            String str;
            while ((str = in.readLine()) != null) {
                if (str.indexOf(word) != -1) {
                    return true;
                }
            }
            in.close();
        } catch (IOException e) {
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(check_for_word("Spense"));
    }
}