import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements MouseListener{
    
    JLabel bgLabel;;
    JLabel dogLabel;
    JLabel catLabel;
    //JLabel catLabelFact;
    //JLabel dogLabelFact;
    

    JTextPane paneFacts;

    String bark1;
    String meow1;

        DogBark dogBark = new DogBark();
        CatMeow catMeow = new CatMeow();
        RandomQuote randomQuoteDog = new RandomQuote();
        RandomQuote randomQuoteCat = new RandomQuote();

MyFrame(){

        // Den Variablen wird die Location der Audiofile übergeben, später werden sie als Parameter in die Methode eingefügt
        bark1 = ".//res//bark1.wav";
        meow1 = ".//res//meow1.wav";

        ImageIcon frameBG = new ImageIcon("res/bg.png");
        ImageIcon dogIcon = new ImageIcon("res/dog.png");
        ImageIcon catIcon = new ImageIcon("res/cat.png");

        bgLabel = new JLabel();
        dogLabel = new JLabel();
        catLabel = new JLabel();
        //catLabelFact = new JLabel();
        //dogLabelFact = new JLabel();
        

        bgLabel.setBounds(0, 0, 400, 250);
        bgLabel.setIcon(frameBG);

        dogLabel.setBounds(50, 30, 150, 150);
        dogLabel.setIcon(dogIcon);
        dogLabel.addMouseListener(this);
        

        catLabel.setBounds(210, 60, 150, 150);
        catLabel.setIcon(catIcon);
        catLabel.addMouseListener(this);

        


        
        paneFacts = new JTextPane();
        paneFacts.setBounds(0, 250, 400, 125);
        paneFacts.setEditable(false);
        //paneFacts.setOpaque(false);
        paneFacts.setBackground(new Color(37, 230, 32));
        paneFacts.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
        
        
        
        JFrame frame = new JFrame("Cat and Dog Clicker");
        frame.setSize(400, 400);
        frame.setBackground(Color.black);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        frame.add(paneFacts);
        frame.add(dogLabel);
        frame.add(catLabel);
        frame.add(bgLabel);

        frame.setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==dogLabel){
            //Aus der Klasse dogBark wird die Methode dogBark() benutzt
            dogBark.dogBark(bark1);
            dogBark.play();
            paneFacts.setText(randomQuoteDog.dogSaySomething());
            
            
        } else if(e.getSource()==catLabel){
            //Aus der Klasse catMeow wird die Methode catMeow benutzt
            catMeow.catMeow(meow1);
            catMeow.play();
            paneFacts.setText(randomQuoteCat.catSaySomething());
        }
        
    } 

    

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}