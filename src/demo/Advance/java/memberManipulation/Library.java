package demo.Advance.java.memberManipulation;

import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Member>  memberList = new ArrayList();

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
    public void addMember(Member memberObj){
        memberList.add(memberObj);
    }
    public List<Member> viewAllMembers(){
        return memberList;
    }

    public List<Member> viewMembersByAddress(String address){
        List<Member> viewByAddress =new ArrayList<>();
        for(Member m : memberList){
            if(m.getAddress().contains(address)){
                viewByAddress.add(m);
            }
        }
        return viewByAddress;
    }
}
