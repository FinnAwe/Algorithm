package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class Pailie {
	private static int count=0;
	public static void getPailie(int i,int n,char[] A,char[] B){
		if(i>=n){
			String out=new String(B);
			System.out.println(" "+out+" "+(++count));
			//System.out.println(Arrays.toString(B)+"   "+(++count));//���}
		}
		else{
			for(int j=0;j<n;j++){
				if(!contains(B,A[j])){
					// if B contain A[j]
					B[i]=A[j]; getPailie(i+1,n,A,B);
				}
				B[i]=' ';
			}
		}
	}
	//if B contain c ,return true,else return false
	public static boolean contains(char[] B,char c){
		int m=B.length;
		for(int i=0;i<m;i++){
			if(c==B[i])return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("�����ַ�������Ԫ�ز��ظ����� ");
		String a=console.nextLine();
		//String a="abcdef";��������
		if(a==null)System.out.println("�����Ч");
		else{
			char[] as=a.toCharArray();
			char[] bs=new char[as.length];
			System.out.println("���ȫ���У�");
			getPailie(0,as.length,as,bs);
		}
	}

}
