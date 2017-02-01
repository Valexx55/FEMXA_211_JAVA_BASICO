package edu.femxa.val.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class HTTPMain {
	
	 public static String getJSON(String urlToRead) throws Exception {
	      StringBuilder result = new StringBuilder();
	      URL url = new URL(urlToRead);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      return result.toString();
	   }

	   public static void main(String[] args) throws Exception
	   {
	     String joson = getJSON("http://elrecadero-ebtm.rhcloud.com/ObtenerListaRecados");
	     Gson gson = new Gson();
	     List<Recado> l = gson.fromJson(joson, new TypeToken<List<Recado>>(){}.getType());
	     Recado r = l.get(1);
	     System.out.println(r.toString());
	   }
	   

}
