
abstract class PointD {
    int x;
    int y;
    
    PointD (int _x, int _y){
        x = _x;
        y = _y;
    }
    
    abstract int distanceTo0();
    boolean closerTo0(PointD p){
        return distanceTo0() <= p.distanceTo0();
    }
}

class CartesianPt extends PointD {
    CartesianPt(int _x, int _y){
        super(_x, _y);
    }
    int distanceTo0(){
        return (int)Math.sqrt(x * x + y * y);
    }
}

class ManhattanPt extends PointD {
    ManhattanPt (int _x, int _y) {
        super(_x, _y);
    }
    int distanceTo0(){
        return (x + y);
    }
}
   
    