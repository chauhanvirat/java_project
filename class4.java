package OnlineClasses; 
public class class4 {
	public static void main(String[] args) {
	int n=123456;
	int i=0;
	int res=0;
	while(n!=0) {
		int r=n%10;
		res=res*10+r;
		n=n/10;
	}
			System.out.println(res);
	}
}
