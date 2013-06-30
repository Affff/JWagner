package ru.obolensk.afff.wagner.jwac.il;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ValuableElement extends Element {
	
	private final String value;

	public ValuableElement(String name, String value) {
		super(name);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public int getIntValue() {
		return Integer.valueOf(value);
	}
	
	public long getLongValue() {
		return Long.valueOf(value);
	}
	
	public float getFloatValue() {
		return Float.valueOf(value);
	}
	
	public double getDoubleValue() {
		return Double.valueOf(value);
	}
	
	public BigInteger getBigIntValue() {
		return new BigInteger(value);
	}
	
	public BigDecimal getBigDecimalValue() {
		return new BigDecimal(value);
	}
	
	@Override
	public String toString() {
		return value;
	}

}
