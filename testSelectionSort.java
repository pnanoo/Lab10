public class testSelectionSort {
@Test
public void testMixed(){
    	 int[] arr = new int[5];
         arr[0] = -8;
         arr[1] = -7;
         arr[2] = -2;
         arr[3] = 10;
         arr[4] = 9;

         int[] Sortedarr = new int[5];
         Sortedarr[0] = -8;
         Sortedarr[1] = -7;
         Sortedarr[2] = -2;
         Sortedarr[3] = 10;
         Sortedarr[4] = 9;
         int[] result = new SelectionSort().basicSelectionSort(arr);
         assertArrayEquals ( Sortedarr, result);
        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){
    	 int[] arr = new int[5];
         arr[0] = 9;
         arr[1] = 10;
         arr[2] = 7;
         arr[3] = 8;
         arr[4] = 2;


         int[] Sortedarr = new int[5];
         Sortedarr[0] = 2;
         Sortedarr[1] = 7;
         Sortedarr[2] = 8;
         Sortedarr[3] = 9;
         Sortedarr[4] = 10;
         int[] result = new SelectionSort().basicSelectionSort(arr);
         assertArrayEquals ( Sortedarr, result);

        /** Test data contains duplicates **/
    }
}
}
