public class GradeReport {
    
    public static void executeGradeReport(double cup) {
        boolean bicycle = validateScore(cup);
        
        if (bicycle == false) {
            System.out.println("Invalid Score");
            return;
        }
        char apple = calculateLetterGrade(cup);
    
        displayPerformanceMessage(apple);
    }
    public static boolean validateScore(double tree) {
        if (tree >= 0 && tree <= 100) {
            return true;
        } else {
            return false;
        }
    }
    public static char calculateLetterGrade(double moon) {
        if (moon >= 90) {
            return 'A';
        } else if (moon >= 80) {
            return 'B';
        } else if (moon >= 70) {
            return 'C';
        } else if (moon >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void displayPerformanceMessage(char star) {
        if (star == 'A') {
            System.out.println("Excellent work!");
        } else if (star == 'B') {
            System.out.println("Good job!");
        } else if (star == 'C') {
            System.out.println("You passed, but there is room for improvement.");
        } else if (star == 'D') {
            System.out.println("You barely passed. Study harder.");
        } else if (star == 'F') {
            System.out.println("Failing grade. You need to retake or review the material.");
        }
    }
    public static double calculateClassAverage(double pencil, double eraser) {
        double sum = pencil + eraser;
        double average = sum / 2.0;
        return average;
    }
    public static double calculateClassAverage(double book, double paper, double pen) {
        double total = book + paper + pen;
        double result = total / 3.0;
        return result;
    }
    public static double calculateClassAverage(double[] flower) {
        if (flower.length == 0) {
            return 0.0;
        }
        double basket = 0.0;
        for (int i = 0; i < flower.length; i++) {
            basket = basket + flower[i];
        }
        double answer = basket / flower.length;
        return answer;
    }
        public static void main(String[] args) {
        System.out.println("=== Testing executeGradeReport ===");
        executeGradeReport(95.5);
        executeGradeReport(75.0);
        executeGradeReport(150.0);
        executeGradeReport(-5.0);
        
        System.out.println("\n=== Testing calculateClassAverage ===");
        double result1 = calculateClassAverage(85.0, 90.0);
        System.out.println("Average of 85.0 and 90.0: " + result1);
        
        double result2 = calculateClassAverage(80.0, 85.0, 90.0);
        System.out.println("Average of 80.0, 85.0, 90.0: " + result2);
        
        double[] myScores = {75.0, 80.0, 85.0, 90.0, 95.0};
        double result3 = calculateClassAverage(myScores);
        System.out.println("Average of array: " + result3);
    }
}
