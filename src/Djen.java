public  class  Djen <T> {
    T t;

    public T getT() {
        return t;
    }

    public Djen(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Djen{" +
                "t=" + t +
                '}';
    }
}
