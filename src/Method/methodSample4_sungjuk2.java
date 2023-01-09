package Method;

public class methodSample4_sungjuk2 {

	public static void main(String[] args) {

		methodSample4_sungjuk ms = new methodSample4_sungjuk();
		
		ms.sungjukOutput();
		System.out.println(ms.kor); // 객체명.메소드명
		System.out.println(ms.total);
		System.out.println(ms.avg);
		
		//클래스명.클래스변수명
		System.out.println(methodSample4_sungjuk.kor);
		System.out.println(methodSample4_sungjuk.grade);

		methodSample4_sungjuk.sungjukOutput();
		
	}
}
