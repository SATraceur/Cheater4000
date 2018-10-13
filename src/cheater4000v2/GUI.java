package cheater4000v2;

import java.awt.AWTException;
import java.awt.AWTKeyStroke;
import static java.awt.AWTKeyStroke.getAWTKeyStroke;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import static java.awt.event.InputEvent.SHIFT_DOWN_MASK;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI extends javax.swing.JFrame {

    public GUI() throws AWTException {
        bot = new Robot();
        bot.setAutoWaitForIdle(true);
        bot.setAutoDelay(1);
        initComponents();
        Font font = CommandTextArea.getFont();
        float size = font.getSize() - 2.0f;
        CommandTextArea.setFont(font.deriveFont(size));
        FeedbackTextArea.setFont(font.deriveFont(size));
        GUI.this.setTitle("Cheater4000 v2.1");
        CommandTextArea.insert("MOVE:1000:750\n"
                + "WAIT:500\n"
                + "LOOP:3\n"
                + "L_CLK\n"
                + "E_LOOP\n"
                + "MOVE:RAND(680|700):RAND(90|120)\n"
                + "WAIT:RAND(500|1000)\n"
                + "MOVE:680:90\n"
                + "M_CLK\n"
                + "LOOP:RAND(5|10)\n"
                + "R_CLK\n"
                + "E_LOOP\n", 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        MouseXBox = new javax.swing.JTextField();
        MouseYBox = new javax.swing.JTextField();
        TrackButton = new javax.swing.JButton();
        TrackStopButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommandTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        FeedbackTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        loopBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        instructionIntervalBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        successiveTimeBox = new javax.swing.JTextField();
        playButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        topStatusLabel = new javax.swing.JLabel();
        bottomStatusLabel = new javax.swing.JLabel();
        DisableLogOutputBox = new javax.swing.JCheckBox();
        jMenuBar2 = new javax.swing.JMenuBar();
        FileButton = new javax.swing.JMenu();
        LoadButton = new javax.swing.JMenuItem();
        SaveButton = new javax.swing.JMenuItem();
        HelpButton = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mouse Position");

        TrackButton.setText("Track");
        TrackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackButtonActionPerformed(evt);
            }
        });

        TrackStopButton.setText("Stop");
        TrackStopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackStopButtonActionPerformed(evt);
            }
        });

        CommandTextArea.setColumns(20);
        CommandTextArea.setRows(5);
        jScrollPane1.setViewportView(CommandTextArea);

        FeedbackTextArea.setColumns(20);
        FeedbackTextArea.setRows(5);
        jScrollPane2.setViewportView(FeedbackTextArea);

        jLabel2.setText("Loops");

        jLabel3.setText("Time Between Commands (ms)");

        jLabel4.setText("Time Between Successive Clicks (ms)");

        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        DisableLogOutputBox.setText("Disable Log Output");
        DisableLogOutputBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisableLogOutputBoxActionPerformed(evt);
            }
        });

        FileButton.setText("File");

        LoadButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });
        FileButton.add(LoadButton);

        SaveButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        FileButton.add(SaveButton);

        HelpButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        HelpButton.setText("Help");
        HelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpButtonActionPerformed(evt);
            }
        });
        FileButton.add(HelpButton);

        jMenuBar2.add(FileButton);

        jMenu4.setText("Coordinate Variables");

        jMenuItem1.setText("Item1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Item2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Item3");
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("Item4");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Item5");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Item6");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Item7");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Item8");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Item9");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Item10");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Item11");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Item12");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Item13");
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Item14");
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Item15");
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Item16");
        jMenu4.add(jMenuItem16);

        jMenuItem17.setText("Item17");
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Item18");
        jMenu4.add(jMenuItem18);

        jMenuItem19.setText("Item19");
        jMenu4.add(jMenuItem19);

        jMenuItem20.setText("Item20");
        jMenu4.add(jMenuItem20);

        jMenuItem21.setText("Item21");
        jMenu4.add(jMenuItem21);

        jMenuItem22.setText("Item22");
        jMenu4.add(jMenuItem22);

        jMenuItem23.setText("Item23");
        jMenu4.add(jMenuItem23);

        jMenuItem24.setText("Item24");
        jMenu4.add(jMenuItem24);

        jMenuItem25.setText("Item25");
        jMenu4.add(jMenuItem25);

        jMenuItem26.setText("Item26");
        jMenu4.add(jMenuItem26);

        jMenuItem27.setText("Item27");
        jMenu4.add(jMenuItem27);

        jMenuItem28.setText("Item28");
        jMenu4.add(jMenuItem28);

        jMenuItem29.setText("Item29");
        jMenu4.add(jMenuItem29);

        jMenuItem30.setText("Item30");
        jMenu4.add(jMenuItem30);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DisableLogOutputBox)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MouseXBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MouseYBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TrackButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TrackStopButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(topStatusLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loopBox, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(instructionIntervalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(successiveTimeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stopButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bottomStatusLabel)))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MouseXBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MouseYBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrackButton)
                    .addComponent(TrackStopButton)
                    .addComponent(topStatusLabel))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loopBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(instructionIntervalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(successiveTimeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(stopButton)
                    .addComponent(bottomStatusLabel))
                .addGap(2, 2, 2)
                .addComponent(DisableLogOutputBox)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="BUTTON ACTIONS">  
    private void TrackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackButtonActionPerformed
                Thread t = new Thread(() -> {
            try {
                setTrackerState(STATE_RUNNING);
                Robot bot = new Robot();
                for (int i = 0; i < 10000; i++) {
                    if (getTrackerState() == STATE_SCHD_TO_STOP) { throw new RuntimeException(); }
                    Point pt = MouseInfo.getPointerInfo().getLocation();
                    MouseXBox.setText("X: " + pt.x);
                    MouseYBox.setText("Y: " + pt.y);
                    bot.delay(5);
                }
            } catch (AWTException | RuntimeException e) {} 
            finally { setTrackerState(STATE_STOPPED); }
        });
        if (getTrackerState() == STATE_STOPPED) { t.start(); }
    }//GEN-LAST:event_TrackButtonActionPerformed

    private void TrackStopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackStopButtonActionPerformed
        setTrackerState(STATE_SCHD_TO_STOP);
    }//GEN-LAST:event_TrackStopButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        LinkedList<Action> list = readCommand();
        playCommand(list);
    }//GEN-LAST:event_playButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed

        setPlayerState(STATE_SCHD_TO_STOP);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void DisableLogOutputBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisableLogOutputBoxActionPerformed
        log = !log;
    }//GEN-LAST:event_DisableLogOutputBoxActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file2 = new File(fileChooser.getSelectedFile().getCanonicalPath() + ".txt"); // Make new file in user chosen dir with ".txt" appended to filename
                Writer out = new BufferedWriter(new FileWriter(file2));
                out.write(CommandTextArea.getText());
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        JFileChooser chooser = new JFileChooser("./");                                          // Set file chooser to root directory of project.
        chooser.setDialogTitle("Load");

        int returned = chooser.showOpenDialog(this);                                            // Open file chooser window.

        if (returned == JFileChooser.APPROVE_OPTION && !fileLoaded) {                            // If a file is chosen.
            File file = chooser.getSelectedFile();                                              // Store the file handle.
            jLabel1.setText("Loading " + file.getName() + " into Cheater4000 v2.1");
            readInFile(file.getName());
            jLabel1.setText("Cheater4000 v2.1 has successfully loaded " + file.getName());
            fileLoaded = true;                                                                  // Set loaded flag.                                                                  
        } else if (returned == JFileChooser.APPROVE_OPTION && fileLoaded) {                     // Display error window if user attempts to load multiple files.
            JOptionPane.showMessageDialog(null, "A file is already loaded! Restart the program to load another file you cheating fuck!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void HelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpButtonActionPerformed
        String infoMessage = "==========================================================================                         \n"
                + "                                                           Welcome to Cheater4000 v2.1                  \n"
                + "==========================================================================                         \n"
                + "The following commands can be used to cheat your way to victory!\n\n"
                + "L_CLK or SHIFT_L_CLK or CTRL_L_CLK\n"
                + "R_CLK or SHIFT_R_CLK or CTRL_R_CLK\n"
                + "M_CLK or SHIFT_M_CLK or CTRL_M_CLK\n"
                + "L_UP or L_DOWN ( can be used to hold mouse button down i.e. click and drag )\n"
                + "TYPE:A sentence you want to type. ( handles all characters EXCEPT : )\n" 
                + "STORE_PSWD:YourPassword\n"
                + "ENTER_PSWD\n"
                + "LOOP:numberOfLoops ( can be used to construct loops, can also have nested loops )\n"
                + "LOOP:RAND(a|b) ( can be used to loop a random number of times in the range of x -> y)\n"
                + "E_LOOP ( used to define end of loop )\n"
                + "MOVE:xxxx:yyyy where \"xxxx\" is the x-coordinate of the mouse and \"yyyy\" is the y-coordinate. \n"
                + "MOVE:RAND(x|y):RAND(x1|y1) can be used to move to random spot in the area defined by x -> x1 & y -> y1 \n"
                + "WAIT:ms \"ms\" should be replaced with the desired wait time in milliseconds. \n"
                + "WAIT:RAND(a|b) can be used to wait a random time from a -> b \n\n\n "
                + "CHANGELOG \n"
                + "- Ported to javax.swing libs for improved jframe, jfilechooser etc. \n"
                + "- Dynamic resizable text boxes & parametrized button locations \n"
                + "- Improved overall performance utilizing multiple threads. \n"
                + "- Added ability to save & load existing command.txt files by menu and hotkeys. \n"
                + "- Added ability to store pswd's, execute shift clicks etc.\n"
                + "- Added ability to disable log output & added elapsed time counter.\n"
                + "- Changed WAIT parameter from seconds to milliseconds. \n"
                + "- Added option to modify delay between each instruction and/or successive clicks. \n"
                + "- Added loop feature.\n"
                + "- Added randomisation options for LOOP, WAIT and MOVE.\n"
                + "- A whole bunch of other BTS stuff / semi-hidden easter eggs.";
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_HelpButtonActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        CVModifierInterface CVMI = new CVModifierInterface();
        CVMI.setVisible(true);      
        CoordinateVariable CV = CVMI.getCV();
        CVList.add(CV);  
        System.out.println(CV.varName + " From GUI");
        jMenuItem12.setText(CV.varName);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CVModifierInterface CVMI = new CVModifierInterface();
        CVMI.setVisible(true);      
    //    CVList.add(CV); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CVModifierInterface CVMI = new CVModifierInterface();
        CVMI.setVisible(true);      
      //  CVList.add(CV);         
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    // </editor-fold>
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new GUI().setVisible(true);
            } catch (AWTException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    private void readInFile(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            CommandTextArea.setText(""); // Clear text area before insrting contents of file
            CommandTextArea.insert(sb.toString(), 0);
            br.close();
        } catch (FileNotFoundException ex) {
            FeedbackTextArea.insert("FILE NOT FOUND", 0);
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean setTrackerState(int newState) {
        if ((tracker_state != STATE_STOPPED) || (newState != STATE_SCHD_TO_STOP)) {
            tracker_state = newState;
        }
        if (tracker_state == STATE_RUNNING) {
            topStatusLabel.setText("Running.");
        //    new Thread(() -> constructMove()).start(); 
        } else if (tracker_state == STATE_SCHD_TO_STOP) {
            topStatusLabel.setText("Scheduled to stop.");
        } else {
            topStatusLabel.setText("Stopped.");
        }
        return true;
    }

    private void constructMove() {   
        int i = 0;
        while(this.getFocusOwner() != null && tracker_state == STATE_RUNNING) {               
            System.out.println("hello" + ++i);
        }
        setTrackerState(STATE_SCHD_TO_STOP);
    } // WORK IN PROGRESS
    
    private int getTrackerState() {
        return this.tracker_state;
    }

    private boolean setPlayerState(int newState) {
        if ((player_state != STATE_STOPPED) || (newState != STATE_SCHD_TO_STOP)) { player_state = newState; }
        if (player_state == STATE_RUNNING) { 
            new Thread(() -> dispElapsedTime()).start(); 
            playButton.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    if(e.getKeyChar() == KeyEvent.VK_ESCAPE) { setPlayerState(STATE_SCHD_TO_STOP); }
                }

                @Override
                public void keyPressed(KeyEvent e) { }

                @Override
                public void keyReleased(KeyEvent e) { }
            });     
        } 
        else if (player_state == STATE_SCHD_TO_STOP) { bottomStatusLabel.setText("Scheduled to stop."); } 
        else {
            bottomStatusLabel.setText("Stopped: "
                    + formatter.format(hours) + "h:"
                    + formatter.format(minutes) + "m:"
                    + formatter.format(seconds) + "s");
        }
        return true;
    }

    private int getPlayerState() {
        return this.player_state;
    }

    private void dispElapsedTime() {
        while (player_state == STATE_RUNNING) {
            seconds = ((System.currentTimeMillis() - startTime) / 1000);
            if (seconds > 59) {
                startTime = System.currentTimeMillis();
                seconds = 0;
                minutes++;
                if (minutes > 59) {
                    minutes = 0;
                    hours++;
                }
            }
            bottomStatusLabel.setText("Running: "
                    + formatter.format(hours) + "h:"
                    + formatter.format(minutes) + "m:"
                    + formatter.format(seconds) + "s");
        }
    }

    private static AWTKeyStroke getKeyStroke(char c) {
        String upper = "`~'\"!@#$%^&*()_+{}|:<>?";
        String lower = "`~'\"1234567890-=[]\\;,./";

        int index = upper.indexOf(c);
        if (index != -1) {
            int keyCode;
            boolean shift = false;
            switch (c) {
                case '~': shift = true;
                case '`': keyCode = KeyEvent.VK_BACK_QUOTE; break;
                case '\"': shift = true;
                case '\'': keyCode = KeyEvent.VK_QUOTE; break;
                default:
                    keyCode = (int) Character.toUpperCase(lower.charAt(index));
                    shift = true;
            }
            return getAWTKeyStroke(keyCode, shift ? SHIFT_DOWN_MASK : 0);
        }
        return getAWTKeyStroke((int) Character.toUpperCase(c), 0);
    }

    public void writeString(CharSequence chars) {
        for (int i = 0, len = chars.length(); i < len; i++) {
            char c = chars.charAt(i);
            AWTKeyStroke keyStroke = getKeyStroke(c);
            int keyCode = keyStroke.getKeyCode();
            boolean shift = Character.isUpperCase(c) || keyStroke.getModifiers() == (SHIFT_DOWN_MASK + 1);
            if (shift) { bot.keyPress(KeyEvent.VK_SHIFT); }
            bot.delay(5);
            bot.keyPress(keyCode);
            bot.keyRelease(keyCode);
            bot.delay(5);
            if (shift) { bot.keyRelease(KeyEvent.VK_SHIFT); }
        }
    }
    
    private void playCommand(final LinkedList<Action> codes) {
        Thread t = new Thread(() -> {
            try {
                startTime = System.currentTimeMillis();
                int loops = Integer.parseInt(loopBox.getText());
                setPlayerState(STATE_RUNNING);
                
                for (int count = 0; count < loops; count++) {
                    if (log) { FeedbackTextArea.insert("LOOP: " + (count + 1) + "\n", 0); }
                    for (int i = 0; i < codes.size(); i++) {
                        playCommandHelper(codes.get(i));
                        if (getPlayerState() == STATE_SCHD_TO_STOP) { return; }
                    }
                }
            } catch (NumberFormatException e) {
                if (log) { FeedbackTextArea.insert("INVALID LOOP NUMBER\n", 0); }
            } finally { setPlayerState(STATE_STOPPED); }
        });
        if (this.getPlayerState() == STATE_STOPPED) { t.start(); }
    }

    private void playCommandHelper(Action code) {
        Action currentAction = code;
        if (lastAction == currentAction.ACTION_TYPE && (currentAction.ACTION_TYPE == Action.L_CLK || currentAction.ACTION_TYPE == Action.R_CLK || currentAction.ACTION_TYPE == Action.M_CLK)) {          
            if (log) { FeedbackTextArea.insert("SUCCESSIVE CLICK - waited specified time of: " + currentAction.successiveInterval + "ms\n", 0); }
                bot.delay(currentAction.successiveInterval);
            } else if (currentAction.ACTION_TYPE == Action.WAIT) {
                // <editor-fold defaultstate="collapsed" desc="WAIT">
                int wait;
                if(currentAction.waitDelayB < 0) { 
                    wait = currentAction.waitDelayA; 
                    bot.delay(wait);  } 
                else { 
                    wait = ThreadLocalRandom.current().nextInt(currentAction.waitDelayA, currentAction.waitDelayB);
                    bot.delay(wait); 
                }
                if (log) { FeedbackTextArea.insert("WAITED: " + wait + "ms\n", 0); }
                // </editor-fold>
            } else if (currentAction.ACTION_TYPE == Action.L_CLK) {                               
                // <editor-fold defaultstate="collapsed" desc="LEFT CLICK">
                if (currentAction.modifier.equals("SHIFT")) { bot.keyPress(KeyEvent.VK_SHIFT); }
                if (currentAction.modifier.equals("CONTROL")) { bot.keyPress(KeyEvent.VK_CONTROL); }
                bot.delay(25);
                bot.mousePress(16);
                bot.mouseRelease(16);
                bot.delay(25);
                if (currentAction.modifier.equals("CONTROL")) { bot.keyRelease(KeyEvent.VK_CONTROL); }
                if (currentAction.modifier.equals("SHIFT")) { bot.keyRelease(KeyEvent.VK_SHIFT); }
                if (log) { FeedbackTextArea.insert("L_CLICK\n", 0); }
                // </editor-fold>
            } else if (currentAction.ACTION_TYPE == Action.UP_LEFT) {
                bot.mouseRelease(16);
                if (log) { FeedbackTextArea.insert("LEFT_MOUSE_UP\n", 0); }
            } else if (currentAction.ACTION_TYPE == Action.DOWN_LEFT) {
                bot.mousePress(16);
                if (log) { FeedbackTextArea.insert("LEFT_MOUSE_DOWN\n", 0); }
            } else if (currentAction.ACTION_TYPE == Action.R_CLK) {                                  
                // <editor-fold defaultstate="collapsed" desc="RIGHT CLICK">
                            if (currentAction.modifier.equals("SHIFT")) { bot.keyPress(KeyEvent.VK_SHIFT); }
                            if (currentAction.modifier.equals("CONTROL")) { bot.keyPress(KeyEvent.VK_CONTROL); }
                            bot.delay(25);
                            bot.mousePress(8);
                            bot.mouseRelease(4);
                            bot.delay(25);
                            if (currentAction.modifier.equals("CONTROL")) { bot.keyRelease(KeyEvent.VK_CONTROL); }
                            if (currentAction.modifier.equals("SHIFT")) { bot.keyRelease(KeyEvent.VK_SHIFT); }
                            if (log) { FeedbackTextArea.insert("R_CLICK\n", 0); }
                            // </editor-fold>
            } else if (currentAction.ACTION_TYPE == Action.M_CLK) {
                // <editor-fold defaultstate="collapsed" desc="MIDDLE CLICK">
                if (currentAction.modifier.equals("SHIFT")) { bot.keyPress(KeyEvent.VK_SHIFT); }
                if (currentAction.modifier.equals("CONTROL")) { bot.keyPress(KeyEvent.VK_CONTROL); }
                bot.delay(25);
                bot.mousePress(4);
                bot.mouseRelease(8);
                bot.delay(25);
                if (currentAction.modifier.equals("CONTROL")) { bot.keyRelease(KeyEvent.VK_CONTROL); }
                if (currentAction.modifier.equals("SHIFT")) { bot.keyRelease(KeyEvent.VK_SHIFT); }
                if (log) { FeedbackTextArea.insert("M_CLICK\n", 0); }
                // </editor-fold>
            } else if (currentAction.ACTION_TYPE == Action.MOVE) {
                // <editor-fold defaultstate="collapsed" desc="MOVE">
                int x, y;
                if(currentAction.x1 < 0 && currentAction.y1 < 0) { 
                    x = currentAction.x;
                    y = currentAction.y;
                   bot.mouseMove(currentAction.x, currentAction.y);
                } else { 
                    x = ThreadLocalRandom.current().nextInt(currentAction.x, currentAction.x1);
                    y = ThreadLocalRandom.current().nextInt(currentAction.y, currentAction.y1);
                    bot.mouseMove(x, y);
                }
                if (log) { FeedbackTextArea.insert("MOVED: X:" + x + " ,Y:" + y + "\n", 0); }
                // </editor-fold>     
            } else if (currentAction.ACTION_TYPE == Action.LOOP) {     
                // <editor-fold defaultstate="collapsed" desc="LOOP">
                for (int internalLoop = 0; internalLoop < currentAction.loopNumber; internalLoop++) {    // For each inner loop
                    for (int j = 0; j < currentAction.loopInstructions.size(); j++) {                    // iterate through instruction list
                        playCommandHelper(currentAction.loopInstructions.get(j));                          // play each instruction
                    }
                }
                // </editor-fold>
            } else if (currentAction.ACTION_TYPE == Action.USE_PASSWORD) {
                writeString(password);
                if (log) { FeedbackTextArea.insert("PSWD_USED\n", 0); }
            } else if (currentAction.ACTION_TYPE == Action.TYPE) { writeString(currentAction.keys); }
            bot.delay(currentAction.instructionInterval);
            lastAction = currentAction.ACTION_TYPE;
    }
    
    private LinkedList<Action> readCommand() {
        LinkedList q = new LinkedList();
        String s = CommandTextArea.getText();         
        lines = s.split("\n");                                       // Make array of ALL commands
        for (iterator = 0; iterator < lines.length; iterator++) {    // For each command 
            q.add(readCommandHelper());                                 // Add action to queue
            endFound = false;
        }
        return q;
    }
    
    private Action readCommandHelper() {
        
        String[] parts = lines[iterator].split(":");                 // Split current command   
        Action action = new Action();
            
        if (parts[0].equals("LOOP") && parts.length == 2) {   
            // <editor-fold defaultstate="collapsed" desc="LOOP">
            action.ACTION_TYPE = Action.LOOP; 
            String[] subParts = parts[1].split("\\|");                                        // LOOP:RAND(a|b)        
            if (subParts.length > 1) {     
                int a = 0, b = 0;
                try {
                    a = Integer.parseInt(subParts[0].substring(5));                           // Extract first number, parse to int 
                    subParts[1] = subParts[1].trim();                                         // Remove trailing whitespace from second number
                    b = Integer.parseInt(subParts[1].substring(0, subParts[1].length() - 1)); // Parse second number to int
                } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
                    FeedbackTextArea.insert("INVALID RANDOM LOOP SYNTAX\n", 0);
                }
                action.loopNumber = ThreadLocalRandom.current().nextInt(a, b);                 // a <= loopNumber <= b   
            } else {
                action.loopNumber = Integer.parseInt(parts[1]); 
            }
                  
            while(!endFound) {                                  // While end of loop not found
                iterator++;
                Action act = readCommandHelper();                  // get next action in loop
                if(act.ACTION_TYPE != Action.E_LOOP) { action.loopInstructions.add(act); } // add if action is not E_LOOP               
            }
            return action;
            // </editor-fold>
        }
        else if (parts[0].equals("E_LOOP") && parts.length == 1) { action.ACTION_TYPE = Action.E_LOOP; endFound = true; }
        else if (parts[0].equals("MOVE")) { 
            // <editor-fold defaultstate="collapsed" desc="MOVE">
            action.ACTION_TYPE = Action.MOVE; 
            String[] subParts = parts[1].split("\\|");
            if (subParts.length > 1) {
                try {
                    action.x = Integer.parseInt(subParts[0].substring(5));                            // Extract first number, parse to int                                
                    action.x1 = Integer.parseInt(subParts[1].substring(0, subParts[1].length() - 1)); // Extract second number, parse to int  
                    String[] subParts2 = parts[2].split("\\|"); 
                    action.y = Integer.parseInt(subParts2[0].substring(5));                           // Extract third number, parse to int  
                    subParts2[1] = subParts2[1].trim();                                               // Remove trailing whitespace from fourth number
                    action.y1 = Integer.parseInt(subParts2[1].substring(0, subParts2[1].length() - 1));  // Extract fourth number, parse to int 
                } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
                    FeedbackTextArea.insert("INVALID RANDOM MOVE SYNTAX\n", 0);
                }
            } else {
                action.x = Integer.parseInt(parts[1]); 
                action.y = Integer.parseInt(parts[2]); 
            }
            // </editor-fold>
        }
        else if (parts[0].equals("L_CLK") && parts.length == 1) { action.ACTION_TYPE = Action.L_CLK; }
        else if (parts[0].equals("L_DOWN") && parts.length == 1) { action.ACTION_TYPE = Action.DOWN_LEFT; }
        else if (parts[0].equals("L_UP") && parts.length == 1) { action.ACTION_TYPE = Action.UP_LEFT; }
        else if (parts[0].equals("R_CLK") && parts.length == 1) { action.ACTION_TYPE = Action.R_CLK; }
        else if (parts[0].equals("M_CLK") && parts.length == 1) { action.ACTION_TYPE = Action.M_CLK; }
        else if (parts[0].equals("WAIT") && parts.length == 2) {     
            // <editor-fold defaultstate="collapsed" desc="WAIT">  
            action.ACTION_TYPE = Action.WAIT;  
            String[] subParts = parts[1].split("\\|");
            if (subParts.length > 1) { 
                try {
                    action.waitDelayA = Integer.parseInt(subParts[0].substring(5));                           // Extract first number, parse to int 
                    subParts[1] = subParts[1].trim();                                                         // Remove trailing whitespace from second number
                    action.waitDelayB = Integer.parseInt(subParts[1].substring(0, subParts[1].length() - 1)); // Parse second number to int
                } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
                    FeedbackTextArea.insert("INVALID RANDOM WAIT SYNTAX\n", 0);
                }
            } else {
                action.waitDelayA = Integer.parseInt(parts[1]); 
            }
            // </editor-fold>
        }
        else if (parts[0].equals("STORE_PSWD") && parts.length == 2) { password = parts[1]; }
        else if (parts[0].equals("USE_PSWD") && parts.length == 1) { action.ACTION_TYPE = Action.USE_PASSWORD; }
        else if (parts[0].equals("SHIFT_L_CLK") && parts.length == 1) { action.ACTION_TYPE = Action.L_CLK; action.modifier = "SHIFT"; }
        else if (parts[0].equals("SHIFT_R_CLK") && parts.length == 1) { action.ACTION_TYPE = Action.R_CLK; action.modifier = "SHIFT"; }
        else if (parts[0].equals("SHIFT_M_CLK") && parts.length == 1) { action.ACTION_TYPE = Action.M_CLK; action.modifier = "SHIFT"; }
        else if (parts[0].equals("CTRL_L_CLK") && parts.length == 1) { action.ACTION_TYPE = Action.L_CLK; action.modifier = "CONTROL"; }
        else if (parts[0].equals("CTRL_R_CLK") && parts.length == 1) { action.ACTION_TYPE = Action.R_CLK; action.modifier = "CONTROL"; }
        else if (parts[0].equals("CTRL_M_CLK") && parts.length == 1) { action.ACTION_TYPE = Action.M_CLK; action.modifier = "CONTROL"; }
        else if (parts[0].equals("TYPE") && parts.length == 2) { action.ACTION_TYPE = Action.TYPE; action.keys = parts[1]; } 
        else if (parts[0].equals("") && lines.length == 1) {
            if (log) { FeedbackTextArea.insert("NO COMMANDS FOUND\n", 0); }
        } else {
            if (log) { FeedbackTextArea.insert("UNKNOWN ACTION ENCOUNTERED\n", 0); }
        }
        try {
            action.instructionInterval = Integer.parseInt(instructionIntervalBox.getText());
        } catch (NumberFormatException e) { }
        try {
            action.successiveInterval = Integer.parseInt(successiveTimeBox.getText());
        } catch (NumberFormatException e) { }
     
        return action;
    }
    

    // <editor-fold defaultstate="collapsed" desc="VARIABLES">   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommandTextArea;
    private javax.swing.JCheckBox DisableLogOutputBox;
    private javax.swing.JTextArea FeedbackTextArea;
    private javax.swing.JMenu FileButton;
    private javax.swing.JMenuItem HelpButton;
    private javax.swing.JMenuItem LoadButton;
    private javax.swing.JTextField MouseXBox;
    private javax.swing.JTextField MouseYBox;
    private javax.swing.JMenuItem SaveButton;
    private javax.swing.JButton TrackButton;
    private javax.swing.JButton TrackStopButton;
    private javax.swing.JLabel bottomStatusLabel;
    private javax.swing.JTextField instructionIntervalBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField loopBox;
    private javax.swing.JButton playButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JTextField successiveTimeBox;
    private javax.swing.JLabel topStatusLabel;
    // End of variables declaration//GEN-END:variables
    public static int STATE_STOPPED = 0;
    public static int STATE_RUNNING = 1;
    public static int STATE_SCHD_TO_STOP = 2;
    private int player_state = 0;
    private int tracker_state = 0;
    private boolean fileLoaded = false;
    private long hours = 0;
    private long minutes = 0;
    private long seconds = 0;
    private long startTime = 0;
    private final DecimalFormat formatter = new DecimalFormat("00");
    private String password;
    private boolean log = true;
    private boolean endFound = false;
    private String[] lines;
    private int iterator = 0;
    private int lastAction = -1;
    private final Robot bot;
    private LinkedList<CoordinateVariable> CVList = new LinkedList();
    // </editor-fold>
    
}
