package com.qa.pizzeria;

public class Pizza {
	
	private long id;
	private String type;
	private int slices;
	private boolean stuffedCrust;
	
	// Our constructors, we need a constructor for posting WITHOUT id
	public Pizza(String type, int slices, boolean stuffedCrust) {
		super();
		this.type = type;
		this.slices = slices;
		this.stuffedCrust = stuffedCrust;
	}
	
	// A constructor for reading WITH id
	public Pizza(long id, String type, int slices, boolean stuffedCrust) {
		super();
		this.id = id;
		this.type = type;
		this.slices = slices;
		this.stuffedCrust = stuffedCrust;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public boolean isStuffedCrust() {
		return stuffedCrust;
	}

	public void setStuffedCrust(boolean stuffedCrust) {
		this.stuffedCrust = stuffedCrust;
	}

	
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", type=" + type + ", slices=" + slices + ", stuffedCrust=" + stuffedCrust + "]";
	}
}
