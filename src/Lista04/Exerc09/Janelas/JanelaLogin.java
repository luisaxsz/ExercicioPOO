package Lista04.Exerc09.Janelas;

import javax.swing.*;

public class JanelaLogin extends JFrame {

    private JPanel painel;
    private BoxLayout layoutPainel;
    private JLabel txtLogin;
    private JLabel txtEmail;
    private JLabel txtSenha;
    private JTextField campoEmail;
    private JPasswordField campoSenha;
    private JButton botaoOK;

    public JanelaLogin() {
        painel = new JPanel();
        layoutPainel = new BoxLayout(painel, BoxLayout.PAGE_AXIS);
        txtLogin = new JLabel("Informe os seus dados");
        txtEmail = new JLabel("E-mail");
        txtSenha = new JLabel("Senha");
        campoEmail = new JTextField(20);
        campoSenha = new JPasswordField(20);
        botaoOK = new JButton("Entrar");

        painel.setLayout(layoutPainel);
        campoEmail.setMaximumSize(campoEmail.getPreferredSize());
        campoSenha.setMaximumSize(campoSenha.getPreferredSize());
        txtLogin.setAlignmentX(CENTER_ALIGNMENT);
        txtEmail.setAlignmentX(CENTER_ALIGNMENT);
        txtSenha.setAlignmentX(CENTER_ALIGNMENT);
        campoEmail.setAlignmentX(CENTER_ALIGNMENT);
        campoSenha.setAlignmentX(CENTER_ALIGNMENT);
        botaoOK.setAlignmentX(CENTER_ALIGNMENT);

        painel.add(txtLogin);
        painel.add(txtEmail);
        painel.add(campoEmail);
        painel.add(txtSenha);
        painel.add(campoSenha);
        painel.add(botaoOK);

        add(painel);
    }

}
