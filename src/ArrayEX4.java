import java.util.Arrays;

public class ArrayEX4 {
	public static void main(String[] args) {
	
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i<100; i++) {
			int n = (int) (Math.random()*10);// n�� 0~9 �ϳ��� ����
			int tmp = numArr[0];//�ڸ������� ���� �ӽú��� ����
			numArr[0] = numArr[n];//0��°���� ���� ����
			numArr[n] = tmp;//�ӽð� ����
		}
		System.out.println(Arrays.toString(numArr));
}
}
