public class Student{
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    public Student(int id,String name,int[] marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.average=0.0f;
        this.grade='U';
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int[] getMarks(){
        return this.marks;
    }
    public void setMarks(int[] marks){
        this.marks=marks;
    }
    public float getAverage(){
        return this.average;
    }
    public void setAverage(float average){
        this.average=average;
    }
    public char getGrade(){
        return this.grade;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public void calculateAvg(){
        for(int i=0;i<this.marks.length;i++){
            this.average+=this.marks[i];
            if(marks[i]<50&&this.grade!='F')
                this.grade='F';
        }
        this.average=(float)(average/this.marks.length);
    }
    public void findGrade(){
        if(this.grade=='F')
            return;
        else{
            if(average>=80&&average<=100)
                this.grade='O';
            else
                this.grade='A';
        }
    }
}