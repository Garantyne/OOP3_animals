package animals;

public class Herbivores extends Mammals {
    private String eatType;


    public Herbivores(String name, int age, String locationLive, int speed, String eatType) {
        super(name, age, locationLive, speed);
        if(eatType == null||eatType.isEmpty()){
            this.eatType = "unknow";
        }else{
            this.eatType = eatType;
        }
    }

    public String getEatType() {
        return eatType;
    }

    public void setEatType(String eatType) {
        if(eatType == null||eatType.isEmpty()){
            this.eatType = "unknow";
        }else{
            this.eatType = eatType;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nТип пищи " + eatType ;
    }
}
