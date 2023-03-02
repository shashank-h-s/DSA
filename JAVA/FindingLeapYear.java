public class FindingLeapYear {
    static String findingLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return "Leap year";
                else
                    return "not leap";
            } else
                return "leap year";
        }
        return "not leap year";
    }

    public static void main(String[] args) {
        System.out.println(findingLeapYear(2000));
        System.out.println(findingLeapYear(2023));
    }
}
