
public class box {
    double width;
    double lenght;
    double depth;
    
    double volume() {
    	return width * lenght * depth;
    }
    //Create method dimension of the box
    void Setdimension(double width,double length,double depth) {
    	this.width = width;
    	this.lenght = length;
    	this.depth = depth;
    }
    // one by one
    /*void setWidth(double width) {
    	this.width = width;
    }
    void setLength(double lenght) {
    	this.lenght = lenght;
    }
    void setDepth(double depth) {
    	this.depth = depth;
    }*/
}
