package exam;

public abstract class Person {
    private String name;
    private Size size;


    public Person(String name, Size size){
        this.name = name;
        this.size = size;
    }

    public void printInfo(){
        System.out.println("my name is : " + this.name + "\n My size is : " + this.size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
