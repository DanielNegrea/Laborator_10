public class Laborator_10
{
    private Circle cercGalben;
    private Triangle triunghiAlbastru;
    private Square patratRosu;
    /**
     * Constructor for objects of class Laborator_10
     */
    public Laborator_10()
    {
        // initialise instance variables
        cercGalben = new Circle();
        triunghiAlbastru = new Triangle();
        patratRosu = new Square();
        patratRosu.changeColor("red");
        patratRosu.changeSize(100);        
        patratRosu.moveDown();
        patratRosu.moveDown();
        patratRosu.moveDown();
        patratRosu.moveRight();
        patratRosu.makeVisible();
        triunghiAlbastru.changeColor("blue");
        triunghiAlbastru.changeSize(85, 130);
        triunghiAlbastru.moveHorizontal(80);
        triunghiAlbastru.moveDown();
        triunghiAlbastru.makeVisible();        
        cercGalben.changeColor("yellow");
        cercGalben.changeSize(70);
        cercGalben.moveHorizontal(160);
        cercGalben.moveUp();
        cercGalben.moveUp();
        cercGalben.moveUp();
        cercGalben.moveRight();
        cercGalben.makeVisible();
    }

   
    public static void main(String args[])
    {
        Laborator_10 l = new Laborator_10();
    }
}
