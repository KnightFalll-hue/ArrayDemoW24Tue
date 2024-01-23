/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author michael
 */
public class StudentList {
    public static void main(String[] args){
        Student[] studentList = new Student[3];
        Student s1 = new Student(1,"Michael");
        
        studentList[0]=s1;
        studentList[1]=new Student(2,"Mike");
        studentList[2]=new Student(3,"Micky");
        
        for(int i=0; i<studentList.length; i++) {
            System.out.println(studentList[i].getSname());
        }
    }
}
