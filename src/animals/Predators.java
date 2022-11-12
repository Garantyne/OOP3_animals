package animals;

public class Predators extends Mammals {
    String eatType;

    public Predators(String name, int age, String locationLive, int speed,String eatType) {
        super(name, age, locationLive, speed);
        if(eatType == null || eatType.isEmpty()){
            this.eatType = "мясо";
        }
        this.eatType = eatType;
    }

    public String getEatType() {
        return eatType;
    }

    public void setEatType(String eatType) {
        if(eatType == null || eatType.isEmpty()){
            this.eatType = "мясо";
        }
        this.eatType = eatType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nТип пищи " + eatType;
    }
}
