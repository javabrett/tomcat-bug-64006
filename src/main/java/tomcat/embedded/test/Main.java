package tomcat.embedded.test;

import org.apache.catalina.users.MemoryUserDatabase;

public class Main {

	public static void main(String[] args) throws Exception {
        MemoryUserDatabase database = new MemoryUserDatabase("foo");
        database.setPathname("file:///tmp/users.xml");
        database.open();
        System.out.println(database.findUser("both"));
        database.close();
	}

}
