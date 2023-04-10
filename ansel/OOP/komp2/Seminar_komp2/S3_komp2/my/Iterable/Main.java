public class Main {
    public static void main(String[] args) {
    Fisherman fm1 = new Fisherman();
        
    fm1.addSkelets(new Fisherman("Mihale", 20, "Settengs"))
       .addSkelets(new Fisherman("Mihae", 22, "Sttengs"));
    // fm1.addSkelets(new Fisherman("Mihale", 20, "Settengs"));

    for (Fisherman i : fm1) {
        System.out.println(i); 
    }
}
}

