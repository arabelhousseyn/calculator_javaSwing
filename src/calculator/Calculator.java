
package calculator;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
public class Calculator extends JFrame {
    int width = 300;
    int height = 400;
    boolean found = true;
    String type ="";
    char k ;
    Font f = new Font("Serif",Font.BOLD,20);
    String n = "";
    String nn = "";
    int res,old;
    float ress,oldd;
    String oper = "";
    /////////////////menubar
    JMenuBar bar;
    JMenu show;
    JMenu qc;
    JMenuItem standard;
    JMenuItem sientifique;
    JMenuItem programmer;
    JMenuItem about;
    ////////////////////////// simple
    JPanel simple;
    JButton b0;JButton b1;JButton b2;
    JButton b3;JButton b4;JButton b5;
    JButton b6;JButton b7;JButton b8;JButton b9;
    JButton clear;JButton div;JButton mult;JButton mins;
    JButton plus;JButton equals;JButton back;JButton comma;
    JTextField screen;
    JLabel number;
    JLabel op;
    ////////////////////////////
    JDialog diag;
    JLabel describ;
    JButton close;
    private void orio()
    {
      bar = new JMenuBar();
      Color c = new Color(239,247,254);
      Color d = c;
      bar.setBackground(d);
      show = new JMenu("show");
      KeyStroke st = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
      KeyStroke ab = KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.VK_A);
      qc = new JMenu("?");
      standard = new JMenuItem("standard");
      standard.setAccelerator(st);
      about = new JMenuItem("about");
      about.setAccelerator(ab);
      show.add(standard);
      qc.add(about);
      bar.add(show);
      bar.add(qc);
    }
    /////design for simple calculator
    private void simple()
    {
        simple = new JPanel(null);
        JPanel pane2 = new JPanel(new GridLayout(3, 3, 5, 5));
        b0 = new JButton("0"); b1 = new JButton("1"); b2 = new JButton("2");
        b3 = new JButton("3"); b4 = new JButton("4"); b5 = new JButton("5");
        b6 = new JButton("6"); b7 = new JButton("7"); b8 = new JButton("8"); b9 = new JButton("9");
        clear = new JButton("C"); div = new JButton("/"); mult = new JButton("*"); mins = new JButton("-");
        plus = new JButton("+"); equals = new JButton("="); back = new JButton("<-");
        comma = new JButton(".");
        screen = new JTextField("0");
        number = new JLabel("0");
        op = new JLabel("");
        GridLayout grid = new GridLayout(3,3,5,5);
        screen.setBounds(20, 20, 250, 40);
        screen.setFont(f);
        screen.setEditable(false);
        simple.add(screen);
        
        number.setBounds(20, 30, 250, 80);
        number.setFont(f);
        simple.add(number);
        
        op.setBounds(250, 30, 250, 80);
        op.setFont(f);
        simple.add(op);
        
        pane2.setBounds(20, 100, 180, 200);
        pane2.add(b7);pane2.add(b4);pane2.add(b1);
        pane2.add(b8);pane2.add(b5);pane2.add(b2);
        pane2.add(b9);pane2.add(b6);pane2.add(b3);
        simple.add(pane2);
        
        b0.setBounds(20, 305, 120, 40);
        simple.add(b0);
        comma.setBounds(141, 305, 60, 40);
        simple.add(comma);
        
        div.setBounds(202, 100, 40, 63);
        simple.add(div);
        
        mult.setBounds(202, 168, 40, 63);
        simple.add(mult);
        
        plus.setBounds(202, 236, 42, 63);
        simple.add(plus);
        
        mins.setBounds(202, 304, 40, 40);
        simple.add(mins);
        
        equals.setBounds(248, 235, 42, 110);
        simple.add(equals);
        
        back.setBounds(246, 100, 45, 63);
        simple.add(back);
        
        clear.setBounds(246, 168, 45, 63);
        simple.add(clear);
        
    }
    ///////////////////////////////
   
    ////////////////////////
    // operation of simple calculator 
    private void simple_op()
    {
        ActionListener al;
        al = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b0)
                {
                    
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    } else{
                        if(number.getText().equals("0"))
                        {
                            n=b0.getText();
                            number.setText(n);
                            screen.setText(n);
                        } else{
                            number.setText("");
                            screen.setText("");
                            n+=b0.getText();
                            number.setText(n);
                            screen.setText(n);
                        }
                    }
                    
                }
                if(e.getSource() == b1)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=b1.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                    
                    
                    
                    
                }
                if(e.getSource() == b2)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=b2.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                     
                }
                if(e.getSource() == b3)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=b3.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                     
                }
                if(e.getSource() == b4)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=b4.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                     
                }
                if(e.getSource() == b5)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=b5.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                     
                }
                if(e.getSource() == b6)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=b6.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                     
                }
                if(e.getSource() == b7)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=b7.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                     
                }
                if(e.getSource() == b8)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=b8.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                     
                }
                if(e.getSource() == b9)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=b9.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                     
                }
                if(e.getSource() == plus)
                {
                    
                    for(int i=0;i<number.getText().length();i++)
                    {
                        char comma_search =number.getText().charAt(i) ;
                        if(comma_search =='.')
                        {
                            k = comma_search;
                        }
                    }
                    if(k == '.' && found == false)
                    {
                        found = true;
                    } else{found = false;}
                    if(found == true)
                    {
                        oper = plus.getText();
                        op.setText(oper);
                        oldd = Float.valueOf(number.getText());
                        n= "";
                        screen.setText(number.getText());
                        number.setText("");
                        found = false;
                    }else{
                        oper = plus.getText();
                        op.setText(oper);
                        old = Integer.parseInt(number.getText());
                        n= "";
                        screen.setText(number.getText());
                        number.setText("");
                    }
                    
                    
                }
                if(e.getSource() == equals)
                {
                    switch(oper)
                    {
                        case "+" :
                            for(int i=0;i<number.getText().length();i++)
                            {
                                char comma_search =number.getText().charAt(i) ;
                                if(comma_search =='.')
                                {
                                    k = comma_search;
                                }
                            }
                            if(k == '.' && found == false)
                            {
                                found = true;
                            } else{found = false;}
                            
                            if(found == true)
                            {
                                ress = oldd + Float.valueOf(screen.getText());
                                screen.setText(String.valueOf(ress));
                                number.setText(String.valueOf(ress));
                                found = false;
                            }else{
                                res = old + Integer.parseInt(n);
                                screen.setText(String.valueOf(res));
                                number.setText(String.valueOf(res));}break;
                        case "-" : 
                            for(int i=0;i<number.getText().length();i++)
                            {
                                char comma_search =number.getText().charAt(i) ;
                                if(comma_search =='.')
                                {
                                    k = comma_search;
                                }
                            }
                            if(k == '.' && found == false)
                            {
                                found = true;
                            } else{found = false;}
                            if(found == true)
                            {
                                ress = oldd - Float.parseFloat(n);
                                screen.setText(String.valueOf(ress));
                                number.setText(String.valueOf(ress));
                                found = false;
                            }else{
                                res = old - Integer.parseInt(n);
                                screen.setText(String.valueOf(res));
                                number.setText(String.valueOf(res));}break;
                        case "*" :
                            for(int i=0;i<number.getText().length();i++)
                            {
                                char comma_search =number.getText().charAt(i) ;
                                if(comma_search =='.')
                                {
                                    k = comma_search;
                                }
                            }
                            if(k == '.' && found == false)
                            {
                                found = true;
                            } else{found = false;}
                            if(found == true)
                            {
                                ress = oldd * Float.parseFloat(n);
                                screen.setText(String.valueOf(ress));
                                number.setText(String.valueOf(ress));
                                found = false;
                            } else{
                                res = old * Integer.parseInt(n);
                                screen.setText(String.valueOf(res));
                                number.setText(String.valueOf(res));}break;
                        case "/" :
                            
                            if(!n.equals("0"))
                            {
                                ress = oldd / Float.parseFloat(n);
                                screen.setText(String.valueOf(ress));
                                found = false;
                                number.setText(String.valueOf(ress));}else{
                                JOptionPane.showMessageDialog(null, "you cannot divide by 0", "warnning", JOptionPane.WARNING_MESSAGE);
                                op.setText("");
                                n="";
                            }
                            
                    }
                    
                }
                if(e.getSource() == mins)
                {
                    for(int i=0;i<number.getText().length();i++)
                    {
                        char comma_search =number.getText().charAt(i) ;
                        if(comma_search =='.')
                        {
                            k = comma_search;
                        }
                    }
                    if(k == '.' && found == false)
                    {
                        found = true;
                    } else{found = false;}
                    
                    if(found == true)
                    {
                        oper = mins.getText();
                        op.setText(oper);
                        oldd = Float.valueOf(number.getText());
                        n= "";
                        screen.setText(number.getText());
                        number.setText("");
                        found = false;
                    } else{
                        oper = mins.getText();
                        op.setText(oper);
                        old = Integer.parseInt(number.getText());
                        n= "";
                        screen.setText(number.getText());
                    }
                    
                }
                if(e.getSource() == mult)
                {
                    for(int i=0;i<number.getText().length();i++)
                    {
                        char comma_search =number.getText().charAt(i) ;
                        if(comma_search =='.')
                        {
                            k = comma_search;
                        }
                    }
                    if(k == '.' && found == false)
                    {
                        found = true;
                    } else{found = false;}
                    
                    if(found == true)
                    {oper = mult.getText();
                    op.setText(oper);
                    oldd = Float.valueOf(number.getText());
                    n= "";
                    screen.setText(number.getText());
                    found = false;
                    number.setText("");}else{oper = mult.getText();
                    op.setText(oper);
                    old = Integer.parseInt(number.getText());
                    n= "";
                    screen.setText(number.getText());
                    number.setText("");}
                    
                    
                }
                if(e.getSource() == div)
                {
                    
                    oper = div.getText();
                    op.setText(oper);
                    oldd = Float.valueOf(number.getText());
                    n= "";
                    screen.setText(number.getText());
                    number.setText("");
                    
                    
                    
                }
                if(e.getSource() == comma)
                {
                    if(screen.getText().length() > 9 && number.getText().length() > 9)
                    {
                        JOptionPane.showMessageDialog(null, "you cannot neter under of 10 numbers", "warnning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        n+=comma.getText();
                        number.setText(n);
                        screen.setText(n);
                    }
                    
                }
                if(e.getSource() == clear)
                {
                    screen.setText("0");
                    number.setText("0");
                    op.setText("");
                    old = 0;
                    res= 0;
                    n="";
                    oldd = 0;
                    ress=0;
                    found = false;
                }
                if(e.getSource() == back)
                {
                    String sub = number.getText().substring(0, number.getText().length()-1);
                    screen.setText(sub);
                    number.setText(sub);
                    n="";
                }
                
            }
            
        };
        b0.addActionListener(al);
        b1.addActionListener(al);
        b2.addActionListener(al);
        b3.addActionListener(al);
        b4.addActionListener(al);
        b5.addActionListener(al);
        b6.addActionListener(al);
        b7.addActionListener(al);
        b8.addActionListener(al);
        b9.addActionListener(al);
        plus.addActionListener(al);
        equals.addActionListener(al);
        mins.addActionListener(al);
        mult.addActionListener(al);
        div.addActionListener(al);
        clear.addActionListener(al);
        comma.addActionListener(al);
        back.addActionListener(al);

    }
    ////////////////////////////////////////// 
    private void dg()
    {
        diag = new JDialog();
        
        describ = new JLabel("this calculator it was developed by elhousseyn arab");
        close = new JButton("close");
        diag.add(describ);
        diag.setSize(400,400);
        diag.setLayout(null);
        diag.setTitle("about");
        diag.setVisible(true);
        diag.add(close);
        diag.setLocationRelativeTo(null);
        diag.setResizable(false);
        describ.setBounds(40, 200, 400, 20);
        close.setBounds(150, 230, 80, 60);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diag.setVisible(false);
            }
        });
        close.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                   diag.setVisible(false); 
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    
    
    public Calculator()
    {
        init();
    }
    private void init()
    {
        orio();
        simple();
        simple_op();
        add(simple);
        
        setJMenuBar(bar);
        
        CardLayout card = new CardLayout();
        Container cc = getContentPane();
        cc.setLayout(card);
        cc.getLayout().addLayoutComponent("standard", simple);
        standard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               card.show(cc, "standard");
               width = 300;
                height = 400;
                setSize(width,height);
                screen = new JTextField("0");
        number = new JLabel("0");
                    old = 0;
                    res= 0;
                    n="";
                    oldd = 0;
                    ress=0;
                     oper = "";
                     type = "";
                     k = '\0';
                    found = false;
            }
        });
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dg();
            }
        });
        
        
        setVisible(true);
        setSize(width,height);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color c = new Color(100,181,246);
        Color d = c;
        getContentPane().setBackground(Color.BLACK);
        
        
    }
    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new Calculator();
           }
       });
    }
    
}
