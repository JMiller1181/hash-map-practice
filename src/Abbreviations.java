import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> abbreviations;
    public Abbreviations(){
         this.abbreviations = new HashMap<>();
    }
    public static void main(String[] args){
        Abbreviations abbreviations1 = new Abbreviations();
        abbreviations1.addAbbreviation("sis", "Sister");
        System.out.println(abbreviations1.findExplanationFor("sis"));
        System.out.println(abbreviations1.hasAbbreviation("bro"));
        System.out.println(abbreviations1.findExplanationFor("bro"));
    }
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviations.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        return abbreviations.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation){
        return abbreviations.get(abbreviation);
    }
}
