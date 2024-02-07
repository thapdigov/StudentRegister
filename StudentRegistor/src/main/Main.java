package main;

import bean.Student;
import data.Base;
import java.util.Scanner;
import util.InputUtill;
import util.StudentUtil;

public class Main {

    public static void main(String[] args) {

        while (true) {
            int secim = InputUtill.ededal("Menyudan secim edin"
                    + "\n1.Telebe elave et"
                    + "\n2.Telebeleri goster"
                    + "\n3.Telebeleri axtar"
                    + "\n4.Telebenin melumatlarini deyis"
                    + "\n5.Telebenin melumatlarini sil"
                    + "\n6.Registrasiyani sonlandir");

            switch (secim) {
                case 1 ->
                    StudentUtil.StudentRegstration();
                case 2 ->
                    StudentUtil.StudentShow();
                case 3 ->
                    StudentUtil.Studentfind();
                case 4 ->
                    StudentUtil.StudentChangeInformation();
                case 5 ->
                    StudentUtil.StudentDelete();
                case 6 ->
                    StudentUtil.RegisterationEnd();
                default -> {
                }
            }

        }
    }

}
