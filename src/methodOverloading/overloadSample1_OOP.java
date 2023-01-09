package methodOverloading;

/* 메소드 오버로딩?
 * - 메소드 이름은 같ㅇ드나, 데이터 타입과 데이터 갯수가 다르면 다른 역을 하는 메소드를 말합니다.
 * 
 * 객체지향 프로그래밍(OOP)
 * 클래스: 객체를 생성하기 위한 기본 틀
 * 객체 = 모든 사물
 *   예> 안경
 * - 속성: 렌즈 2개, 코받침, 프레임, 제조회사, 가격, 색상 ...
 * - 기능: 시력 보호, 잘 보이기 위한 것 ...
 */

public class overloadSample1_OOP {
	
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
	
	@SuppressWarnings("static-access") // > annotation
	public static void main(String[] args) {
		
		overloadSample1_OOP os = new overloadSample1_OOP();
		//pointer = object = address =>
		System.out.println(os); //methodOverloading.overloadSample1_OOP@1a3869f4: 주소값
		os.sum(4);
		os.sum(4, 4);
		os.sum(4,4,4); // 객체명.메소드명
		os.sum(5,5,4,4);
		os.sum(1,2,3,4,5);
		os.sum(11.12, 22.33, 33.44, 44.55);
		os.print("안녕하세요?");
		os.print("다시 만나요.", 5);
	}


}
