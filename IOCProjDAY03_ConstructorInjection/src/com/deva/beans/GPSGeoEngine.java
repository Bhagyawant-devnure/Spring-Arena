package com.deva.beans;

import java.util.Arrays;
import java.util.List;

class GPSGeoEngine implements IGeoEngine{
	public List<String> direction(String source,String destination,String travelMode)
	{
		return Arrays.asList("33.45,39.6","29.5,23.7",source,destination,travelMode);
		}
	
}

