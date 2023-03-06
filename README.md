# 삽입 정렬(insertion sort)

### 알고리즘 개념
삽입 정렬은 두 번째 자료부터 시작하여 그 앞(왼쪽)의 자료들과 비교하여<br/>
삽입할 위치를 지정한 후 자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬하는 알고리즘이다.

### 삽입 정렬 방법
초기 상태 : [8, 3, 4, 9, 7]
* pass 1 [8, 3, 4, 9, 7] - > [3, 8, 4, 9, 7]
  * 두 번째 자료부터 우선권을 가지므로 3과 그 앞(왼쪽)에 있는 8과 비교하여 이동한다.
* pass 2 [3, 8, 4, 9, 7] - > [3, 4, 8, 9, 7]
  * 세 번째 자료인 4와 그 앞(왼쪽)에 있는 8, 3을 비교하여 이동한다.
* pass 3 [3, 4, 8, 9, 7] 
  * 네 번째 자료인 9와 그 앞(왼쪽)에 있는 8, 4, 3을 비교하여 이동한다.
* pass 4 [3, 4, 8, 9, 7] - > [3, 4, 8, 7, 9] - > [3, 4, 7, 8, 9]
  * 다섯 번째 자료인 7과 그 앞(왼쪽)에 있는 9, 8, 4, 3을 비교하여 이동한다.

### Java Code
```
package sort;

import java.util.Arrays;

public class InsertionSort {
	static int[] nums;

	public static void main(String[] args) {
		nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 10);
		}
		System.out.println("<정렬 전>");
		System.out.println(Arrays.toString(nums));
		
		for(int i = 1; i < nums.length; i++) {
			// 현재 선택된 원소의 값을 임시 변수에 저장해준다.
			int temp = nums[i];
			// 현재 원소를 기준으로 이전 원소를 탐색하기 위한 index 변수.
			int prev = i - 1;
			// 현재 선택된 원소가 이전 원소보다 작은 경우까지만 반복. 단, 0번째 원소까지만 비교한다.
			while(prev >= 0 && nums[prev] > temp) {
				// 현재 선택된 원소가 현재 탐색중인 원소보다 작다면, 해당 원소는 다음 인덱스로 미뤄버린다.
				nums[prev + 1] = nums[prev];
				// 다음 대상 원소를 탐색한다.
				prev--;
			}
			// 탐색이 종료된 지점에 현재 선택되었던 변수의 값을 삽입해준다.
			nums[prev + 1] = temp;
		}
		
		System.out.println("<정렬 후>");
		System.out.println(Arrays.toString(nums));
	}
}
```
