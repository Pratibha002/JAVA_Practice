package JAVA_Practice;

public class Max_N_MinArrayElement {
   
    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 1, 9 };
        int arr2[] = { 22, 14, 8, 17, 35, 3 };
        System.out.print("GIVEN ARRAY :  ");
        int maxElement = arr[0];
        int minElement = arr[0];
        int minElement2 = arr2[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            if (maxElement < arr[i]) {
                maxElement = arr[i];
            }
            if (minElement > arr[i]) {
                minElement = arr[i];
            }
        }
        System.out.println();
        System.out.println("MAXIMUM ELEMENT :  " + maxElement);
        System.out.println("MINIMUM ELEMENT :  " + minElement);

        System.out.println();

        System.out.print("GIVEN ARRAY :  ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

            if (maxElement < arr2[i]) {
                maxElement = arr2[i];
            }
            if (minElement2 > arr2[i]) {
                minElement2 = arr2[i];
            }
        }
        System.out.println();
        System.out.println("MAXIMUM ELEMENT :  " + maxElement);
        System.out.print("MINIMUM ELEMENT :  " + minElement2);

    }
}


