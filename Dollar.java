class Dollar {
	int amount;
	Dollar(int amount) {
		this.amount= amount;
	}
	void times(int multiplier) {
      amount= amount * multiplier;
   }

	public boolean equals(Object object)  {
   Dollar dollar = (Dollar) object;
   return amount == dollar.amount;
	}
}