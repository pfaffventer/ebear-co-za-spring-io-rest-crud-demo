package zzz.java.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CreateShadowEntity {
	
	
	public static final String prefix = "src/main/java/ebear/co/za/spring/io/rest/crud/demo/";
	
	private List<String> entities = new ArrayList<String>();
	
	public CreateShadowEntity() throws Exception {
		entities.add(prefix + "supplier/model/Supplier.java");

		BufferedReader r = new BufferedReader(new FileReader(new File(entities.get(0))));
		String line;
		while ((line=r.readLine())!=null) {

			System.out.println(":) " + line);

		}
		r.close();


	}

	public static void main(String[] args) {
		try {
			new CreateShadowEntity();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

}
