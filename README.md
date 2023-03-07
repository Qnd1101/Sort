# 정렬

## 삽입 정렬(Insertion Sort)


### 삽입 정렬 알고리즘 개념
삽입 정렬은 두 번째 자료부터 시작하여 그 앞(왼쪽)의 자료들과 비교하여<br/>
삽입할 위치를 지정한 후 자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬하는 알고리즘이다.
<br/>

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
<br/>

### Java Code
```java
package sort;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8, 3, 4, 9, 7};
		int temp = 0;
		
		System.out.println("정렬 전" + Arrays.toString(arr));
		for(int i = 1; i < arr.length; i++) { 		// 삽입 정렬은 두번째 자리부터 시작하기 때문에 i를 1로 지정하였습니다.
			for(int j = i; j > 0; j--) {  		// 배열 방번호 
				if(arr[j-1] > arr[j]) { 	// j-1이 j보다 클경우 조건이 성립하게 만들었습니다.
					 temp = arr[j-1]; 	// 자리를 옮겨주기 위해서 temp값에 arr[j-1]을 저장하였습니다.
				     arr[j-1] = arr[j];		// j-1자리에 j를 옮기기 위한 코드입니다.
				     arr[j] = temp;		// temp에 저장한 값을 arr[j]방에 넣어주었습니다.
				}
			}
			System.out.printf("정렬 과정 : %d번 %s\n", i, Arrays.toString(arr));
		}
		 System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

}

```

### 코드 결과
![삽입 정렬 결과](https://user-images.githubusercontent.com/107795830/223327355-7d489836-065f-42dc-84ca-9ec968c1b18c.png)

## 버블 정렬(Bubble Sort)

### 버블 정렬 알고리즘 개념
* 옆에 닿아 있는 원소와 비교하여 정렬한다.
* 버블 정렬은 n번째 자료와 n+1번째 자료를 비교하여 마지막 자료에 도착할 떄 까지 교환하여 정렬한다.
* 버블 정렬은 'pass 1'을 수행하고 나면 가지고 있는 자료 중 가장 큰 자료가 맨 뒤로 이동한다.
   * 'pass 2'부터는 맨 끝에 있는 자료는 정렬에서 제외되고, 1회전을 수행 할 때마다 제외되는 데이터가 하나씩 늘어난다.
<br/>

### 버블 정렬 방법
![Bubble_Sort](https://user-images.githubusercontent.com/107795830/223307683-99ffbdbc-a419-46bb-a5c0-8c62d1e943a5.png)
<br/>

### Java Code
```java
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

```
### 코드 결과
![image](https://user-images.githubusercontent.com/107795830/223332997-714efe27-232f-4480-b506-2cdc0aa31e8c.png)

## 퀵 정렬(Quick sort)

