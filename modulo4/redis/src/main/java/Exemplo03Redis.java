import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;

public class Exemplo03Redis {

    public static void main(String[] args) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");
        Jedis jedis = pool.getResource();

        jedis.rpush("amigos", "João Victor", "Maria");
        String valor = jedis.lindex("amigos", 0);
        System.out.println(valor);
        valor = jedis.lindex("amigos", 1);
        System.out.println(valor);
        List lista = jedis.lrange("amigos", 0, -1);
        System.out.println(lista);
        long tamanho = jedis.llen("amigos");
        System.out.println("tamanho da lista: " + tamanho);
        pool.destroy();
    }

}
