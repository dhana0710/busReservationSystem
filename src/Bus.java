public class Bus {



    private int busId;

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    private boolean ac;
    private int seat;


    public Bus(int busId, boolean ac, int seat) {
        this.busId = busId;
        this.ac = ac;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busId=" + busId +
                ", ac=" + ac +
                ", seat=" + seat +
                '}';
    }
}
