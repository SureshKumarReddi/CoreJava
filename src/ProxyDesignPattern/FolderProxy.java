package ProxyDesignPattern;

public class FolderProxy implements IFolder {

	Folder folder;
	User user;
	
	FolderProxy(User user){
		this.user = user;
	}
	
	
	@Override
	public void performOperations() {
		 if(user.getUserName().equalsIgnoreCase("suresh") && user.getPassword().equalsIgnoreCase("password")) {
			 folder = new Folder();
			 folder.performOperations();
		 }else {
			 System.out.println( "You aren't Authorized to perform this operations....");
		 }
	}

}
