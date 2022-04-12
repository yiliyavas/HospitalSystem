class Date {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int d) { 
		if(d > 0 && d <= 31)
			day = d; 
		else {
			throw new IllegalArgumentException("month out of range 1-31");
		}
	}
	public int getDay() { return day; }
	public void setMonth(int m) { 
		if(m <= 12)
			month = m; 
		
	}
	public int getMonth() { return month; }
	public void setYear (int y) { year = y; }
	public int getYear () { return year; }
	
	public Date(int d, int m, int y){
		setDay(d);
		setMonth(m);
		setYear(y);
	}
	
	public String toString() {
		return day + "-" + month + "-" + year;
	}
}