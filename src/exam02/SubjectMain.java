package exam02;

public class SubjectMain {

	public static void main(String[] args) {
		// 필요한 자료(학번, 이름, 점수)를 입력받고
		DataInput inputData = new DataInput();
		String studentName = inputData.stringScan("이름");
		int studentId = inputData.intScan("학번");
		int kor = inputData.intScan("국어 점수");
		int eng = inputData.intScan("영어 점수");
		int mat = inputData.intScan("수학 점수");
		int his = inputData.intScan("한국사 점수");
		int edps = inputData.intScan("전산 점수");
		
		SubjectProcess subjectProcess = new SubjectProcess();
		int total = subjectProcess.total(kor,eng,mat,his,edps);
		double avg = subjectProcess.avg(total,5);
		ResultPrint resultPrint = new ResultPrint();
		resultPrint.printData(studentName,studentId,total,avg);
		// 처리(총점, 평균)를 한다
		// 해당 결과를 출력한다
	}

}
