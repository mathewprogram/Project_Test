package misrc;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<String> nombres_al = new ArrayList<>();
        
        nombres_al.add("Luis");
        nombres_al.add("Miguel");
        
        for(String elementos: nombres_al){
            System.out.println(elementos);
        } 
    }
    
}
