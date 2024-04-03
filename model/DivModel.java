package model;

public class DivModel extends CalcModel {

    @Override
    public double resultReal() {
        return (realX*realY + imageX*imageY)/(realY*realY + imageY*imageY);
    }

    @Override
    public double resultImage() {
        return (imageX*realY - realX*imageY)/(realY*realY + imageY*imageY);
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
