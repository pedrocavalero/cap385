package com.pedrocavalero.inpe.cap385.optionallab;

import java.util.Optional;

public class LoyaltyCard {
	private String cardNumber;
	private int points;

	public LoyaltyCard(String cardNumber, int points) {
		this.cardNumber = cardNumber;
		this.points = points;
	}

	public int addPoints(int pointToAdd) {
		return points += pointToAdd;
	}
	
	public Optional<Gift> getLastGift(){
		return Optional.empty();
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	
}