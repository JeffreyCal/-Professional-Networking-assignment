/*
 * Jeffrey Patterson
 * Lab 5
 */

class Pet {
    private String Name;
    private String Type;
    private String BirthDate;
    private String Owner;
    private double Weight;
    private String Sex;
    private String Color; //using instance variables for the toString

    public Pet () {
         //Default Constructor
    }
    
    public Pet (String Name, String Type, String BirthDate, String Owner, double Weight, String Sex, String Color) {
        this.Name = Name;
        this.Type = Type;
        this.BirthDate = BirthDate;
        this.Owner = Owner;
        this.Weight = Weight;
        this.Sex = Sex;
        this.Color = Color;
    }
    //Constructor with parameters
    
    public String getName(){
        return Name; 
    }
    public String getType(){
        return Type; 
    }
    public String getbirthDate(){
        return BirthDate; 
    }
    public String getOwner(){
        return Owner; 
    } 
    public double getWeight(){
        return Weight; 
    }
    public String getSex(){
        return Sex; 
    }
    public String getColor(){
        return Color; 
    }
    //Above are all the getters for the instance variables
    
    
    public void setName(String aName){
        this.Name = aName;
    }
    public void setType(String aType){
        this.Type = aType;
    }
    public void setBirthDate(String aBirthDate){
        this.BirthDate = aBirthDate;
    }
    public void setOwner(String aOwner){
        this.Owner = aOwner;
    }
    public void setWeight(double aWeight){
        this.Weight = aWeight;
    }
    public void setSex(String aSex){
        this.Sex = aSex;
    }
    public void setColor(String aColor){
        this.Color = aColor;
    }
    //Above are all the setters for their respective instance variables
    
    
    public String getTag(){
        String Lost ="If lost, call " + this.Owner;
        return Lost;
    }
    //Above is the getTag we had to put in
    
    
    public void Speak(){
       System.out.println("No animal class!");
    }
    //Above is a Speak method that will be overwritten
    
    
    public String toString(){
        String Info = this.Name + "\n" + this.Type + "\n" + this.BirthDate + "\n" + this.Owner + "\n" + this.Weight + "\n" + this.Sex + "\n" + this.Color;
        return Info;
    }
}
//Above is the whole of my parent class


class Cat extends Pet {
    
    Cat(String Name, String Type, String BirthDate, String Owner, double Weight, String Sex, String Color){
        super(Name, Type, BirthDate, Owner, Weight, Sex, Color);
        }
    //Super for class
    
    
    @Override
    public void Speak(){
        System.out.println("Meow");
    }
    //Above is speak override
    
    
    public void scratch_post(){
        System.out.println("The cats is tearing away at the post!");
    }
    //Required Method w/ no parameters
    
    public void ignore_owner(){
        System.out.println("It's sulking in the corner again. I wonder if it's mad at me?");
    }
    //Required Method w/ no parameters
    
    public void sleep(){
        System.out.println("It has begun the great slumber, curled up in a tiny ball.");
    }
    //Required Method w/ no parameters
    
    public void climb_trees(){
        System.out.println("I think it sees a squirell! It's darting up the tree! Oh, but now halfway up it's crying for help.");
    }
    //Required Method w/ no parameters
}
//Above is the entirety of the cat class


class Dog extends Pet {
    
    Dog(String Name, String Type, String BirthDate, String Owner, double Weight, String Sex, String Color){
        super(Name, Type, BirthDate, Owner, Weight, Sex, Color);
        }
    //Super for class
    
    
    @Override
    public void Speak(){
        System.out.println("bark! bark!");
    }
    //Above is speak override
    
    
    public void roll_over(){
        System.out.println("The dog tries to roll over, but gave up halfway through and is now scratching it's back on the ground.");
    }
    //Required Method w/ no parameters
    
    public void play_dead(){
        System.out.println("You fire your finger pistols at the dog and it plops on its side!");
    }
    //Required Method w/ no parameters
    
    public void sit(){
        System.out.println("You ask it to sit, and so it does.");
    }
    //Required Method w/ no parameters
    
    public void whine(){
        System.out.println("The dog is now whining. It may want a treat, or some outside time.");
    }
    //Required Method w/ no parameters
    
    public void wag_tail(){
        System.out.println("The dog sees you approach the doar and you can hear it's tail hitting the ground behind you!");
    }
}
//Above is the entirety of the dog class


class Bird extends Pet {
    
    Bird(String Name, String Type, String BirthDate, String Owner, double Weight, String Sex, String Color){
        super(Name, Type, BirthDate, Owner, Weight, Sex, Color);
        }
    //Super for class
    
    
    @Override
    public void Speak(){
        System.out.println("chirp! chirp!");
    }
    //Above is speak override
    
    
    public void sing(){
        System.out.println("The bird hears it's favorite song play, and begins to chirp along with it!");
    }
    //Required Method w/ no parameters
    
    public void fly(){
        System.out.println("The bird swoops up with a flurry of wing flutters as it makes it's way to your shoulder.");
    }
    //Required Method w/ no parameters
    
    public void eat_bird_seed(){
        System.out.println("The bird saw it's freshly put out food and begins pecking at it.");
    }
    //Required Method w/ no parameters
}
//Above is the entirety of the bird class


class Turtle extends Pet {
    
    Turtle(String Name, String Type, String BirthDate, String Owner, double Weight, String Sex, String Color){
        super(Name, Type, BirthDate, Owner, Weight, Sex, Color);
        }
    //Super for class
    
    
    @Override
    public void Speak(){
        System.out.println("grunt! grunt!");
    }
    //Above is speak override
    
    
    public void crawl(){
        System.out.println("The turtle notices you and ever so slowly begins to crawl his way towards you.");
    }
    //Required Method w/ no parameters
    
    public void hide_in_shell(){
        System.out.println("Your not so quick movements startled the turtle, it's now tucked inside it's shell.");
    }
    //Required Method w/ no parameters
    
    public void swim(){
        System.out.println("The turtle plops into the water, then elegantly swims aroundl.");
    }
    //Required Method w/ no parameters
}
//Above is the entirety of the turtle class


public class Lab5{ //Driver class
    public static void main(String args[]){
        
        Cat objCat = new Cat("Ginger", "Cat", "8/15/18", "Joe", 10.3, "Male", "Orange Tabby");
        System.out.println(objCat);
        objCat.Speak();
        objCat.scratch_post();
        objCat.ignore_owner();
        objCat.sleep();
        objCat.climb_trees();
        
        Dog objDog = new Dog("Titus", "Dog", "6/15/14", "Anna", 20.2, "Male", "Black");
        System.out.println("/n" + objDog);
        objDog.Speak();
        objDog.roll_over();
        objDog.play_dead();
        objDog.sit();
        objDog.whine();
        objDog.wag_tail();
        
        Bird objBird = new Bird("Sprinkle", "Bird", "10/15/20", "Mary", 1.8, "Female", "Green");
        System.out.println(objBird);
        objBird.Speak();
        objBird.sing();
        objBird.fly();
        objBird.eat_bird_seed();
        
        
        Turtle objTurtle = new Turtle("Hank", "Turtle", "10/6/87", "Bill", 18.1, "Male", "Brown");
        System.out.println(objTurtle);
        objTurtle.Speak();
        objTurtle.crawl();
        objTurtle.hide_in_shell();
        objTurtle.swim();
        
        
        
    }
}