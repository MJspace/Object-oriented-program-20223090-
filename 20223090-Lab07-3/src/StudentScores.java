
public class StudentScores
{	
	private final int MAX_STUDENTS = 100;
	private Student[] student;
	private int numStudents;
	
	public StudentScores(){
		student = new Student[MAX_STUDENTS];
		numStudents=0;
	}

	public void add(String name, int score)
	{
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		student[numStudents] = new Student(name, score);
		numStudents++;
	}
	public String getHighest(){
		if (numStudents == 0)
			return null;
		int highest = 0;
		for (int i = 1; i < numStudents; i++)
			if (student[i].getScores() > student[highest].getScores())
				highest = i;
		return student[highest].getNames();
	}
	public String getLowest() {
		if (numStudents == 0)
			return null;
		int lowest = 0;
		for (int i = 1; i < numStudents; i++)
			if (student[i].getScores() < student[lowest].getScores())
				lowest = i;
		return student[lowest].getNames();
	}
}