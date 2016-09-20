package com.marceljm.constant;

public enum InputFileEnum {
	BALAO("Balão da Informática"), 
	CINTYLAR("Cintylar"), 
	CISSA("Cissa Magazine"), 
	EFACIL("Efacil"), 
	ELETROSHOPPING("Eletro Shopping"), 
	FASTSHOP("Fastshop"), 
	HP("HP"), 
	INSINUANTE("Insinuante"), 
	KANGOOLU("Kangoolu"), 
	LENOVO("Lenovo"), 
	MEGAMAMUTE("Mega Mamute"), 
	MICROSOFT("Microsoft"), 
	PLAZA("MerchandisingPlaza"),
	RICARDOELETRO("Ricardo Eletro"),
	SALFER("Salfer"),
	WALLMART("Wallmart");

	private String value;

	private InputFileEnum(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
};
