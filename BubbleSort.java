package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 0;
		int[] arr = {5, 3, 8, 1, 2, 7};
		
		System.out.println("정렬 전" + Arrays.toString(arr));
		for(int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.printf("정렬 과정 : %d번 %s\n", i, Arrays.toString(arr));
		}
		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

}
