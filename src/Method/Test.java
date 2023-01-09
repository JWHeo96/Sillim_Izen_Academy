package Method;

/* 메소드 오버로딩?
 * - 메소드 이름은 같으나 인자의 갯수나 데이터 형이 다르면 다르게 인식하여 처리 됩니다.
 */

public class Test {
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
	
	public static void main(String[] args) {
		sum(4);
		sum(4,4);
		sum(4,4,4);
		sum(5,5,4,4);
		sum(1,2,3,4,5);
		sum(11.12, 22.33, 33.44, 44.55);
	}

}
