/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambulance.system;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.LinkedList;

/**
 *
 * @author BestBoi
 */
public class DispatchAmbulance extends javax.swing.JFrame {
    DefaultTableModel model;
    
    LinkedList object2=new LinkedList();
    queue q = new queue();

    /**
     * Creates new form DispatchAmbulance
     */
    public DispatchAmbulance() {
        initComponents();
         model= (DefaultTableModel) jTable2.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        jTextField1.setText("               ALMO AMBULANCE SERVICE");

        jLabel1.setText("DISPATCH AMBULANCE");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ambulance No", "Ambulance VIN", "Driver Name", "Model", "Availibility Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("BACK");

        jButton2.setText("DISPATCH");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 176));
        jLabel3.setText("ALMO AMBULANCE SYSTEM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 390, 110));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 176));
        jLabel4.setText("Ambulance No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, -1));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 176));
        jLabel5.setText("Ambulance VIN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 176));
        jLabel6.setText("Driver's Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 176));
        jLabel7.setText("Model");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 176));
        jLabel9.setText("Availability Status");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jTextField2.setText(" ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        jTextField3.setText(" ");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, -1));

        jTextField4.setText(" ");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, -1));

        jTextField5.setText(" ");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, -1));

        jTextField6.setText(" ");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "LEE 101", "Alex", "2017", "Y"},
                {"2", "LEE 102", "Cole", "2017", "Y"},
                {"3", "LEE 103", "Jack", "2017", "Y"},
                {"4", "LEE 104", "abc", "2017", "Y"},
                {"5", "LEE 105", "xyz", "2017", "N"},
                {"6", "LEE 106", "sample", "2017", "N"},
                {"7", "LEE 107", "goot", "2017", "N"},
                {"8", "LEE 108", "peter", "2017", "N"},
                {"9", "LEE 109", "joe", "2017", "Y"},
                {"10", "LEE 110", "shawn", "2017", null}
            },
            new String [] {
                "Ambulance #", "Ambulance VIN", "Driver's Name", "Model", "Availability Status"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, 270));

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 70, 30));

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EDIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 70, 30));

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, 30));

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("DISPATCH");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 110, 40));

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ambulance/system/t2.jpg"))); // NOI18N
        jLabel8.setText(" ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 793, 505));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
          //making object of linked list
        
         LinkedList object2=new LinkedList();
         
         
         object2.add(jTextField2.getText());
         object2.add(jTextField3.getText());
         object2.add(jTextField4.getText());
         object2.add(jTextField5.getText());
         object2.add(jTextField6.getText());
        model.insertRow(model.getRowCount() ,new Object[]{jTextField2.getText(),jTextField3.getText(),jTextField4.getText(),jTextField5.getText(),jTextField6.getText()});
                String n ;
        n = model.getValueAt(jTable2.getSelectedRow(),0).toString() ;
        int amb_num;
        amb_num = Integer.parseInt(n);
q.enqueue(amb_num);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        model.removeRow(jTable2.getSelectedRow());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         model= (DefaultTableModel) jTable2.getModel();
          if(jTable2.getSelectedRowCount()==1){
              String name=jTextField2.getText();
              String name2=jTextField3.getText();
              String name3=jTextField4.getText();
              String name4=jTextField5.getText();
              String name5=jTextField6.getText();
              
              
              //now code to write edited data in table
             
               model.setValueAt(name, jTable2.getSelectedRow(),0);
               model.setValueAt(name2, jTable2.getSelectedRow(),1);
               model.setValueAt(name3, jTable2.getSelectedRow(),2);
               model.setValueAt(name4, jTable2.getSelectedRow(),3);
               model.setValueAt(name5, jTable2.getSelectedRow(),4);
    }                                        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
         String name=model.getValueAt(jTable2.getSelectedRow(), 0).toString();
        String name2=model.getValueAt(jTable2.getSelectedRow(), 1).toString();
        String name3=model.getValueAt(jTable2.getSelectedRow(), 2).toString();
        String name4=model.getValueAt(jTable2.getSelectedRow(), 3).toString();
        String name5=model.getValueAt(jTable2.getSelectedRow(), 4).toString();
        
        
        
        //set TextField
        jTextField2.setText(name);
        jTextField3.setText(name2);
        jTextField4.setText(name3);
        jTextField5.setText(name4);
        jTextField6.setText(name5);
        
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    String AvailabilityStatus ;
    AvailabilityStatus = jTextField6.getText();
 
    if (AvailabilityStatus.equals("Y") || AvailabilityStatus.equals("Y"))
    {       
        
        
        int srow;
        srow = jTable2.getSelectedRow();

        String num=model.getValueAt(jTable2.getSelectedRow(), 0).toString();

        int obj ;
        obj = Integer.parseInt(num);
        q.dequeue(obj);

        JOptionPane.showMessageDialog(null,"Ambulance Dispatched\nStatus Updated Successfully");
        model.setValueAt("N",srow,4); 
    }
    else if (AvailabilityStatus.equals("N")){
        JOptionPane.showMessageDialog(null," Dear User, \n Kindly Select an available ambulance");
    }
    else {
        JOptionPane.showMessageDialog(null," Dear User, \n Type 'Y' or 'N) in the required text field");
    }
    
    
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(DispatchAmbulance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DispatchAmbulance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DispatchAmbulance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DispatchAmbulance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DispatchAmbulance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
