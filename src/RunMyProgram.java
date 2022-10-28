

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new FinalGeoWorldPicture());
        run.planeIcon = "plane.png";
        run.pictureFileName="hillside.jpg";
        run.HEIGHT=360;
        run.WIDTH=617;
        run.Refresh();

        //new Thread(run).start();
    }
}
