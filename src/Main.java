
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Main extends JFrame{
        public Main(){
        initComponents();
    }
    
    public void initComponents()
    {
        this.setTitle("listy kombinowane");
        this.setBounds(300, 300, 300, 200);
        pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na zielony", new ImageIcon("zielony.gif"), Color.GREEN)));
        pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na niebieski", new ImageIcon("niebieski.gif"), Color.BLUE)));
        pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na czerwony", new ImageIcon("czerwony.gif"), Color.RED)));
        
        this.getContentPane().add(pasekNarzedzi, BorderLayout.NORTH);
        //this.getContentPane().add(panel);
        this.setDefaultCloseOperation(3);
        
        pasekNarzedzi.add(new JButton("Wyłącz kolor"));
    }

    //private JPanel panel = new JPanel();
    JToolBar pasekNarzedzi = new JToolBar("Nazwa nowej ramki");
    
    private class ActionColor extends AbstractAction
    {
        public ActionColor (String tooltip, Icon icon, Color color){
            this.putValue(Action.SHORT_DESCRIPTION, tooltip);
            this.putValue(Action.SMALL_ICON, icon);
            this.putValue("kolor", color);
        }
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            
        }
    }
    private class KolorowyButton extends JButton{
        public KolorowyButton (ActionColor actionColor){
        super(actionColor);
        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ten.setBackground((Color)actionColor.getValue("kolor"));
            }
        });
        
        } 
        KolorowyButton ten = this;
    }
    public void setZaznaczony (boolean zazn){
        this.zaznaczony = zazn;
    }
    
    boolean zaznaczony = false;
    
    public static void main(String[] args) {
        
        new Main().setVisible(true);
    }
    

}