package core;

import java.net.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data // i.a. generate getter/setter
@JsonIgnoreProperties(ignoreUnknown = true) // ignore JSON properties not used by this class
public class Restaurant {
	@JsonIgnore
	private String api;

	private String name;
	private String startTime; //date gets too ugly with jackson, so we use string
	private String endTime;
	private String description;
	private URL image;
	private String venue; //the name of the venue
	private String street;
	private float latitude;
	private float longitude;
}