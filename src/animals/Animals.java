package animals;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        if(name == null ||name.isEmpty()){
            this.name = "unknow";
        }else{
            this.name = name;
        }
        if(age <0){
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null ||name.isEmpty()){
            this.name = "unknow";
        }else{
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <0){
            this.age = 0;
        }else{
            this.age = age;
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    @Override
    public String toString() {
        return "имя " + name +
                "\nвозраст " + age;
    }
}
