public class Oswietlenie {
    public static void main(String[] args) {
        Lampa lampa1 = new Lampa ("nocna", 30, "czerwony");

        System.out.println("LAMPAl:");
        System.out.println(lampa1.rodzaj);
        System.out.println(lampa1.moc + "W");
        System.out.println(lampa1.kolor);
        System.out.println();

        Lampa lampa2 = new Lampa ("kinkiet", 15, "zimny");

        System.out.println("Lampa2:");
        System.out.println(lampa2.rodzaj);
        System.out.println(lampa2.moc + "W");
        System.out.println(lampa2.kolor);
    }

}
