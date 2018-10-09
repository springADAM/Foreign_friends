package myPack;

import javax.swing.*;

import userPack.Friends;
import userPack.User;


public class MClass {

    public static void main(String[] args) {

        User me = new User(JOptionPane.showInputDialog(null,"Write your first name please : ","my account",JOptionPane.INFORMATION_MESSAGE),
                JOptionPane.showInputDialog(null , "Write your last name please : ","my account",JOptionPane.INFORMATION_MESSAGE),
                "Algerienne");

        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"How many friends do you have ?","how many friends",JOptionPane.INFORMATION_MESSAGE));
        for(int i=0;i<n;i++){
            me.insertF( new Friends(JOptionPane.showInputDialog(null," Enter Your first name : ","my "+(i+1)+" friend's name",JOptionPane.INFORMATION_MESSAGE),JOptionPane.showInputDialog(null , "Write your last name please : ","my "+(i+1)+" friend's last name",JOptionPane.INFORMATION_MESSAGE), JOptionPane.showInputDialog(null ," Entrer votre nationalité ","my "+(i+1)+" friend's  nationality",JOptionPane.INFORMATION_MESSAGE)));
        }

        for(Friends tmp: me.getF()){
          if(!tmp.equals(me)){
              JOptionPane.showMessageDialog(null,tmp.toString(),"this is one of your foreign friends",JOptionPane.INFORMATION_MESSAGE);
          }
        }
    }
}
