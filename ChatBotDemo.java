package sanke;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ChatBot extends JFrame{
    private JTextArea ca= new JTextArea();
    private JTextField cf= new JTextField();
    private JButton b= new JButton();
    private JLabel l=new JLabel();

    ChatBot(){
        JFrame f= new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(true);
        f.setLayout(null);
        f.setSize(700,700);
        f.getContentPane().setBackground(Color.PINK);
        f.setTitle("ChatBot");
        f.add(ca);
        f.add(cf);

        ca.setSize(550,550);
        ca.setLocation(1,1);
        ca.setBackground(Color.GRAY);
        cf.setSize(450,20);
        cf.setLocation(1,600);
        f.add(b);
        l.setText("Send");
        b.add(l);

        b.setSize(200,20);
        b.setLocation(500,600);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==b){
                    String text= cf.getText();
                    ca.setForeground(Color.BLACK);
                    ca.append("You-->"+text+"\n");
                    cf.setText("");

                    if (text.contains("hi")){
                        replyMeth("Hi there");
                    }
                    else if(text.contains("how are you ")){
                        replyMeth("I'm good :). Thankyou for asking.");
                    }
                    else if(text.contains("what is your name?")){
                        replyMeth(" I'm POPO");
                    }
                    else if(text.contains("what is your gender?")){
                        replyMeth("I don't have a gender, but can give me any. :|");

                    }
                    else if(text.contains("i love you")) {
                        replyMeth("Hey!! , I am Shy. I love you too!");
                    }
                    else if(text.contains("what is 2+2")) {
                        replyMeth("It's 4");
                    }
                    else if(text.contains("how is the wether today")) {
                        replyMeth("It's Sunny today");
                    }
                    else if(text.contains("what is the distance between Earth and Moon")) {
                        replyMeth("This Guy wants to go to Moon\n HAHAHAHAHAHAHAHAHAH \n well its 384,400 km\n Ready to take off!!!");
                    }
                    else if(text.contains("tell me something about German Language")) {
                        replyMeth("Danke\n That's the most you can do\n :)");
                    }
                    else
                        replyMeth("I Can't Understand ");
                }
            }
        });
    }

    public void replyMeth(String s){
        ca.append("ChatBot-->"+s+"\n");
    }
}

public class ChatBotDemo {
    public static void main(String[] args){
        new ChatBot();
    }
}

