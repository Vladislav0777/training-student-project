package edu.vladix0777.studentorder;

import edu.vladix0777.studentorder.domain.Adult;
import edu.vladix0777.studentorder.domain.Child;
import edu.vladix0777.studentorder.domain.StudentOrder;

import java.time.LocalDate;

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
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        so.setMarriageOffice("Отдел ЗАГС");

  //      Address address = new Address("195000", "street", "12", "", "142");

        // Муж
        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100090 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        husband.setIssueDepartment("Policia #" + id);
        husband.setStudentId("" + (100000 + id));
    //    husband.setAddress(address);

        // Жена
        Adult wife = new Adult("Петрова", "Вероника", "Алекссевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(1997, 8, 24));
        wife.setIssueDepartment("Policia #" + id);
        wife.setStudentId("" + (200000 + id));
    //    wife.setAddress(address);

        // Ребенок
        Child child = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child.setCertificateNumber("" + (300000 + id));Москва
        child.setIssueDate(LocalDate.of(1998, 6, 12));
        child.setIssueDepartment("Otdel ZAGS #" + id);
    //    child.setAddress(address);

        so.setHusband(husband);
        so.setWife(wife);
     //   so.addChild(child1);
     //   so.addChild(child2);

        return so;
    }
}