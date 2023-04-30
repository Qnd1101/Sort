package sort;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8, 3, 4, 9, 7};
		int temp = 0;
		
		System.out.println("정렬 전" + Arrays.toString(arr));
		for(int i = 1; i < arr.length; i++) { 		// 삽입 정렬은 두번째 자리부터 시작하기 때문에 i를 1로 지정
			for(int j = i; j > 0; j--) {  		// 배열의 방 번호를 위하여 만듦
				if(arr[j-1] > arr[j]) { 	// j-1이 j보다 클경우 조건이 성립하게 만듦
					 temp = arr[j-1]; 	// 자리를 옮겨주기 위해서 temp값에 arr[j-1]을 저장
				     arr[j-1] = arr[j];		// j-1자리에 j를 옮기기 위한 코드
				     arr[j] = temp;		// temp에 저장한 값을 arr[j]방에 넣
				}
			}
			System.out.printf("정렬 과정 : %d번 %s\n", i, Arrays.toString(arr));
		}
		 System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

}
