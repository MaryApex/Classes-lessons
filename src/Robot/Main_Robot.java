package Robot;

public class Main_Robot {
    public static void main(String[] args) {
       Robot robot1 = new Robot();
       robot1.work();

       RobotCooker jamieOliver = new RobotCooker();
       jamieOliver.work();

       RobotDancer vladYama = new RobotDancer();
       vladYama.work();

       CoffeeRobot lavazza = new CoffeeRobot();
       lavazza.work();

       Robot[] robotMass = {robot1,jamieOliver,vladYama,lavazza};
       for (int i = 0; i < robotMass.length; i++){
           robotMass[i].work();
       }


    }
}
