package animals;

public class Amphibians extends Animals{

    private String locationLive;

    public Amphibians(String name, int age,String locationLive) {
        super(name, age);
        if(locationLive == null||locationLive.isEmpty()){
            this.locationLive = "unknow";
        }else{
            this.locationLive = locationLive;
        }
    }


    @Override
    public void eat() {
        System.out.println("Едят то что поймают в водной среде");
    }

    @Override
    public void sleep() {
        System.out.println("Спят не долго могут и в воде");
    }

    @Override
    public void move() {
        System.out.println("Передвигаються и по земле и в воде");
    }

    public String getLocationLive() {
        return locationLive;
    }

    public void setLocationLive(String locationLive) {
        if(locationLive == null||locationLive.isEmpty()){
            this.locationLive = "unknow";
        }else{
            this.locationLive = locationLive;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nСреда проживания " + locationLive ;
    }
}
