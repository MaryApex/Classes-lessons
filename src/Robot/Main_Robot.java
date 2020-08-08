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

       Object[] Robot = {robot1,jamieOliver,vladYama,lavazza};
       for (int i = 0; i < Robot.length; i++){
           System.out.println(Robot[i]); // чому тут повертає значення класів а не обєктів?
       }


    }
}
