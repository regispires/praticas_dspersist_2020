import redis.clients.jedis.Jedis;

public class Exemplo01Redis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set("usuario:1:nome", "João Victor");
        String valor = jedis.get("usuario:1:nome");
        System.out.println(valor);
        jedis.close();
    }

}
