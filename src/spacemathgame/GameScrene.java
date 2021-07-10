/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacemathgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author butkowb
 */
public class GameScrene extends javax.swing.JFrame {

    public static int correct = 1;
    public static int ExtraLifeMultiplier=0;
    public static int gold = 0;
    public static int score = 0;
    public static int health = 100;
    public static int difficulty = 1; //record the difficulty for ammount of gold given
    public static int answer, wrong1, wrong2, wrong3;
    public static int ExtraExtra, AnswerGone;
    public static int ExtraExtraCounter, AnswerGoneCounter;
    public static int userNum = 0;
    public static int helper;
    public static Users[] all = new Users[1000];
    public static Difficulty[] savingScores = new Difficulty[1000];

    public GameScrene() {// TODO: add time limit for questions, animations, finish settings and shop, allow user to see if they have upgrades and how mant boosts they have. Add difficulty and changing questions based on difficulty
        initComponents();
        health = 100;
        score = 0;
        ExtraLifeMultiplier=0;
        // <editor-fold defaultstate="collapsed" desc="Getting things ready">

        showHealth.setText("HEALTH: 100");
        removeAnswer.setVisible(false);
        
        showQuestionNow.setEditable(false);
      

showScore.setForeground(Color.ORANGE);
showGold.setForeground(Color.ORANGE);
        showHealth.setForeground(Color.ORANGE);
setGIF();
showGold.setVisible(true);
showHealth.setVisible(true);
        answer1.setVisible(true);
        answer2.setVisible(true);
        answer3.setVisible(true);
        answer4.setVisible(true);
        showQuestionNow.setVisible(true);
        showScore.setText("SCORE: 0");
        


        // </editor-fold>  
        
        // <editor-fold defaultstate="collapsed" desc="get Extra lives and remove answers">
        Scanner userCheck1;
        try {
            userCheck1 = new Scanner(new File("storeUsers.txt")).useDelimiter("#");
            helper = 0;
            while (userCheck1.hasNextLine()) {
                Scanner userCheck = new Scanner(userCheck1.nextLine()).useDelimiter("#");
                String name = userCheck.next();
                String surname = userCheck.next();
                String username = userCheck.next();
                String password = userCheck.next();
                String email = userCheck.next();
                int goldAmount = userCheck.nextInt();
                all[helper] = new Users(name, surname, username, password, email, goldAmount);
                helper++;
                userCheck.close();
            }
            gold = all[0].getGold();
            userCheck1.close();

            Scanner userCheck3 = new Scanner(new File("difficulty.txt")).useDelimiter("#");
            helper = 0;
            while (userCheck3.hasNextLine()) {
                Scanner userCheck2 = new Scanner(userCheck3.nextLine()).useDelimiter("#");
                String username2 = userCheck2.next();
                String difficulty = userCheck2.next();
                String extras = userCheck2.next();
                savingScores[helper] = new Difficulty(username2, difficulty, extras);
                helper++;
                userCheck2.close();
            }
            userCheck3.close();

            for (int i = 0; i < helper; i++) {
                if (all[0].getUsername().equalsIgnoreCase(savingScores[i].getUsername())) {
                    userNum = i;
                    i = helper;
                }
            }
            Scanner extraGetter = new Scanner(savingScores[userNum].getExtras()).useDelimiter("&");
            AnswerGone = extraGetter.nextInt();
            ExtraExtra = extraGetter.nextInt();
            extraGetter.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(signIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        // </editor-fold> 
        
        
        showGold.setText("TOTAL GOLD: " + gold);
        try {
            doStuff();
        } catch (IOException ex) {
            Logger.getLogger(GameScrene.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        removeAnswer = new javax.swing.JButton();
        showQuestionNow = new javax.swing.JTextField();
        answer1 = new javax.swing.JButton();
        answer2 = new javax.swing.JButton();
        answer3 = new javax.swing.JButton();
        answer4 = new javax.swing.JButton();
        showScore = new javax.swing.JLabel();
        showGold = new javax.swing.JLabel();
        showHealth = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPanel.setMaximumSize(new java.awt.Dimension(32767, 32700));
        BackgroundPanel.setName(""); // NOI18N

        removeAnswer.setText("remove an answer");
        removeAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAnswerActionPerformed(evt);
            }
        });

        showQuestionNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showQuestionNowActionPerformed(evt);
            }
        });

        answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1ActionPerformed(evt);
            }
        });

        answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ActionPerformed(evt);
            }
        });

        answer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3ActionPerformed(evt);
            }
        });

        answer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer4ActionPerformed(evt);
            }
        });

        showScore.setText("SCORE: 0");

        showGold.setText("TOTAL GOLD: ");

        showHealth.setText("HEALTH: 100");

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeAnswer)
                    .addComponent(showScore, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(showHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showGold, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(answer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showQuestionNow)
                    .addComponent(answer4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addComponent(showQuestionNow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(answer4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addComponent(showScore, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showGold, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void setGIF(){
        
JLabel label = new JLabel();
         ImageIcon background = new ImageIcon("movingShipC.gif");
        if(null != chooseGif.Choice)switch (chooseGif.Choice) {
      //  switch ("c2"){
            case "l1":
                background = new ImageIcon("UFOL.gif");
label.setBounds(-90, 0, 560, 300);
                break;
            case "l2":
                background = new ImageIcon("solarSystemL.gif");
label.setBounds(-150, -30, 800, 400);
                break;
            case "r1":
                background = new ImageIcon("spaceManR.gif");
label.setBounds(-80, -40, 700, 400);
                break; 
            case "r2":
                background = new ImageIcon("spaceMonkeyR.gif");
label.setBounds(-180, 0, 700, 320);
                break; 
            case "r3":
                background = new ImageIcon("spaceDolphinR.gif");
label.setBounds(0, 0, 700, 310);
                break; 
            case "c1":
                background = new ImageIcon("movingShipC.gif");
label.setBounds(0, 0, 700, 370);
                break; 
            case "c2":
                background = new ImageIcon("earthC.gif");
label.setBounds(-30, -130, 700, 550);
                break;
            case "c3":
                background = new ImageIcon("rainbowGhostC.gif");
label.setBounds(-120, 0, 700, 390);
                break;
            case "c4":
                background = new ImageIcon("eggUFOC.gif");
label.setBounds(0, -180, 600, 600);
                break;
        }
        
        
//Image image = background.getImage(); 
label.setIcon(background);
BackgroundPanel.add(label);


    }
    private void takeHealth() {

        health = health - 10;
        showHealth.setText("HEALTH: " + health);
    }

    private void givePoints() {

        int helper = 0;
        if (difficulty == 1) {
            helper = 1;
        } else if (difficulty == 2) {
            helper = 3;
        } else if (difficulty == 3) {
            helper = 5;
        }
        gold += helper;
        score += helper;
        showGold.setText("TOTAL GOLD: " + gold);
        showScore.setText("SCORE: " + score);
    }

    private void makeAnswers() {

        switch (correct) {
            case 1:
                answer1.setText("" + answer);
                answer2.setText("" + ((int) answer + wrong1));
                answer3.setText("" + ((int) answer + wrong2));
                answer4.setText("" + ((int) answer + wrong3));
                break;
            case 2:
                answer2.setText("" + answer);
                answer1.setText("" + ((int) answer + wrong1));
                answer3.setText("" + ((int) answer + wrong2));
                answer4.setText("" + ((int) answer + wrong3));
                break;
            case 3:
                answer3.setText("" + answer);
                answer2.setText("" + ((int) answer + wrong1));
                answer1.setText("" + ((int) answer + wrong2));
                answer4.setText("" + ((int) answer + wrong3));
                break;
            case 4:
                answer4.setText("" + answer);
                answer2.setText("" + ((int) answer + wrong1));
                answer3.setText("" + ((int) answer + wrong2));
                answer1.setText("" + ((int) answer + wrong3));
                break;
        }

    }

    private void doStuff() throws IOException {

        // <editor-fold defaultstate="collapsed" desc="This is how its done">
        // </editor-fold>  
        
        // <editor-fold defaultstate="collapsed" desc="Setting Q and A">
        int a, b, c;

        wrong1 = 0;
        wrong2 = 0;
        wrong3 = 0;

        while (wrong1 == 0) {
            wrong1 = ((int) Math.rint(Math.random() * 10 - 5));
        }
        while (wrong2 == 0 || wrong2 == wrong1) {

            wrong2 = ((int) Math.rint(Math.random() * 10 - 5));
        }
        while (wrong3 == 0 || wrong3 == wrong1 || wrong3 == wrong2) {

            wrong3 = ((int) Math.rint(Math.random() * 10 - 5));
        }
//        Math.rint(Math.random());
//        answer1.setText(""+Math.rint(Math.random()*100));
        correct = ((int) Math.rint(Math.random() * 3 + 1));//random int between 1&3 inclusive
        double typeQ = ((Math.random() * 3));
        if (typeQ <= 1) {////////////////////////////////////////////////////////////
            difficulty = 1;
            a = ((int) Math.rint(Math.random() * 200 - 100)); // from -100 to 100      
            b = ((int) Math.rint(Math.random() * 200 - 100)); // from -100 to 100
            c = ((int) Math.rint(Math.random() * 200 - 100)); // from -100 to 100

            showQuestionNow.setText("(" + a + ") + (" + b + ") + (" + c + ")");
            answer = a + b + c;
            makeAnswers();

        } else if (typeQ <= 2) {//////////////////////////////////////////////////////////////////////
            difficulty = 2;
            double whichPart = ((Math.random() * 3));

            a = ((int) Math.rint(Math.random() * 8 + 4));

            c = 0;
            if (whichPart <= 1) {//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                b = ((int) Math.rint(Math.random() * 11 + 4));
                int helper2 = ((a * b) * 2) / 7; //where to start checking for factors
                do {

                    if ((a * b) % helper2 == 0) {
                        c = helper2;
                    } else {
                        helper2--;
                    }

                } while (c == 0);
                answer = (a * b) / c;
                showQuestionNow.setText("(" + a + " X " + b + ") / " + c);
                makeAnswers();
            } else if (whichPart <= 2) {//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

                b = ((int) Math.rint(Math.random() * 60 + 20));

                int helper2 = ((b) * 2) / 7; //where to start checking for factors
                do {

                    if ((b) % helper2 == 0) {
                        c = helper2;
                    } else {
                        helper2--;
                    }

                } while (c == 0);

                answer = a * (b / c);
                showQuestionNow.setText(a + " X (" + b + " / " + c + ")");
                makeAnswers();
            } else {//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

                b = ((int) Math.rint(Math.random() * 8 + 4));
                c = ((int) Math.rint(Math.random() * 8 + 4));
                answer = a * b * c;
                showQuestionNow.setText(a + " X " + b + " X " + c);
                makeAnswers();
            }

        } else {////////////////////////////////////////////////////////////////////////////////////
            difficulty = 3;

            double whichPart = ((Math.random() * 4));
            a = ((int) Math.rint(Math.random() * 9 + 4));

            c = 0;
            if (whichPart <= 1) {//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                b = ((int) Math.rint(Math.random() * 9 + 4));
                c = ((int) Math.rint(Math.random() * 200 - 100));

                answer = (int) Math.pow(a, 2) + (int) Math.pow(b, 2) + c;
                showQuestionNow.setText(a + "^2 + " + b + "^2 + " + c);
                makeAnswers();
            } else if (whichPart <= 2) {//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

                b = ((int) Math.rint(Math.random() * 9 + 4));

                int helper2 = (((int) Math.pow(a, 2) + (int) Math.pow(b, 2)) * 2) / 7; //where to start checking for factors
                do {

                    if (((int) Math.pow(a, 2) + (int) Math.pow(b, 2)) % helper2 == 0) {
                        c = helper2;
                    } else {
                        helper2--;
                    }

                } while (c == 0);

                answer = ((int) Math.pow(a, 2) + (int) Math.pow(b, 2)) / c;
                showQuestionNow.setText("(" + a + "^2 + " + b + "^2) / " + c);
                makeAnswers();
            } else if (whichPart <= 3) {//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

                a = ((int) Math.rint(Math.random() * 3 + 2));
                b = ((int) Math.rint(Math.random() * 200 - 100));
                c = ((int) Math.rint(Math.random() * 200 - 100));
                answer = (int) Math.pow(a, 3) + b + c;
                showQuestionNow.setText(a + "^3 + (" + b + ") + (" + c + ")");
                makeAnswers();
            } else {

                b = ((int) Math.rint(Math.random() * 8 + 4));

                int helper2 = (((int) Math.pow(a, 2) * b) * 2) / 7; //where to start checking for factors
                do {

                    if (((int) Math.pow(a, 2) * b) % helper2 == 0) {
                        c = helper2;
                    } else {
                        helper2--;
                    }

                } while (c == 0);

                answer = ((int) Math.pow(a, 2) * b) / c;
                showQuestionNow.setText("(" + a + "^2 X " + b + ") / " + c);
                makeAnswers();
            }

        }
        // </editor-fold>  
        
        // <editor-fold defaultstate="collapsed" desc="remove an answer">
        if(AnswerGone>0){
            removeAnswer.setVisible(true);
        }else{
            removeAnswer.setVisible(false);
        }
        
                // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="when health == 0">
        if (health == 0) {//add: if have extra life,in leaderboard sort text file and save top 50 only
            char carryOn = 'N';
            String stringHelp="";
            if (ExtraExtra >= Math.pow(2,ExtraLifeMultiplier)) {
                
                stringHelp = JOptionPane.showInputDialog("You have " + ExtraExtra + " extra lives remaining, would you like to use "+  (int)Math.pow(2,ExtraLifeMultiplier)+"?\nYou will continue with 40 health\n\nPlease type Y / N . Only the first character will be looked at");
                
                while(stringHelp==null||"".equals(stringHelp) || !(stringHelp.toUpperCase().charAt(0) =='Y' ||stringHelp.toUpperCase().charAt(0) =='N' )){
                    
                stringHelp = JOptionPane.showInputDialog("You have " + ExtraExtra + " extra lives remaining, would you like to use "+  (int)Math.pow(2,ExtraLifeMultiplier)+"?\nYou will continue with 40 health\n\nPlease type Y / N . Only the first character will be looked at\nPlease make sure to enter a valid answer");
                
                } 
//                    do{
//                stringHelp = JOptionPane.showInputDialog("You have " + ExtraExtra + " extra lives remaining, would you like to use "+  (int)Math.pow(2,ExtraLifeMultiplier)+"?\nYou will continue with 40 health\n\nPlease type Y / N . Only the first character will be looked at");
//            }while(stringHelp.length()<1);
//                }while(!(stringHelp.toUpperCase().charAt(0) =='Y' ||stringHelp.toUpperCase().charAt(0) =='N' ));
//                
            
            
            
            carryOn = stringHelp.toUpperCase().charAt(0);
            }
            if (carryOn == 'Y') {

                health = 40;
                showHealth.setText("HEALTH: 40");
                ExtraExtra = ExtraExtra -(int) Math.pow(2,ExtraLifeMultiplier);
                ExtraExtraCounter++;
ExtraLifeMultiplier++;
            } else {
                JOptionPane.showMessageDialog(null, "          YOU LOSE!\nYou got a score of " + score + "\n\nKeep practising and buy extras from the shop to keep improving");

                try {

                    all[0].setGold(gold);
                    PrintWriter file = new PrintWriter(new FileWriter("storeUsers.txt", false));
                    for (int z = 0; z < helper; z++) {

                        file.println(all[z].toString());

                    }
                    file.close();

                    PrintWriter file2 = new PrintWriter(new FileWriter("leaderboard.txt", true), true);

                    file2.println(all[0].getUsername() + "#" + score+"#"+ExtraExtraCounter+"#"+AnswerGoneCounter);

                    file2.close();

                    Scanner extraGetter2 = new Scanner(savingScores[userNum].getExtras()).useDelimiter("&");
                    int notNeeded = extraGetter2.nextInt();
                    notNeeded = extraGetter2.nextInt();
                    savingScores[userNum].setExtras(AnswerGone + "&" + ExtraExtra + "&" + extraGetter2.next() + "&" + extraGetter2.next());
                    PrintWriter file3 = new PrintWriter(new FileWriter("difficulty.txt", false));
                    for (int z = 0; z < helper; z++) {

                        file3.println(savingScores[z].toString());

                    }
                    file3.close();
         
                } catch (IOException ex) {
                    Logger.getLogger(signIn.class.getName()).log(Level.SEVERE, null, ex);
                }
                MainMenu helpMe = new MainMenu();
                helpMe.setResizable(false);
                helpMe.setVisible(true);
                dispose();
            }

        }

        // </editor-fold>  
    }

    private void showQuestionNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showQuestionNowActionPerformed

       
        
    }//GEN-LAST:event_showQuestionNowActionPerformed

    private void answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1ActionPerformed
        if (correct == 1) {
            givePoints();
        } else {
            takeHealth();
        }
        try {
            doStuff();
        } catch (IOException ex) {
            Logger.getLogger(GameScrene.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_answer1ActionPerformed

    private void answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2ActionPerformed
        if (correct == 2) {
            givePoints();
        } else {
            takeHealth();
        }
        try {
            doStuff();
        } catch (IOException ex) {
            Logger.getLogger(GameScrene.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_answer2ActionPerformed

    private void answer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3ActionPerformed
        if (correct == 3) {
            givePoints();
        } else {
            takeHealth();
        }
        try {
            doStuff();
        } catch (IOException ex) {
            Logger.getLogger(GameScrene.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_answer3ActionPerformed

    private void answer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer4ActionPerformed
        if (correct == 4) {
            givePoints();
        } else {
            takeHealth();
        }
        try {
            doStuff();
        } catch (IOException ex) {
            Logger.getLogger(GameScrene.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_answer4ActionPerformed

    private void removeAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAnswerActionPerformed
int notAnswer;
        do{
         notAnswer = ((int) Math.rint(Math.random() * 3 + 1));
        }while(notAnswer == correct);
        
        switch (notAnswer){
            case 1:
                answer1.setText("This is not the correct answer");
                break;
            case 2:
                answer2.setText("This is not the correct answer");
                break;
            case 3:
                answer3.setText("This is not the correct answer");
                break;
            case 4:
                answer4.setText("This is not the correct answer");
                break;
        }
        removeAnswer.setVisible(false);
        AnswerGone--;
        AnswerGoneCounter++;

    }//GEN-LAST:event_removeAnswerActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameScrene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameScrene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameScrene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScrene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameScrene().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton answer1;
    private javax.swing.JButton answer2;
    private javax.swing.JButton answer3;
    private javax.swing.JButton answer4;
    private javax.swing.JButton removeAnswer;
    private javax.swing.JLabel showGold;
    private javax.swing.JLabel showHealth;
    private javax.swing.JTextField showQuestionNow;
    private javax.swing.JLabel showScore;
    // End of variables declaration//GEN-END:variables
}
