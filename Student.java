class Student {
	String index;
	String firstName;
	String lastName;
	int grades[] = new int[5];
	
	//TODO constructor
	public Student(){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	//TODO seters & getters
	public void setIndex(String index){
		this.index = index;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastNameName;
	}
	
	public String getIndex(){
		return index;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public double getAverage() {
		//TODO
		int sum = 0;
		for(int i=0; i<5; i++) { 
           sum = sum + grades[i];
        }
		return (sum / 5);
	}

	public int ECTSCredits() {
		//TODO
		int credits = 0;
		for(int i=0; i<5; i++) { 
           if (grades[i] >= '6'){
			   credits = credits + 6;
		   }
        }
		return credits;
		
	}
}
