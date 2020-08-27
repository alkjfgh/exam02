package exam02;

import java.util.Scanner;

//필요한 자료를 입력만 받아주는 기능
public class DataInput {

	// 입력받아서 자료를 정수형으로 변환
	@SuppressWarnings("resource")
	public int intScan(String message) {
		System.out.print(message + "을(를) 입력  : ");
		Scanner keyIn = null;
		keyIn = new Scanner(System.in);
		int inputData = Integer.parseInt(keyIn.next(), 10);
		keyIn = null;
		return inputData;
	}

	// 입력받아서 자료를 실수형(double)으로 변환
	@SuppressWarnings("resource")
	public double doubleScan(String message) {
		System.out.print(message + "을(를) 입력  : ");
		Scanner keyIn = null;
		keyIn = new Scanner(System.in);
		double inputData = Double.parseDouble(keyIn.next());
		keyIn = null;
		return inputData;
	}

	// 입력받아서 자료를 실수형(float)으로 변환
	@SuppressWarnings("resource")
	public float floatScan(String message) {
		System.out.print(message + "을(를) 입력  : ");
		Scanner keyIn = null;
		keyIn = new Scanner(System.in);
		return Float.parseFloat(keyIn.next());
	}

	// 입력받아서 자료를 문자열로 변환
	@SuppressWarnings("resource")
	public String stringScan(String message) {
		System.out.print(message + "을(를) 입력  : ");
		return new Scanner(System.in).next();
	}
}
