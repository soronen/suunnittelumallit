package Singleton;

public class Main {

    public static void main(String[] args) {

        /**
         * Singleton luokkalla voidaan tallentaa vaikka kirjautunut käyttäjä.
         * Tällöin käyttäjä voidaan kutsua missä tahansa luokassa, jossa on käytössä singleton,
         * ja se on kaikkialla sama.
         * Sitä ei myöskään tarvitse välittää parametrina metodeille.
         */
        User user = User.getInstance();
        System.out.println(user.getUsername());
        user.setUsername("Eetu");
        System.out.println(user.getUsername());


        /**
         * SaveInformation luokalle ei tarvitse välittää käyttäjää.
         * Tämä välttää tilanteita, joissa tieto tallennetaan muulle kuin sisäänkirjautuneelle käyttäjälle.
         * Tieto voisi olla pelisovelluksessa vaikka pelaajan pisteet.
         */
        SaveInformation si = new SaveInformation();
        System.out.println(si.saveInfo("Tämä on tallennettu tieto"));
        System.out.println(user.getInformation());


    }
}
