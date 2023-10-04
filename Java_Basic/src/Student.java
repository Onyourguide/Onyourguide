public class Student {
    private String name;
    private int midtermScore;
    private int finalScore;

    public Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public void showGrade() {
        double score = (midtermScore * 0.4) + (finalScore * 0.4) + 20;
        char grade;

        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is " + grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Guide", 85, 90);
        Student student2 = new Student("Guide2", 70, 75);

        student1.showGrade();
        student2.showGrade();
    }
}
