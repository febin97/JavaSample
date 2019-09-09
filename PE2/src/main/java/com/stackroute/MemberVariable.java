package com.stackroute;

public class MemberVariable {
    public static void main(String[] args) {
        Member newMember = new Member();
        newMember.memberName = "Harry Potter";
        newMember.memberAge = 30;
        newMember.memberSalary = 2500.3;
        System.out.println(newMember.toString());
    }
}
