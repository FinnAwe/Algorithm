package BackTracking;
import java.util.ArrayList;
import java.util.Scanner;;
/** ����һ���ַ�������������Ӽ�**/

public class Zuhe {
	public static void getZuhe(int i,int k,char[] A, ArrayList<Character> B){
		if(i>=k){
			System.out.println(B.toString());
		}else{
			char a=A[i];
			int size=B.size();
			B.add(size,a); getZuhe(i+1,k,A,B);//��B[size]����
			B.remove(size);getZuhe(i+1,k,A,B);//�س���ɾ��B[size]
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("�����ַ�����");
		String inputString=console.nextLine();
		char[] a=inputString.toCharArray();//��������ַ�����ת�ɵȼ۵��ַ�����
		int m=a.length;
		System.out.println("�����");
		getZuhe(0,m,a,new ArrayList<Character>());
	}

}
