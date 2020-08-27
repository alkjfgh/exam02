package real;

public class GradeDataVO {
	private String studentName;
	private int studentId;
	private int kor;
	private int eng;
	private int mat;
	private int his;
	private int edps;
	private int total;
	private double avg;

	public GradeDataVO() {
		super();
		// TODO 자동 생성된 생성자 스텁
	}

	public GradeDataVO(String studentName, int studentId, int kor, int eng, int mat, int his, int edps) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.his = his;
		this.edps = edps;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getHis() {
		return his;
	}

	public void setHis(int his) {
		this.his = his;
	}

	public int getEdps() {
		return edps;
	}

	public void setEdps(int edps) {
		this.edps = edps;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + edps;
		result = prime * result + eng;
		result = prime * result + his;
		result = prime * result + kor;
		result = prime * result + mat;
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + total;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GradeDataVO other = (GradeDataVO) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (edps != other.edps)
			return false;
		if (eng != other.eng)
			return false;
		if (his != other.his)
			return false;
		if (kor != other.kor)
			return false;
		if (mat != other.mat)
			return false;
		if (studentId != other.studentId)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (total != other.total)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubjectDataVO [studentName=" + studentName + ", studentId=" + studentId + ", kor=" + kor + ", eng="
				+ eng + ", mat=" + mat + ", his=" + his + ", edps=" + edps + ", total=" + total + ", avg=" + avg + "]";
	}

}
