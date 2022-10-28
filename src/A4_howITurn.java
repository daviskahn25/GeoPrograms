

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.pausetime = 1;
        plane.isTrail = true;
        plane.trailWidth = 7;
        plane.startingAngle(120);
        plane.setColor(200, 0, 0);
        plane.move(150);
        plane.turn(120);
        plane.setColor(0, 0, 200);
        plane.move(150);
        plane.setColor(255,100,255);
        plane.turn(120);
        plane.move(150);

    }


}
