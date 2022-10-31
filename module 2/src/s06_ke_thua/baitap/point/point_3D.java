package s06_ke_thua.baitap.point;

public class point_3D extends point_2D {
    private float z = 0.0f;

    public point_3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public point_3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x,y);
        this.z=z;
    }

    public float[] getXYZ(){
        float[] test = new float[3];
        test [0] = this.z;
        test [1] = this.z;
        test [2] = this.z;
        return test;
    }

    @Override
    public String toString() {
        return "point_3D{" +
                "z=" + z +
                '}';
    }
}
