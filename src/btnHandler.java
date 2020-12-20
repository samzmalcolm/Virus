/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Ahsan
 */
public class btnHandler implements ActionListener {
    GUIV ref;
    public btnHandler(GUIV g)
    {
        ref=g;
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("Press"))
        {
            for(int i=0;i<50;i++)
            {
                ref.initGUIV();
            }
        }
    }
    
}
