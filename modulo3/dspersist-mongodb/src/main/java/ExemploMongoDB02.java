import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.gt;

public class ExemploMongoDB02 {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase db = mongoClient.getDatabase("meudb");
        MongoCollection col = db.getCollection("funcionarios");

        Bson filtroMaiorQue = gt("salario", 1000);
        Document obj = (Document) col.find(filtroMaiorQue).first();

        System.out.println(obj);
        System.out.println(obj.toJson());
        System.out.println("Nome: " + obj.get("nome"));
        System.out.println("Salario: " + obj.get("salario"));
        mongoClient.close();
    }
}
