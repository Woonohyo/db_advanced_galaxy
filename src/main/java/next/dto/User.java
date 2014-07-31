package next.dto;

public class User {
	private int UID;
	private int GID;
	
	public User() {
		
	}
	
	public User(int UID, int GID){
		this.UID = UID;
		this.GID = GID;
	}
	
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public int getGID() {
		return GID;
	}
	public void setGID(int gID) {
		GID = gID;
	}
}
