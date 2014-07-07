package JDBCCours;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;




public class Application {

	public static void main(String[] args) {
		BDDConnect jdbc = new BDDConnect("localhost:3306/cours","root","");
		String[] champs = {"code","nom","prenom","moy"};
		try {
			jdbc.select("eleve", champs, "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResultSet rs = jdbc.getRs();
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("------------- MetaData -------------");
			System.out.println("Nombre de colonnes : "+rsmd.getColumnCount());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int i =0;
		try {
			System.out.println("------------  Contenu  -------------");
			while(rs.next())
			{
				System.out.println("Ligne "+i+++" - "+rs.getString("prenom")+" "+rs.getString("nom")+" -- Moyenne : "+rs.getString("moy"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
