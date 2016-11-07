package BackTracking;
import java.util.ArrayList;
import java.util.Scanner;;
/** 输入一个字符串，输出其真子集**/

public class Zuhe {
	public static void getZuhe(int i,int k,char[] A, ArrayList<Character> B){
		if(i>=k){
			System.out.println(B.toString());
		}else{
			char a=A[i];
			int size=B.size();
			B.add(size,a); getZuhe(i+1,k,A,B);//在B[size]插入
			B.remove(size);getZuhe(i+1,k,A,B);//回撤，删除B[size]
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("输入字符串：");
		String inputString=console.nextLine();
		char[] a=inputString.toCharArray();//把输入的字符串，转成等价的字符数组
		int m=a.length;
		System.out.println("输出：");
		getZuhe(0,m,a,new ArrayList<Character>());
	}

}
