import java.util.Arrays;

public class ArrayEX4 {
	public static void main(String[] args) {
	
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i<100; i++) {
			int n = (int) (Math.random()*10);// n에 0~9 하나를 저장
			int tmp = numArr[0];//자리변경을 위한 임시변수 생성
			numArr[0] = numArr[n];//0번째값에 변수 저장
			numArr[n] = tmp;//임시값 저장
		}
		System.out.println(Arrays.toString(numArr));
}
}
