package directors;

import builders.ConnectionBuilder;

public class ConnectionDirector {

	private ConnectionBuilder builder;
	
	public ConnectionDirector(ConnectionBuilder builder) {
		this.builder=builder;
	}
	
	public void constructorConnection(){
		builder.buildId();
		builder.buildPass();
		builder.buildUrl();
		builder.buildUser();
	}
	
	
	
}
