/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translateee;

import com.gtranslate.Language;
import com.gtranslate.Translator;
import java.util.HashMap;

public class Trans extends javax.swing.JFrame {

    // private HashMap<String, String> hashLanguage;
    String a = null;
    String b = null;
    String c = null;

    public Trans() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        value = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        detectlan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        detectlangbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        turned = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        madlol = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        jLabel1.setText("enter text");

        jButton1.setText("from english to arabic ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        value.setText(" ");

        jLabel2.setText("الترجمه ");

        jLabel4.setText("احتماليه الكلمات ");

        detectlangbutton.setText("detect language");
        detectlangbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detectlangbuttonActionPerformed(evt);
            }
        });

        turned.setEditable(false);
        turned.setColumns(20);
        turned.setRows(5);
        jScrollPane2.setViewportView(turned);

        madlol.setColumns(20);
        madlol.setRows(5);
        jScrollPane3.setViewportView(madlol);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(detectlan, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(detectlangbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(8, 8, 8)))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(detectlangbutton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(94, 94, 94))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(detectlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(205, 205, 205))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //لو فرانكو ححولها لانجلش وبعدين اترجمها 
        // ahmed mohamed shalash 
        // 01090875416 at 10 pm 19/8 
         // This code to translate from the Franko to arab words and also it translate exeprtions ...
 //         
 // Refernce are down
 //http://ar.wikipedia.org/wiki/%D9%85%D9%84%D8%AD%D9%82:%D9%82%D8%A7%D8%A6%D9%85%D8%A9_%D8%B1%D9%85%D9%88%D8%B2_%D8%A7%D9%84%D9%85%D8%B4%D8%A7%D8%B9%D8%B1       
 //http://www.yamli.com/editor/ar/       
 //http://princessesdisney.ahlamontada.net/t5602-topic   

        String translatee = TextArea.getText();
        translatee.toLowerCase();

         a = translatee.replace("dh", "ذ").replace("kh", "خ").replace("sms", "رساله نصيه قصيره")
                .replace("dh", "ظ").replace("th", "ث").replace("gh", "غ").replace("isa", "ان شاء الله").replace("cu", "اراك لاحقا").replace("msa", "ماشاء الله")
                .replace("a", "ا").replace("ee", "ي").replace("sh", "ش").replace("ie", "ي").replace("in", "ان")
                .replace("el7","الحمد لله").replace("LOL ","بضحك بصوت عالي ").replace("BRB "," سأعود قريبا")
                .replace("TYT ","خد وقتك  ").replace("WB ","مرحبا بعودتك ").replace("back ", " رجعت")
                .replace("BTW ", "علي فكره ").replace("FYI ","لمعلوماتك ").replace("OMG "," ياالهي")
                .replace("ATW "," بدون تفكير").replace("FTW ","شئ بيفوز بالنهايه ").replace("IMO ","في رأي ")
                .replace("IMHO ","في رأي المتواضع " ).replace("BMW "," عضو مصيره الطرد ")
                .replace("thx ","شكرا ").replace("ty ","شكرا لك ").replace("BFN "," سلام دلوقتي")
                .replace("GTG","لازم امشي ").replace("DC ","النت مفصول")
                .replace("7", "ح").replace("r", "ر").replace("z", "ز").replace("s", "(ص)(س)")
                .replace("p", "ب").replace("t", "ت‎").replace("s", "ث").replace("z", "ذ")
                .replace("g", "ج").replace("j", "ج").replace("7'", "خ").replace("5", "خ")
                .replace("d", "د").replace("9'", "ض")
                .replace("9", "ص").replace("3", "ع").replace("s", "ص").replace("t", "ط")
                .replace("6", "ط").replace("z", "ظ").replace("6'", "ظ").replace("t'", "ظ")
                .replace("m", "م").replace("b", "ب").replace("o", "و").replace("u", "")
                .replace("f", "ف").replace("2", "ء").replace("v", "ف")
                .replace("q", "ق").replace("k", "ك").replace("l", "ل")
                .replace("n", "ن").replace("h", "ح").replace("w", "و")
                .replace("y", "ي").replace("i", "ي")
                .replace("e", " ي").replace(":^)", "الابتسامة أو الوجه السعيد").replace(":-)", "الابتسامة أو الوجه السعيد")
                .replace(":)", "الابتسامة أو الوجه السعيد").replace(":o)", "الابتسامة أو الوجه السعيد")
                .replace(":]", "الابتسامة أو الوجه السعيد").replace(":3", "الابتسامة أو الوجه السعيد")
                .replace(":c)", "الابتسامة أو الوجه السعيد").replace(":c)", "الابتسامة أو الوجه السعيد")
                .replace(":>", "الابتسامة أو الوجه السعيد").replace("=]", "الابتسامة أو الوجه السعيد")
                .replace("8)", "الابتسامة أو الوجه السعيد").replace("=)", "الابتسامة أو الوجه السعيد")
                .replace(":}", "الابتسامة أو الوجه السعيد").replace(":D", "ابتسامه كبيره بهجه")
                .replace("C:", "ابتسامه كبيره بهجه ").replace("()", "عناق").replace("XD", "َضجكه كبيره")
                .replace("xd", "ضحكه").replace(":{", "التجهم او العبس").replace(":-", "التجهم او العبس ")
                .replace("(:", "التجهم او العبس ").replace("( :", "التجهم و العبس ").replace("-c", "التجهم او العبس")
                .replace(":c", "التجهم او العبس ").replace(":-<", "التجهم و العبس ").replace(":<", "التجهم او العبس ")
                .replace(":-[", "التجهم او العبس ").replace(":[", "التجهم او العبس ")
                .replace("d:", "الرعب والاشمئزاز والحزن والفزع الكبير0").replace("d8", "الرعب والاشمئزاز والحزن والفزع الكبير")
                .replace("d;", "الرعب والاشمئزاز والحزن والفزع الكبير").replace("d=", "الرعب والاشمئزاز والحزن والفزع الكبير")
                .replace("v.v", "الرعب والاشمئزاز والحزن والفزع الكبير").replace("*)", "الغمزه")
                .replace(";-)", "الغمزه").replace(";)", "الغمزه").replace("*-)", "الغمزه")
                .replace(";-]", "الغمزه").replace(";]", "الغمزه").replace(";D", "الغمزه")
                .replace(":-P", "اخراج اللسان ").replace(":b", "اخراج اللسان ").replace(":-b", "اخراج اللسان")
                .replace(":P", "اخراج اللسان").replace(":Þ", "اخراج اللسان").replace("x-p", "اخراج اللسان")
                .replace("xp", "اخراج اللسان").replace(":p", "اخراج اللسان").replace("=p", "اخراج اللسان")
                .replace(":-o","المفاجأة والصدمة، عسير الوصف").replace("O.o","المفاجأة والصدمة، عسير الوصف")
                .replace("o_o ","المفاجأة والصدمة، عسير الوصف").replace("o..o","المفاجأة والصدمة، عسير الوصف")
                .replace("c.c", "لف العنين او الرفض ").replace(":-/","متشكك، منزعج، قلق، غير مستقر، متردد")
                .replace(":/", "متشكك، منزعج، قلق، غير مستقر، متردد").replace("=/", "متشكك، منزعج، قلق، غير مستقر، متردد")
                .replace(":s", "متشكك، منزعج، قلق، غير مستقر، متردد").replace("qb","قبعه ")
                .replace(":)~","الترويل سيلان اللعاب").replace("-3","ملاك برئ");
        
                  
//           
////         //لو انجلش يترجم علطول 
        //else {
//
//            Translator translate = Translator.getInstance();
//            String text = translate.translate(TextArea.getText(), Language.ENGLISH, Language.ARABIC);
//            value.setText(text);
//            String ahmed = java.util.Arrays.toString(text.split(" "));
//            turned.setText(ahmed);
//
//        }
        //===================================================================
        turned.setText(a);

        //======================================================================
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


    }//GEN-LAST:event_jButton2ActionPerformed

    private void detectlangbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detectlangbuttonActionPerformed
 Translator translate = Translator.getInstance();
           String texte = translate.translate(TextArea.getText(), Language.ENGLISH, Language.ARABIC);
          turned.setText(texte);
    }//GEN-LAST:event_detectlangbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JLabel detectlan;
    private javax.swing.JButton detectlangbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea madlol;
    private javax.swing.JTextArea turned;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}
