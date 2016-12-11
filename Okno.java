package labw04babiy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class Okno extends JFrame {
  
	private static final long serialVersionUID = 1L;

	private int count = 0;
 
    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("Ваше имя?");
    private JLabel metkaDva = new JLabel("");
    private JLabel metkaTri = new JLabel("");
    
    class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object button = e.getSource();
 
            if(button instanceof JButton){
                count++;
                ((JLabel)metkaTri).setText("Нажато " + count + " раз");
                metkaDva.setText("Спасибо, "+fio.getText()+"!");
            }
        }
    }
    
    class ChengeSizeListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
        	setSize(500,500);
        }
    }
 
    public Okno(String title)
      {
        super(title);
        SozdatxOkno();
      }
 
    private void SozdatxOkno(){
        
    	JButton button = new JButton(" Нажми меня! ");
        button.setBounds(65,60,150,40);
        
        JButton button2 = new JButton(" Измени размер! ");
        button2.setBounds(65,100,150,40);
        
        button.addActionListener(new PushingListener());
        button2.addActionListener(new ChengeSizeListener());
        
        metka.setBounds(15,15,95,30);
        metkaDva.setBounds(15,130,200,30);
        metkaTri.setBounds(150,130,200,30);
        
        fio.setBounds(120, 15, 100, 30);
        
        getContentPane().setLayout(null);
        getContentPane().add(button);
        getContentPane().add(button2);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(metkaTri);
        getContentPane().add(fio);
                
        setLocationRelativeTo(null);
      }
}
