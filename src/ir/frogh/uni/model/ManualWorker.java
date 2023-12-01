package ir.frogh.uni.model;

public class ManualWorker extends  Person implements Pay implements Switching  {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public void solid() {

    }

    @Override
    public void eydi() {

    }

    @Override
    public void padash() {

    }
}
