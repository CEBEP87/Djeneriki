import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hellow {
    public static void main(String args[]){
        Oka oka1 = new Oka(123);
        Oka oka2 = new Oka(456);
        Oka oka3 = new Oka(789);

        List<Oka> ca= new ArrayList();
        ca.add(oka1);
        ca.add(oka2);
        ca.add(oka3);
        ca = ca.stream().filter(q->(q.ktoTi().toString()).equals("459")).collect(Collectors.toList());
        System.out.println(ca+ "!!!!!!!!!");
        xui(ca);

        Reno reno1 = new Reno(123);
        Reno reno2 = new Reno(456);
        Reno reno3 = new Reno(789);

        //master commit



    }
    public static  <T > T xui(List<? extends Car> cars){
        cars.forEach(s->System.out.println(s.ktoTi()));


        return null;
    }

}
