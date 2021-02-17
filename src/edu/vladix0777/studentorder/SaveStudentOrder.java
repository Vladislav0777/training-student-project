package edu.vladix0777.studentorder;

import edu.vladix0777.studentorder.domain.Adult;
import edu.vladix0777.studentorder.domain.StudentOrder;

public class SaveStudentOrder
{
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder (StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder");
        return answer;
    }

    static  StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Andrey");
        so.setHusband(husband);

        husband.getPersonString();
        return so;
    }
}