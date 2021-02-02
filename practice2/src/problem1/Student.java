package problem1;

class Student {
	String name;
	int id;
	int yearOfStudy;
	
	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	String getName() {
		return name;
	}
	int getId() {
		return id;
	}
	int getYearOfStudy() {
		return yearOfStudy;
	}
	void setYearOfStudy(int yearOfStudent) {
		this.yearOfStudy = yearOfStudent;
	}
}

