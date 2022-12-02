
package Lesson22HomeWork;


public class Student {
    private StringBuilder name;
    private int course;
    private int grade;
    
    
    public void setName (StringBuilder n){
        if(n.length()>=3){
            name = n;
        }        
    }
    
    public void setCourse(int c){
        if (c>0 && c<5){
            course = c;
        }        
    }
    
    public void setGrade(int g){
        if (g>0 && g<11){
            grade = g;
        }    
    }
    
    public void showInfo(){
        StringBuilder sb = new StringBuilder (name);
        int c  = course;
        int g = grade;
        System.out.println ("Name: " + sb);
        System.out.println ("Course: " + c);
        System.out.println ("Grade: " + g);
    }
    
}


class TestStudent {
    public static void main (String []args){
        Student s = new Student();
        s.setName(new StringBuilder ("Victor"));
        s.setCourse(4);
        s.setGrade(7);        
        s.showInfo();
    }
    
}