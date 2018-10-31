package jogodavelha;


import javax.swing.JOptionPane;


public class TelaJogoVelha extends javax.swing.JFrame {

    private int turno = 0;
    int[][] matriz = new int[3][3];
    int i = 0;
    int pontoJogadorUm = 0;
    int pontoJogadorDois = 0;
    int qtdJogadas = 0;
    
 
    public TelaJogoVelha() {
        for(i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        matriz[i][j] = 2;
            }
        }
        
        initComponents();
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        
    }
    
    public void verificaGanhador(){
       
        for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.println("Matriz["+i+"]["+j+"]"+matriz[i][j]);
                        
                    }     
        }
        
        /*linha*/
        for(i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(matriz[i][j] == 0){
                        pontoJogadorUm += 1;
                    }
                    else if(matriz[i][j] == 1){
                        pontoJogadorDois += 1;
                    }

                    if(pontoJogadorUm == 3){
                        JOptionPane.showMessageDialog(null,"Jogador um ganhou");
                        this.reiniciarJogo();
                    }else if(pontoJogadorDois == 3){
                        JOptionPane.showMessageDialog(null,"Jogador dois ganhou");
                        this.reiniciarJogo();
                    }
                    
            }
                pontoJogadorUm = 0;
                pontoJogadorDois = 0;
        }
        
        
        /* coluna*/
        for(int j=0;j<3;j++){
                for(int i=0;i<3;i++){
                    if(matriz[i][j] == 0){
                        pontoJogadorUm += 1;
                    }
                    else if(matriz[i][j] == 1){
                        pontoJogadorDois += 1;
                    }

                    if(pontoJogadorUm == 3){
                        JOptionPane.showMessageDialog(null,"Jogador um ganhou");
                        this.reiniciarJogo();
                    }else if(pontoJogadorDois == 3){
                        JOptionPane.showMessageDialog(null,"Jogador dois ganhou");
                        this.reiniciarJogo();
                    }
                    
            }
                pontoJogadorUm = 0;
                pontoJogadorDois = 0;
        }
        
        /*diagonal*/
        if((matriz[0][0] == 0) && (matriz[1][1] == 0) && (matriz[2][2] == 0)){
            JOptionPane.showMessageDialog(null,"Jogador um ganhou");
            this.reiniciarJogo();
            
        }else if((matriz[0][0] == 1) && (matriz[1][1] == 1) && (matriz[2][2] == 1)){
            JOptionPane.showMessageDialog(null,"Jogador dois ganhou");
            this.reiniciarJogo();
        }
        
        /* diagonal inversa */
        if((matriz[0][2] == 0) && (matriz[1][1] == 0) && (matriz[2][0] == 0)){
            JOptionPane.showMessageDialog(null,"Jogador um ganhou");
            this.reiniciarJogo();
        }else if((matriz[0][2] == 1) && (matriz[1][1] == 1) && (matriz[2][0] == 1)){
            JOptionPane.showMessageDialog(null,"Jogador dois ganhou");
            this.reiniciarJogo();
        }
        
        
        System.out.println("\n\n Quantidade jogadas: "+qtdJogadas);
        if(qtdJogadas == 9){
            JOptionPane.showMessageDialog(null,"Jogo Empatou");
            this.reiniciarJogo();
        }
        
    }

    
    public void reiniciarJogo(){
        for(i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        matriz[i][j] = 2;
            }
        }
        lbPos11.setText("?");
        lbPos12.setText("?");
        lbPos13.setText("?");
        lbPos21.setText("?");
        lbPos22.setText("?");
        lbPos23.setText("?");
        lbPos31.setText("?");
        lbPos32.setText("?");
        lbPos33.setText("?");
        
        turno = 0;
        qtdJogadas = 0;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jpPos21 = new javax.swing.JPanel();
        lbPos21 = new javax.swing.JLabel();
        jpPos11 = new javax.swing.JPanel();
        lbPos11 = new javax.swing.JLabel();
        jpPos12 = new javax.swing.JPanel();
        lbPos12 = new javax.swing.JLabel();
        jpPos13 = new javax.swing.JPanel();
        lbPos13 = new javax.swing.JLabel();
        jpPos22 = new javax.swing.JPanel();
        lbPos22 = new javax.swing.JLabel();
        jpPos23 = new javax.swing.JPanel();
        lbPos23 = new javax.swing.JLabel();
        jpPos31 = new javax.swing.JPanel();
        lbPos31 = new javax.swing.JLabel();
        jpPos33 = new javax.swing.JPanel();
        lbPos33 = new javax.swing.JLabel();
        jpPos32 = new javax.swing.JPanel();
        lbPos32 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPos21.setBackground(new java.awt.Color(255, 255, 255));

        lbPos21.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        lbPos21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPos21.setText("?");
        lbPos21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPos21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPos21Layout = new javax.swing.GroupLayout(jpPos21);
        jpPos21.setLayout(jpPos21Layout);
        jpPos21Layout.setHorizontalGroup(
            jpPos21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPos21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpPos21Layout.setVerticalGroup(
            jpPos21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPos21, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );

        jPanel1.add(jpPos21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 149, 126));

        jpPos11.setBackground(new java.awt.Color(255, 255, 255));
        jpPos11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpPos11MouseClicked(evt);
            }
        });

        lbPos11.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        lbPos11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPos11.setText("?");

        javax.swing.GroupLayout jpPos11Layout = new javax.swing.GroupLayout(jpPos11);
        jpPos11.setLayout(jpPos11Layout);
        jpPos11Layout.setHorizontalGroup(
            jpPos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPos11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        jpPos11Layout.setVerticalGroup(
            jpPos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPos11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );

        jPanel1.add(jpPos11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 149, -1));

        jpPos12.setBackground(new java.awt.Color(255, 255, 255));

        lbPos12.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        lbPos12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPos12.setText("?");
        lbPos12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPos12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPos12Layout = new javax.swing.GroupLayout(jpPos12);
        jpPos12.setLayout(jpPos12Layout);
        jpPos12Layout.setHorizontalGroup(
            jpPos12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPos12Layout.createSequentialGroup()
                .addComponent(lbPos12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPos12Layout.setVerticalGroup(
            jpPos12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPos12Layout.createSequentialGroup()
                .addComponent(lbPos12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jpPos12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jpPos13.setBackground(new java.awt.Color(255, 255, 255));

        lbPos13.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        lbPos13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPos13.setText("?");
        lbPos13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPos13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPos13Layout = new javax.swing.GroupLayout(jpPos13);
        jpPos13.setLayout(jpPos13Layout);
        jpPos13Layout.setHorizontalGroup(
            jpPos13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPos13Layout.createSequentialGroup()
                .addComponent(lbPos13, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPos13Layout.setVerticalGroup(
            jpPos13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPos13Layout.createSequentialGroup()
                .addComponent(lbPos13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jpPos13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jpPos22.setBackground(new java.awt.Color(255, 255, 255));

        lbPos22.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        lbPos22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPos22.setText("?");
        lbPos22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPos22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPos22Layout = new javax.swing.GroupLayout(jpPos22);
        jpPos22.setLayout(jpPos22Layout);
        jpPos22Layout.setHorizontalGroup(
            jpPos22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPos22Layout.createSequentialGroup()
                .addComponent(lbPos22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPos22Layout.setVerticalGroup(
            jpPos22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPos22, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );

        jPanel1.add(jpPos22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jpPos23.setBackground(new java.awt.Color(255, 255, 255));

        lbPos23.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        lbPos23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPos23.setText("?");
        lbPos23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPos23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPos23Layout = new javax.swing.GroupLayout(jpPos23);
        jpPos23.setLayout(jpPos23Layout);
        jpPos23Layout.setHorizontalGroup(
            jpPos23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPos23Layout.createSequentialGroup()
                .addComponent(lbPos23, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPos23Layout.setVerticalGroup(
            jpPos23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPos23, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );

        jPanel1.add(jpPos23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, 126));

        jpPos31.setBackground(new java.awt.Color(255, 255, 255));

        lbPos31.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        lbPos31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPos31.setText("?");
        lbPos31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPos31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPos31Layout = new javax.swing.GroupLayout(jpPos31);
        jpPos31.setLayout(jpPos31Layout);
        jpPos31Layout.setHorizontalGroup(
            jpPos31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPos31Layout.createSequentialGroup()
                .addComponent(lbPos31, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPos31Layout.setVerticalGroup(
            jpPos31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPos31, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jpPos31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 140));

        jpPos33.setBackground(new java.awt.Color(255, 255, 255));

        lbPos33.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        lbPos33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPos33.setText("?");
        lbPos33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPos33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPos33Layout = new javax.swing.GroupLayout(jpPos33);
        jpPos33.setLayout(jpPos33Layout);
        jpPos33Layout.setHorizontalGroup(
            jpPos33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPos33Layout.createSequentialGroup()
                .addComponent(lbPos33, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPos33Layout.setVerticalGroup(
            jpPos33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPos33, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jpPos33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, 140));

        jpPos32.setBackground(new java.awt.Color(255, 255, 255));

        lbPos32.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        lbPos32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPos32.setText("?");
        lbPos32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPos32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPos32Layout = new javax.swing.GroupLayout(jpPos32);
        jpPos32.setLayout(jpPos32Layout);
        jpPos32Layout.setHorizontalGroup(
            jpPos32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPos32Layout.createSequentialGroup()
                .addComponent(lbPos32, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPos32Layout.setVerticalGroup(
            jpPos32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPos32, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jpPos32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpPos11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPos11MouseClicked
        
        if(lbPos11.getText() != "X" && lbPos11.getText() != "O"){
            if(turno == 0){
                lbPos11.setText("O");
                turno = 1;
                matriz[0][0] = 0;
            }else{
                lbPos11.setText("X");
                turno = 0;
                matriz[0][0] = 1;
            }      
        }
        qtdJogadas += 1;
        this.verificaGanhador();
        
    }//GEN-LAST:event_jpPos11MouseClicked

    private void lbPos12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPos12MouseClicked
        if(lbPos12.getText() != "X" && lbPos12.getText() != "O"){
            if(turno == 0){
                lbPos12.setText("O");
                turno = 1;
                matriz[0][1] = 0;
            }else{
                lbPos12.setText("X");
                turno = 0;
                matriz[0][1] = 1;
            }
            
        }
        qtdJogadas += 1;
        this.verificaGanhador();
    }//GEN-LAST:event_lbPos12MouseClicked

    private void lbPos13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPos13MouseClicked
        if(lbPos13.getText() != "X" && lbPos13.getText() != "O"){
            if(turno == 0){
                lbPos13.setText("O");
                turno = 1;
                matriz[0][2] = 0;
            }else{
                lbPos13.setText("X");
                turno = 0;
                matriz[0][2] = 1;
            }
            
        }
        qtdJogadas += 1;
        this.verificaGanhador();
    }//GEN-LAST:event_lbPos13MouseClicked

    private void lbPos21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPos21MouseClicked
        if(lbPos21.getText() != "X" && lbPos21.getText() != "O"){
            if(turno == 0){
                lbPos21.setText("O");
                turno = 1;
                matriz[1][0] = 0;
            }else{
                lbPos21.setText("X");
                turno = 0;
                matriz[1][0] = 1;
            }
            
        }
        qtdJogadas += 1;
        this.verificaGanhador();
    }//GEN-LAST:event_lbPos21MouseClicked

    private void lbPos22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPos22MouseClicked
        if(lbPos22.getText() != "X" && lbPos22.getText() != "O"){
            if(turno == 0){
                lbPos22.setText("O");
                turno = 1;
                matriz[1][1] = 0;
            }else{
                lbPos22.setText("X");
                turno = 0;
                matriz[1][1] = 1;
            }
            
        }
        qtdJogadas += 1;
        this.verificaGanhador();
    }//GEN-LAST:event_lbPos22MouseClicked

    private void lbPos23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPos23MouseClicked
        if(lbPos23.getText() != "X" && lbPos23.getText() != "O"){
            if(turno == 0){
                lbPos23.setText("O");
                turno = 1;
                matriz[1][2] = 0;
            }else{
                lbPos23.setText("X");
                turno = 0;
                matriz[1][2] = 1;
            }
            
        }
        qtdJogadas += 1;
        this.verificaGanhador();
    }//GEN-LAST:event_lbPos23MouseClicked

    private void lbPos31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPos31MouseClicked
        if(lbPos31.getText() != "X" && lbPos31.getText() != "O"){
            if(turno == 0){
                lbPos31.setText("O");
                turno = 1;
                matriz[2][0] = 0;
            }else{
                lbPos31.setText("X");
                turno = 0;
                matriz[2][0] = 1;
            }
            
        }
        qtdJogadas += 1;
        this.verificaGanhador();
    }//GEN-LAST:event_lbPos31MouseClicked

    private void lbPos32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPos32MouseClicked
        if(lbPos32.getText() != "X" && lbPos32.getText() != "O"){
            if(turno == 0){
                lbPos32.setText("O");
                turno = 1;
                matriz[2][1] = 0;
            }else{
                lbPos32.setText("X");
                turno = 0;
                matriz[2][1] = 1;
            }
            
        }
        qtdJogadas += 1;
        this.verificaGanhador();
    }//GEN-LAST:event_lbPos32MouseClicked

    private void lbPos33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPos33MouseClicked
        if(lbPos33.getText() != "X" && lbPos33.getText() != "O"){
            if(turno == 0){
                lbPos33.setText("O");
                turno = 1;
                matriz[2][2] = 0;
            }else{
                lbPos33.setText("X");
                turno = 0;
                matriz[2][2] = 1;
            }     
        }
        qtdJogadas += 1;
        this.verificaGanhador();
        
    }//GEN-LAST:event_lbPos33MouseClicked

    
    public static void main(String args[]) {
        
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TelaJogoVelha().setVisible(true);
                
                int[][] matriz = new int[3][3];
                
                
                
               for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.println("Matriz: "+matriz[i][j]);
                                
            }
            }
                
                
                
             
                     
                }
                
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpPos11;
    private javax.swing.JPanel jpPos12;
    private javax.swing.JPanel jpPos13;
    private javax.swing.JPanel jpPos21;
    private javax.swing.JPanel jpPos22;
    private javax.swing.JPanel jpPos23;
    private javax.swing.JPanel jpPos31;
    private javax.swing.JPanel jpPos32;
    private javax.swing.JPanel jpPos33;
    private javax.swing.JLabel lbPos11;
    private javax.swing.JLabel lbPos12;
    private javax.swing.JLabel lbPos13;
    private javax.swing.JLabel lbPos21;
    private javax.swing.JLabel lbPos22;
    private javax.swing.JLabel lbPos23;
    private javax.swing.JLabel lbPos31;
    private javax.swing.JLabel lbPos32;
    private javax.swing.JLabel lbPos33;
    // End of variables declaration//GEN-END:variables
}
