import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by eb on 2017.05.23..
 */
public abstract class Bacterium {
    float lifeSpan;
    float nearby;
    float age;
    float xPosition;
    float yPosition;

    public Bacterium (float lifeSpan, float nearby) {
        this.lifeSpan = lifeSpan;
        this.nearby = nearby;
        this.age = 0;
        this.xPosition = setPosition();
        this.yPosition = setPosition();
    }

    public float setPosition () {
        float Position = (float) ThreadLocalRandom.current().nextDouble(0, 50 + 1);
        return Position;
    }

    public abstract boolean checkIfDead(List<Bacterium> petri);

}
