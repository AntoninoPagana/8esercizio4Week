import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        verificaElemento();
    }
    public static void verificaElemento(){
        Set<String> hashset1 = new HashSet<String>();
        hashset1.add("Uno");
        hashset1.add("Due");
        hashset1.add("Tre");

        String quattro = "quattro";
        hashset1.add(quattro);

        if(hashset1.contains(quattro)){
            System.out.println("L'HashSet contiene l'elemento inserito " + quattro);
        } else {
            System.out.println("L'elemento non e' stato inserito correttamente");
        }

        System.out.print("Elementi HashSet: ");
        for(String elemento : hashset1){
            System.out.printf(elemento + " ");
        }
    }
}
