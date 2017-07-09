package new27_06;

/**
 * Created by Вождь on 27.06.2017.
 */
public class Continents {
    public enum Continent{
        Asia, Africa, America, Europe, Australia, Antarctica
    }

    public Continent FindContinent(String country){
        Continent continent = null;
        switch (country){
            case "Abkhazia": case "Azerbaijan": continent = Continent.Asia; break;
            case "Algeria": case "Egypt": continent = Continent.Africa; break;
            case "Canada": case "USA": continent = Continent.America; break;
            case "Ukraine": case "Poland": continent = Continent.Europe; break;
            case "Australia": case "Norfolk": continent = Continent.Australia; break;
            case "Bouvet Island":case "Hurd Island": continent = Continent.Antarctica; break;
            default:
                System.out.println("No this country");
                System.exit(0);
        }

        return continent;
    }

    public static void main(String[] args) {
        Continents continents = new Continents();
        System.out.println(continents.FindContinent("Ukraine"));

    }

}
