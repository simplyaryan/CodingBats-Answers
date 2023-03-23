import java.util.ArrayList;

//note: these methods will all be STATIC, and will input an array as a parameter
//instead of an instance field/
//The purpose of this class is to apply our search and sort algorithms to Strings not numbers.
//Unless otherwise specified, the sort methods should always be sorted in alphabetical order.
public class SearchAndSortStrings {
    // returns the index where target is located in words, -1 if target is not found
    public static int linearSearchStrings(String[] words, String target) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // use the binary Search algorithm to return the index where target is located
    // return -1 if target is not found. NOTE the parameter is an ArrayList not an
    // array.
    public static int binarySearchStrings(ArrayList<String> wordList, String target) {
        int l = 0;
        int r = wordList.size() - 1;
        int m = (l + r) / 2;

        while (l <= m) {
            m = (l + r) / 2;
            if (wordList.get(m).equals(target)) {
                return m;
            }
            if (wordList.get(m).compareTo(target) >= 1) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    // use the bubble sort algorithm to return an array that is a sorted version of
    // words.
    public static String[] bubbleSortStrings(String[] words) {
        boolean temp = true;
        while (temp) {
            temp = false;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].compareTo(words[i + 1]) >= 1) {
                    String tempString = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = tempString;
                    temp = true;
                }
            }
        }
        return words;
    }

    // use the selection sort algorithm to return an ArrayList that is a sorted
    // version of wordList.
    public static ArrayList<String> selectionSortStrings(ArrayList<String> wordList) {
        int index ;
       for(int i =0;i<wordList.size();i++){
        String min = wordList.get(i);
        index = i;
        for(int j =i ;j<wordList.size();j++){
            if(min.compareTo(wordList.get(j))>=1){
                min = wordList.get(j);
                index = j;
            }
        }
        String temp = wordList.get(i);
        wordList.set(i,min);
        wordList.set(index,temp);
       }
       return wordList;
    }

    // use the insertion sort algorithm to return an array that is a sorted version
    // of words.
    public static String[] insertionSortStrings(String[] words) {
        // your code goes here
        int j = 0 ;
        for (int i = 1; i < words.length; i++) {
            j = i;
            String why = words[i];
            while (j > 0 && words[j - 1].compareTo(why) > 0) {
                words[j] = words[j-1];
                j--;
            }
            words[j] = why;
        }
        return words;
    }

    // FINALLY, for this last method... use ANY SORTING ALGORITHM YOU WANT to sort
    // the String array...
    // but this time, don't sort alphabetically, sort by the length() of each of the
    // String elements!
    public static String[] sortStringLength(String[] words) {
        // your code goes here
        int index = 0;
        for(int i =0;i<words.length;i++){
            int temp = words[i].length();
            index = i;
            for(int j = i;j<words.length;j++){
                if(temp>words[j].length()){
                    temp = words[j].length();
                    index = j;
                }
            }
            String temp2 = words[i];
            words[i] = words[index];
            words[index] = temp2;
        }
        return words;
    }

    // Here is the main method - run it, output SHOULD MATCH the Expected Output
    // provided at the end
    public static void main(String[] args) {
        String[] testWords1 = { "luuuuuke", "i", "am", "your", "father" };

        ArrayList<String> testWords2 = new ArrayList<String>();
        testWords2.add("apple");
        testWords2.add("banana");
        testWords2.add("cookie");
        testWords2.add("dessert");

        String[] testWords3 = { "how", "bout", "them", "apples" };

        ArrayList<String> testWords4 = new ArrayList<String>();
        testWords4.add("hope");
        testWords4.add("is");
        testWords4.add("a");
        testWords4.add("dangerous");
        testWords4.add("thing");

        String[] testWords5 = { "not", "all", "who", "wander", "are", "lost" };

        System.out.println("testing the linear search with testWords1:");
        System.out.println("\"your\" is at index " + linearSearchStrings(testWords1, "your")
                + ", and \"mother\" is at index " + linearSearchStrings(testWords1, "mother") + "\n");

        System.out.println("testing the binary search with testWords2:");
        System.out.println("\"banana\" is at index " + binarySearchStrings(testWords2, "banana")
                + ", and \"pizza\" is at index " + binarySearchStrings(testWords2, "pizza") + "\n");

        System.out.println("\ntesting the bubble sort with testWords3:");
        String[] bubbleSorted = bubbleSortStrings(testWords3);
        for (String s : bubbleSorted)
            System.out.print(s + " | ");

        System.out.println("\n\ntesting the selection sort with testWords4:");
        ArrayList<String> selectionSorted = selectionSortStrings(testWords4);
        for (String s : selectionSorted)
            System.out.print(s + " | ");

        System.out.println("\n\ntesting the insertion sort with testWords5:");
        String[] insertionSorted = insertionSortStrings(testWords5);
        for (String s : insertionSorted)
            System.out.print(s + " | ");

        System.out.println("\n\ntesting the sortStringLength sort with testWords4:");
        String[] lengthSorted = sortStringLength(testWords1);
        for (String s : lengthSorted)
            System.out.print(s + " | ");
    }
}

/*
 * EXPECTED OUTPUT
 * testing the linear search with testWords1:
 * "your" is at index 3, and "mother" is at index -1
 * 
 * testing the binary search with testWords2:
 * "banana" is at index 1, and "pizza" is at index -1
 * 
 * 
 * testing the bubble sort with testWords3:
 * apples | bout | how | them |
 * 
 * testing the selection sort with testWords4:
 * a | dangerous | hope | is | thing |
 * 
 * testing the insertion sort with testWords5:
 * all | are | lost | not | wander | who |
 * 
 * testing the sortStringLength sort with testWords4:
 * i | am | your | father | luuuuuke |
 * 
 */
