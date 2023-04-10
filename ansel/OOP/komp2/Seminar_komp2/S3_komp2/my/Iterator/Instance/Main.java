import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
fisherman fishermn = new fisherman("Piter", 23, "grid");
Iterator<String> compnnts = fishermn;

while (compnnts.hasNext()){
System.out.println(fishermn.next());
}
}
}
