package real;

import java.util.Arrays;

public class GradeDataVO {
	private String studentName;
	private int studentId;
	private int subject[];
	private int total;
	private double avg;

	public GradeDataVO() {
		super();
		// TODO 자동 생성된 생성자 스텁
	}

	public GradeDataVO(String studentName, int studentId, int[] subject) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
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

	public int[] getSubject() {
		return subject;
	}

	public void setSubject(int[] subject) {
		this.subject = subject;
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
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + Arrays.hashCode(subject);
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
		if (studentId != other.studentId)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (!Arrays.equals(subject, other.subject))
			return false;
		if (total != other.total)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GradeDataVO [studentName=" + studentName + ", studentId=" + studentId + ", subject="
				+ Arrays.toString(subject) + ", total=" + total + ", avg=" + avg + "]";
	}

}
