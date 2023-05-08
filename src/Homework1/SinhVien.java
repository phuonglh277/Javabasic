package Homework1;

public class SinhVien {
    //Khai bao bien instance
    //Sưa để học github
    String Name = "Le Hue Phuong";
    //Khai bao bien static
    public static String School = "Hoc vien Buu Chinh Vien Thong";

    public static void main(String[] args) {
        //Khai bao bien local
        int Age = 31;
        SinhVien Ten = new SinhVien();
        System.out.println("Ho va ten: " +Ten.Name);
        System.out.println("Tuoi: " +Age);
        System.out.println("Truong dai hoc: " +SinhVien.School);

        //In thong tin tu cac bien static cua class Thongtin
        System.out.println("Khoa: " +Thongtin.major);
        System.out.println("Lop: " +Thongtin.grade);
    }
}