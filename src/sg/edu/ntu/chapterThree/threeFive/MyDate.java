package sg.edu.ntu.chapterThree.threeFive;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};
    public String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (isLeapYear(year) && month == 2) {
            return day <= 29;
        }
        return day <= DAYS_IN_MONTH[month - 1];
    }
    public int getDayOfWeek(int year, int month, int day) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year -= 1;
        }
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }
    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }
    public MyDate nextDay() {
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;
        if (isLeapYear(year) && month == 2) {
            if (nextDay > 29) {
                nextDay = 1;
                nextMonth++;
            }
        } else if (nextDay > DAYS_IN_MONTH[month - 1]) {
            nextDay = 1;
            nextMonth++;
        }
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
        return new MyDate(nextYear, nextMonth, nextDay);
    }
    public MyDate nextMonth() {
        int nextMonth = month + 1;
        int nextYear = year;
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
        return new MyDate(nextYear, nextMonth, day);
    }
    public MyDate nextYear() {
        MyDate newDate = new MyDate(year + 1, month, day);
        if (!isValidDate(newDate.year, newDate.month, newDate.day)) {
            // Adjust February 29 to February 28 in non-leap years
            newDate.day = 28;
        }
        return newDate;
    }

    public MyDate previousDay() {
        int previousDay = day - 1;
        int previousMonth = month;
        int previousYear = year;
        if (previousDay < 1) {
            previousMonth--;
            if (previousMonth < 1) {
                previousMonth = 12;
                previousYear--;
            }
            if (isLeapYear(previousYear) && previousMonth == 2) {
                previousDay = 29;
            } else {
                previousDay = DAYS_IN_MONTH[previousMonth - 1];
            }
        }
        return new MyDate(previousYear, previousMonth, previousDay);
    }
    public MyDate previousMonth() {
        int previousMonth = month - 1;
        int previousYear = year;
        if (previousMonth < 1) {
            previousMonth = 12;
            previousYear--;
        }
        return new MyDate(previousYear, previousMonth, day);
    }
    public MyDate previousYear() {
        int newYear = year - 1;
        int newDay = day;

        // If moving to a non-leap year from Feb 29, adjust the day to 28
        if (month == 2 && day == 29 && !isLeapYear(newYear)) {
            newDay = 28;
        }

        return new MyDate(newYear, month, newDay);
    }

}
