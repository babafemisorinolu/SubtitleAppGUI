/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code.subtitle.app;

import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author babafemi.sorinolu
 */
public class SubtitleGUI2 extends javax.swing.JFrame {

    private SubtitleSeq subtitleSeq;
    // Create the table model with data and column names
    private DefaultTableModel model;
    // Column names for the JTable
    private final String[] columnNames = {"Start Time", "End Time", "Subtitle Text"};

    /**
     * Creates new form SubtitleGUI
     */
    public SubtitleGUI2() {
        initComponents();

        // Create the table model with data and column names
        model = new DefaultTableModel(columnNames, 0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLoadSubtitleFromFile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnFindSubtitle = new javax.swing.JButton();
        tfStartTime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfStartTime_find = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEndTime_find = new javax.swing.JTextField();
        btnFindSubtitle2 = new javax.swing.JButton();
        btnLoadSubtitleFromFile2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAddSubtitle = new javax.swing.JButton();
        tfStartTime_add = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfEndTime_add = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSubtitleText_add = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Movie Subtitle App");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Start Time", "End Time", "Subtitle Text"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnLoadSubtitleFromFile.setText("Load Subtitle from File");
        btnLoadSubtitleFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadSubtitleFromFileActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Find Subtitle by Time"));

        btnFindSubtitle.setText("Find Subtitle");
        btnFindSubtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindSubtitleActionPerformed(evt);
            }
        });

        jLabel2.setText("Start Time");

        jLabel6.setText("Start Time");

        jLabel7.setText("End Time");

        btnFindSubtitle2.setText("Find Subtitle");
        btnFindSubtitle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindSubtitle2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfStartTime))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tfStartTime_find, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tfEndTime_find, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFindSubtitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFindSubtitle2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFindSubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfStartTime_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfEndTime_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFindSubtitle2)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        btnLoadSubtitleFromFile2.setText("Load Default Subtitle");
        btnLoadSubtitleFromFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadSubtitleFromFile2ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Subtitle"));

        btnAddSubtitle.setText("Add Subtitle");
        btnAddSubtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubtitleActionPerformed(evt);
            }
        });

        jLabel3.setText("Start Time");

        jLabel4.setText("End Time");

        jLabel5.setText("Subtitle");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 296, Short.MAX_VALUE)
                        .addComponent(btnAddSubtitle))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfStartTime_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tfEndTime_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfSubtitleText_add))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfStartTime_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfEndTime_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSubtitleText_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddSubtitle)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel5)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLoadSubtitleFromFile, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLoadSubtitleFromFile2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoadSubtitleFromFile)
                            .addComponent(btnLoadSubtitleFromFile2))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadSubtitleFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadSubtitleFromFileActionPerformed
        // TODO add your handling code here:

        JFileChooser jfc = new JFileChooser();
        int option = jfc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                File file = jfc.getSelectedFile();

                subtitleSeq = SubtitleSeqFactory.loadSubtitleSeq(file.getAbsolutePath());

                // Create the table model with data and column names
                model = new DefaultTableModel(columnNames, 0);

                // Add rows to the table model from the ArrayList
                for (Subtitle subtitle : subtitleSeq.getSubtitles()) {
                    String[] row = {Utils.convertTime(subtitle.getStartTime()), Utils.convertTime(subtitle.getEndTime()).toString(), subtitle.getText()};
                    model.addRow(row);
                }
                jTable1.setModel(model);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btnLoadSubtitleFromFileActionPerformed

    private void btnFindSubtitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindSubtitleActionPerformed
        // TODO add your handling code here:
        String startTime = tfStartTime.getText();

        Subtitle subtitle = subtitleSeq.getSubtitle(Utils.convertTime(startTime));
        if (subtitle == null) {
            JOptionPane.showMessageDialog(rootPane, "Not found");
        } else {
            //clear the table
            model.setRowCount(0);
            String[] row = {Utils.convertTime(subtitle.getStartTime()), Utils.convertTime(subtitle.getEndTime()), subtitle.getText()};
            model.addRow(row);
            jTable1.setModel(model);
//            System.out.println(subtitle.getText());
        }
    }//GEN-LAST:event_btnFindSubtitleActionPerformed

    private void btnLoadSubtitleFromFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadSubtitleFromFile2ActionPerformed
        // TODO add your handling code here:
        subtitleSeq = SubtitleSeqFactory.loadSubtitleSeq("The.Chosen.2017.S01E01.srt");

        // Create the table model with data and column names
        model = new DefaultTableModel(columnNames, 0);

        // Add rows to the table model from the ArrayList
        for (Subtitle subtitle : subtitleSeq.getSubtitles()) {
            String[] row = {Utils.convertTime(subtitle.getStartTime()), Utils.convertTime(subtitle.getEndTime()), subtitle.getText()};
            model.addRow(row);
        }
        jTable1.setModel(model);

    }//GEN-LAST:event_btnLoadSubtitleFromFile2ActionPerformed

    private void btnAddSubtitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubtitleActionPerformed
        // TODO add your handling code here:

        String startTime = tfStartTime_add.getText();
        String endTime = tfEndTime_add.getText();

        String text = tfSubtitleText_add.getText();

        Time sTime = Utils.convertTime(startTime);
        Time eTime = Utils.convertTime(endTime);

        Subtitle subtitle = Utils.getSubtitle(sTime, eTime, text);

        subtitleSeq.addSubtitle(subtitle);

        //update the table model
        String[] row = {Utils.convertTime(subtitle.getStartTime()), Utils.convertTime(subtitle.getEndTime()), subtitle.getText()};
        model.addRow(row);

    }//GEN-LAST:event_btnAddSubtitleActionPerformed

    private void btnFindSubtitle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindSubtitle2ActionPerformed
        // TODO add your handling code here:
        String startTime = tfStartTime_find.getText();
        String endTime = tfEndTime_find.getText();

        Time sTime = Utils.convertTime(startTime);
        Time eTime = Utils.convertTime(endTime);

        List<Subtitle> subtitles = subtitleSeq.getSubtitles(sTime, eTime);

        //clear the table
        model.setRowCount(0);

        // Add rows to the table model from the ArrayList
        for (Subtitle subtitle : subtitles) {
            String[] row = {Utils.convertTime(subtitle.getStartTime()), Utils.convertTime(subtitle.getEndTime()), subtitle.getText()};
            model.addRow(row);
        }

    }//GEN-LAST:event_btnFindSubtitle2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SubtitleGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubtitleGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubtitleGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubtitleGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubtitleGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSubtitle;
    private javax.swing.JButton btnFindSubtitle;
    private javax.swing.JButton btnFindSubtitle2;
    private javax.swing.JButton btnLoadSubtitleFromFile;
    private javax.swing.JButton btnLoadSubtitleFromFile2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfEndTime_add;
    private javax.swing.JTextField tfEndTime_find;
    private javax.swing.JTextField tfStartTime;
    private javax.swing.JTextField tfStartTime_add;
    private javax.swing.JTextField tfStartTime_find;
    private javax.swing.JTextField tfSubtitleText_add;
    // End of variables declaration//GEN-END:variables
}
