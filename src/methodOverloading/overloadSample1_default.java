package methodOverloading;

/* 메소드 오버로딩?
 * - 메소드 이름은 같ㅇ드나, 데이터 타입과 데이터 갯수가 다르면 다른 역을 하는 메소드를 말합니다.
 */

public class overloadSample1_default {
	
	private static int sum; // 0 > 4> 8 > 12 > 18 > 15
	private static double sum2;
	
	public static void sum(int i) {
		sum = i;
		System.out.println(sum);
	}
	public static void sum(int i, int j) {
		sum = i + j;
		System.out.println(sum);
	}
	public static void sum(int i, int j, int k) {
		sum = i+j+k;
		System.out.println(sum);
	}
	public static void sum(int i, int j, int k, int m) {
		sum = i+j+k+m;
		System.out.println(sum);
	}
	public static void sum(int i, int j, int k, int m, int n) {
		sum = i+j+k+m+n;
		System.out.println(sum);
	}
	private static void sum(double d, double e, double f, double g) {
		sum2 = d+e+f+g;
		System.out.println(sum2);
	}
	
	private static void print(String string) {
		String str = string + "반갑습니다.";
		System.out.println(str);
	}
	private static void print(String string, int x) {
		for(int i = 0; i < x ; i++) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		sum(4);
		sum(4,4);
		sum(4,4,4);
		sum(5,5,4,4);
		sum(1,2,3,4,5);
		sum(11.12, 22.33, 33.44, 44.55);
		print("안녕하세요?");
		print("다시 만나요.", 5);
	}


}
