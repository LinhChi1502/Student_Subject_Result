public class Result {
    private double[] points;
    private double avg;
    private boolean status;

    public Result() {

    }

    public Result(double[] point) {
        this.points = point;
    }

    public double[] getPoints() {
        return points;
    }

    public void setPoints(double[] points) {
        this.points = points;
    }

    public double getAvg() {
        return this.avg;
    }

    public void setAvg() {
        double avg = 0.0d;
        if (this.getPoints().length == 4) {
            avg = this.getPoints()[0] * 0.1 + this.getPoints()[1] * 0.2 + this.getPoints()[2] * 0.3 + this.getPoints()[3] * 0.4;
        } else if (this.getPoints().length == 3) {
            avg = this.getPoints()[0] * 0.2 + this.getPoints()[1] * 0.3 + this.getPoints()[2] * 0.5;
        } else if (this.getPoints().length == 2) {
            avg = this.getPoints()[0] * 0.3 + this.getPoints()[1] * 0.7;
        }
        this.avg = avg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        if (this.avg >= 4) {
            this.status = true;
        } else {
            this.status = false;
        }
    }
    public String toString() {
        String str = "";
        for (Double point: points) {
            str += point+" ";
        }
        str += " average " + this.getAvg() + " ";
        if (this.status) {
            return str + " pass";
        } else {
            return str + "not pass";
        }
    }
}
