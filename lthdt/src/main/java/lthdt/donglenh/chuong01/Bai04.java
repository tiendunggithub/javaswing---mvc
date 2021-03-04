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
public class Bai04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle htron = new Circle(5, 1, 2);
        System.out.println("Chu vi cua hinh tron la: " + htron.calcPerimeter());
        System.out.println("Dien tich cua hinh tron la: " + htron.calcArea());
        
        Rectangle hcn = new Rectangle(3, 15, 8, 5);
        System.out.println("Chu vi cua hinh chu nhat la: " + hcn.calcPerimeter());
        System.out.println("Dien tich cua hinh chu nhat la: " + hcn.calcArea());
    }
    
}
