package animals;

public class Fly extends Birds{
    private String moveTipe;
    public Fly(String name, int age, String locationLive,String moveTipe) {
        super(name, age, locationLive);
        if(moveTipe == null || moveTipe.isEmpty()){
            this.moveTipe = "unknow";
        }else{
            this.moveTipe = moveTipe;
        }
    }
    public void fly(){
        System.out.println("птичка летает");
    }

    public String getMoveTipe() {
        return moveTipe;
    }

    public void setMoveTipe(String moveTipe) {
        if(moveTipe == null || moveTipe.isEmpty()){
            this.moveTipe = "unknow";
        }else{
            this.moveTipe = moveTipe;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nтип перемещения " + moveTipe ;
    }
}
