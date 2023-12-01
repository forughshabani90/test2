package ir.frogh.uni.model;

public class Chairman extends Person implements Services{
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public  void Reservation() {

    }
}
