package edu.ncsu.monopoly;

public abstract class Cell implements IOwner {
	private String name;
	protected Player Newowner;
	private boolean available = true;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Player getOwner() {
		return Newowner;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	@Override
	public abstract void playAction();

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setOwner(Player owner) {
		this.Newowner = owner;
	}
    
    public String toString() {
        return name;
    }
}
