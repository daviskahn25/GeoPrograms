

public class A3_changeMyColor extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 2;
        plane.startingAngle(60);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(100, 0, 0);
        plane.move(150);

    }


}
