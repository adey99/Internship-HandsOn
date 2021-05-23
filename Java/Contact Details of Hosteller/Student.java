public class Student{
    protected int studentId,departmentId;
    protected String name,gender,phone;
    public int getStudentId(){
        return this.studentId;
    }
    public void setStudentId(int id){
        this.studentId = id;
    }
    public int getDepartmentId(){
        return this.departmentId;
    }
    public void setDepartmentId(int dept_id){
        this.departmentId = dept_id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gen){
        this.gender = gen;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String ph){
        this.phone=ph;
    }
}