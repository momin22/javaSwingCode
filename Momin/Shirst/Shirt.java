
package comm.example;


public class Shirt {
    private int ShirtID;
    private  double  ShirtPrice;
    private  Color ShirtColor;
    private Size ShirtSize;

    public void  Shirt(int ShirtID, double ShirtPrice, Color ShirtColor, Size ShirtSize) {
        this.ShirtID = ShirtID;
        this.ShirtPrice = ShirtPrice;
        this.ShirtColor = ShirtColor;
        this.ShirtSize = ShirtSize;
    }

    @Override
    public String toString() {
        return "Shirt{" + "ShirtID=" + ShirtID + ", ShirtPrice=" + ShirtPrice + ", ShirtColor=" + ShirtColor + ", ShirtSize=" + ShirtSize + '}';
    }
    
    
    
}
