package real;

public class GradeProcess {

	GradeDataVO vo;

	public GradeProcess(GradeDataVO vo) { // 생성자 함수
		this.vo = vo;
	}

	public int total() {
		return vo.getKor() + vo.getEng() + vo.getMat() + vo.getHis() + vo.getEdps();
	}

	public double avg(int i) {
		return vo.getTotal() * 1.0 / i;
	}
}
