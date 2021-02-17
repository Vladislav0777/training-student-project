package edu.vladix0777.studentorder;

import edu.vladix0777.studentorder.domain.Adult;
import edu.vladix0777.studentorder.domain.StudentOrder;

public class SaveStudentOrder
{
    public static void main(String[] args) {
//        StudentOrder so = new StudentOrder();

//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }
    static long saveStudentOrder (StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder");
        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        
        Adult husband = new Adult("wsds", "dssd", "dsds", null);

        return so;
    }
}