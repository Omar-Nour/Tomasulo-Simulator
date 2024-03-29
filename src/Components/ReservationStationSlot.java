package Components;

public class ReservationStationSlot {
    private Instruction instruction;
    private String tag;
    private int timeLeft;
    private boolean busy;
    private Double vJ;
    private Double vK;
    private String qJ;
    private String qK;
    private Double result; //TODO: yeba long fee 7alet eno integer operation
    private boolean ready;
    private boolean finished;
    private boolean published;

    public ReservationStationSlot() {
        instruction = null;
        tag = null;
        timeLeft = 0;
        busy = false;
        vJ = null;
        vK = null;
        qJ = null;
        qK = null;
        result = null;
        ready = false;
        finished = false;
        published = false;
    }

    public ReservationStationSlot(String tag) {
        instruction = null;
        this.tag = tag;
        timeLeft = 0;
        busy = false;
        vJ = null;
        vK = null;
        qJ = null;
        qK = null;
        result = null;
        ready = false;
        finished = false;
        published = false;
    }

    public ReservationStationSlot(Instruction instruction, String tag, boolean busy, double vJ, double vK, String qJ, String qK, double result, boolean ready, boolean finished, boolean published) {
        this.instruction = instruction;
        this.tag = tag;
        this.timeLeft = instruction.getLatency();
        this.busy = busy;
        this.vJ = vJ;
        this.vK = vK;
        this.qJ = qJ;
        this.qK = qK;
        this.result = result;
        this.ready = ready;
        this.finished = finished;
        this.published = published;
    }

    public Instruction getInstruction() {
        return instruction;
    }

    public void setInstruction(Instruction instruction) {
        this.instruction = instruction;

    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public Double getvJ() {
        return vJ;
    }

    public void setvJ(Double vJ) {
        this.vJ = vJ;
    }

    public Double getvK() {
        return vK;
    }

    public void setvK(Double vK) {
        this.vK = vK;
    }

    public String getqJ() {
        return qJ;
    }

    public void setqJ(String qJ) {
        this.qJ = qJ;
    }

    public String getqK() {
        return qK;
    }

    public void setqK(String qK) {
        this.qK = qK;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public boolean isReady() {
        return ready;
    }

    public void updateReady() {
        this.ready = (qJ == null && qK == null); // I have Some Doubts About this line
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public void decrementTimeLeft() {
        timeLeft--;
    }

    public void setAll(String tag, boolean busy, Double vJ, Double vK, String qJ, String qK, boolean finished, boolean published, boolean ready) {
        this.tag = tag;
        this.timeLeft = instruction == null ? 0 : instruction.getLatency();
        this.busy = busy;
        this.vJ = vJ;
        this.vK = vK;
        this.qJ = qJ;
        this.qK = qK;
        this.ready = ready;
        this.finished = finished;
        this.published = published;
    }

    public void updateReservationStation(String tag) {

    }

    public void reset() {
        instruction = null;
        tag = null;
        timeLeft = 0;
        busy = false;
        vJ = null;
        vK = null;
        qJ = null;
        qK = null;
        result = null;
        ready = false;
        finished = false;
        published = false;
    }

    public String toString() {
        return "Instruction: " + instruction + " Tag: " + tag + " Time Left: " + timeLeft + " Busy: " + busy + " vJ: " + vJ + " vK: " + vK + " qJ: " + qJ + " qK: " + qK + " Result: " + result + " Ready: " + ready + " Finished: " + finished + " Published: " + published;
    }

    public String forGUI() {
        return  tag + "     \t" + timeLeft + "     \t" + busy + "  \t" + vJ + "   \t" + vK + "   \t" + qJ + "   \t" + qK + "     ";
    }


}
