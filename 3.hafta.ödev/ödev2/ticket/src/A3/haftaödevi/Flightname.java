package A3.haftaödevi;

public class Flightname {

    private HashSet fullSeat = new HashSet<>();
    private HashSet emptySeat = new HashSet<>();
    public HashSet getFullSeat() {
        return fullSeat;
    }
    public void setFullSeat(String fullSeat) {
        this.fullSeat.add(fullSeat);
    }
    public HashSet getEmptySeat() {
        return emptySeat;
    }
    public void setEmptySeat(HashSet emptySeat) {
        this.emptySeat = emptySeat;
    }
}
