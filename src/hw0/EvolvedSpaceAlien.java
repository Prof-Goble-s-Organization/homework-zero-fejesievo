package hw0;


public class EvolvedSpaceAlien extends SpaceAlien implements ZapsWithSlime {


    String alienColorType;
    String homePlanet;
    double distanceFromEarth;


    public EvolvedSpaceAlien(String homePlanet, double distanceFromEarth){
        super(homePlanet, distanceFromEarth);
        alienColorType = "White";
    }


    public EvolvedSpaceAlien(String homePlanet, double distanceFromEarth, String alienColorType){
        super(homePlanet, distanceFromEarth);
        this.alienColorType = alienColorType;
    }


    public String getHomePlanet(){
        return this.homePlanet;
    }

    public double getDistanceFromEarth(){
        return this.distanceFromEarth;
    }



    @Override
    public void doGreeting() {
        System.out.println("I am a type " + alienColorType + " evolved lifeform form planet " + getHomePlanet() + ", "
                + getDistanceFromEarth() + " light years away.");
    }


    @Override
    public String doSlimeZap(int num){
        if (num == 1){
            return "blech";
        }
        else if (num > 1){
            return "BLECHHH";
        }
        else {
            return "Not enough slime..";
        }
    }


    @Override
    public String slimeWholeEarth(){
        return "Splurg!"; 
    }



    public static void main(String[] args){
        EvolvedSpaceAlien a1 = new EvolvedSpaceAlien("Texas", 10, "Blue");
        a1.doGreeting();
        a1.getDistanceFromEarth();
        System.out.println(a1.doSlimeZap(3));
        System.out.println(a1.slimeWholeEarth());
    }

}