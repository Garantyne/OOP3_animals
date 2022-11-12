package animals;

public class Nofly extends Birds{
    private String moveType;
    public Nofly(String name, int age, String locationLive,String moveType) {
        super(name, age, locationLive);
        if(moveType == null || moveType.isEmpty()){
            this.moveType = "unknow";
        }else{
            this.moveType = moveType;
        }
    }
    public void walck(){
        System.out.println("птички не повезло она гуляет");
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        if(moveType == null || moveType.isEmpty()){
            this.moveType = "unknow";
        }else{
            this.moveType = moveType;
        }
    }

    @Override
    public String toString() {
        return super.toString() +  "\nТип передвижения " + moveType ;
    }
}
