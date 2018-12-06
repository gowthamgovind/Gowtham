package harryhiber;

public class objcre {

String name,house,role,status,dies;
	void setName(String name) {
		this.name=name;	
		
	}
	
	void setHouse(String house) {
		this.house=house;	
		
	}
	void setRole(String role) {
		this.role=role;	
		
	}
	void setStatus(String status) {
		this.status=status;	
		
	}
	void setDies(String dies) {
		this.dies=dies;	
		
	}
	
	
	
	
	
	String getName() {
		return name;	
		
	}
	
	String getHouse() {
		return house;	
		
	}
	String getRole(){
		return role;	
		
	}
	String getStatus() {
		return status;	
		
	}
	String getDies() {
		return dies;	
		
	}
	
	
	@Override
	public String  toString() {
		
		return name+"   "+house+"   "+role+"  "+status+"   "+dies;
		
		
		
	}
	
	
	
	
	
}
