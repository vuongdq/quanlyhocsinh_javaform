/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuongdq.vuongdq.helper;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Validator {
    public static boolean checkEmpty(JTextField field,StringBuilder sb, String msg){
        boolean ok = false;
        if(field.getText().equals("")){
            sb.append(msg).append("\n");
            field.setBackground(Color.red);
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return ok;
    }
    public static boolean CheckAge(JTextField field, StringBuilder sb){
        boolean ok = true;
        if(!checkEmpty(field, sb, "Tuoi chua  nhap")){
            return false;
        }
        try {
            int age = Integer.parseInt(field.getText());
            if(age<18 || age >55){
                sb.append("Tuoi khong hop le nam trong khoang 18-55 \n");
                field.setBackground(Color.red);
                ok = false;
            }
          
        } catch (Exception e) {
             sb.append("Tuoi khong hop le, phai la gia tri so \n");
             field.setBackground(Color.red);
             ok = false;
        }
        if(ok){
            field.setBackground(Color.white);
        }
        return ok;
        
    }
    public static boolean CheckEmail(JTextField field, StringBuilder sb){
        boolean ok = true;
        if(!checkEmpty(field, sb, "Email chua  nhap")){
            return false;
        }
        Pattern pattern = Pattern.compile("\\w+@\\.\\w+");
            Matcher matcher = pattern.matcher(field.getText());
            if(!matcher.find()){
                sb.append("Email khong hop le nam trong khoang 18-55 \n");
                field.setBackground(Color.red);
                ok = false;
            }
        if(ok){
            field.setBackground(Color.white);
        }
        return ok;
        
    }
    
    
}
