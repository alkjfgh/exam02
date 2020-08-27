package exam02;

public class SubjectProcess {

	public int total(int kor, int eng, int mat, int his, int edps) {
		return kor+eng+mat+his+edps;
	}

	public double avg(int total, int i) {
		return total*1.0/i;
	}

}
