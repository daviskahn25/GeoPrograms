public class Soccer_field extends World {
    public void go() {
        plane.isTrail = true;

        PickRandom();

    }







        //for (int x = 0; x < 200; x = x + 5) {
            //plane.teleport(plane.random(10,500),plane.random(10,500));
            //plane.setColor(plane.random(10,255), plane.random(10,255), plane.random(10,255));
            //bigsquare(100);
            //System.out.println("x= " + x);


        //plane.teleport(plane.random(100,600),150);
        //bigsquare(100);
        //plane.teleport(plane.random(100,600),150);
        //bigsquare(100);

    public void book(){
        plane.startingAngle(270);
        plane.move(200);
        plane.startingAngle(320);
        plane.move(30);
        plane.startingAngle(0);
        plane.move(100);
        plane.startingAngle(90);
        plane.move(170);
        plane.startingAngle(270);
        plane.move(170);
        plane.startingAngle(0);
        plane.move(100);
        plane.startingAngle(40);
        plane.move(30);
        plane.startingAngle(90);
        plane.move(200);
        plane.startingAngle(200);
        plane.move(130);
        plane.startingAngle(160);
        plane.move(130);}

    public void flag(){
        square(50);
        rectangle(100);


    }

    public void rectangle(int distance){
        plane.move(distance);
        plane.turn(90);
        plane.move(distance*1.5);
        plane.turn(90);
        plane.move(distance);
        plane.turn(90);
        plane.move(distance*1.5);


    }

    public void D(int length){
        plane.move(length*20);
        plane.turn(110);
        plane.move(80);
        plane.turn(70);
        plane.move(120);
        plane.turn(70);
        plane.move(80);}

    public void triangle(){
        //plane.startingAngle(120);
        plane.move(150);
        plane.turn(120);
        plane.move(150);
        plane.turn(120);
        plane.move(150);
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
        square(150);
        plane.turn(150);
        plane.move(150);
        plane.turn(240);
        plane.move(150);
    }

    public void bigsquare(int distance){
        plane.move(distance);
        plane.turn(90);
        plane.move(distance);
        plane.turn(90);
        plane.move(distance);
        plane.turn(90);
        plane.move(distance);
        plane.turn(90);
    }

    public void PickRandom () {
        int r = plane.random(1, 6);
        if (r == 1) {
            plane.pausetime = 2;
            plane.trailWidth = 5;
            plane.setColor(100, 100, 100);
            plane.startingAngle(plane.random(0, 360));
            flag();
        }

        if (r == 2) {
            plane.trailWidth = 5;
            plane.setColor(100, 100, 100);
            plane.pausetime = plane.random(1, 100);
            triangle();
        }

        if (r == 3) {
            plane.pausetime = 2;
            plane.setColor(100, 100, 100);
            plane.trailWidth = plane.random(1, 100);
            book();
        }

        if (r == 4) {
            plane.pausetime = 2;
            plane.trailWidth = 5;
            for (int x = 0; x < 3; x = x + 1) {
                System.out.println(x);
                square(100);
            }
        }

        if (r == 5) {
            plane.setColor(plane.random(1, 255), plane.random(1, 255), plane.random(1, 255));
            plane.trailWidth = 5;
            plane.pausetime = 2;
            house();
        }
    }








}
