
public class ArrayEx3 {
	public static void main(String[] args) {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {//�迭�� 2��° ��Һ��� �б� ���� ���۰� 1
			if (score[i] > max) {//�迭�� ��Ұ� max���� ũ��
				max = score[i];// �� ���ڰ� max
			}else if(score[i] < min){
				min = score[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}
}
