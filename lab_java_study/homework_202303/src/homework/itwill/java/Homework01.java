package homework.itwill.java;


import java.util.Random;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("����/����/�� �����Դϴ�.");
		System.out.println("�ش� ������ ��� ������ �ִ� 10ȸ���� ���Ⱑ �����մϴ�. \n\n");
		for (int i=1; i<=10; i++) { // ���������� ���ų�, �߸��� �Է��� �� ��� ���� �����ϵ��� 10ȸ �ݺ���
			int com1 = r1.nextInt(3); // com1�� ���������� ���� ����
			
			
			System.out.println("============\n[0] ���� \n[1] ���� \n[2] �� \n ============\n �����ϼ���>>>");
			int user = sc1.nextInt(); // �������� �Է¹��� ��ĳ�� ����
			String coms; // com1�� ���� ������ ���ڷ� ǥ���ϱ� ���� ��Ʈ�� ����
			String users; // user �� ���� ���� ���� ��
			
			if (user<=2 & user >=0) { // ������ �� �������� �Է��ϵ��� ���� ����
				if ( com1 == 0) { // com1�� ���� coms�� ���ڷ� ��ȯ
					coms = "����";
				} else if ( com1 == 1 ) {
					coms = "����";
				} else {
					coms = "��";
				}
				if (user == 0) { // user�� ���� users�� ���ڷ� ��ȯ
					users = " ����";
				} else if ( user ==1) {
					users = " ����";
				} else {
					users = "��";
				}
				System.out.println("computer(" + coms + ") : user(" + users + ")");
				
				if ( com1 == 0 ) { // com�� ���ǿ� ���� user�� � ���� �´����� ���� �б� ����(���ǰ�1)
					if ( user == 1 ) {
						System.out.println("User�� �¸��Դϴ�.");
						break;
					} else if ( user ==2) {
						System.out.println("Computer �� �¸��Դϴ�.");
						break;
					} else {
						System.out.println("�����ϴ�. ���⸦ �����ϼ���."); // ����� ��� ���⸦ �����϶�� �޽��� ���
						System.out.println((10-i) + " ȸ �����̽��ϴ�."); // 10ȸ �� ������� �ݺ��� i ������ �����Ͽ� �ܿ� Ƚ�� ���
						
					}
				} else if ( com1 == 1) { // ���� ��(���ǰ�2)
					if ( user == 2 ) {
						System.out.println("User�� �¸��Դϴ�.");
						break;
					} else if ( user ==0) {
						System.out.println("Computer �� �¸��Դϴ�.");
						break;
					} else {
						System.out.println("�����ϴ�. ���⸦ �����ϼ���.");
						System.out.println((10-i) + " ȸ �����̽��ϴ�.");
						
					}
				} else if ( com1 == 2) { // ���� ��(���ǰ�3)
					if ( user == 0 ) {
						System.out.println("User�� �¸��Դϴ�.");
						break;
					} else if ( user ==1) {
						System.out.println("Computer �� �¸��Դϴ�.");
						break;
					} else {
						System.out.println("�����ϴ�. ���⸦ �����ϼ���.");
						System.out.println((10-i) + " ȸ �����̽��ϴ�.");
						
					}
				}
			} else {
				System.out.println("�߸��� �Է��Դϴ�. ������ �ٽ� �����մϴ�.\n���� ���� ����Ƚ���� 1ȸ �����մϴ�."); 
				System.out.println((10-i) + " ȸ �����̽��ϴ�.");
			}
			
			System.out.println();
		}
		
		
	}

}
