import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = { 100, 95, 80, 70, 60 };
		char[] chArr = { 'a', 'b', 'c', 'd', 'e' };

		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;// 1~10을 순서대로 배열에 삽입
		}
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1;// 1~10을 랜덤으로 추출 후 배열에 삽입
		}
		
		for(int i = 0; i <iArr1.length; i++) {
			System.out.print(iArr1[i]+","); // iArr1 저장된 값을 순차적으로 출력
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));//배열내에 정수형을 문자형으로 변경하여 출력
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}

}
