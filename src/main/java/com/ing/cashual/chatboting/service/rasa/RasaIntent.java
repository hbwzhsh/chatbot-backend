package com.ing.cashual.chatboting.service.rasa;

public class RasaIntent {

	private String name;
	private Double confidence;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getConfidence() {
		return confidence;
	}

	public void setConfidence(Double confidence) {
		this.confidence = confidence;
	}
}
