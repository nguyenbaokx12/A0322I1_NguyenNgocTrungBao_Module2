package ss6_inheritance.baitap.LopPoint2DVaLopPoint3D;

public class LopPoint3D extends LopPoint2D {
    private float z = 0.0f;

    public LopPoint3D() {
        super();
    }

    public LopPoint3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setXYZ(x,y,z);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = z;
        return array;
    }
    public String toString(){
        return "("+getX()+","+getY()+","+z+")";
    }
}
