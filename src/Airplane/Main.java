package Airplane;

public class Main {
    public static void main(String[] args) {
        Su_27 su_27Object = new Su_27(30,10,2000);
        su_27Object.startEngine();
        su_27Object.takeOff();
        su_27Object.goUp();
        su_27Object.goDown();
        su_27Object.goStraight();
        su_27Object.goBack();
        su_27Object.technoStells();
        su_27Object.nuclearHit();
        su_27Object.turboSpeed();
        su_27Object.landing();
    }
}
