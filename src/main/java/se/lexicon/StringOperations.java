package se.lexicon;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println("==================================================================");

        // 1. What is the length of the String: "Java" ?
        System.out.println("EXERCISE 1:");
        String string = "Java";
        System.out.println("Length of the string: Java: " + string.length());

        System.out.println("==================================================================");

        // 1. What char is at index position 6 in the following String:
        // "Long example sentence" ?
        System.out.println("EXERCISE 1:");
        String string1 = "Long example sentence";
        System.out.println("Character at 6th position in the sentence: Long example sentence: " +
                string1.charAt(6));

        System.out.println("==================================================================");

        // 2. What is the index position of 'o' in the following String:
        // "Even longer example sentence" ?
        System.out.println("EXERCISE 2:");
        String string2 = "Even longer example sentence";
        System.out.println("Index position of 'o' at the sentence: Even longer example sentence: " +
                string2.indexOf('o'));

        System.out.println("==================================================================");

        // 3. Given the following String: "Ok this is not as long!"
        // create a substring of only "not as long" (excluding the
        // exclamation point) and print it out.
        System.out.println("EXERCISE 3:");
        String string3 = "Ok this is not as long!";
        System.out.println("Substring in the sentence 'Ok this is not as long!': " + string3.substring(11,22));

        System.out.println("==================================================================");

        // 4. Convert the following String: "CAPS EQUALS SCREAMING" to
        // lowercase and print it out. Then convert it back to
        // uppercase and print it out again.
        System.out.println("EXERCISE 4:");
        String string4 = "CAPS EQUALS SCREAMING";
        System.out.println("Lowercase: " + string4.toLowerCase());
        System.out.println("Uppercase: " + string4.toUpperCase());

        System.out.println("==================================================================");

        // 5. Correct the following String: "Java is the worst
        // programming language!" by replacing the (obviously
        // incorrect) word "worst" with the word "best". Then print
        // out the sentence.
        System.out.println("EXERCISE 5:");
        String string5 = "Java is the worst programming language!";
        System.out.println("Replacing worst with best: " + string5.replace("worst", "best"));

        System.out.println("==================================================================");

        // 6. What is the output of the following String:
        // "\tJ\ta\tv\ta\t" after you trim it?
        System.out.println("EXERCISE 6:");
        String string6 = "\tJ\ta\tv\ta\t";
        System.out.println("Trimming extra spaces: " + string6.trim());

        System.out.println("==================================================================");

        // 7. Parse the following int: 20 to a String and add a 20 to the
        // end of the String. Printing it out should return: "2020".
        System.out.println("EXERCISE 7:");
        String string7 = String.valueOf(20);
        System.out.println("Concatenating 20 at the end of the string '20': " + string7 + 20);

        System.out.println("==================================================================");

        // 8. Oil and water don't go well together. Given the String:
        // "Oil and Water", split them up into the words "Oil","Water"
        // and store them in a String array.
        System.out.println("EXERCISE 8:");
        String string8 = "Oil and Water don't go well together";
        String[] splittedStrings = string8.split(" don't ");
        System.out.println("Splitting the words in 'Oil and Water don't go well together': ");
        for (String splittedString : splittedStrings) {
            if(splittedString.contains(" and ")) {
                String[] splittedStrings1 = splittedString.split(" and ");
                for (String splittedString1 : splittedStrings1) {
                    System.out.println(splittedString1);
                }
            }
        }

        System.out.println("==================================================================");

        // 9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
        // into an array. Print out all names separately.
        System.out.println("EXERCISE 9:");
        String string9 = "Carl,Susie,Fredrick,Bob,Erik";
        System.out.println("Splitting the names in 'Carl,Susie,Fredrick,Bob,Erik': ");
        String[] splittedStrings2 = string9.split(",");
        for(String splittedString : splittedStrings2) {
            System.out.println(splittedString);
        }

        System.out.println("==================================================================");

        // 10. Convert the following String: "ThisShouldBeConverted" to
        // a char array. Iterate through the char array and print out
        // each element.
        System.out.println("EXERCISE 10:");
        String string10 = "ThisShouldBeConverted";
        char[] chars = string10.toCharArray();
        System.out.println("Convert String object to Array of Characters: ");
        for(char i : chars) {
            System.out.println(i);
        }

        System.out.println("==================================================================");

        // 11. Convert the following char[]: {'J','a','v','a'} to a
        // String and print it out.
        System.out.println("EXERCISE 11:");
        char[] charArray = {'J','A','V','A'};
        String string11 = String.valueOf(charArray);
//        String string11 = new String(charArray);
        System.out.println("Convert Array of Characters to String object: " + string11);

        System.out.println("==================================================================");
    }
}