public class Oka extends Car {
    private Integer nomer;

    public Oka(Integer nomer) {
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
        return 3+getNomer();
    }
}
