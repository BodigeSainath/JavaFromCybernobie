package demo.CgJavaBook.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class ex4 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> student=new HashMap<>();
        student.put(1,100);
        student.put(2,70);
        student.put(3,85);
        student.put(4,68);
        HashMap<Integer,String> grades=getStudents(student);
        for (Map.Entry<Integer,String> e :grades.entrySet()){
            System.out.println("Student registration numbver is "+e.getKey() +
                    " Achieved Medal "+e.getValue());
        }
    }
    public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> stu){
        HashMap<Integer,String> studentGrades=new HashMap<>();
        for(Map.Entry<Integer,Integer> entry : stu.entrySet()){
            if(entry.getValue()>=90 && entry.getValue()<=100){
                studentGrades.put(entry.getKey(),"Gold");
            }
            else if(entry.getValue()>=80 && entry.getValue()<=89){
                studentGrades.put(entry.getKey(),"Silver");
            }
            else if(entry.getValue()>=70 && entry.getValue()<=79){
                studentGrades.put(entry.getKey(),"Bronze");
            }
            else {
                studentGrades.put(entry.getKey(), "no medal");
            }
        }
        return studentGrades;
    }
}
