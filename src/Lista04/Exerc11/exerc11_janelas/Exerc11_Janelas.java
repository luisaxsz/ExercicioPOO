
package Lista04.Exerc11.exerc11_janelas;

import Lista04.Exerc11.janelas.JanelaLogin;

public class Exerc11_Janelas {

    public static void main(String[] args) {
        // TODO 01 - crie aqui um objeto da classe JanelaLogin de nome janelaLogin
        JanelaLogin janelaLogin = new JanelaLogin();
        // TODO 02 - através do objeto janelaLogin, acesse o método setSize 
        ////////// e passe os seguintes valores: 300, 300
        janelaLogin.setSize(300,300);
        // TODO 03 - através do objeto janelaLogin, acesse o método setDefaultCloseOperation 
        ////////// e passe o seguinte valor: JFrame.EXIT_ON_CLOSE (realize importação)
        janelaLogin.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        // TODO 04 - através do objeto janelaLogin, acesse o método setVisible 
        ////////// e passe o seguinte valor: true
        janelaLogin.setVisible(true);
        
        // TODO 05 - execute o projeto, digite valores nos campos e clique no botão!
        ////////// o que acontece?
        // Nada acontece, pois não foi programado o evento de clique do botão.
        
    }
    
}
