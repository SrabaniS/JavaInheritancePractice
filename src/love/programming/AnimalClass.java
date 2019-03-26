package love.programming;

import javax.xml.stream.events.Namespace;
import java.util.Set;

public class AnimalClass    {
    String animalNames;
    int numLegs;
    public void setAnimalNames( String animalNames) {
        this.animalNames = animalNames;
    }

    public void setNumlegs(int numlegs) {
        this.numLegs = numlegs;
    }

    public String getAnimalName() {
        return animalNames;
    }

    public int getNumlegs() {
        return numLegs;
    }
    public void printInfo(){

    }
    public int getNumberOfHeads(){
        return numLegs;
    }
}








