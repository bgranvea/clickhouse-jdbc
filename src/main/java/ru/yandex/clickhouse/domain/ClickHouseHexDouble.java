package ru.yandex.clickhouse.domain;

public class ClickHouseHexDouble extends Number {

	private double value_;

	public ClickHouseHexDouble(double value) {
		this.value_ = value;
	}
	
	@Override
	public double doubleValue() {
		return value_;
	}

	@Override
	public float floatValue() {
		return 0;
	}

	@Override
	public int intValue() {
		return 0;
	}

	@Override
	public long longValue() {
		return 0;
	}

}
