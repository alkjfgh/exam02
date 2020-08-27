package real;

public class GradePrint {
	public void printData(GradeDataVO vo) {
		System.out.println(vo.getStudentName() + " 학생\n" + vo.getStudentId() + " 학번\n" + "총점 : " + vo.getTotal() + "점\n"
				+ "평균 : " + vo.getAvg() + "점");
	}
}
