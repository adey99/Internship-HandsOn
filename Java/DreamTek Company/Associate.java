public class Associate{
    private int associateId;
    private String associateName,workStatus;
    public Associate(){
        this.associateId = 0;
        this.associateName = "";
        this.workStatus="";
    }
    public int getAssociateId(){
        return this.associateId;
    }
    public void setAssociateId(int id){
        this.associateId=id;
    }
    public String getAssociateName(){
        return this.associateName;
    }
    public void setAssociateName(String name){
        this.associateName = name;
    }
    public String getWorkStatus(){
        return this.workStatus;
    }
    public void setWorkStatus(String ws){
        this.workStatus=ws;
    }
    public void trackAssociateStatus(int days){
        if(days<=20)
            this.setWorkStatus("Core skills");
        else if(days>20&&days<=40)
            this.setWorkStatus("Advanced modules");
        else if(days>40&&days<=60)
            this.setWorkStatus("Project phase");
        else if(days>60)
            this.setWorkStatus("Deployed in project");
    }
}