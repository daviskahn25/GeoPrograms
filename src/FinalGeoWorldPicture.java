public class FinalGeoWorldPicture extends World {

    public int red;
    public int blue;
    public int green;

    public void go(){

        plane.showBackGround();
        plane.teleport(0,0);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 0;
        houserow();
        cars();
        skyfilter();

    }

    public void square(int distance){
        plane.move(distance);
        plane.turn(90);
        plane.move(distance);
        plane.turn(90);
        plane.move(distance);
        plane.turn(90);
        plane.move(distance);
        plane.turn(90);
    }

    public void house (){
        square(50);
        plane.turn(150);
        plane.move(50);
        plane.turn(240);
        plane.move(50);
        plane.startingAngle(180);
        plane.isTrail = false;
        plane.move(50);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 55;
        plane.move(5);
    }

    public void houserow(){
        for (int x = 0; x < 7; x = x + 1) {
            plane.startingAngle(90);
            plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
            plane.teleport(plane.random(10, 600), plane.random(170, 230));
            house();
            plane.trailWidth = 5;
        }

    }

    public void cars(){
        car1();
        car2();
    }

    public void car1(){
        plane.setColor(0,0,0);
        plane.teleport(450,310);
        square(20);
        plane.teleport(400,310);
        square(20);
        plane.teleport(410,270);
        square(50);
        plane.turn(90);
        plane.trailWidth=55;
        plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
        plane.move(0);
    }

    public void car2(){
        plane.trailWidth = 5;
        plane.setColor(0,0,0);
        plane.teleport(100,300);
        square(20);
        plane.teleport(155,300);
        square(20);
        plane.teleport(110,285);
        square(50);
        plane.teleport(110,235);
        plane.trailWidth=55;
        plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
        plane.move(0);
    }

    public void skyfilter(){
        if (red>160 && green>220 && blue>235);
        plane.setPixelColor(100,100,100);
    }

    public void filter(){
        for (int row = 500; row < 680; row = row + 1) {
            for (int col = 50; col < 430; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (blue < 100 && red > 200 && green > 190) {
                    plane.setPixelColor(255, 190, 200);
                }
            }
        }
    }

    public void rectangle(int distance){
        plane.move(distance);
        plane.turn(90);
        plane.move(distance*1.5);
        plane.turn(90);
        plane.move(distance);
        plane.turn(90);
        plane.move(distance*1.5);
        plane.turn(90);
        plane.trailWidth=55;
        plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
        plane.move(0);


    }






}
