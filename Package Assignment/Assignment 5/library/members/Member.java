package library.members;

public class Member {
    private String name;
    private String memberId;
    private String type;
    
    public Member(String name, String memberId, String type) {
        this.name = name;
        this.memberId = memberId;
        this.type = type;
    }
    
    public void displayMemberDetails() {
        System.out.println("Member Registered: " + name + " [ID: " + memberId + ", Type: " + type + "]");
    }
}

