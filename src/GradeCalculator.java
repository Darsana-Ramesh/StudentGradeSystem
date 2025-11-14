public class GradeCalculator {

    public static int getTotal(Student s) {
        return s.getM1() + s.getM2() + s.getM3();
    }

    public static double getAverage(Student s) {
        return getTotal(s) / 3.0;
    }

    public static char getGrade(Student s) {
        double avg = getAverage(s);

        if (avg >= 90) return 'A';
        if (avg >= 75) return 'B';
        if (avg >= 60) return 'C';
        if (avg >= 50) return 'D';
        else return 'F';
    }
}
