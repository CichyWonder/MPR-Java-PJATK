package pl.pjatk.tdd;

public class Calculator {

    public static final int YEAR_LENGTH = 365;
    public static final int MONTH_LENGTH = 30;
    public static final String DATEFORMAT = "-";

    public static int calculateAge(String dateOfBirth, String givenDate) {
        checkDatesFormat(dateOfBirth, givenDate);

        int days = calculateDaysDifference(dateOfBirth, givenDate);

        if (days<0){
            throw new ArithmeticException("Given date should be after Birth Date");
        }
        int years = days/ YEAR_LENGTH;

        return years;
    }

    private static int calculateDaysDifference(String dateOfBirth, String givenDate) {
        String[] dateOfBirthAsArray = dateOfBirth.split(DATEFORMAT);
        String[] givebDateAsArray = givenDate.split(DATEFORMAT);
        int days = calculateDays(givebDateAsArray) - calculateDays(dateOfBirthAsArray);
        return days;
    }

    private static int calculateDays(String[] formattedDateArray){
        int years = Integer.parseInt(formattedDateArray[0]);
        int months = Integer.parseInt(formattedDateArray[1]);
        int days = Integer.parseInt(formattedDateArray[2]);

        return YEAR_LENGTH * years + MONTH_LENGTH *months+days;

    }

    private static void checkDatesFormat(String dateOfBirth, String givenDate) {
        String dateFormat = "\\d{4}-\\d{2}-\\d{2}";
        if (!dateOfBirth.matches(dateFormat)) {
            throw new IllegalArgumentException("Incorrect format of date birth!");
        }else if (!givenDate.matches(dateFormat)){
            throw new IllegalArgumentException("Incorrect format of given date!");
        }
    }
}
