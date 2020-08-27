package real;

public class GradeProcess {

	GradeDataVO vo;

	public GradeProcess(GradeDataVO vo) { // 생성자 함수
		this.vo = vo;
	}

	public int total() {
		int[] data=vo.getSubject();
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=data[i];
		}
		return sum;
	}

	public double avg(int i) {
		return vo.getTotal() * 1.0 / i;
	}
}
