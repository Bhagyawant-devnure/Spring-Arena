package com.deva.beans;

import java.util.List;

public class MapRender {
 private IGeoEngine geoEngine;

public MapRender() {
	
}



public MapRender(IGeoEngine geoEngine) {
	
	this.geoEngine = geoEngine;
}
 
public void render(String source,String destination,String travelMode) {
	List<String> coordinate=null;
	coordinate= geoEngine.direction(source,destination,travelMode);
System.out.println(coordinate);
}
	
	
}
