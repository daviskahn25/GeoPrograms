public class MIckeyFilter extends World{
    public int red;
    public int blue;
    public int green;


   public void go(){
       System.out.println("This will be printed to the  window. ");
       plane.teleport(0, 0);
       plane.showBackGround();

       eyefilter();
   }
    public void filter() {
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


    public void eyefilter(){
          for (int row = 350; row >235; row--) {
              System.out.println(row);
              for (int col = 250; col < 310; col++) {
                  plane.teleport(col,row);
                  red = plane.howMuchRed();
                  green = plane.howMuchGreen();
                  blue = plane.howMuchBlue();
                  plane.setPixelColor(100,100,100);
              }
          }
    }









}
