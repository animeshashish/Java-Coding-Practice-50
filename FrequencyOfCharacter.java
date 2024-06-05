package JavaCodingPractice50;

/* Frequency of the character in string*/

// Frequency of the character in string means how many times a particular character is present in that string.

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a String:");
        String str = sc.nextLine();

        int[] freq = new int[str.length()]; // Create freq array having size of length of string.
        int i, j;

        // Convert String to character array
        char string[] = str.toCharArray();

        for (i=0; i<str.length(); i++) {
            freq[i] = 1;

            for (j = i+1; j <str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;

                    // set string [j] to 0 to avoid printing visited character
                    string[j] = '0';

                }
            }
        }
        // Display the each character and their corresponding frequency
        System.out.println("Character and their corresponding frequencies");
        for (i =0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] !='0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }

}
