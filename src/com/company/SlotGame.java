package com.company;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.awt.image.ImageObserver;
import java.awt.Graphics;
import java.applet.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SlotGame extends JFrame {

    int creditt = 100;
    int bett = 2;
    int winn = 0;
    JButton spin;

    private JButton c, c1, c2, c3, c4, c5, c6, c7, c8;
    private JButton d, d1, d2, d3, d4, d5, d6, d7, d8;
    private JButton h, h1, h2, h3, h4, h5, h6, h7, h8;
    private JButton y, y1, y2, y3, y4, y5, y6, y7, y8;
    private JButton e, e1, e2, e3, e4, e5, e6, e7, e8;
    private JButton r, r1, r2, r3, r4, r5, r6, r7, r8;
    private JButton l, l1, l2, l3, l4, l5, l6, l7, l8;
    private JButton ea, ea1, ea2, ea3, ea4, ea5, ea6, ea7, ea8;
    private JButton w, w1, w2, w3, w4, w5, w6, w7, w8;

    private JLabel credit;
    private JLabel bet;
    private JLabel win;
    private Font bFont;
    private Font bigFont;

    private Icon coin, coin1, coin2, coin3, coin4, coin5, coin6, coin7, coin8;
    private Icon dragon, dragon1, dragon2, dragon3, dragon4, dragon5, dragon6, dragon7, dragon8;
    private Icon helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8;
    private Icon yinYan, yinYan1, yinYan2, yinYan3, yinYan4, yinYan5, yinYan6, yinYan7, yinYan8;
    private Icon eagle, eagle1, eagle2, eagle3, eagle4, eagle5, eagle6, eagle7, eagle8;
    private Icon rose, rose1, rose2, rose3, rose4, rose5, rose6, rose7, rose8;
    private Icon lion, lion1, lion2, lion3, lion4, lion5, lion6, lion7, lion8;
    private Icon earth, earth1, earth2, earth3, earth4, earth5, earth6, earth7, earth8;
    private Icon wizard, wizard1, wizard2, wizard3, wizard4, wizard5, wizard6, wizard7, wizard8;


    public SlotGame() {

        super("Kanasubg");

        setLayout(new GridLayout());
        setPreferredSize(new Dimension(1600, 1300));
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        credit = new JLabel("CREDIT:  " + creditt);
        bet = new JLabel("BET:  " + bett);
        win = new JLabel("WIN:  " + winn);
        spin = new JButton("      S P I N      ");
        spin.setForeground(Color.cyan);
        bFont = new Font("serif", Font.BOLD, 20);
        bigFont = new Font("serif", Font.BOLD, 40);

        credit.setFont(bFont);
        bet.setFont(bFont);
        win.setFont(bFont);
        spin.setFont(bigFont);

        credit.setBounds(30, 1050, 150, 50);
        bet.setBounds(255, 1050, 150, 50);
        win.setBounds(480, 1050, 150, 50);
        spin.setBounds(710, 1050, 300, 50);

        credit.setForeground(Color.white);
        bet.setForeground(Color.green);
        win.setForeground(Color.red);
        spin.setBackground(Color.black);

        add(credit);
        add(bet);
        add(win);
        add(spin);
        setLayout(null);
        setVisible(true);

        coin = new ImageIcon(getClass().getResource("1coin.png"));
        coin1 = new ImageIcon(getClass().getResource("11coin.png"));
        coin2 = new ImageIcon(getClass().getResource("111coin.png"));
        coin3 = new ImageIcon(getClass().getResource("1111coin.png"));
        coin4 = new ImageIcon(getClass().getResource("11111coin.png"));
        coin5 = new ImageIcon(getClass().getResource("111111coin.png"));
        coin6 = new ImageIcon(getClass().getResource("1111111coin.png"));
        coin7 = new ImageIcon(getClass().getResource("11111111coin.png"));
        coin8 = new ImageIcon(getClass().getResource("111111111coin.png"));


        dragon = new ImageIcon(getClass().getResource("2dragon_299x300.png"));
        dragon1 = new ImageIcon(getClass().getResource("22dragon_299x300.png"));
        dragon2 = new ImageIcon(getClass().getResource("222dragon_299x300.png"));
        dragon3 = new ImageIcon(getClass().getResource("2222dragon_299x300.png"));
        dragon4 = new ImageIcon(getClass().getResource("22222dragon_299x300.png"));
        dragon5 = new ImageIcon(getClass().getResource("222222dragon_299x300.png"));
        dragon6 = new ImageIcon(getClass().getResource("2222222dragon_299x300.png"));
        dragon7 = new ImageIcon(getClass().getResource("22222222dragon_299x300.png"));
        dragon8 = new ImageIcon(getClass().getResource("222222222dragon_299x300.png"));


        helmet = new ImageIcon(getClass().getResource("3helmet_299x300.png"));
        helmet1 = new ImageIcon(getClass().getResource("33helmet_299x300.png"));
        helmet2 = new ImageIcon(getClass().getResource("333helmet_299x300.png"));
        helmet3 = new ImageIcon(getClass().getResource("3333helmet_299x300.png"));
        helmet4 = new ImageIcon(getClass().getResource("33333helmet_299x300.png"));
        helmet5 = new ImageIcon(getClass().getResource("333333helmet_299x300.png"));
        helmet6 = new ImageIcon(getClass().getResource("3333333helmet_299x300.png"));
        helmet7 = new ImageIcon(getClass().getResource("33333333helmet_299x300.png"));
        helmet8 = new ImageIcon(getClass().getResource("333333333helmet_299x300.png"));


        yinYan = new ImageIcon(getClass().getResource("4yin-yan_299x300.png"));
        yinYan1 = new ImageIcon(getClass().getResource("44yin-yan_299x300.png"));
        yinYan2 = new ImageIcon(getClass().getResource("444yin-yan_299x300.png"));
        yinYan3 = new ImageIcon(getClass().getResource("4444yin-yan_299x300.png"));
        yinYan4 = new ImageIcon(getClass().getResource("44444yin-yan_299x300.png"));
        yinYan5 = new ImageIcon(getClass().getResource("444444yin-yan_299x300.png"));
        yinYan6 = new ImageIcon(getClass().getResource("4444444yin-yan_299x300.png"));
        yinYan7 = new ImageIcon(getClass().getResource("44444444yin-yan_299x300.png"));
        yinYan8 = new ImageIcon(getClass().getResource("444444444yin-yan_299x300.png"));


        eagle = new ImageIcon(getClass().getResource("5eagle_299x300.png"));
        eagle1 = new ImageIcon(getClass().getResource("55eagle_299x300.png"));
        eagle2 = new ImageIcon(getClass().getResource("555eagle_299x300.png"));
        eagle3 = new ImageIcon(getClass().getResource("5555eagle_299x300.png"));
        eagle4 = new ImageIcon(getClass().getResource("55555eagle_299x300.png"));
        eagle5 = new ImageIcon(getClass().getResource("555555eagle_299x300.png"));
        eagle6 = new ImageIcon(getClass().getResource("5555555eagle_299x300.png"));
        eagle7 = new ImageIcon(getClass().getResource("55555555eagle_299x300.png"));
        eagle8 = new ImageIcon(getClass().getResource("555555555eagle_299x300.png"));


        rose = new ImageIcon(getClass().getResource("6rose_299x300.png"));
        rose1 = new ImageIcon(getClass().getResource("66rose_299x300.png"));
        rose2 = new ImageIcon(getClass().getResource("666rose_299x300.png"));
        rose3 = new ImageIcon(getClass().getResource("6666rose_299x300.png"));
        rose4 = new ImageIcon(getClass().getResource("66666rose_299x300.png"));
        rose5 = new ImageIcon(getClass().getResource("666666rose_299x300.png"));
        rose6 = new ImageIcon(getClass().getResource("6666666rose_299x300.png"));
        rose7 = new ImageIcon(getClass().getResource("66666666rose_299x300.png"));
        rose8 = new ImageIcon(getClass().getResource("666666666rose_299x300.png"));


        lion = new ImageIcon(getClass().getResource("7lion_299x300.png"));
        lion1 = new ImageIcon(getClass().getResource("77lion_299x300.png"));
        lion2 = new ImageIcon(getClass().getResource("777lion_299x300.png"));
        lion3 = new ImageIcon(getClass().getResource("7777lion_299x300.png"));
        lion4 = new ImageIcon(getClass().getResource("77777lion_299x300.png"));
        lion5 = new ImageIcon(getClass().getResource("777777lion_299x300.png"));
        lion6 = new ImageIcon(getClass().getResource("7777777lion_299x300.png"));
        lion7 = new ImageIcon(getClass().getResource("77777777lion_299x300.png"));
        lion8 = new ImageIcon(getClass().getResource("777777777lion_299x300.png"));


        earth = new ImageIcon(getClass().getResource("8earth_299x300.png"));
        earth1 = new ImageIcon(getClass().getResource("88earth_299x300.png"));
        earth2 = new ImageIcon(getClass().getResource("888earth_299x300.png"));
        earth3 = new ImageIcon(getClass().getResource("8888earth_299x300.png"));
        earth4 = new ImageIcon(getClass().getResource("88888earth_299x300.png"));
        earth5 = new ImageIcon(getClass().getResource("888888earth_299x300.png"));
        earth6 = new ImageIcon(getClass().getResource("8888888earth_299x300.png"));
        earth7 = new ImageIcon(getClass().getResource("88888888earth_299x300.png"));
        earth8 = new ImageIcon(getClass().getResource("888888888earth_299x300.png"));


        wizard = new ImageIcon(getClass().getResource("9wizard_299x300.png"));
        wizard1 = new ImageIcon(getClass().getResource("99wizard_299x300.png"));
        wizard2 = new ImageIcon(getClass().getResource("999wizard_299x300.png"));
        wizard3 = new ImageIcon(getClass().getResource("9999wizard_299x300.png"));
        wizard4 = new ImageIcon(getClass().getResource("99999wizard_299x300.png"));
        wizard5 = new ImageIcon(getClass().getResource("999999wizard_299x300.png"));
        wizard6 = new ImageIcon(getClass().getResource("9999999wizard_299x300.png"));
        wizard7 = new ImageIcon(getClass().getResource("99999999wizard_299x300.png"));
        wizard8 = new ImageIcon(getClass().getResource("999999999wizard_299x300.png"));


        c = new JButton("", coin);
        add(c);
        c1 = new JButton("", coin1);
        add(c1);
        c2 = new JButton("", coin2);
        add(c2);
        c3 = new JButton("", coin3);
        add(c3);
        c4 = new JButton("", coin4);
        add(c4);
        c5 = new JButton("", coin5);
        add(c5);
        c6 = new JButton("", coin6);
        add(c6);
        c7 = new JButton("", coin7);
        add(c7);
        c8 = new JButton("", coin8);
        add(c8);
        c.setBounds(15, 15, 303, 303);

        d = new JButton("", dragon);
        add(d);
        d1 = new JButton("", dragon1);
        add(d1);
        d2 = new JButton("", dragon2);
        add(d2);
        d3 = new JButton("", dragon3);
        add(d3);
        d4 = new JButton("", dragon4);
        add(d4);
        d5 = new JButton("", dragon5);
        add(d5);
        d6 = new JButton("", dragon6);
        add(d6);
        d7 = new JButton("", dragon7);
        add(d7);
        d8 = new JButton("", dragon8);
        add(d8);
        d.setBounds(360, 15, 303, 303);

        h = new JButton("", helmet);
        add(h);
        h1 = new JButton("", helmet1);
        add(h1);
        h2 = new JButton("", helmet2);
        add(h2);
        h3 = new JButton("", helmet3);
        add(h3);
        h4 = new JButton("", helmet4);
        add(h4);
        h5 = new JButton("", helmet5);
        add(h5);
        h6 = new JButton("", helmet6);
        add(h6);
        h7 = new JButton("", helmet7);
        add(h7);
        h8 = new JButton("", helmet8);
        add(h8);
        h.setBounds(710, 15, 303, 303);

        y = new JButton("", yinYan);
        add(y);
        y1 = new JButton("", yinYan1);
        add(y1);
        y2 = new JButton("", yinYan2);
        add(y2);
        y3 = new JButton("", yinYan3);
        add(y3);
        y4 = new JButton("", yinYan4);
        add(y4);
        y5 = new JButton("", yinYan5);
        add(y5);
        y6 = new JButton("", yinYan6);
        add(y6);
        y7 = new JButton("", yinYan7);
        add(y7);
        y8 = new JButton("", yinYan8);
        add(y8);
        y.setBounds(15, 360, 303, 303);

        e = new JButton("", eagle);
        add(e);
        e1 = new JButton("", eagle1);
        add(e1);
        e2 = new JButton("", eagle2);
        add(e2);
        e3 = new JButton("", eagle3);
        add(e3);
        e4 = new JButton("", eagle4);
        add(e4);
        e5 = new JButton("", eagle5);
        add(e5);
        e6 = new JButton("", eagle6);
        add(e6);
        e7 = new JButton("", eagle7);
        add(e7);
        e8 = new JButton("", eagle8);
        add(e8);
        e.setBounds(360, 360, 303, 303);

        r = new JButton("", rose);
        add(r);
        r1 = new JButton("", rose1);
        add(r1);
        r2 = new JButton("", rose2);
        add(r2);
        r3 = new JButton("", rose3);
        add(r3);
        r4 = new JButton("", rose4);
        add(r4);
        r5 = new JButton("", rose5);
        add(r5);
        r6 = new JButton("", rose6);
        add(r6);
        r7 = new JButton("", rose7);
        add(r7);
        r8 = new JButton("", rose8);
        add(r8);
        r.setBounds(710, 360, 303, 303);

        l = new JButton("", lion);
        add(l);
        l1 = new JButton("", lion1);
        add(l1);
        l2 = new JButton("", lion2);
        add(l2);
        l3 = new JButton("", lion3);
        add(l3);
        l4 = new JButton("", lion4);
        add(l4);
        l5 = new JButton("", lion5);
        add(l5);
        l6 = new JButton("", lion6);
        add(l6);
        l7 = new JButton("", lion7);
        add(l7);
        l8 = new JButton("", lion8);
        add(l8);
        l.setBounds(15, 710, 303, 303);

        ea = new JButton("", earth);
        add(ea);
        ea1 = new JButton("", earth1);
        add(ea1);
        ea2 = new JButton("", earth2);
        add(ea2);
        ea3 = new JButton("", earth3);
        add(ea3);
        ea4 = new JButton("", earth4);
        add(ea4);
        ea5 = new JButton("", earth5);
        add(ea5);
        ea6 = new JButton("", earth6);
        add(ea6);
        ea7 = new JButton("", earth7);
        add(ea7);
        ea8 = new JButton("", earth8);
        add(ea8);
        ea.setBounds(360, 710, 303, 303);

        w = new JButton("", wizard);
        add(w);
        w1 = new JButton("", wizard1);
        add(w1);
        w2 = new JButton("", wizard2);
        add(w2);
        w3 = new JButton("", wizard3);
        add(w3);
        w4 = new JButton("", wizard4);
        add(w4);
        w5 = new JButton("", wizard5);
        add(w5);
        w6 = new JButton("", wizard6);
        add(w6);
        w7 = new JButton("", wizard7);
        add(w7);
        w8 = new JButton("", wizard8);
        add(w8);
        w.setBounds(710, 710, 303, 303);


        thehandler handler = new thehandler();
        spin.addActionListener(handler);


    }

    private class thehandler implements ActionListener {


        public void actionPerformed(ActionEvent event) {


            List<JButton> listE1 = Arrays.asList(c, d, h, y, e, r, l, ea, w);
            List<JButton> listE2 = Arrays.asList(c1, d1, h1, y1, e1, r1, l1, ea1, w1);
            List<JButton> listE3 = Arrays.asList(c2, d2, h2, y2, e2, r2, l2, ea2, w2);
            List<JButton> listE4 = Arrays.asList(c3, d3, h3, y3, e3, r3, l3, ea3, w3);
            List<JButton> listE5 = Arrays.asList(c4, d4, h4, y4, e4, r4, l4, ea4, w4);
            List<JButton> listE6 = Arrays.asList(c5, d5, h5, y5, e5, r5, l5, ea5, w5);
            List<JButton> listE7 = Arrays.asList(c6, d6, h6, y6, e6, r6, l6, ea6, w6);
            List<JButton> listE8 = Arrays.asList(c7, d7, h7, y7, e7, r7, l7, ea7, w7);
            List<JButton> listE9 = Arrays.asList(c8, d8, h8, y8, e8, r8, l8, ea8, w8);


            Random rand = new Random();


            JButton randomElement1 = listE1.get(rand.nextInt(listE1.size()));
            randomElement1.setBounds(15, 15, 303, 303);
            randomElement1.setVisible(true);
            randomElement1.repaint();
            randomElement1.revalidate();


            JButton randomElement2 = listE2.get(rand.nextInt(listE2.size()));
            randomElement2.setBounds(360, 15, 303, 303);
            randomElement2.setVisible(true);
            randomElement2.repaint();
            randomElement2.revalidate();


            JButton randomElement3 = listE3.get(rand.nextInt(listE3.size()));
            randomElement3.setBounds(710, 15, 303, 303);
            randomElement3.setVisible(true);
            randomElement3.repaint();
            randomElement3.revalidate();


            JButton randomElement4 = listE4.get(rand.nextInt(listE4.size()));
            randomElement4.setBounds(15, 360, 303, 303);
            randomElement4.setVisible(true);
            randomElement4.repaint();
            randomElement4.revalidate();


            JButton randomElement5 = listE5.get(rand.nextInt(listE5.size()));
            randomElement5.setBounds(360, 360, 303, 303);
            randomElement5.setVisible(true);
            randomElement5.repaint();
            randomElement5.revalidate();


            JButton randomElement6 = listE6.get(rand.nextInt(listE6.size()));
            randomElement6.setBounds(710, 360, 303, 303);
            randomElement6.setVisible(true);
            randomElement6.repaint();
            randomElement6.revalidate();


            JButton randomElement7 = listE7.get(rand.nextInt(listE7.size()));
            randomElement7.setBounds(15, 710, 303, 303);
            randomElement7.setVisible(true);
            randomElement7.repaint();
            randomElement7.revalidate();


            JButton randomElement8 = listE8.get(rand.nextInt(listE8.size()));
            randomElement8.setBounds(360, 710, 303, 303);
            randomElement8.setVisible(true);
            randomElement8.repaint();
            randomElement8.revalidate();

            JButton randomElement9 = listE9.get(rand.nextInt(listE9.size()));
            randomElement9.setBounds(710, 710, 303, 303);
            randomElement9.setVisible(true);
            randomElement9.repaint();
            randomElement9.revalidate();



                creditt = creditt + 50;

            String position = ((ImageIcon)randomElement1.getIcon()).getDescription();
            String position2 = ((ImageIcon)randomElement2.getIcon()).getDescription();
            String position3 = ((ImageIcon)randomElement3.getIcon()).getDescription();
            String position4 = ((ImageIcon)randomElement4.getIcon()).getDescription();
            String position5 = ((ImageIcon)randomElement5.getIcon()).getDescription();
            String position6 = ((ImageIcon)randomElement6.getIcon()).getDescription();
            String position7 = ((ImageIcon)randomElement7.getIcon()).getDescription();
            String position8 = ((ImageIcon)randomElement8.getIcon()).getDescription();
            String position9 = ((ImageIcon)randomElement9.getIcon()).getDescription();

            System.out.println(position);
            System.out.println(position2);
            System.out.println(position3);
            System.out.println(position4);
            System.out.println(position5);
            System.out.println(position6);
            System.out.println(position7);
            System.out.println(position8);
            System.out.println(position9);



            char[] ch = position.toCharArray();
            char[] ch1 = position2.toCharArray();
            char[] ch2 = position3.toCharArray();
            char[] ch3 = position4.toCharArray();
            char[] ch4 = position5.toCharArray();
            char[] ch5 = position6.toCharArray();
            char[] ch6 = position7.toCharArray();
            char[] ch7 = position8.toCharArray();
            char[] ch8 = position9.toCharArray();




            if(ch[82] == ch1[82]){
                creditt = creditt + 5;
                System.out.println("fds");
            }
            if(ch1[82] == ch2[82]){
                creditt = creditt + 5;
                System.out.println("fds");
            }
            if(ch3[82] == ch4[82]){
                creditt = creditt + 5;
                System.out.println("fds");
            }
            if(ch4[82] == ch5[82]){
                creditt = creditt + 5;
                System.out.println("fds");
            }

            if(ch6[82] == ch7[82]){
                creditt = creditt + 5;
                System.out.println("fds");
            }
            if(ch7[82] == ch8[82]){
                creditt = creditt + 5;
                System.out.println("fds");
            }

            creditt = creditt - bett;
        }


    }

}




