//IMPORTANT NOTE:
//YOU SHOULD NOT EDIT THIS CLIENT FILE AT ALL!!!
//JUST RUN IT... if some of your methods don’t work, it will tell you which ones don’t work
//if all your methods work, you get a smiley face!

import java.util.ArrayList;
public class SearchAndSortClientFile 
{
    public static void main(String[] args) 
    {
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


