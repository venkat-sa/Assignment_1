/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java2.Beans.Student;

/**
 *
 * @author venkatsa
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a simple hello world application
        System.out.println("Hello world");
        Student student = new Student("Test","23433");
        System.out.println(student.toString());
        
    }
    
}
