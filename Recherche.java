/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package explorateurfichier;
/**
 *
 * @author Dreux
 */
public class Recherche implements Filtre {
    
    private String prefixe;
    
    public Recherche(String prefixe){
        this.prefixe = prefixe;
    }
    
    @Override
    public boolean valide(Fichier f) {
        
        boolean res = false;
        try{
            for(int i = 0; i <  prefixe.length(); i++){
                if(f.getNom().charAt(i) ==  prefixe.charAt(i)){
                    res = true;
                }
                else{
                    res = false;
                }
            }
        }
        catch(Exception e){
            res = false;
        }
        finally{
            return res;
        }
        
    }
    
}
