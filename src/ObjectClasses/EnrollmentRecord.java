package ObjectClasses;

import java.math.BigDecimal;

public class EnrollmentRecord

{
    //int EnrollmentId
    public int EnrollmentId;

    //	int PersonId
    public int PersonId;

    //	LanguageEnum Language
    public LanguageEnum Language;

    //	decimal TuitionCost
    public BigDecimal TuitionCost;

    public EnrollmentRecord(int enrollmentId, int personId, LanguageEnum language, BigDecimal tuitionCost)
    {
        EnrollmentId = enrollmentId;
        PersonId = personId;
        Language = language;
        TuitionCost = tuitionCost;
    }
}
