/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tic;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nada
 */
public class Tic extends JFrame implements ActionListener{
 JButton b1 , b2 , b3 , b4 , b5 ,b6 , b7 , b8 , b9 , b10 , b11;
    JLabel l1 , l2 , l3 , l4;
    JPanel p ;
    private int PlayerX_counter;
    private int PlayerO_counter;
    private String startGame = "X";
    public Tic(){
         
        this.setTitle("Tic Tac Toe Game");
        this.setSize(1200,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setBackground(Color.blue);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         PlayerX_counter = 0;
         PlayerO_counter = 0;
       
        p = new JPanel();
        p.setLayout(new GridLayout(3,5));
        
        b1 = new JButton("");
        p.add(b1);
        b2 = new JButton("");
        p.add(b2);
        b3 = new JButton("");
        p.add(b3); 
        l1 = new JLabel("Player X :");
        p.add(l1);
        l2 = new JLabel(" "+ PlayerX_counter);
        p.add(l2);
        b4 = new JButton("");
        p.add(b4);
        b5 = new JButton("");
        p.add(b5);
        b6 = new JButton("");
        p.add(b6);
        l3 = new JLabel("Player O :" );
        p.add(l3);
        l4 = new JLabel(" "+  PlayerO_counter);
        p.add(l4);
        b7 = new JButton("");
        p.add(b7);
        b8 = new JButton("");
        p.add(b8);
        b9 = new JButton("");
        p.add(b9);
        b10 = new JButton("Reset");
        p.add(b10);
        b11 = new JButton("Exit");
        p.add(b11);
  
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         b10.addActionListener(this);
         b11.addActionListener(this);
         this.add(p);
        
        
        
    }
       // counters values
       private void gameScore(){
           l2.setText(String.valueOf(PlayerX_counter));
           l4.setText(String.valueOf(PlayerO_counter));
       }
       
       // who win
        private void Win_Game(){
           
            String btn1 = b1.getText();
            String btn2 = b2.getText();
            String btn3 = b3.getText();
            String btn4 = b4.getText();
            String btn5 = b5.getText();
            String btn6 = b6.getText();
            String btn7 = b7.getText();
            String btn8 = b8.getText();
            String btn9 = b9.getText();
       
            // x win
            if (btn1 == "X" && btn2 == "X" && btn3 == "X"){
           JOptionPane.showMessageDialog(this , "player x win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
           
                PlayerX_counter++;
                gameScore();
               
                
          // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
              
          
            }
         
            
            else if (btn4 == "X" && btn5 == "X" && btn6 == "X"){
            JOptionPane.showMessageDialog(this , "player x win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerX_counter++;
                gameScore();
                
          // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
            
               
            }
            else if (btn7 == "X" && btn8 == "X" && btn9 == "X"){
            JOptionPane.showMessageDialog(this , "player x win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerX_counter++;
                gameScore();
                
            // return all the buttons equal null      
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
               
               
            }
            else if (btn1 == "X" && btn4 == "X" && btn7 == "X"){
            JOptionPane.showMessageDialog(this , "player x win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerX_counter++;
                gameScore();
                
             // return all the buttons equal null     
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
             
               
            }
            else if (btn2 == "X" && btn5 == "X" && btn8 == "X"){
            JOptionPane.showMessageDialog(this , "player x win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerX_counter++;
                gameScore();
                
              // return all the buttons equal null    
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
               
               
            }
            else if (btn3 == "X" && btn6 == "X" && btn9 == "X"){
            JOptionPane.showMessageDialog(this , "player x win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerX_counter++;
                gameScore();
                
              // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
               
             
            }
            else if (btn1 == "X" && btn5 == "X" && btn9 == "X"){
            JOptionPane.showMessageDialog(this , "player x win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerX_counter++;
                gameScore();
                
             // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
               
               
            }
            else if (btn3 == "X" && btn5 == "X" && btn7 == "X"){
            JOptionPane.showMessageDialog(this , "player x win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerX_counter++;
                gameScore();
                
               // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
             
               
            }
                 // O win
            if (btn1 == "O" && btn2 == "O" && btn3 == "O"){
            JOptionPane.showMessageDialog(this , "player o win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerO_counter++;
                gameScore();
                
             // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
               
            }
            
            else if (btn4 == "O" && btn5 == "O" && btn6 == "O"){
            JOptionPane.showMessageDialog(this , "player O win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerO_counter++;
                gameScore();
                
             // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
         
            }
           else if (btn7 == "O" && btn8 == "O" && btn9 == "O"){
            JOptionPane.showMessageDialog(this , "player o win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerO_counter++;
                gameScore();
                
              // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
              
            }
           else if (btn1 == "O" && btn4 == "O" && btn7 == "O"){
            JOptionPane.showMessageDialog(this , "player O win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerO_counter++;
                gameScore();
                
             // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
             
            }
           else if (btn2 == "O" && btn5 == "O" && btn8 == "O"){
            JOptionPane.showMessageDialog(this , "player O win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerO_counter++;
                gameScore();
                
             // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
               
            }
        
           else if (btn3 == "O" && btn6 == "O" && btn9 == "O"){
            JOptionPane.showMessageDialog(this , "player O win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerO_counter++;
                gameScore();
                
             // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null); 
               
            }
           else if (btn1 == "O" && btn5 == "O" && btn9 == "O"){
            JOptionPane.showMessageDialog(this , "player O win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerO_counter++;
                gameScore();
                
             // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
       
            }
           else if (btn3 == "O" && btn5 == "O" && btn7 == "O"){
            JOptionPane.showMessageDialog(this , "player O win " , "TIC TOC game " , JOptionPane.INFORMATION_MESSAGE);
                PlayerO_counter++;
                gameScore();
                
             // return all the buttons equal null 
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
              
            }
        }
            
        
        
    
    
    
      @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        //Exit button
        if(o == b11){
            if( JOptionPane.showConfirmDialog(this, "Confirm if you want to exit " , "Tic Toc game" , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        
        }
        }
        // Reset Button
        if (o == b10){
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
            
        }
        
        // action listener buttons
        if (o == b1){
        b1.setText(startGame);
        if (startGame.equalsIgnoreCase("x")){
            startGame = "O";
          b1.setForeground(Color.blue);
           
       }
       else {
             startGame = "X";
          b1.setForeground(Color.red);
       }
         Win_Game();
        
        }
    
       else if (o == b2){
        
        b2.setText(startGame);
        if (startGame.equalsIgnoreCase("x")){
            startGame = "O";
          b2.setForeground(Color.blue);
           
       }
       else {
             startGame = "X";
          b2.setForeground(Color.red);
       }
         Win_Game();
         
         }
   
         else if (o == b3){
         b3.setText(startGame);
        if (startGame.equalsIgnoreCase("x")){
             startGame = "O";
          b3.setForeground(Color.blue);
           
       }
       else {
             startGame = "X";
          b3.setForeground(Color.red);
       }
         Win_Game();
       
          }

         else  if (o == b4){
         b4.setText(startGame);
        if (startGame.equalsIgnoreCase("x")){
             startGame = "O";
          b4.setForeground(Color.blue);
           
       }
       else {
             startGame = "x";
          b4.setForeground(Color.red);
       }
         Win_Game();
         
           }

          else  if (o == b5){
         b5.setText(startGame);
        if (startGame.equalsIgnoreCase("x")){
             startGame = "O";
          b5.setForeground(Color.blue);
           
       }
       else {
             startGame = "X";
          b5.setForeground(Color.red);
       }
         Win_Game();
          
            }

            else if (o == b6){
         b6.setText(startGame);
        if (startGame.equalsIgnoreCase("x")){
             startGame = "O";
          b6.setForeground(Color.blue);
           
       }
       else {
             startGame = "X";
          b5.setForeground(Color.red);
       }
        Win_Game();
     
             }
  
            else  if (o == b7){
         b7.setText(startGame);
        if (startGame.equalsIgnoreCase("x")){
             startGame = "O";
          b7.setForeground(Color.blue);
           
       }
       else {
             startGame = "X";
          b7.setForeground(Color.red);
       }
           Win_Game();
           
              }

              
             else  if (o == b8){
         b8.setText(startGame);
        if (startGame.equalsIgnoreCase("x")){
             startGame = "O";
          b8.setForeground(Color.blue);
           
       }
       else {
             startGame = "X";
          b8.setForeground(Color.red);
       }
           Win_Game();
        
               }
 
              else  if (o == b9){
         b9.setText(startGame);
        if (startGame.equalsIgnoreCase("x")){
             startGame = "O";
          b9.setForeground(Color.blue);
           
       }
       else {
             startGame = "X";
          b9.setForeground(Color.red);
       }
           Win_Game();
            
                }
        
      
    }
    

    
    

   
    public static void main(String[] args) {
        Tic t = new Tic();
    }
    
}
