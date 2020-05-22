import java.io.Serializable;

/* Trida reprezentuje pokemona, jedna se transfer object.
 * 
 * @author mandik@spsejecna.cz
 *
 */
public class Pokemon implements Comparable<Pokemon>, Serializable {

    /* Jmeno pokemona
     */
    public String jmeno;

    /* Druh pokemona
     */
    public String druh;

    /* Konstruktor pro rychle vytvareni 
     * 
     * @param jmeno Jmeno pokemona
     * @param druh Druh pokemona
     */
    public Pokemon(String jmeno, String druh) {
        this.jmeno = jmeno;
        this.druh = druh;
    }

    /**
     * Komparator umozni porovnat dva pokemony jednoduse podle jmena
     */
    @Override
    public int compareTo(Pokemon other) {
        return this.jmeno.compareTo(other.jmeno);
    }

}