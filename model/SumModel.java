package model;

public class SumModel extends CalcModel {

    @Override
    public double resultReal() {
        return realX+realY;
    }

    @Override
    public double resultImage() {
        return imageX+imageY;
    }

    @Override
    public void setRealX(double value) {
        super.realX = value;
    }

    @Override
    public void setImageX(double value) {
        super.imageX = value;
    }

    @Override
    public void setRealY(double value) {
        super.realY = value;
    }

    @Override
    public void setImageY(double value) {
        super.imageY = value;
    }    
}