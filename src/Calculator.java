import javax.swing.*;
import java.awt.*;
    public class Calculator extends JFrame {
        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
        JTextField t;
        JLabel l;
        Font f;
        void setComponents(){
            f=new Font("Arial",Font.PLAIN,30);
            l=new JLabel("Standard Calculator");
            l.setFont(new Font("Cambria",Font.BOLD,25));
            l.setBounds(56,0,900,50);
            add(l);

            t=new JTextField("");
            t.setBounds(25,55,290,50);
            t.setFont(new Font("Arial",Font.LAYOUT_RIGHT_TO_LEFT,20));
            t.setEditable(false);
            add(t);

            b7=new JButton("7");
            b7.setBounds(25,120,65,60);
            b7.setFont(f);
            add(b7);

            b8=new JButton("8");
            b8.setBounds(93,120,65,60);
            b8.setFont(f);
            add(b8);

            b9=new JButton("9");
            b9.setBounds(161,120,65,60);
            b9.setFont(f);
            add(b9);

            b4=new JButton("4");
            b4.setBounds(25,183,65,60);
            b4.setFont(f);
            add(b4);

            b5=new JButton("5");
            b5.setBounds(93,183,65,60);
            b5.setFont(f);
            add(b5);

            b6=new JButton("6");
            b6.setBounds(161,183,65,60);
            b6.setFont(f);
            add(b6);


        }
        public static void main(String[] args) {
            Calculator jf=new Calculator();
            jf.setVisible(true);
            jf.setSize(350,560);
            jf.setLocation(100,100);
            jf.setLayout(null);
            jf.setResizable(false);
            jf.setComponents();



        }
    }

