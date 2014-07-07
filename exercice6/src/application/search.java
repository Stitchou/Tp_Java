package application;

public class search implements filtre {
    
    private String prefixe;
    
    public search(String prefixe){
        this.prefixe = prefixe;
    }
    
	public boolean valide(fichier f) {
        
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

	public void Recherche(String prefixe) {
		// TODO Auto-generated method stub
		
	}
}
