package edu.vladix0777.studentorder;

import edu.vladix0777.studentorder.domain.StudentOrder;

public class SaveStudentOrder
{
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "";
        so.hFirstName = "";
        so.hFirstName = "";
        so.hFirstName = "";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder (StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.hLastName);
        return answer;
    }
}