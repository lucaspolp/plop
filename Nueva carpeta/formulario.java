public class formulario extends javax.swing.JFrame {

    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNombre;

    public formulario() {
        initComponents();
    }

    private void initComponents() {
        lblNombre = new javax.swing.JLabel("Nombre:");
        txtNombre = new javax.swing.JTextField(20);
        btnEnviar = new javax.swing.JButton("Enviar");

        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String nombre = txtNombre.getText().trim();
                javax.swing.JOptionPane.showMessageDialog(formulario.this, "Hola, " + (nombre.isEmpty() ? "amigo" : nombre));
            }
        });

        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.insets = new java.awt.Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0; gbc.anchor = java.awt.GridBagConstraints.EAST;
        panel.add(lblNombre, gbc);

        gbc.gridx = 1; gbc.gridy = 0; gbc.anchor = java.awt.GridBagConstraints.WEST; gbc.fill = java.awt.GridBagConstraints.HORIZONTAL; gbc.weightx = 1.0;
        panel.add(txtNombre, gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2; gbc.anchor = java.awt.GridBagConstraints.CENTER; gbc.fill = java.awt.GridBagConstraints.NONE; gbc.weightx = 0;
        panel.add(btnEnviar, gbc);

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Formulario");
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new formulario().setVisible(true);
        });
    }
}
