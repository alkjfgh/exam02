package real;

public class GradePrint {
	
	public void printData(GradeDataVO vo) {
		System.out.println("이름 : "+vo.getStudentName()+"\n학번 : "+ vo.getStudentId() + "\n총점 : " + vo.getTotal() + "점"
				+ "\n평균 : " + vo.getAvg() + "점\n\n");
	}
	
}