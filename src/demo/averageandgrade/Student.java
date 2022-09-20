package demo.averageandgrade;

public class Student {
    private int id;
    private String name;
    private  int[] marks;
    private float  average;
    private  char grade;

    public Student(int sid, String name, int[] marks) {
        id=sid;
        this.name=name;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public Student(){
    }
    float avg=0;
    public void calculateAvg(){
        System.out.println("calAVG");
        int sum=0;
       for(int m :marks){
            sum=sum+m;
        }
         avg=sum/(float)marks.length;

    }
    public void findGrade(){
        System.out.println("GRADE");
       if(avg>80 && avg<100){
           setGrade('A');
       }else if(avg>60 && avg<80){
           setGrade('B');
       }else
           setGrade('F');
    }
    void display(){
        System.out.println("id : "+getId());
        System.out.println("name : "+getName());
        System.out.println("Average : "+getAverage());
        System.out.println("Grade : "+getGrade());
    }
}
