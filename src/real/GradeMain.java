package real;

public class GradeMain {

	public static void main(String[] args) {
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
