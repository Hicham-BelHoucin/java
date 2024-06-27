package java_module_00.ex03;

import java.util.Scanner;

public class Program {
    private static final int MAX_WEEKS = 18;
    private static int[] minGradeInweeks = new int[18];
    private static int end = 0;

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void print() {
        for (int i = 0; i < end; i++) {
            System.out.print("week " + (int) (i + 1) + ' ');
            for (int j = 0; j < minGradeInweeks[i]; j++) {
                System.out.print('=');
            }
            System.out.println('>');
        }
    }

    private static void error() {
        System.err.println("IllegalArgument");
        System.exit(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("-> ");
            if (sc.hasNext()) {
                String input = sc.next();

                if (input.equals("42") || end == MAX_WEEKS) {
                    print();
                    sc.close();
                    break;
                } else if (input.equals("Week")) {
                    int week = sc.nextInt();
                    if (week != (end + 1)) {
                        error();
                    }
                    System.out.print("-> ");
                    int[] grades = new int[5];
                    if (sc.hasNextLine()) {
                        for (int i = 0; i < 5; i++) {
                            if (!sc.hasNextInt()) {
                                error();
                            }
                            int grade = sc.nextInt();
                            if (grade < 1 || grade > 9) {
                                error();
                            }
                            grades[i] = grade;
                        }
                        int minGrade = min(grades);
                        minGradeInweeks[end] = minGrade;
                        end++;
                    }
                } else {
                    error();
                }
            }
        }
    }
}
