package section3lap1;

import java.util.Scanner;

public class Student extends Person{
    String maSV,Email;
    int DiemThi;

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setDiemThi(int diemThi) {
        DiemThi = diemThi;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getEmail() {
        return Email;
    }

    public int getDiemThi() {
        return DiemThi;
    }


    //Hàm nhập trồng
    public void insert(){
        super.insert();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã SV: ");
        setMaSV(sc.nextLine());
        System.out.println("Nhập điểm thi: ");
        setDiemThi(sc.nextInt());
        System.out.println("Nhập email: ");
        setEmail(sc.nextLine());
    }
    public void print(){
        super.print();
        System.out.println("Mã sinh viên là: "+getMaSV());
        System.out.println("Điểm thi là: "+getDiemThi());
        System.out.println("Email là: "+getEmail());
    }


}
