import java.util.List;

/**
 * Created by eb on 2017.05.23..
 */
public class Coccus extends Bacterium {

    public Coccus () {
        super(10, 0.1f);
    }

    @Override
    public boolean checkIfDead(List<Bacterium> petri) {
        return false;
    }
}
