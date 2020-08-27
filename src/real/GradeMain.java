package real;

import java.util.Scanner;

public class GradeMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("인원수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.next());
		for (int i = 0; i < n; i++) {
			GradeDataVO vo = new GradeDataVO();
			DataInput inputData = new DataInput();
			vo.setStudentName(inputData.strDataInput("이름"));
			vo.setStudentId(inputData.intDataInput("학번"));
			vo.setKor(inputData.intDataInput("국어 점수"));
			vo.setEng(inputData.intDataInput("영어 점수"));
			vo.setMat(inputData.intDataInput("수학 점수"));
			vo.setHis(inputData.intDataInput("한국사 점수"));
			vo.setEdps(inputData.intDataInput("전산 점수"));

			GradeProcess gradeProcess = new GradeProcess(vo);
			vo.setTotal(gradeProcess.total());
			vo.setAvg(gradeProcess.avg(5));

			GradePrint gradePrint = new GradePrint();
			gradePrint.printData(vo);
		}
	}

}
