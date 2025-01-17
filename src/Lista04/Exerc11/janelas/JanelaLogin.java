
package Lista04.Exerc11.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JanelaLogin extends JFrame {
    private JPanel painel = new JPanel();
    
    private BoxLayout layoutPainel = new BoxLayout(painel, BoxLayout.PAGE_AXIS);
    
    private JLabel txtLogin = new JLabel("Informe seus dados");
    private JLabel txtEmail = new JLabel("E-mail:");
    private JLabel txtSenha = new JLabel("Senha:");
    
    private JTextField campoEmail = new JTextField(20);
    private JPasswordField campoSenha = new JPasswordField(20);
    
    private JButton botaoOK = new JButton("Entrar");

    public JanelaLogin() {
        
        painel.setLayout(layoutPainel);
        campoEmail.setMaximumSize( campoEmail.getPreferredSize() );
        campoSenha.setMaximumSize( campoSenha.getPreferredSize() );
        
        txtLogin.setAlignmentX(CENTER_ALIGNMENT);
        txtEmail.setAlignmentX(CENTER_ALIGNMENT);
        txtSenha.setAlignmentX(CENTER_ALIGNMENT);
        campoEmail.setAlignmentX(CENTER_ALIGNMENT);
        campoSenha.setAlignmentX(CENTER_ALIGNMENT);
        botaoOK.setAlignmentX(CENTER_ALIGNMENT);
        
        // TODO 06 - vamos programar aqui a ação de clique do botão
        // o método addActionListener é chamado através do objeto botaoOK
        botaoOK.addActionListener(new ActionListener() {
            
            // dentro deste método, chama-se o método actionPerformed 
            // repare que o actionPerformed está sendo sobrescrito!!! (override):
            @Override
            public void actionPerformed(ActionEvent ae) {
                // TODO 07 - aqui dentro, crie uma variável do tipo String de nome
                ////////// emailDigitado e atribua a ela o valor de retorno
                ////////// do método getText que deve ser chamado através do 
                ////////// objeto campoEmail

                String emailDigitado = campoEmail.getText();
                
                // TODO 08 - crie agora outra variável do tipo String de nome
                ////////// senhaDigitada e atribua a ela o valor de retorno 
                ////////// do método getPassword que deve ser chamado através do 
                ////////// objeto campoSenha

                //String senhaDigitada = campoSenha.getPassword();
                
                // TODO 09 - por que está dando erro?
                ////////// R: Porque o método getPassword() retorna um array de char
                // TODO 10 - realize a conversão para String através do método String.valueOf
                String senhaDigitada = String.valueOf(campoSenha.getPassword());
                // TODO 11 - programe a seguinte verificação:
                ////////// se a senha digitada for igual a "senha!@#" e o email "admin@sistema.com"
                ////////// então mostre uma caixa de JOptionPane da seguinte forma:
                ////////// JOptionPane.showMessageDialog(null, "Senha Correta", "Sistema.com", JOptionPane.INFORMATION_MESSAGE);
                ////////// senão, mostre a seguinte caixa:
                ////////// JOptionPane.showMessageDialog(null, "Senha Incorreta", "Sistema.com", JOptionPane.ERROR_MESSAGE);
                ////////// faça importações necessárias
                if(senhaDigitada.equals("senha!@#") && emailDigitado.equals("admin@sistema.com")){
                    JOptionPane.showMessageDialog(null, "Senha Correta", "Sistema.com", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Senha Incorreta", "Sistema.com", JOptionPane.ERROR_MESSAGE);
                }
                
                // TODO 12 - execute o projeto, faça os testes. o que acontece? 
                ////////// LEGAL NÉ??? ;)
                // Ao digitar a senha correta aparece um pop up "Senha correta" e caso esteja errada aparece um popUp com senha incorreta;
                
            }
        });
        
        painel.add(txtLogin);
        painel.add(txtEmail);
        painel.add(campoEmail);
        painel.add(txtSenha);
        painel.add(campoSenha);
        painel.add(botaoOK);
        
        this.add(painel);
    }
    
}
