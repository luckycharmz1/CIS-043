public class Date {
    // Instance variables
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    // Setters with validation
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12.");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 || day > getDaysInMonth(month, year)) {
            throw new IllegalArgumentException("Day must be between 1 and " + getDaysInMonth(month, year) + " for month " + month + ".");
        }
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Year cannot be negative.");
        }
        this.year = year;
    }

    // Method to return the number of days in a month
    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // January, March, May, July, August, October, December
            case 4: case 6: case 9: case 11:
                return 30; // April, June, September, November
            case 2:
                return isLeapYear(year) ? 29 : 28; // February
            default:
                return 0; // Invalid month
        }
    }

    // Method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to increment the day by one
    public void nextDay() {
        day++;
        if (day > getDaysInMonth(month, year)) {
            day = 1; // Reset day to 1
            month++; // Increment month
            if (month > 12) {
                month = 1; // Reset month to January
                year++; // Increment year
            }
        }
    }

    // Method to print the date in MM/DD/YYYY format
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
}