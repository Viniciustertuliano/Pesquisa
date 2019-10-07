import java.awt.Desktop;
import java.awt.List;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JFprincipal extends javax.swing.JFrame {

    public JFprincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTGprodutos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RBpay = new javax.swing.JRadioButton();
        RBxbox = new javax.swing.JRadioButton();
        RBiphone = new javax.swing.JRadioButton();
        RBsamsu = new javax.swing.JRadioButton();
        BTNpesquisar = new javax.swing.JButton();
        BTNsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Produto");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione um produto"));

        BTGprodutos.add(RBpay);
        RBpay.setText("Playstation 4");

        BTGprodutos.add(RBxbox);
        RBxbox.setText("Xbox One");

        BTGprodutos.add(RBiphone);
        RBiphone.setText("Iphone X");

        BTGprodutos.add(RBsamsu);
        RBsamsu.setText("Samsung S10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBpay)
                    .addComponent(RBxbox)
                    .addComponent(RBiphone)
                    .addComponent(RBsamsu))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RBpay)
                .addGap(18, 18, 18)
                .addComponent(RBxbox)
                .addGap(18, 18, 18)
                .addComponent(RBiphone)
                .addGap(18, 18, 18)
                .addComponent(RBsamsu)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        BTNpesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNpesquisar.setText("Pesquisar");
        BTNpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNpesquisarActionPerformed(evt);
            }
        });

        BTNsair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNsair.setText("Sair ");
        BTNsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNpesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNsair))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNpesquisar)
                    .addComponent(BTNsair))
                .addContainerGap(25, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNpesquisarActionPerformed

        ArrayList valor = new ArrayList();
        
      
       
        if(RBpay.isSelected()==true)
        {
            try{
                 
                 URI Play = new URI ("https://www.amazon.com.br/s?k=playstation+4+console&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=44NI9IPJ1M0C&sprefix=play%2Caps%2C269&ref=nb_sb_ss_i_4_4");
                 Desktop.getDesktop().browse(Play);
                 
                 //teste de busca de conteudo na web     
                 try {
                    Document doc = Jsoup.connect("https://www.amazon.com.br/s?k=playstation+4+console&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=44NI9IPJ1M0C&sprefix=play%2Caps%2C269&ref=nb_sb_ss_i_4_4").get();
                    
                     Elements titulo = doc.getElementsByClass("a-price-whole");
                     
                    valor = titulo;
                     valor.get(1);
                     System.out.println(valor);
                    
                } catch (IOException e) {
                }
                 //teste de busca de conteudo na web
                 
             }catch(Exception erro)
             {
                 System.out.println("Produto não foi encontrado");
             }
        }
        if(RBxbox.isSelected()==true)
        {
            try{
                 
                 URI Xbox = new URI ("https://www.amazon.com.br/s?k=xbox+one+console&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=26CBG6H1X9G9R&sprefix=xbox+one+%2Caps%2C279&ref=nb_sb_ss_i_4_9");
                 Desktop.getDesktop().browse(Xbox);
                 
             }catch(Exception erro)
             {
                 System.out.println("Produto não foi encontrado");
             }
        }
        if(RBiphone.isSelected()==true)
        {
            try{
                 
                 URI Iphone = new URI ("https://www.amazon.com.br/s?k=Iphone+x&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&ref=nb_sb_noss_2");
                 Desktop.getDesktop().browse(Iphone);
                 
             }catch(Exception erro)
             {
                 System.out.println("Produto não foi encontrado");
             }
        }
        if(RBsamsu.isSelected()==true)
        {
            try{
                 
                 URI Samsung = new URI ("https://www.amazon.com.br/s?k=Smartphone+samsung+galaxy+s10&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&ref=nb_sb_noss_2");
                 Desktop.getDesktop().browse(Samsung);
                 
             }catch(Exception erro)
             {
                 System.out.println("Produto não foi encontrado");
             }
        }
    }//GEN-LAST:event_BTNpesquisarActionPerformed

    private void BTNsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTNsairActionPerformed

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
            java.util.logging.Logger.getLogger(JFprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BTGprodutos;
    private javax.swing.JButton BTNpesquisar;
    private javax.swing.JButton BTNsair;
    private javax.swing.JRadioButton RBiphone;
    private javax.swing.JRadioButton RBpay;
    private javax.swing.JRadioButton RBsamsu;
    private javax.swing.JRadioButton RBxbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

  
}
