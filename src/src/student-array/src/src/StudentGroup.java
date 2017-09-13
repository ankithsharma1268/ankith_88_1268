import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private int length;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.length=length;
	}

	@Override
	public Student[] getStudents() {
		for(int i=0;i<length;i++)
			return students[i];
		
	}

	@Override
	public void setStudents(Student[] students) {
		for(int i=0;i<length;i++)
			this.students[i]=students[i];
		
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 || index>length)
			throw IllegalArgumentException;
		else{
			return students[i];
		}
		//return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		students[length+1]=student;
	}

	@Override
	public void add(Student student, int index) {
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		for(int i=index;i<length;i++)
			students[index]=students[index+1];
	}

	@Override
	public void remove(Student student) {
	for(int i=0;i<length;i++){
		if(studens[i]==student){
			for(int j=i;j<length;j++)
				students[j]=students[j+1];
		}
		else
		continue;
			
	}
	}

	@Override
	public void removeFromIndex(int index) {
		length=index;
	}

	@Override
	public void removeFromElement(Student student) {
		for(int i=0;i<length;i++){
			if(students[index]==student)
				length=index;
		}
	}

	@Override
	public void removeToIndex(int index) {
				int j=0;
				for(int i=index+1;i<=length;i++){
					students[j]=students[i];
					j++;
				}
		
				
		}
	

	@Override
	public void removeToElement(Student student) {
		for(int i=0;i<length;i++){
			if(students[i]==student){
				int k=0;
				for(int j=i+1;j<length;j++){
					students[k]=students[j];
					k++;
				}
					
			}
		}
	}

	@Override
	public void bubbleSort() {
	
	for(int i=0;i<length;i++){
		for(int j=0;j<length;j++){
		if(students.id[j]>students.id[j+1]){
			students.id[j]=students.id[j]+students.id[j+1];
			students.id[j+1]=students.id[j]-students.id[j+1];
			students.id[j]=students.id[j]-students.id[j+1];
		}
		}
	}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		for(int i=0;i<length;i++){
			if(date.equals(student.date))
				return Student.name[i];
		}
	
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		for(int i=0;i<length;i++){
			if(students.date.after(firstDate) && students.date.before(lastDate))
				return Student.name[i];
		}
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		 return null;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		int max=students.avgmark[0];
		for(int i=0;i<n;i++){
			if(max<students.avgmark[i]){
				max=students.avgmark[i];
				return students.fullname[i];
		}
		}
		
	}

	@Override
	public Student getNextStudent(Student student) {
		for(int i=0;i<length;i++){
			if(students.fullname[i]==student)
				return students.fullname[i+1];
		}
	}
}
