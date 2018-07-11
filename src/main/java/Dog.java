import java.sql.SQLOutput;

public class Dog {
    public String name;
    public String owner;
    public boolean run;
    public boolean eat;
    public boolean walk;
    public Dog(String name, String owner){
        this.name=name;
        this.owner=owner;
        this.eat=false;
        this.run=false;
        System.out.println("This is a Dog");
        System.out.println("It's name is "+name);
        System.out.println("It's Owner is "+name);
    }

    public void run(){
        System.out.println(name+" is runing");
        this.run=true;
    }

    public  void stop(){
        System.out.println(name+" stopped");
        this.run=false;
        this.walk=false;
    }

    public void eat(){
        if(this.run==true){
            System.out.println(name+" can't eat because it is running");
        }
        else{
            System.out.println(name+" is eating");
            this.eat=true;
        }
    }

    public void walk(){
        System.out.println(name+" is walikng");
        this.walk=true;
        System.out.println("Finish");

    }
}
