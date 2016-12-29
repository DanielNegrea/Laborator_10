public class Laborator_10
{
    private Circle cercGalben;
    private Triangle triunghiAlbastru;

    /**
     * Constructor for objects of class Laborator_10
     */
    public Laborator_10()
    {
        // initialise instance variables
        cercGalben = new Circle();
        triunghiAlbastru = new Triangle();
        cercGalben.changeColor("yellow");
        cercGalben.changeSize(100);
        cercGalben.moveHorizontal(90);
        cercGalben.moveLeft();
        cercGalben.makeVisible();
        triunghiAlbastru.changeColor("blue");
        triunghiAlbastru.changeSize(85, 130);
        triunghiAlbastru.moveHorizontal(90);
        triunghiAlbastru.makeVisible();
    }

   
    public static void main(String args[])
    {
        Laborator_10 l = new Laborator_10();
    }
}
