 public class Date{
	int day,month,year;
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(Date other){
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}
	
	public void showDate() {
        	System.out.println(day + "/" + month + "/" + year);
	}

	@Override	
	public boolean equals(Object obj){
	Date other = (Date) obj;
        return this.day == other.day && this.month == other.month && this.year == other.year;	
	}

	public int getDay(){
		return day;	
	}

	public void setDay(int day){
		this.day = day;
	}	
	
	public int getMonth(){
		return month;	
	}

	public void setMonth(int month){
		this.month = month;
	}

	public int getYear(){
		return year;	
	}

	public void setYear(int year){
		this.year = year;
	}
	
}