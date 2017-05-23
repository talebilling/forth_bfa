import java.util.List;

/**
 * Created by eb on 2017.05.23..
 */
public class Spirillum extends Bacterium {

    public Spirillum () {
        super(4, 0.2f);

    }

    @Override
    public boolean checkIfDead(List<Bacterium> petri) {
        return false;
    }
}
