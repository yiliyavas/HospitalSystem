class Bill extends Person {
	private int ID;
	private double pharmCharge;
	private double doctFee;
	private double roomCharge;
	
	public void setID(int i) { ID = i; }
	public int getID() { return ID; }
	public void setPharm(double p) { pharmCharge = p; }
	public double getPharm() { return pharmCharge; }
	public void setFee(double d) { doctFee = d; }
	public double getFee() { return doctFee; }
	public void setRoom(double n) { roomCharge = n; }
	public double getRoom() { return roomCharge; }
	public Bill (String f, String l, int i, double p, double d, double n) {
		super(f, l);
		setID(i);
		setPharm(p);
		setFee(d);
		setRoom(n);
	}
	
	@Override
	public String toString() {
		return "\nPharmacy charges: $" + pharmCharge +
				"\nRoom Charges:     $" + roomCharge + 
				"\nDoctor's Fees:    $" + doctFee + 
				"\n_______________________________\n" +
				"\nTotal:            $" + (pharmCharge + roomCharge + doctFee);
	}
}