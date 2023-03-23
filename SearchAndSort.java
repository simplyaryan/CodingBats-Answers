import java.util.ArrayList;

public class SearchAndSort {
    private int[] random_ints;
    private ArrayList<Integer> random_Integers;

    // FIRST, instantiates each instance field.
    // THEN, fills each instance field with 10 random ints/Integers ranging from -10
    // to 10 (inclusive)
    // this is coded for you
    public SearchAndSort() {
        random_ints = new int[10];
        random_Integers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            random_ints[i] = (int) (Math.random() * 21) - 10;
            random_Integers.add((int) (Math.random() * 21) - 10);
        }
    }

    // parameterized constructor that lets the user input the instance fields
    // this constructor is coded for you
    public SearchAndSort(int[] intValues, ArrayList<Integer> integerValues) {
        random_ints = intValues;
        random_Integers = integerValues;
    }

    /*
     * ____________________
     * 
     * SEARCHING ALGORITHMS
     * ____________________
     */

    // provides the linear search algorithm to the array instance field
    // linear search: look through each element in the array, return the index when
    // target is found, -1 if not found
    public int linearSearchArray(int target) {
        for (int i = 0; i < random_ints.length; i++) {
            if (random_ints[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // provides the linear search algorithm to the ArrayList instance field
    // linear search: look through each element in the ArrayList, return the index
    // when target is found, -1 if not found
    public int linearSearchArrayList(Integer target) {
        for (int i = 0; i < random_Integers.size(); i++) {
            if (random_Integers.get(i) == target) {
                return i;
            }
        }
        return -1;

    }

    // provides the binary search algorithm to the array instance field
    // binary search: keep cutting a sorted array in half until you find the target
    // or you can't cut the array in half anymore
    // important precondition: the array MUST BE SORTED
    public int binarySearchArray(int target) {

        int l = 0;
        int r = random_ints.length - 1;
        int mid = (l + r) / 2;
        while (l<=r) {
         
          if(random_ints[mid] == target){
            return mid;
          }
            else if (random_ints[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
             mid = (l + r) / 2;
        }
        return -1;

    }

    // provides the binary search algorithm to the ArrayList instance field
    // binary search: keep cutting a sorted array in half until you find the target
    // or you can't cut the array in half anymore
    // preconditoin: the ArrayList MUST be sorted
    public int binarySearchArrayList(Integer target) {
        int l = 0;
        int r = random_Integers.size() - 1;
        int mid = (l + r) / 2;
        while (l<=r) {
          if(random_Integers.get(mid) == target){
            return mid;
          }
            else if (random_Integers.get(mid) < target) {
                l = mid + 1;
            } 
          else {
                r = mid - 1;
            }
            mid = (l + r) / 2;
        }
        return mid;
    }
  /*
  
  */

    /*
     * ____________________
     * 
     * SORTING ALGORITHMS
     * ____________________
     */

    // sorts the array instance field using the selection sort algorithm
    public void selectionSortArray() {
        for (int i = 0; i < random_ints.length; i++) {
            swapArray(i, minIndexArray(i));
        }
    }

    // sorts the ArrayList instance field using the selection sort algorithm
    public void selectionSortArrayList() {
        for (int i = 0; i < random_Integers.size(); i++) {
            swapArrayList(i, minIndexArrayList(i));
        }
    }

    // sorts the array instance field using the insertion sort algorithm
    public void insertionSortArray() {
        int j = 0;
        for (int i = 1; i < random_ints.length; i++) {
           j = i;
           while (j > 0 && random_ints[j - 1] > random_ints[j]) {
              random_ints[j-1] = random_ints[j];
             j--;
            
         }
          random_ints[j] = random_ints[i];
      }
    }

    // sorts the ArrayList instance field using the insertion sort algorithm
    public void insertionSortArrayList() {
        int j = 0;
        for (int i = 1; i < random_Integers.size(); i++) {
            j = i;
            while (j > 0 && random_Integers.get(j - 1) > random_Integers.get(j)) {
                random_Integers.set(j-1,random_Integers.get(j));
                j--;
            }
          random_Integers.set(j,random_Integers.get(i));
        }
    }

    // sorts the array instance field using the bubble sort algorithm
    // this is given to you (bubble sort NOT on AP test)
    public void bubbleSortArray() {
      boolean temp = true;
       while(temp){
         temp = false;
          for(int i = 0;i<random_ints.length-1;i++){
            if(random_ints[i+1] < random_ints[i]){
              temp = true;
              swapArray(i,i+1);
            }
          }
        }
    }

    // sorts the Array List instance field using the bubble sort algorithm
    // this is given to you (bubble sort NOT on AP Test)
    public void bubbleSortArrayList() {
      boolean temp = true;
        while(temp){
          temp = false;
          for(int i = 0;i<random_Integers.size()-1;i++){
            if(random_Integers.get(i+1) < random_Integers.get(i)){
              swapArrayList(i,i+1);
              temp  = true;
            }
          }
        }

    }

    /*
     * ______________
     * 
     * HELPER METHODS
     * ______________
     */

    // checks to see if the array instance field is sorted
    public boolean isSortedArray() {
        for (int i = 0; i < random_ints.length - 1; i++) {
            if (random_ints[i + 1] < random_ints[i]) {
                return false;
            }
        }
        return true;
    }

    // checks to see if the array instance field is sorted
    public boolean isSortedArrayList() {
        for (int i = 0; i < random_Integers.size() - 1; i++) {
            if (random_Integers.get(i + 1) < random_Integers.get(i)) {
                return false;
            }
        }
        return true;
    }

    // swaps the elements at index1 and index2 in the array instance field
    public void swapArray(int index1, int index2) {
        int indexone = random_ints[index1];
        random_ints[index1] = random_ints[index2];
        random_ints[index2] = indexone;

    }

    // swaps the elements at index1 and index2 in the ArrayList instance field
    public void swapArrayList(int index1, int index2) {
    //  random_Integers.set(index2,random_Integers.set(index1,random_Integers.get(index2)));
        int indexone = random_Integers.get(index1);
        random_Integers.set(index1, random_Integers.get(index2));
        random_Integers.set(index2, indexone);
    }

    // returns the index of the minimum value in the array instance field
    // beginning at the start parameter
    public int minIndexArray(int start) {
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = start; i < random_ints.length; i++) {
            if (min > random_ints[i]) {
                min = random_ints[i];
                temp = i;
            }
        }
        return temp;
    }

    // returns the index of the minimum value in the Array List instance field
    // beginning at the start parameter
    public int minIndexArrayList(int start) {
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = start; i < random_Integers.size(); i++) {
            if (min > random_Integers.get(i)) {
                min = random_Integers.get(i);
                temp = i;
            }
        }
        return temp;
    }

    // returns the array instance field (this method is given to you)
    public String toStringArray() {
        String result = "array values:  |";
        for (int x : random_ints)
            result = result + " " + x + " |";
        result = result + "\n";

        return result;
    }

    // returns the ArrayList instance field (this method is given to you)
    public String toStringArrayList() {
        String result = "ArrayList values:  |";
        for (Integer x : random_Integers)
            result = result + " " + x + " |";
        result = result + "\n";

        return result;
    }

    // resets the values of BOTH instance fields to random values -10 to 10
    // inclusive
    // this code is given to you
    public void resetArrays() {
        random_ints = new int[10];
        random_Integers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            random_ints[i] = (int) (Math.random() * 21) - 10;
            random_Integers.add((int) (Math.random() * 21) - 10);
        }

    }

    // use the main method to test your code on your own!
    public static void main(String[] args) {
        //preliminary assignments:
		ArrayList<Integer> tempList = new ArrayList<Integer>();
      	for(int i = 0; i < 10; i++)
        {
          	tempList.add(2 * i - 5);
        }
      
      	int[] tempArray = new int[10];
      	for(int i = 0; i < 10; i++)
        {
          	tempArray[i] = 3 * i - 12;
        }
      
      	SearchAndSort orderedArrays = new SearchAndSort(tempArray, tempList);
      	SearchAndSort randomArrays = new SearchAndSort();
      
      	boolean error = false;

      	//test isSortedArray:
      	if(randomArrays.isSortedArray())
        {
          	System.out.println("isSortedArray returns true incorrectly");
          	error = true;
        }
      	if(!orderedArrays.isSortedArray())
        {
          	System.out.println("isSortedArray returns false incorrectly");
          	error = true;
        }
        //test isSortedArrayList:
      	if(randomArrays.isSortedArrayList())
        {
          	System.out.println("isSortedArrayList returns true incorrectly");
          	error = true;
        }
      	if(!orderedArrays.isSortedArrayList())
        {
          	System.out.println("isSortedArrayList returns false incorrectly");
          	error = true;
        }
      	
      	//test linearSearch
      	if(orderedArrays.linearSearchArray(-12) != 0 || orderedArrays.linearSearchArray(15) != 9 || orderedArrays.linearSearchArray(0) != 4)
        {
          	System.out.println("linearSearchArray is not working correctly");
          	error = true;
        }  
      	if(orderedArrays.linearSearchArrayList(-5) != 0 || orderedArrays.linearSearchArrayList(13) != 9 || orderedArrays.linearSearchArrayList(7) != 6)
        {
          	System.out.println("linearSearchArrayList is not working correctly");
          	error = true;
        }  
      
      	//test binarySearch
      	if(orderedArrays.binarySearchArray(-12) != 0 || orderedArrays.binarySearchArray(15) != 9 || orderedArrays.binarySearchArray(0) != 4)
        {
          	System.out.println("binarySearchArray is not working correctly");
          	error = true;
        }  
      	if(orderedArrays.binarySearchArrayList(-5) != 0 || orderedArrays.binarySearchArrayList(13) != 9 || orderedArrays.binarySearchArrayList(7) != 6)
        {
          	System.out.println("binarySearchArrayList is not working correctly");
          	error = true;
        }  
      
      	//test bubbleSort
		randomArrays.resetArrays();
      	randomArrays.bubbleSortArray();
      	randomArrays.bubbleSortArrayList();
      	if(!randomArrays.isSortedArray())
        {
          	System.out.println("bubbleSortArray not working correctly");
          	error = true;
        }
      	if(!randomArrays.isSortedArrayList())
        {
          	System.out.println("bubbleSortArrayList not working correctly");
          	error = true;
        }
      	randomArrays.resetArrays();
      	
      	//test selectionSort
      	randomArrays.selectionSortArray();
      	randomArrays.selectionSortArrayList();
      	if(!randomArrays.isSortedArray())
        {
          	System.out.println("selectionSortArray not working correctly");
          	error = true;
        }
      	if(!randomArrays.isSortedArrayList())
        {
          	System.out.println("selectionSortArrayList not working correctly");
          	error = true;
        }
      	randomArrays.resetArrays();
      
      	//test insertionSort
      	randomArrays.insertionSortArray();
      	randomArrays.insertionSortArrayList();
      	if(!randomArrays.isSortedArray())
        {
          	System.out.println("insertionSortArray not working correctly");
          	error = true;
        }
      	if(!randomArrays.isSortedArrayList())
        {
          	System.out.println("insertionSortArrayList not working correctly");
          	error = true;
        }
      	randomArrays.resetArrays();
      
      	if(!error)
        {
          	System.out.println("\nCongraluations!  All your methods appear to be working correctly\n");
        	System.out.println("                +\"\"\"\"\"\"\"+ ");
        	System.out.println("               [|  o o  |]");
        	System.out.println("                |   ^   | ");
        	System.out.println("                | \\___/ | ");
       	 	System.out.println("                +-------+ ");
        }
    }

}
