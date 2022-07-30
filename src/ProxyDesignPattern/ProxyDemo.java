package ProxyDesignPattern;

public class ProxyDemo {

	public static void main(String[] args) {
		
		User user = new User("suresh","password");
		FolderProxy proxy = new FolderProxy(user);
		proxy.performOperations();
	}
}
