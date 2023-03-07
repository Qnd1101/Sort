# 정렬

***
### 삽입 정렬(Insertion Sort)


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
```
asdasd
```
***

### 버블 정렬(Bubble Sort)

### 버블 정렬 알고리즘 개념
* 옆에 닿아 있는 원소와 비교하여 정렬한다.
* 버블 정렬은 n번째 자료와 n+1번째 자료를 비교하여 마지막 자료에 도착할 떄 까지 교환하여 정렬한다.
* 버블 정렬은 'pass 1'을 수행하고 나면 가지고 있는 자료 중 가장 큰 자료가 맨 뒤로 이동한다.
   * 'pass 2'부터는 맨 끝에 있는 자료는 정렬에서 제외되고, 1회전을 수행 할 때마다 제외되는 데이터가 하나씩 늘어난다.

### 버블 정렬 방법
![Bubble_Sort](https://user-images.githubusercontent.com/107795830/223307683-99ffbdbc-a419-46bb-a5c0-8c62d1e943a5.png)

### Java Code
```
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
