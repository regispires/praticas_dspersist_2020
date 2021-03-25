import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Exemplo02Redis {

    public static void main(String[] args) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");
        Jedis jedis = pool.getResource();

        jedis.set("usuario:1:nome", "João Victor");
        String valor = jedis.get("usuario:1:nome");
        System.out.println(valor);

        pool.destroy();
    }

}
