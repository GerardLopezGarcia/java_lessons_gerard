package com.ironhack.w1d1;

public class Course {
    private int classId;
    private String capacity;
    private int studentCount;
    private String title;

    public Course (int classId,String capacity, int studentCount,String title){
        setClassId(classId);
        setCapacity(capacity);
        setStudentCount(studentCount);
        setTitle(title);
    }


    public void setClassId(int classId){
        this.classId = classId;
    }
    public void setCapacity (String Capacity){
        this.capacity = capacity;
    }
    public void setStudentCount( int studentCount){
        this.studentCount = studentCount;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getClassId(){
        return this.classId;
    }
    public String getCapacity(){
        return this.capacity;
    }
    public int getStudentCount(){
        return this.studentCount;
    }
    public String getTitle(){
        return this.title;
    }
}
