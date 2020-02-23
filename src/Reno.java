public class Reno extends Car {
    private Integer nomer;

    public Reno(Integer nomer) {
        this.nomer = nomer;
    }

    public Integer getNomer() {
        return nomer;
    }

    public void setNomer(Integer nomer) {
        this.nomer = nomer;
    }

    @Override
    public Integer ktoTi(){
        return 4+getNomer();
    }
}
