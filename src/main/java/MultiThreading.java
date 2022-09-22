import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiThreading {

    private Random random = new Random();
    private List<BigDecimal> list = new ArrayList<>();

    void insertValues() {
        System.out.println(Thread.currentThread().getName() + "thread started... ");
        for (int i = 0; i < 10_00_000; i++) {
            BigDecimal bigDecimal = BigDecimal.valueOf(random.nextGaussian());
            list.add(bigDecimal);
        }
    }

    void spawnThread() throws InterruptedException {
        for (int i = 0; i < 100; i ++) {
            new Thread(this::insertValues, "ThisIsMyThread" + i).start();
            Thread.sleep(2000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThreading memoryExample = new MultiThreading();
        memoryExample.spawnThread();
    }
}
