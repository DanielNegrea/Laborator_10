public class Laborator_10
{
    private Circle cercGalben;
    private Triangle triunghiAlbastru;
    private Square patratRosu;
    private Square patratAlb1;
    private Square patratAlb2;
    private Square patratNegru;
    /**
     * Constructor for objects of class Laborator_10
     */
    public Laborator_10()
    {
        // initialise instance variables
        cercGalben = new Circle();
        triunghiAlbastru = new Triangle();
        patratRosu = new Square();
        patratAlb1 = new Square();
        patratAlb2 = new Square();
        patratNegru = new Square();
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
        patratAlb1.changeColor("white");
        patratAlb1.moveVertical(80);        
        patratAlb1.moveHorizontal(30);
        patratAlb1.makeVisible();
        patratAlb2.changeColor("white");
        patratAlb2.moveHorizontal(80);
        patratAlb2.moveVertical(80);
        patratAlb2.makeVisible();
        patratNegru.changeColor("black");
        patratNegru.changeSize(22);
        patratNegru.moveVertical(130);
        patratNegru.moveHorizontal(60);
        patratNegru.makeVisible();
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
