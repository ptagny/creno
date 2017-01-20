package io.creno.api.model;

public enum MeterPeriodIncrement{
	ONEMINUTE(1), FIVEMINUTES(5), TENMINUTES(10), FIFTEENMINUTES(15), THIRTYMINUTES(30), ONEHOUR(60), TWOHOURS(120);

	private int value;

	MeterPeriodIncrement(int value){
		this.value = value;
	}

	public int getValue() {
        return value;
    }
}