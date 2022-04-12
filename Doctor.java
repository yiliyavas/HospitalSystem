class Doctor extends Person {
	private String specialty;
	
	public void setSpec(String s) { specialty = s; }
	public String getSpec() { return specialty; }
	public Doctor (String f, String l, String s) {
		super(f, l);
		setSpec(s);
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + specialty;
 	}
}
