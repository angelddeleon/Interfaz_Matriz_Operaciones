package Ventana;
import java.awt.GridLayout;
import java.math.BigInteger;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class Interfaz extends javax.swing.JFrame {
    
    private int m = 0;
    private int[][] matriz;
    private JPanel panel;
    
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        Diagonal.setEditable(false);
        FactorialNumeroMayor.setEditable(false);
        FibonacciPromedioSuma.setEditable(false);
        SumatoriaUltimaColumna.setEditable(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        BotonSalir = new javax.swing.JButton();
        BotonLimpiaVentana = new javax.swing.JButton();
        BottonGeneraMatriz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CapturaNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Diagonal = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        FactorialNumeroMayor = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        FibonacciPromedioSuma = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        SumatoriaUltimaColumna = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        panelMatriz = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(255, 255, 255));
        BotonSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotonSalir.setText("X");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, 40));

        BotonLimpiaVentana.setBackground(new java.awt.Color(255, 255, 255));
        BotonLimpiaVentana.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotonLimpiaVentana.setText("Limpiar");
        BotonLimpiaVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiaVentanaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonLimpiaVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 40));

        BottonGeneraMatriz.setBackground(new java.awt.Color(255, 255, 255));
        BottonGeneraMatriz.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BottonGeneraMatriz.setText("Generar");
        BottonGeneraMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonGeneraMatrizActionPerformed(evt);
            }
        });
        BottonGeneraMatriz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BottonGeneraMatrizKeyPressed(evt);
            }
        });
        getContentPane().add(BottonGeneraMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar el N° de filas y columnas (3-10):  ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 370, 40));

        CapturaNumero.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        CapturaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapturaNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(CapturaNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Multiplicacion de la diagonal principal: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Factorial del numero mayor de la Matriz: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Secuencia Fibonacci hasta el promedio de la suma de todas las variables positivas: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Promedio Sumatoria de la ultima Columna:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("MATRIZ RESULTANTE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 210, 40));

        Diagonal.setBackground(new java.awt.Color(0, 0, 0));
        Diagonal.setColumns(20);
        Diagonal.setForeground(new java.awt.Color(255, 255, 255));
        Diagonal.setRows(5);
        jScrollPane2.setViewportView(Diagonal);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 360, 70));

        FactorialNumeroMayor.setBackground(new java.awt.Color(0, 0, 0));
        FactorialNumeroMayor.setColumns(20);
        FactorialNumeroMayor.setForeground(new java.awt.Color(255, 255, 255));
        FactorialNumeroMayor.setRows(5);
        jScrollPane4.setViewportView(FactorialNumeroMayor);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 820, 70));

        FibonacciPromedioSuma.setBackground(new java.awt.Color(0, 0, 0));
        FibonacciPromedioSuma.setColumns(20);
        FibonacciPromedioSuma.setForeground(new java.awt.Color(255, 255, 255));
        FibonacciPromedioSuma.setRows(5);
        jScrollPane5.setViewportView(FibonacciPromedioSuma);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 820, 70));

        SumatoriaUltimaColumna.setBackground(new java.awt.Color(0, 0, 0));
        SumatoriaUltimaColumna.setColumns(20);
        SumatoriaUltimaColumna.setForeground(new java.awt.Color(255, 255, 255));
        SumatoriaUltimaColumna.setRows(5);
        jScrollPane7.setViewportView(SumatoriaUltimaColumna);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 360, 70));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 646, 920, -1));

        panelMatriz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelMatriz.setToolTipText("");
        panelMatriz.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(panelMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Boton de salir
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed
    
    // Captura del texto
    private void CapturaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapturaNumeroActionPerformed
        
    }//GEN-LAST:event_CapturaNumeroActionPerformed
    
    // Boton que genera la matriz
    private void BottonGeneraMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonGeneraMatrizActionPerformed
        String numero; 
        int captura = 0;
        numero = CapturaNumero.getText();
        try{
            captura = Integer.parseInt(numero);
            if (captura < 3 || captura > 10){
                CapturaNumero.setText("Informacion erronea... ");
                BottonGeneraMatriz.setEnabled(false);
            } else{
                // Se define la matriz 
                int matriz[][] = new int[captura][captura];
                generaMatriz(matriz);
                MatrizMostrar(matriz);
                multiplicarDiagonal(matriz);
                PromedioSumaUltimaColum(matriz);
                FactorialNumMayor(matriz);
                FibonacciPromedioSuma(matriz);
            }
            
        }catch(Exception e){
            CapturaNumero.setText("Informacion erronea... ");
            BottonGeneraMatriz.setEnabled(false);
        }
    }//GEN-LAST:event_BottonGeneraMatrizActionPerformed
    
    // Mostrar la matriz
    public void MatrizMostrar(int matriz[][]) {
        this.matriz = matriz;
        this.panel = panelMatriz;
        panelMatriz.setLayout(new GridLayout(matriz.length, matriz[0].length));

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                panelMatriz.add(new JLabel(String.valueOf(matriz[i][j]), SwingConstants.CENTER));
            }
        }

        panelMatriz.revalidate();
        panelMatriz.repaint();
        BottonGeneraMatriz.setEnabled(false);
        CapturaNumero.setEnabled(false);
        
    }
    
    // Generar la matriz (numeros aleatorios del -999 al 999)
    private void generaMatriz(int matriz[][]){
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[0].length; columnas++) {
                matriz[filas][columnas] = (int)(Math.random()*1998-999);
            }
        }
    }
    
    
    
    
    // BOTON DE LIMPIAR LOS DATOS
    private void BotonLimpiaVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiaVentanaActionPerformed
        jLabel1.setText("Ingresar el N° de filas y columnas (3-10): ");
        CapturaNumero.setText("");
        Diagonal.setText("");
        // Eliminar los elementos de la tabla
        panelMatriz.removeAll();
        panelMatriz.revalidate();
        panelMatriz.repaint();
        BottonGeneraMatriz.setEnabled(true);
        CapturaNumero.setEnabled(true);
        FactorialNumeroMayor.setText("");
        FibonacciPromedioSuma.setText("");
        SumatoriaUltimaColumna.setText("");
    }//GEN-LAST:event_BotonLimpiaVentanaActionPerformed

    private void BottonGeneraMatrizKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BottonGeneraMatrizKeyPressed
        
    }//GEN-LAST:event_BottonGeneraMatrizKeyPressed

    
    // Algoritmo que multiplica la diagonal principal 
    private void multiplicarDiagonal(int matriz[][]){
        BigInteger resultado = BigInteger.valueOf(1);
        String mostrar="( ";
        int acumulador = 0;
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                if (filas==columnas){
                   acumulador = matriz[filas][columnas];
                   resultado = resultado.multiply(BigInteger.valueOf(matriz[filas][columnas]));
                }
            }
            if (filas == matriz.length-1){
                mostrar += acumulador;
            }else {
                mostrar += acumulador + " * ";
            }
        }
        mostrar += " ) = ";
        Diagonal.setText(mostrar + "\n" + resultado);
    }
    
    // PROMEDIO SUMA DE LA ULTIMA COLUMNA
    private void PromedioSumaUltimaColum(int m[][]){
        int suma = 0;
        double promS;
        String sumatoria = "(";
        
        for (int i = 0; i < m.length; i++) {
            suma += m[i][m.length-1];
            if (i == m.length-1){
                sumatoria+= m[i][m.length-1];
            }else {
                sumatoria += m[i][m.length-1] + ") + (";
            }
        }
        sumatoria += ") / ";
        promS = (double)suma/(m.length);
        SumatoriaUltimaColumna.setText(sumatoria + (m.length) + " = \n" + promS + "");
        
    }
    
    // FACTORIAL DEL NUMERO MAYOR
    public void FactorialNumMayor(int matriz[][]){
        int max= Integer.MIN_VALUE;
        BigInteger fact = BigInteger.ONE;
    
        for(int i = 0;i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j] > max){
                max = matriz[i][j];
            }
        }
    }
    
        for(int i = 2;i <= max; i++){
            fact= fact.multiply(BigInteger.valueOf(i));
        }
    
        FactorialNumeroMayor.setText(max + "! = \n" + fact + "");
        
        jScrollPane4.setViewportView(FactorialNumeroMayor);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                jScrollPane4.getHorizontalScrollBar().setValue(0);
            }
        });
}
    
    // FIBONACCI DEL VALOR PROMEDIO DE LA SUMA LOS VALORES POSITIVOS
    private void FibonacciPromedioSuma(int matriz[][]){
        int sumaT = 0, a = 0, b = 1, contador = 0;
        double prom;
        String secuen;
        
        secuen = "( ";
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if (matriz[i][j]>=0){
                    sumaT += matriz[i][j];
                    contador++;
                }
            }
        }
        
        prom=(double)sumaT/contador;
        String form = String.format("%.2f", prom);
        while(a <= prom){
            secuen += a; 
            
            int sum = a+b;
            a=b;
            b=sum;
            
            if (a <= prom) {
                secuen += ", ";
            }
        }
        
        secuen += " )";
        
        FibonacciPromedioSuma.setText("El promedio es = " + form + "\n" + "La secuencia Fibonacci es " + secuen);
        
    }
    
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });   
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLimpiaVentana;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BottonGeneraMatriz;
    private javax.swing.JTextField CapturaNumero;
    private javax.swing.JTextArea Diagonal;
    private javax.swing.JTextArea FactorialNumeroMayor;
    private javax.swing.JTextArea FibonacciPromedioSuma;
    private javax.swing.JTextArea SumatoriaUltimaColumna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelMatriz;
    // End of variables declaration//GEN-END:variables
}