import java.util.List;

/**
 * Created by eb on 2017.05.23..
 */
public class Bacillus extends Bacterium {

    public Bacillus () {
        super(1, 0.3f);

    }

    @Override
    public boolean checkIfDead(List<Bacterium> petri) {
        for (int i = 0; i < petri.size(); i++) {
             if (petri.get(i) instanceof Coccus &&
                 Math.abs(this.xPosition - petri.get(i).xPosition) < this.nearby &&
                 Math.abs(this.yPosition - petri.get(i).yPosition) < this.nearby) {
                 return false;
             }
        }
        return true;
    }
}
