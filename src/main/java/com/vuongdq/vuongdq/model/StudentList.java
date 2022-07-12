/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuongdq.vuongdq.model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class StudentList{
   private ArrayList<Student> list = new ArrayList<>();
   
   private int currentIndex = 0;
   public String getCurrentStudentInfo(){
       return "Record "+(currentIndex+1)+" of "+list.size();
   }
   
   public void first(){
       if(currentIndex >0){
           currentIndex =0;
       }
   }
   public void previous(){
       if(currentIndex>0){
           currentIndex--;
       }
   }
   public void next(){
       if(currentIndex<list.size()-1){
          currentIndex++; 
       }
   }
   public void last(){
       if(currentIndex<list.size()-1){
           currentIndex = list.size()-1;
       }
   }
   
   public int getCurrentEmployeeIndex(){
       
            
       return currentIndex;
   }
   public Student getCurrentStudent(){
       if(list.size()==0){
            return null;
       }else{
        return list.get(currentIndex);
       }
       
   }
   
   public void add(Student std){
       list.add(std);
   }
   
   public boolean update(Student std){
      Student existedStd = findById(std.getId());
      boolean flag = false;
      if(existedStd!=null){
          existedStd.setFullname(std.getFullname());
          existedStd.setAge(std.getAge());
          existedStd.setEmail(std.getEmail());
          flag = true;
          
      }
      return flag;
   }
   
   public void renderToTable(DefaultTableModel tblModel){
     tblModel.setRowCount(0);
     for(Student std: list){
        Object[] row = new Object[]{
            std.getId(),
            std.getFullname(),
            std.getAge(),
            std.getEmail()
     };
     tblModel.addRow(row);
     }
     tblModel.fireTableDataChanged();
   }

   public Student findById(String id){
       for (Student std: list){
           if(std.getId().equals(id)){
               return std;
           }
       }
       return null;
   }
   public boolean deleteById(String id){
       for(Student std: list){
           if(std.getId().equals(id)){
               list.remove(std);
               return true;
           }
       }
       return false;
   }
   

}
