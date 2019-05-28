package hello;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting extends ResourceSupport {

	private final String output;
	
	@JsonCreator
	public Greeting(@JsonProperty("output") String output) {
		this.output = output;
	}

	public String getOutput() {
		return output;
	}
	
}
