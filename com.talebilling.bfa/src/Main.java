import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Bacterium> petri = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            petri.add(new Bacillus());
            petri.add(new Coccus());
            petri.add(new Spirillum());
        }

        for (int i = 0; i < 20; i++) {

        }
    }
}
