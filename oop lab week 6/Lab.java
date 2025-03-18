public class Lab{
	private String name;
	private Employee labStaff;
	private SystemUnit[] systemUnit = new SystemUnit[50];
	private boolean hasMultimedia;

	public Lab(String name, String employeeName, String designation, SystemUnit[] systemUnit, boolean hasMultimedia){
		this.name = name;
		labStaff = new Employee (employeeName, designation);
		this.hasMultimedia = hasMultimedia;
	}

	public void setName(String Name){
		this.name = name;
	}
	public void setHasMulitmedia(boolean hasMultimedia){
		this.hasMultimedia = hasMultimedia;
	}
	public void setSystemUnit(SystemUnit[] systemUnit){
		for(int i = 0; i < systemUnit.length; i++){
			this.systemUnit[i] = systemUnit[i]; 
		}
	}
	
	public String getName(){return name;}
	public boolean hasMultimedia(){return hasMultimedia;}
	public SystemUnit[] getSystemUnit(){return systemUnit;}
}