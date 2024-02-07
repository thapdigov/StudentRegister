/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Student;
import data.Base;

/**
 *
 * @author Behruz Tapdiqov
 */
public class StudentUtil {

    public static Student fillStudent() {

        String ad = InputUtill.textal("Telebenin adini daxil edin");
        String soyad = InputUtill.textal("Telebenin soyadini daxil edin");
        String qrup = InputUtill.textal("Telebenin qrupunu daxil edin");
        int yas = InputUtill.ededal("Telebenin yasini daxil edin");
        return new Student(ad, soyad, qrup,yas);
    }

    public static void StudentRegstration() {
        int count = InputUtill.ededal("Nece telebe elave etmek isteyirsiniz?");
        Base.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Qeydiyyat");
            Base.students[i] = StudentUtil.fillStudent();

        }

    }

    public static void StudentShow() {

        for (int i = 0; i < Base.students.length; i++) {
            if (Base.students[i] != null) {
                System.out.println((i + 1) + "." + Base.students[i]);
            }
        }
    }

    public static void Studentfind() {
        String text = InputUtill.textal("Axtarmaq istediyinizi yazin");
        for (int i = 0; i < Base.students.length; i++) {
            if (Base.students[i].getName().contains(text)
                    || Base.students[i].getSurname().contains(text)
                    || Base.students[i].getGroup().contains(text)) {
                System.out.println(Base.students[i]);
            }
        }

    }

    public static void StudentChangeInformation() {

        StudentUtil.StudentShow();
        int nomre = InputUtill.ededal("Necenci telebenin melumatlarini deyismek isteyirsiniz?") - 1;
        Student s = Base.students[nomre];
        String param = InputUtill.textal("Deyismek istediyinizi qeyd edin: Ad, soyad, qrup ,yas");
        if (param.equalsIgnoreCase("ad")) {
            s.setName(InputUtill.textal("Yeni adi daxil edin"));
        } else if (param.equalsIgnoreCase("soyad")) {
            s.setSurname(InputUtill.textal("Yeni soyadi daxil edin"));
        } else if (param.equalsIgnoreCase("qrup")) {
            s.setGroup(InputUtill.textal("Yeni qrupu daxil edin"));
        } else if (param.equalsIgnoreCase("yas")) {
            s.setName(InputUtill.textal("Yeni yasi daxil edin"));
        }
        System.out.println(param.toUpperCase() + " deyisildi");

    }

    public static void StudentDelete() {

        StudentUtil.StudentShow();
        int sil = InputUtill.ededal("Necenci telebenin melumatlarini silmek isteyirsiniz?") - 1;
        Base.students[sil] = null;
        System.out.println("Telebe melumatlari silindi");
    }

    public static void RegisterationEnd() {
        System.exit(0);
    }
}
