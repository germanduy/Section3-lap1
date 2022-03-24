package section3lap1;

import java.util.Scanner;

public class GiaoVien extends Person{
    String DSlopGiangDay,MucLuong,SoMonDay,CacMonGiangDay;

    public void setDSlopGiangDay(String DSlopGiangDay) {
        this.DSlopGiangDay = DSlopGiangDay;
    }

    public void setMucLuong(String mucLuong) {
        MucLuong = mucLuong;
    }

    public void setSoMonDay(String soMonDay) {
        SoMonDay = soMonDay;
    }

    public void setCacMonGiangDay(String cacMonGiangDay) {
        CacMonGiangDay = cacMonGiangDay;
    }

    public String getDSlopGiangDay() {
        return DSlopGiangDay;
    }

    public String getMucLuong() {
        return MucLuong;
    }

    public String getSoMonDay() {
        return SoMonDay;
    }

    public String getCacMonGiangDay() {
        return CacMonGiangDay;
    }

    public void insert(){
        super.insert();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Ds lớp giảng dậy: ");
        setDSlopGiangDay(sc.nextLine());
        System.out.println("Nhập mức lương: ");
        setMucLuong(sc.nextLine());
        System.out.println("Nhập số môn giảng dậy: ");
        setSoMonDay(sc.nextLine());
        System.out.println("Nhập các môn giảng dậy: ");
        setCacMonGiangDay(sc.nextLine());
    }
    public  void print(){
        super.print();
        System.out.println("Danh sách lớp giảng dậy là: "+ getDSlopGiangDay());
        System.out.println("Mức lương là: "+ getMucLuong());
        System.out.println("Số môn giảng dậy là: "+getSoMonDay());
        System.out.println("Các môn giảng dậy là: "+getCacMonGiangDay());
    }

}
