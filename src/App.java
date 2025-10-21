public class App {
    public static void main(String[] args) throws Exception {
        String tekija = "Pyry";
        double luku1 = 2;
        double luku2 = 4;
        double tulo = luku1 * luku2;
        double erotus = luku1 - luku2;
        double summa = luku1 + luku2;
        double jako = luku1 / luku2;

        System.out.println("Hei olen tulostin-ohjelma");
        System.out.println("Ohjelman tekijä: " + tekija);
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku1-muuttujan arvo on " + luku2);
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);
        System.out.println(luku1 + " + " + luku2 + " = " + summa);
        System.out.println(luku1 + " / " + luku2 + " = " + jako);
    }   
}
