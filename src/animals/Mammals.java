package animals;

public class Mammals extends Animals {
    String locationLive;
    int speed;

    public Mammals(String name, int age, String locationLive, int speed) {
        super(name, age);
        if(locationLive == null||locationLive.isEmpty()){
            locationLive = "unknow";
        }else{
            this.locationLive = locationLive;
        }
        if(speed<0){
            this.speed = 1;
        }else{
            this.speed = speed;
        }
    }



    @Override
    public void eat() {
        System.out.println("Едят молоко на ранних этапах жизни ");
    }

    @Override
    public void sleep() {
        System.out.println("Спят... ну хз по разному спят");
    }

    @Override
    public void move() {
        System.out.println("Передвигаются тоже по разному, в основном на лапах конечно");
    }

    public String getLocationLive() {
        return locationLive;
    }

    public void setLocationLive(String locationLive) {
        if(locationLive == null||locationLive.isEmpty()){
            locationLive = "unknow";
        }else{
            this.locationLive = locationLive;
        }
    }
    public void wolck(){
        System.out.println("гулять так гулять, стрелять так стрелять!!!");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed<0){
            this.speed = 1;
        }else{
            this.speed = speed;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nМесто проживания " + locationLive +
                "\nскорость передвижения " + speed ;

    }
}
