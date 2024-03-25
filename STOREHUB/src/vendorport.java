import java.awt.HeadlessException;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.sql.Blob;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import static jdk.jfr.FlightRecorder.register;

public class vendorport extends javax.swing.JFrame {

    /**
     * Creates new form vendorport
     */
    public vendorport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        location1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        bs = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51,51,51));
        jPanel2.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(989, 524));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 90, 110, 28);

        name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(name1);
        name1.setBounds(340, 90, 177, 28);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOCATION:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 170, 129, 27);

        location1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(location1);
        location1.setBounds(340, 170, 177, 27);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NO OF PERSONAL  SLOT:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 250, 230, 28);

        ps.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(ps);
        ps.setBounds(340, 250, 177, 28);

        bs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsActionPerformed(evt);
            }
        });
        jPanel1.add(bs);
        bs.setBounds(340, 330, 177, 28);

        price1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(price1);
        price1.setBounds(340, 410, 177, 28);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NO OF BS:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1057, 593, 116, 28);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRICE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1097, 452, 70, 28);

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 490, 170, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NO OF BUSINESS SLOT:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 330, 210, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRICE:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 410, 60, 30);

        upload.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        upload.setForeground(new java.awt.Color(255, 51, 51));
        upload.setText("UPLOAD");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jPanel1.add(upload);
        upload.setBounds(770, 330, 100, 30);

        photo.setText("jLabel9");
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        photo.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel1.add(photo);
        photo.setBounds(700, 80, 220, 220);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 130, 1050, 570));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\shruti\\Downloads\\home-solid-36.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 20, 90, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //registration button code here:
        if("".equals(name1.getText())){
              JOptionPane.showMessageDialog(new JFrame(),"Enter name","Error",JOptionPane.ERROR_MESSAGE);
          }else if("".equals(location1.getText())){
             JOptionPane.showMessageDialog (new JFrame(),"Enter location","Error",JOptionPane.ERROR_MESSAGE);
          }else if("".equals(ps.getText())){
             JOptionPane.showMessageDialog(new JFrame(),"Enter number of personal slots","Error",JOptionPane.ERROR_MESSAGE);
          }else if("".equals(bs.getText())){
             JOptionPane.showMessageDialog (new JFrame(),"Enter number of businness slots","Error",JOptionPane.ERROR_MESSAGE);
          }else if("".equals(price1.getText())){
             JOptionPane.showMessageDialog(new JFrame(),"Enter proper price","Error",JOptionPane.ERROR_MESSAGE);
          }else if(!(Pattern.matches("^[a-zA-Z]+$",name1.getText()))){
            JOptionPane.showMessageDialog (new JFrame(),"Enter valid name","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!(Pattern.matches("^[a-zA-Z]+$",location1.getText()))){
            JOptionPane.showMessageDialog (new JFrame(),"Enter valid location","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!(Pattern.matches("^[0-9]+$",price1.getText()))){
            JOptionPane.showMessageDialog (new JFrame(),"Enter valid amount","Error",JOptionPane.ERROR_MESSAGE);
        }else{
              JOptionPane.showMessageDialog(null,"REGISTERD SUCCESSFULLY");
          }
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query="INSERT INTO `vendor_database`(`name`, `location`, `personal_slot`, `bussiness_slot`, `price`) VALUES (?,?,?,?,?)";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/storehub","root","");
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,name1.getText());
            pst.setString(2,location1.getText());
            pst.setString(3,ps.getText());
            pst.setString(4,bs.getText());
            pst.setString(5,price1.getText());
            
            pst.executeUpdate();
           // JOptionPane.showMessageDialog(null,"REGISTERD SUCCESSFULLY");

        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // HOMEPAGE BUTTON CODE:
        newhomepage menu =new newhomepage();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        //upload button code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String path=f.getAbsolutePath();
        try{
            BufferedImage bi= ImageIO.read(new File(path));
            Image img=bi.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(img);
            photo.setIcon(icon);
        }catch(IOException ex){
            Logger.getLogger(vendorport.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_uploadActionPerformed

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
            java.util.logging.Logger.getLogger(vendorport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendorport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendorport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendorport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendorport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField location1;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField price1;
    private javax.swing.JTextField ps;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}