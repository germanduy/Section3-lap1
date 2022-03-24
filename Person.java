package section3lap1;

import java.util.Scanner;

public class Person {
    String ten,gender,birthday,address;

    public String getTen() {
        return ten;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //Hàm nhập thông tin
    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        setTen(sc.nextLine());
        System.out.println("Nhập giới tính: ");
        setGender(sc.nextLine());
        System.out.println("Nhập sinh nhât: ");
        setBirthday(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        setAddress(sc.nextLine());
    }
    //In thông tin
    public void print(){
        System.out.println("tên: "+getTen());
        System.out.println("giới tính: "+getGender());
        System.out.println("sinh nhật: "+getBirthday());
        System.out.println("địa chỉ" +getAddress());
    }
}
