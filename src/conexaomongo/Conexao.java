package conexaomongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import java.net.UnknownHostException;

public class Conexao {
    private Mongo conexao;
    private DB db;
    
    public void addPessoa(Pessoa p) throws UnknownHostException, MongoException{
        this.conexao = new Mongo("localhost", 27017);
        this.db = conexao.getDB("Java_Teste_1");
        
        try{
            BasicDBObject pessoa = new BasicDBObject();
            pessoa.put("nome", p.getNome());
            pessoa.put("idade", p.getIdade());
            
            DBCollection col = db.getCollection("Java_Teste_1");
            col.insert(pessoa);
        }catch(Exception e){
            System.out.println(e.getClass().getName()+ ", " + e.getMessage());
        }
    }
}
