import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.*;

public class ExemploMongoDB01 {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase db = mongoClient.getDatabase("meudb");
        MongoCollection col = db.getCollection("funcionarios");

        Bson filtroMaria = eq("nome", "maria");
        Document obj = (Document) col.find(filtroMaria).first();

        System.out.println(obj);
        System.out.println(obj.toJson());
        System.out.println("Nome: " + obj.get("nome"));
        System.out.println("Salario: " + obj.get("salario"));
        mongoClient.close();
    }
}
