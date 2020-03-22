class Faculty {
	String facultyName;
	List<Student> students = new ArrayList<Student>();
	
	//TODO constructor
	public Student(){
		this.facultyName = facultyName;		
	}

	//TODO seters & getters
	public void setfacultyName(String facultyName){
		this.facultyName = facultyName;
	}
	
	public String getFacultyName(){
		return facultyName;
	}
	
	public boolean addStudent(Student student){
        if (student==null || studentList.contains(student)) {
            return false;
        }
        studentList.add(student);
        return true;
    }
		
	
}