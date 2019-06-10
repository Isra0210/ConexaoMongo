package conexaomongo;

import java.net.UnknownHostException;

public class Play {
    public static void main(String[] args) throws UnknownHostException {
        Pessoa p1 = new Pessoa("Eu consegui..", 22);
        Conexao conexao = new Conexao();
        
        int i = 0;
        
        for(i = 0; i <= 3000; i++){
            conexao.addPessoa(p1);
        }
    }
}
