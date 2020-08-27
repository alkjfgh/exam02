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
			int data[] = new int[5];
			vo.setStudentName(inputData.strDataInput("이름"));
			vo.setStudentId(inputData.intDataInput("학번"));
			data[0] = inputData.intDataInput("국어 점수");
			data[1] = inputData.intDataInput("영어 점수");
			data[2] = inputData.intDataInput("수학 점수");
			data[3] = inputData.intDataInput("한국사 점수");
			data[4] = inputData.intDataInput("전산 점수");
			vo.setSubject(data);

			GradeProcess gradeProcess = new GradeProcess(vo);
			vo.setTotal(gradeProcess.total());
			vo.setAvg(gradeProcess.avg(5));

			GradePrint gradePrint = new GradePrint();
			gradePrint.printData(vo);
		}
	}

}