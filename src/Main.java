import java.util.ArrayList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("да");
        A.add("суши");
        A.add("яблоки");
        A.add("животное");
        A.add("жемчужница");
        System.out.println(A);
        ArrayList<String> B = new ArrayList<>();
        B.add("нет");
        B.add("листы");
        B.add("Ежевика");
        B.add("сохранять");
        B.add("воображение");
        ArrayList<String> C = new ArrayList<>();
        ListIterator<String> listIter = A.listIterator();
        ListIterator<String> listter = B.listIterator();
        while (listIter.hasNext()){
            C.add(listIter.next());
            C.add(listter.next());
        }
        System.out.println(C);
        for (String ret : C) {
            System.out.println(ret);
        }
    }
}
