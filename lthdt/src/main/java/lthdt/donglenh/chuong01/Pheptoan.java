/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

/**
 *
 * @author LOVE
 */
public class Pheptoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // các phép toán với số nguyên
        int a = 17, b = 4, c;
        c = a + b;
        System.out.println("Phep cong: " + a + "+" + b + "=" + c);
        c = a - b;
        System.out.println("Phep tru: " + a + "-" + b + "=" + c);
        c = a * b;
        System.out.println("Phep nhan: " + a + "*" + b + "=" + c);
        c = a / b;
        System.out.println("Phep chia: " + a + "/" + b + "=" + c);
        c = a % b;
        System.out.println("Phep chia lay phan du: " + a + "%" + b + "=" + c);
        
        //phep toan voi so thuc
        double x = 12.4, y =2.3, z;
        z = x + y;
        System.out.println("Phep cong: " + x + "+" + y + "=" + z);
        z = x - y;
        System.out.println("Phep tru: " + x + "-" + y + "=" + z);
        z = x * y;
        System.out.println("Phep nhan: " + x + "*" + y + "=" + z);
        z = x / y;
        System.out.println("Phep chia: " + x + "/" + y + "=" + z);
        
        //cac phep toan kieu logic
        boolean flag1 = true, flag2 = false, flag3 = true;
        System.out.println("Phep AND: " + (flag1&&flag2));
        System.out.println("Phep OR: " + (flag1||flag2));
        System.out.println("Phep NOT: " + (!flag1));
        System.out.println("Phep XOR: " + (flag1^flag3));
        
        //mot so phep toan co ban tren chuoi
        String s1 = "Hue University";
        String s2 = "university";
        
        System.out.println(s1.toLowerCase()); //chuyển thành chữ thường
        System.out.println(s1.toUpperCase()); //chuyển thành chữ hoa
        System.out.println(s1.contains(s2)); //kiểm tra bao chứa
        System.out.println(s1.toLowerCase().contains(s2));
        s1 += " " +s2; //cộng chuỗi (rất tốn bộ nhớ)
        System.out.println(s1);
    }
    
}
