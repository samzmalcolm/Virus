/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author Ahsan
 */
public class GUIV 
{
    JFrame jf;
    JButton btn1;
    btnHandler hnd;
    Random rand;
    
    public GUIV()
    {
        initGUIV();
    }
    public void initGUIV()
    {
    jf=new JFrame("Virus");
    BorderLayout fl=new BorderLayout();
    jf.setLayout(fl);
    btn1=new JButton("Press");
    rand=new Random();
    
    
    int n1=rand.nextInt(1080);
    int n2=rand.nextInt(520);
    hnd =new btnHandler(this);
    btn1.addActionListener(hnd);
    
    
    jf.add(btn1, BorderLayout.CENTER);
    
    
    jf.setSize(250,250);
    jf.setVisible(true);
    jf.setLocation(n1,n2);
    
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    }
    
}
