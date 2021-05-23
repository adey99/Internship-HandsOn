import java.util.*;
public class Library{
    private List<Member> memberList;
    public Library(){
        memberList=new ArrayList<Member>();
    }
    public List<Member> getMemberList(){
        return this.memberList;
    }
    public void setMemberList(List<Member> memberList){
        this.memberList = memberList;
    }
    public void addMember(Member memberObj){
        this.memberList.add(memberObj);
    }
    public List<Member> viewAllMembers(){
        return this.memberList;
    }
    public List<Member> viewMembersByAddress(String address){
        List<Member> list =new ArrayList<Member>();
        for(Member m:this.memberList){
            if(m.getAddress().equals(address))
                list.add(m);
        }
        return list;
    }
}