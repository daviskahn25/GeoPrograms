public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.trailWidth = 10;
        squaregrid(100);
    }

    public void squarerow() {
            plane.turn(90);
        for (int x = 0; x < 5; x = x + 1) {
            System.out.println(x);
            plane.square(100);
            plane.move(100);

        }
        System.out.println("The Loop Is Over");
    }

    public void squaregrid(int size) {
        plane.teleport(0, 0);
        for (int x = 0; x < 1000 / size; x = x + 1) {
            for (int y = 0; y < 800 / size; y = y + 1) {
                plane.setColor(y*35,75,75);
                plane.teleport(x * size, y * size);
                plane.square(100);
            }

        }
    }

}