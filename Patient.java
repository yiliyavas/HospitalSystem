
class Patient extends Person {
	private int persID;
	private Date birthDate;
	private Doctor nameDR;
	private Date dateAdm;
	private Date dateDis;
	
	public void setPersID(int i) { persID = i; }
	public int getPersID() { return persID; }
	public void setBDay(Date d) { birthDate = d; }
	public Date getBDay() { return birthDate; }
	public void setDr(Doctor name) { nameDR = name; }
	public Doctor getDr() { return nameDR; }
	public void setAdm(Date d) { dateAdm = d; }
	public Date getAdm() { return dateAdm; }
	public void setDis(Date d) { dateDis = d; }
	public Date getDis() { return dateDis; }
	
	public Patient(String f, String l, int id, Date bD, Doctor dr, Date aD, Date dD) {
		super(f, l);
		persID = id;
		birthDate = bD;
		nameDR = dr;
		dateAdm = aD;
		dateDis = dD;
	}
	
	public String toString() {
		return "\nName: " + super.toString() + "\nID: " + persID +
				"\nAttending Physician: " + nameDR + 
				"\nAdmit Date: " + dateAdm +
				"\nDischarge Date: " + dateDis;
	}
}
