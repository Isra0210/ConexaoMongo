package conexaomongo;

import java.net.UnknownHostException;

public class Play {
    public static void main(String[] args) throws UnknownHostException {
        Pessoa p1 = new Pessoa("Israel", 18, "Santa Helena", 419982731);
        Conexao conexao = new Conexao();
                
        for(int i = 0; i < 3000; i++){
            conexao.addPessoa(p1);
        }
    }
}
