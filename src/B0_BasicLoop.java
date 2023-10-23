public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.trailWidth = 10;
        plane.teleport(71, 1);


        for (int a = 10; a > 0; a--) { // a is controlling x values
            for (int z = 10; z > 0; z--) {//y is controlling y values

                plane.setColor(a*10, a*z, 255/z);
                // plane.startingAngle(360);
                plane.teleport(a * 60, z * 60);// tells me what is x and y
                plane.square(50);


                //plane.move(50);
            }
        }
    }
}
// plane.setColor(r=10+x*10)
// plane.teleport (x;335,y;x+110)