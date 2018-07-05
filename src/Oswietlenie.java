public class Oswietlenie {
    public static void main(String[] args) {
        Lampa lampa1 = new Lampa ("nocna", 30, "czerwony");
        lampa1.rodzaj = "nocna";
        lampa1.moc = 30;
        lampa1.kolor = "czerwony";

        System.out.println("LAMPAl:");
        System.out.println(lampa1.rodzaj);
        System.out.println(lampa1.moc + "W");
        System.out.println(lampa1.kolor);
        System.out.println();

        Lampa lampa2 = new Lampa ("kinkiet", 15, "zimny");
        lampa2.rodzaj = "kinkiet";
        lampa2.kolor = "zimny";
        lampa2.moc = 15;
        System.out.println("Lampa2:");
        System.out.println(lampa2.rodzaj);
        System.out.println(lampa2.moc + "W");
        System.out.println(lampa2.kolor);
    }

}
