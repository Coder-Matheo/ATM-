package rob.myappcompany.atmtraining;

public class transationStruc {

    private int pay;
    private String message;

    public transationStruc(int pay, String message) {
        this.pay = pay;
        this.message = message;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPay() {
        return pay;
    }

    public String getMessage() {
        return message;
    }



}
