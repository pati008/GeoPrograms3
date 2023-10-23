

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.pausetime=10;

        plane.setColor(52, 120, 70);


        plane.teleport(192,196);
        house();
        plane.teleport(745, 199);
        house();

        plane.teleport(757, 613);
        house();

        plane.teleport(206,613);
        house();





    }
public void tri(){
    plane.move(100);
    plane.turn(120);
    plane.move(100);
    plane.turn(120);
    plane.move(100);






}
public void square(){
        plane.startingAngle(90);
    plane.move(100);
    plane.turn(90);
    plane.move(100);
    plane.turn(90);
    plane.move(100);
    plane.turn(90);
    plane.move(100);

}
public void house(){
    square();
    plane.turn(180);
    tri();

}
}
