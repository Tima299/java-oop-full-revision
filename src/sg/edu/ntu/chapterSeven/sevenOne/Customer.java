package sg.edu.ntu.chapterSeven.sevenOne;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;
    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean isMember(){
        return member;
    }
    public void setMember(boolean member){
        this.member = member;
    }
    public String getMemberType(){
        return memberType;
    }
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }
    public String toString(){
        return name;
    }
}
