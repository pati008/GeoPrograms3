public class ProjectOne extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("hiiii ");
        plane.teleport(0, 0);
        plane.showBackGround();

        // filter : loop & nested loop
        for (int row = 6; row < 750; row = row + 1) {
            for (int col = 3; col < 998; col++) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 135 && green < 227 && blue < 254) {
                    plane.setPixelColor(12, 48, 145);
                }
            }
        }
        // end of filter
        plane.isTrail = true;
        plane.teleport(863, 275);
        moon();
        plane.teleport(141, 224);
        plane.setColor(255, 255, 255);
        for(int x=0;x<15;x=x+1) {
            plane.teleport((int)(Math.random()*800),(int)(Math.random()*302)+100);
            star();
        }


    }


    public void moon() {
        plane.trailWidth = 50;
        plane.setColor(255, 255, 51);
        plane.startingAngle(300);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
    }

    public void star() {
        plane.trailWidth=20;
        plane.move(1);
    }
}