package mainmenujava;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author Vo Tue Nam CE140557
 */
public final class ranking extends javax.swing.JFrame {

    ArrayList<Scores> ranking;

    /**
     * Creates new form ranking
     *
     * @param ranking
     */
    public ranking(ArrayList<Scores> ranking) {
        this.setVisible(true);
        initComponents();
        setIcon();
        CustomCursor();
        this.setLocationRelativeTo(null);
        reset();
        this.ranking = ranking;
        try {
            lblNamePlayer1.setText(ranking.get(0).getsUser());
            lblScorePlayer1.setText(ranking.get(0).getsScore());
            lblNamePlayer2.setText(ranking.get(1).getsUser());
            lblScorePlayer2.setText(ranking.get(1).getsScore());
            lblNamePlayer3.setText(ranking.get(2).getsUser());
            lblScorePlayer3.setText(ranking.get(2).getsScore());
            lblNamePlayer4.setText(ranking.get(3).getsUser());
            lblScorePlayer4.setText(ranking.get(3).getsScore());
            lblNamePlayer5.setText(ranking.get(4).getsUser());
            lblScorePlayer5.setText(ranking.get(4).getsScore());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Reset status of frame
     */
    void reset() {
        lblNamePlayer2.setText("");
        lblNamePlayer3.setText("");
        lblNamePlayer4.setText("");
        lblNamePlayer5.setText("");
        lblNamePlayer1.setText("");
        lblScorePlayer2.setText("");
        lblScorePlayer3.setText("");
        lblScorePlayer4.setText("");
        lblScorePlayer5.setText("");
        lblScorePlayer1.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNamePlayer2 = new javax.swing.JLabel();
        lblNamePlayer3 = new javax.swing.JLabel();
        lblNamePlayer4 = new javax.swing.JLabel();
        lblNamePlayer5 = new javax.swing.JLabel();
        lblNamePlayer1 = new javax.swing.JLabel();
        lblScorePlayer2 = new javax.swing.JLabel();
        lblScorePlayer3 = new javax.swing.JLabel();
        lblScorePlayer4 = new javax.swing.JLabel();
        lblScorePlayer5 = new javax.swing.JLabel();
        lblScorePlayer1 = new javax.swing.JLabel();
        LblReturn = new javax.swing.JLabel();
        BACKGOUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ranking Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNamePlayer2.setFont(new java.awt.Font("VNI-Bandit", 0, 20)); // NOI18N
        lblNamePlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNamePlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 230, 50));

        lblNamePlayer3.setFont(new java.awt.Font("VNI-Bandit", 0, 20)); // NOI18N
        lblNamePlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNamePlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 230, 50));

        lblNamePlayer4.setFont(new java.awt.Font("VNI-Bandit", 0, 20)); // NOI18N
        lblNamePlayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNamePlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 230, 50));

        lblNamePlayer5.setFont(new java.awt.Font("VNI-Bandit", 0, 20)); // NOI18N
        lblNamePlayer5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNamePlayer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, 230, 50));

        lblNamePlayer1.setFont(new java.awt.Font("VNI-Bandit", 0, 20)); // NOI18N
        lblNamePlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNamePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 240, 50));

        lblScorePlayer2.setFont(new java.awt.Font("VNI 27 Bendigo", 1, 32)); // NOI18N
        lblScorePlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScorePlayer2.setText("0");
        getContentPane().add(lblScorePlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 110, 90));

        lblScorePlayer3.setFont(new java.awt.Font("VNI 27 Bendigo", 1, 32)); // NOI18N
        lblScorePlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScorePlayer3.setText("0");
        getContentPane().add(lblScorePlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 110, 90));

        lblScorePlayer4.setFont(new java.awt.Font("VNI 27 Bendigo", 1, 32)); // NOI18N
        lblScorePlayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScorePlayer4.setText("0");
        getContentPane().add(lblScorePlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 110, 90));

        lblScorePlayer5.setFont(new java.awt.Font("VNI 27 Bendigo", 1, 32)); // NOI18N
        lblScorePlayer5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScorePlayer5.setText("0");
        getContentPane().add(lblScorePlayer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 110, 90));

        lblScorePlayer1.setFont(new java.awt.Font("VNI 27 Bendigo", 1, 32)); // NOI18N
        lblScorePlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScorePlayer1.setText("0");
        lblScorePlayer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblScorePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 110, 90));

        LblReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblReturnMouseClicked(evt);
            }
        });
        getContentPane().add(LblReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 60, 60));

        BACKGOUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ranking.png"))); // NOI18N
        getContentPane().add(BACKGOUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LblReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblReturnMouseClicked
        this.dispose();
    }//GEN-LAST:event_LblReturnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGOUND;
    private javax.swing.JLabel LblReturn;
    private javax.swing.JLabel lblNamePlayer1;
    private javax.swing.JLabel lblNamePlayer2;
    private javax.swing.JLabel lblNamePlayer3;
    private javax.swing.JLabel lblNamePlayer4;
    private javax.swing.JLabel lblNamePlayer5;
    private javax.swing.JLabel lblScorePlayer1;
    private javax.swing.JLabel lblScorePlayer2;
    private javax.swing.JLabel lblScorePlayer3;
    private javax.swing.JLabel lblScorePlayer4;
    private javax.swing.JLabel lblScorePlayer5;
    // End of variables declaration//GEN-END:variables

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/2.png")));
    }

    public void CustomCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("mousecontrol.png");
        Point point = new Point(0, 0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");
        setCursor(cursor);
    }
}
