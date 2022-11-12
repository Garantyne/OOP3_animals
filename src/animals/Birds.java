package animals;

public class Birds extends Animals{
    private String locationLive;

    public Birds(String name, int age, String locationLive) {
        super(name, age);
        if(locationLive == null||locationLive.isEmpty()){
            this.locationLive = "unknow";
        }else{
            this.locationLive = locationLive;
        }
    }
    public void hunt(){
        System.out.println("Охотятся на жертв XD" );
    }

    @Override
    public void eat() {
        System.out.println("Кого то там едят");
    }

    @Override
    public void sleep() {
        System.out.println("Cпят на ветках если не сильно жирные");
    }

    @Override
    public void move() {
        System.out.println("летают если не повезло то не летают...");
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
        return super.toString() + "\nСреда обитания " + locationLive ;
    }
}
