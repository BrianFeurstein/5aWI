public class Tank {
    private int currentFillingAmount;
    private int maxFillingAmount;


    public Tank(int currentFillingAmount, int maxFillingAmount) {
        this.currentFillingAmount = currentFillingAmount;
        this.maxFillingAmount = maxFillingAmount;
    }

    public int getCurrentFillingAmount() {
        return currentFillingAmount;
    }

    public void setCurrentFillingAmount(int currentFillingAmount) {
        this.currentFillingAmount = currentFillingAmount;
    }

    public int getMaxFillingAmount() {
        return maxFillingAmount;
    }

    public void setMaxFillingAmount(int maxFillingAmount) {
        this.maxFillingAmount = maxFillingAmount;
    }
}
