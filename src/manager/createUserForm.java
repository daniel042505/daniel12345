/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import config.dbConnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import paparon.LoginPage;

/**
 *
 * @author User
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
        
    }
    
     Color navcolor = new Color(102,0,102);
        Color hovercolor = new Color(153,0,255);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firn = new javax.swing.JLabel();
        fin = new javax.swing.JTextField();
        lasn = new javax.swing.JLabel();
        lan = new javax.swing.JTextField();
        show = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        can = new javax.swing.JTextField();
        occ1 = new javax.swing.JLabel();
        occ = new javax.swing.JComboBox<>();
        emai = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        un = new javax.swing.JLabel();
        use = new javax.swing.JTextField();
        ps = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        stt = new javax.swing.JComboBox<>();
        st = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        up = new javax.swing.JButton();
        Clear1 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        u_id = new javax.swing.JTextField();
        firn1 = new javax.swing.JLabel();
        Cancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firn.setForeground(new java.awt.Color(0, 255, 255));
        firn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firn.setText("User Id:");
        jPanel1.add(firn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        fin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fin.setEnabled(false);
        fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finActionPerformed(evt);
            }
        });
        jPanel1.add(fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 180, 30));

        lasn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lasn.setForeground(new java.awt.Color(0, 255, 255));
        lasn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lasn.setText("Last Name: ");
        jPanel1.add(lasn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 20));

        lan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanActionPerformed(evt);
            }
        });
        jPanel1.add(lan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, 30));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/013-view.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMousePressed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 30, 30));

        hide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/012-hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        jPanel1.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 30, 30));

        cn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cn.setForeground(new java.awt.Color(0, 255, 255));
        cn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cn.setText("Contact Number:");
        jPanel1.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 20));

        can.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });
        jPanel1.add(can, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 180, 30));

        occ1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        occ1.setForeground(new java.awt.Color(0, 255, 255));
        occ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        occ1.setText("Occupation:");
        jPanel1.add(occ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, -1));

        occ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Manager", "Cashier"}));
        occ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occActionPerformed(evt);
            }
        });
        jPanel1.add(occ, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 180, 30));

        emai.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emai.setForeground(new java.awt.Color(0, 255, 255));
        emai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emai.setText("Email:");
        jPanel1.add(emai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 100, -1));

        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 180, 30));

        un.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        un.setForeground(new java.awt.Color(0, 255, 255));
        un.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        un.setText("Username:");
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 90, 20));

        use.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useActionPerformed(evt);
            }
        });
        jPanel1.add(use, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 180, 30));

        ps.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ps.setForeground(new java.awt.Color(0, 255, 255));
        ps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ps.setText("Password:");
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, -1));

        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 180, 30));

        stt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Active", "Pending"
            + ""}));
stt.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        sttActionPerformed(evt);
    }
    });
    jPanel1.add(stt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 180, 30));

    st.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    st.setForeground(new java.awt.Color(0, 255, 255));
    st.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    st.setText("Status:");
    jPanel1.add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, -1));

    add.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    add.setText("Add");
    add.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addActionPerformed(evt);
        }
    });
    jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 90, 30));

    up.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    up.setText("Update");
    up.setEnabled(false);
    up.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            upActionPerformed(evt);
        }
    });
    jPanel1.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 90, 30));

    Clear1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    Clear1.setText("Clear");
    Clear1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Clear1ActionPerformed(evt);
        }
    });
    jPanel1.add(Clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 90, 30));

    refresh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    refresh.setText("Refresh");
    refresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshActionPerformed(evt);
        }
    });
    jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 90, 30));

    u_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    u_id.setEnabled(false);
    u_id.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            u_idActionPerformed(evt);
        }
    });
    jPanel1.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 180, 30));

    firn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    firn1.setForeground(new java.awt.Color(0, 255, 255));
    firn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    firn1.setText("First Name:");
    jPanel1.add(firn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

    Cancel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    Cancel1.setText("Cancel");
    Cancel1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Cancel1ActionPerformed(evt);
        }
    });
    jPanel1.add(Cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 90, 30));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finActionPerformed

    private void lanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lanActionPerformed

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canActionPerformed

    private void occActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_occActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void sttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sttActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (fin.getText().isEmpty() || lan.getText().isEmpty() ||  can.getText().isEmpty() ||  em.getText().isEmpty() ||  use.getText().isEmpty() ||  pass.getPassword().length == 0 ) {
        JOptionPane.showMessageDialog(null, "All Fields Are Required");
     


    } 
    else if (fin.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "First Name is required");
    fin.setText("");
    }
     else if (lan.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Last Name is required");
    lan.setText("");
     }
     else if (can.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Contact Number is required");
    can.setText("");
} else {
    String input = can.getText();
    if (!input.matches("[0-9]{11}")) {  
        JOptionPane.showMessageDialog(null, "Please enter a valid contact number (11 digits only)");
        can.setText("");
    }

    
    else if (em.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Email is required");
    em.setText(""); 
      
     
}
      else {
            String email = em.getText();
            
           
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);

            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid email with @yahoo.com or @gmail.com");
                em.setText("");
            }
      
              
   else if (use.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Username is required");
    use.setText(""); 
} 
else if (pass.getPassword().length == 0) {
    
    JOptionPane.showMessageDialog(null, "Password is required");
    pass.setText(""); 
} 
else if (pass.getPassword().length < 8) {
    JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
    pass.setText("");
} 


   

else {
     dbConnect dbc = new dbConnect();
      try{
     String ps = passwordHasher.hashPassword(pass.getText());
     String status = (String )stt.getSelectedItem();
       String checkUsernameQuery = "SELECT COUNT(*) FROM tbl_user WHERE u_user = '" + use.getText() + "'";
                int usernameCount = dbc.executeQueryForCount(checkUsernameQuery);
                if (usernameCount > 0) {
                    JOptionPane.showMessageDialog(null, "Username is already taken");
                    return;
                }

                
                String checkEmailQuery = "SELECT COUNT(*) FROM tbl_user WHERE u_em = '" + em.getText() + "'";
                int emailCount = dbc.executeQueryForCount(checkEmailQuery);
                if (emailCount > 0) {
                    JOptionPane.showMessageDialog(null, "Email is already registered");
                    return; 
                }

              
                String insertQuery = "INSERT INTO tbl_user(u_fname, u_lname, u_occ, u_cn, u_em, u_user, u_pass, u_status)"
                        + "VALUES('"+fin.getText()+"', '"+lan.getText()+"', '"+occ.getSelectedItem()+"', '"+can.getText()+"', '"+em.getText()+"', '"+use.getText()+"', '"+ps+"', "+status+")";
                
                if (dbc.insertData(insertQuery) == 0) {
                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                }
                new ManageUsers().setVisible(true);
                this.setVisible(false);
                this.dispose();
                
                }catch(NoSuchAlgorithmException ex){
         System.out.println(""+ex);
                }
}
    }
     }
            
    }//GEN-LAST:event_addActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
         if (can.getText().isEmpty() ||  em.getText().isEmpty() ||  use.getText().isEmpty() ||  pass.getPassword().length == 0 ) {
        JOptionPane.showMessageDialog(null, "All Fields Are Required");
     


    } 
   
          
     else if (lan.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Last Name is required");
    lan.setText("");
     }
     
     
     else if (can.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Contact Number is required");
    can.setText("");
} else {
    String input = can.getText();
    if (!input.matches("[0-9]{11}")) {  
        JOptionPane.showMessageDialog(null, "Please enter a valid contact number (11 digits only)");
        can.setText("");
    }

    
    else if (em.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Email is required");
    em.setText(""); 
      
     
}
      else {
            String email = em.getText();
            
           
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);

            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid email with @yahoo.com or @gmail.com");
                em.setText("");
            }
      
              
   else if (use.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Username is required");
    use.setText(""); 
} 
else if (pass.getPassword().length == 0) {
    
    JOptionPane.showMessageDialog(null, "Password is required");
    pass.setText(""); 
} 
else if (pass.getPassword().length < 8) {
    JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
    pass.setText("");
} 


   

else {
      
     String occupation = (String )occ.getSelectedItem();
     String status = (String )stt.getSelectedItem();
     
        dbConnect dbc = new dbConnect();
        
                   try {
      
        ResultSet rs = dbc.getData("SELECT u_user, u_em FROM tbl_user WHERE u_id = '" + u_id.getText() + "'");
        if (rs.next()) {
            String currentUsername = rs.getString("u_user");
            String currentEmail = rs.getString("u_em");

         
            if (!use.getText().equals(currentUsername)) {
                String checkUsernameQuery = "SELECT COUNT(*) FROM tbl_user WHERE u_user = '" + use.getText() + "'";
                int usernameCount = dbc.executeQueryForCount(checkUsernameQuery);
                if (usernameCount > 0) {
                    JOptionPane.showMessageDialog(null, "Username is already taken");
                    return;
                }
            }

          
            if (!em.getText().equals(currentEmail)) {
                String checkEmailQuery = "SELECT COUNT(*) FROM tbl_user WHERE u_em = '" + em.getText() + "'";
                int emailCount = dbc.executeQueryForCount(checkEmailQuery);
                if (emailCount > 0) {
                    JOptionPane.showMessageDialog(null, "Email is already registered");
                    return; 
                }
            }
        }
        rs.close();
         
        
        dbc.UpdateData("UPDATE tbl_user SET u_lname = '"+lan.getText()+"', u_cn = '"+can.getText()+"', u_occ = '"+occupation+"', u_em = '"+em.getText()+"', u_user = '"
                        +use.getText()+"', u_pass = '"+new String(pass.getPassword())+"', u_status = '"+status+"' WHERE u_id = '"+u_id.getText()+"'");

          JOptionPane.showMessageDialog(null, "Data Uploaded Successfully!");

        new ManageUsers().setVisible(true);
        this.setVisible(false);
        this.dispose();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}
    }
     }
    }//GEN-LAST:event_upActionPerformed

    private void Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear1ActionPerformed
        // TODO add your handling code here:
         use.setText("");
        lan.setText("");
        can.setText("");
        em.setText("");
        pass.setText("");
    }//GEN-LAST:event_Clear1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        String userId = u_id.getText();

    if (userId.isEmpty()) {
        JOptionPane.showMessageDialog(null, "User ID is missing. Cannot refresh data.");
        return;
    }

    dbConnect dbc = new dbConnect();

    try {
        
        String query = "SELECT u_lname, u_cn, u_em, u_user, u_pass, u_status FROM tbl_user WHERE u_id = ?";
        PreparedStatement pst = dbc.getConnection().prepareStatement(query);
        pst.setString(1, userId);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Set values back to the text fields
            lan.setText(rs.getString("u_lname"));
            can.setText(rs.getString("u_cn"));  
            em.setText(rs.getString("u_em"));  
            use.setText(rs.getString("u_user"));
            pass.setText(rs.getString("u_pass")); 
            stt.setSelectedItem(rs.getString("u_status"));

            JOptionPane.showMessageDialog(null, "Fields refreshed successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "User not found.");
        }

        rs.close();
        pst.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error refreshing data: " + ex.getMessage());
    }
      
    }//GEN-LAST:event_refreshActionPerformed

    private void u_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_idActionPerformed

    private void showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMousePressed
        // TODO add your handling code here:
        show.setVisible(false);
        hide.setVisible(true);
        pass.setEchoChar('*');

    }//GEN-LAST:event_showMousePressed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        // TODO add your handling code here:

        show.setVisible(true);
        hide.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_hideMouseReleased

    private void Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel1ActionPerformed
        // TODO add your handling code here:
        new ManageUsers().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Cancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel1;
    private javax.swing.JButton Clear1;
    public javax.swing.JButton add;
    public javax.swing.JTextField can;
    private javax.swing.JLabel cn;
    public javax.swing.JTextField em;
    private javax.swing.JLabel emai;
    public javax.swing.JTextField fin;
    private javax.swing.JLabel firn;
    private javax.swing.JLabel firn1;
    private javax.swing.JLabel hide;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField lan;
    private javax.swing.JLabel lasn;
    public javax.swing.JComboBox<String> occ;
    private javax.swing.JLabel occ1;
    public javax.swing.JPasswordField pass;
    private javax.swing.JLabel ps;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel show;
    private javax.swing.JLabel st;
    public javax.swing.JComboBox<String> stt;
    public javax.swing.JTextField u_id;
    private javax.swing.JLabel un;
    public javax.swing.JButton up;
    public javax.swing.JTextField use;
    // End of variables declaration//GEN-END:variables
}
