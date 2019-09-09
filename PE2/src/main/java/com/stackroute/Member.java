package com.stackroute;

public class Member {
    String memberName;
    int memberAge;
    double memberSalary;
    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberAge=" + memberAge +
                ", memberSalary=" + memberSalary +
                '}';
    }

}
