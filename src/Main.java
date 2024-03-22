import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Task 1: Write a program that creates an array of integers with a length of 3. Assign
    //the values 1, 2, and 3 to the indexes. Print out each array element.
        int [] arr = {1,2,3};
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//

    //Task 2: Write a program that returns the middle element in an array. Give the following
    //values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        int[] array = {13,5,7,68,2};
//            System.out.println(array.length);

            for (int i = 0; i < array.length; i++) {
//                System.out.println(array[array.length /2]);

        }
            System.out.println(array[array.length /2]);

//
//
//
    //Task 3: Write a program that creates an array of String type and initializes it with the
    //strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy
    //using the clone( ) method. Use the Arrays.toString( ) method on the new array to
    //verify that the original array was copied.
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors.length);

        String[] copy = colors.clone();
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(copy));

//
//
    //Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
    //The numbers can be any integers. Print out the value at the first index and the last
    //index using length - 1 as the index. Now try printing the value at index = length (e.g.,
    //myArray[myArray.length] ). Notice the type of exception which is produced. Now try
    //to assign a value to the array index 5. You should get the same type of exception.
        int[] nums = {1,2,3,4,5};
        System.out.println(nums[0]);
        System.out.println(nums.length - 1);
        System.out.println(nums[nums.length]);

        nums[5] = 10;
        System.out.println(nums[nums.length]);
//
    //Task 5: Write a program where you create an integer array with a length of 5. Loop
    //through the array and assign the value of the loop control variable (e.g., i) to the
    //corresponding index in the array.
        int[] ages = {10,2,5,6,8};
        System.out.println(ages.length);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
            System.out.print(i);
            System.out.println(ages[i]);
        }
//
    //Task 6: Write a program where you create an integer array of 5 numbers. Loop
    //through the array and assign the value of the loop control variable multiplied by 2 to
    //the corresponding index in the array.
        int[] numbers = {1,2,3,4,5};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
            System.out.println(numbers[i]);

        }
//
//
//
    //Task 7: Write a program where you create an array of 5 elements. Loop through the
    //array and print the value of each element, except for the middle (index 2) element.
        String[] sentence = {"Hello", "all", "don't", "welcome", "back"};
        for (int i = 0; i < sentence.length; i++) {
//            System.out.println(i);
            if(i != 2){
//                System.out.println(i);
                System.out.println(sentence[i]);
            }

        }
//
//
    //Task 8: Write a program that creates a String array of 5 elements and swaps the first
    //element with the middle element without creating a new array.
        String[] words = {"two", "has", "Luis", "beautiful", "cats"};
        int middle = words.length / 2 ;
//        System.out.println(middle);

        String temp = words[0];
//        System.out.println(words[0]);
        words[0] = words[middle];
//        System.out.println(words[middle]);
        words[middle] = temp;
//        System.out.println(temp);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
//
//
    //Task 9:Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}
    //Print the array in ascending order, and print the smallest and the largest
    // element of the array. The output will look like the following:
    //Array in ascending order: 0, 1, 2, 4, 9, 13
    //The smallest number is 0
    //The biggest number is 13
        int[] moreNums = {4,2,9,13,1,0};
        Arrays.sort(moreNums);
        System.out.println("Array in ascending order: " + Arrays.toString(moreNums));
        System.out.println("The smallest number is " + moreNums[0]);
        System.out.println("The biggest number is " + moreNums[moreNums.length -1]);

//
    //Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the
    //array.
        Object[] mixed = {1, "plus", "dot", "two", 1.2,};
//        System.out.println(mixed[1]);
        for (int i = 0; i < mixed.length; i++) {
            System.out.println(mixed[i]);

        }
//
//
    //Task 11: Write some Java code that asks the user how many favorite things they
    //have. Based on their answer, you should create a String array of the correct size.
    //Then ask the user to enter the things and store them in the array you created. Finally,
    //print out the contents of the array.
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int answer = scanner.nextInt();
        scanner.nextLine();
        String[] favorite = new String[answer];

        for (int i = 0; i < answer; i++) {
            System.out.print("Enter your thing: ");
            favorite[i] = scanner.nextLine();
//            scanner.nextLine();
//            System.out.println(favorite[i]);
        }
//            String temp = favorite[i];
//            System.out.println(temp);
        System.out.println("Your favorite things are: " + Arrays.toString(favorite));
    }
}