package real;

import java.util.Scanner;

public class DataInput {

//	문자열을 입력 받아서 입력 받은 자료를 반환
	@SuppressWarnings("resource")
	public String strDataInput(String message) {
		System.out.println(message + "을(를) 입력하세요");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}

//	문자열을 입력받아서 숫자로 변환
	public int intDataInput(String message) {
		return Integer.parseInt(strDataInput(message));
	}
}
