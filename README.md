
Created with java template also in my repository.
Java program app translated from C.
---

## License

This project is licensed under the MIT License.  
You may freely use, modify, and distribute this.

---

## Contributing

If you customize this code for your own workflow, feel free to fork it or submit suggestions.

## Project Requirements Outline:
Person
	int PersonId
	string Name
	DateTime BirthDate
 
Student : Person
	bool HasPlacementTestResult
 
LanguageSchoolManager
	Dictionary<int, EnrollmentRecord> _enrollments
	void DisplayLanguages()
	int Enroll(Student student, LanguageEnum language) // requires placement test
	bool CancelEnrollment(int enrollmentId)
	decimal GetCurrentlyEnrolledStudentTotalRevenue()
 
EnrollmentRecord
	int EnrollmentId
	int PersonId
	LanguageEnum Language
	decimal TuitionCost
 
LanguageEnum
	English
	Spanish
	Japanese
 
Static LanguageHelper
	GetLanguageInfo(LanguageEnum language)
 
Program Menu
	Create 3 Student objects
	Menu
		Display Languages
		Enroll
		Cancel Enrollment
		Get Total Revenue
