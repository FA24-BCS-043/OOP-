public class SystemUnit{
	
	private String cpuName, lcdModel;
	private int ramSize, diskSize, systemId;
	private static int counter=1;
	public SystemUnit(String cpuName, String lcdModel, int ramSize, int diskSize){
	
		this.cpuName = cpuName;
		this.lcdModel = lcdModel;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		systemId = counter;
		counter++;	
	}

	public void setCpuName(String cpuName){
		this.cpuName = cpuName;
	}
	public void setLcdModel(String lcdModel ){
		this.lcdModel = lcdModel;
	}
	public void setRamSize(int ramSize){
		this.ramSize = ramSize;
	}
	public void setDiskSize(int diskSize){
		this.diskSize = diskSize;
	}
	
	
	public String getCpuName(){
		return cpuName;
	}
	public String getLcdModel(){
		return lcdModel;
	}
	public int getRamSize(){
		return ramSize;
	}
	public int getDiskSize(){
		return diskSize;
	}
	public int getSystemId(){
		return systemId;
	}

}

	







