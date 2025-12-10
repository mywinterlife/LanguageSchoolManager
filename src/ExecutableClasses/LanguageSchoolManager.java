package ExecutableClasses;

import java.math.BigDecimal;
import java.util.HashMap;
/**
public class LanguageSchoolManager
{
    //Dictionary<int, EnrollmentRecord> _enrollments
    HashMap<Integer, EnrollmentRecord> enrollments = new HashMap<Integer, EnrollmentRecord>();

    //Current/Next
    private int nextEnrollmentId =1;

    private int getNextEnrollmentId()
    {
        return nextEnrollmentId++;
    }

    //	void DisplayLanguages()
    public void DisplayLanguages()
    {

    }

    //	int Enroll(Student student, LanguageEnum language) // requires placement test
    // when enrolled a record is created with an id
    public int Enroll(Student student, LanguageEnum language)

    {
        //Check if placement test
        if (student.HasPlacementTestResult)
        {
            //If placement test true create enrollment record
            EnrollmentRecord  enrollmentRecord = new EnrollmentRecord( getNextEnrollmentId(), student.PersonId,language, getEnrollmentCostByLanguage(language));
            this.hashMap.put(enrollmentRecord.EnrollmentId, enrollmentRecord);

            //return the enrollment record id
            return enrollmentRecord.EnrollmentId;


        }
        else
        {
        //If no bail out do not enroll.
            System.out.println("Student cannot be enrolled without placement result");
            return -1;
        }





    }



    //	bool CancelEnrollment(int enrollmentId)
    public boolean CancelEnrollment(int enrollmentId)
    {
        this.hashMap.remove(enrollmentId);
        return true;

        if (hashMap.containsKey(enrollmentId))
        {
            return true;
            this.hashMap.remove(enrollmentId);
        }

        return false;
    }

    //	decimal GetCurrentlyEnrolledStudentTotalRevenue()
    public BigDecimal GetCurrentlyEnrolledStudentTotalRevenue()

    //
    public BigDecimal getEnrollmentCostByLanguage(LanguageEnum language)
    {
        switch (language)
        {
            case English:
                return BigDecimal.valueOf(1000);

            case Spanish:
                return BigDecimal.valueOf(1200);

            case Japanese:
                return BigDecimal.valueOf(1100);

            default:
                return  BigDecimal.ZERO;
        }




    }
}
*/
