package eu.stamp_project.jira.plugins.config;

/**
 * Configuration parameters to call Botsing server
 * @author luca
 *
 */
public final class BotsingServerConfig {

	public static final String BOTSING_SERVER_CONFIG_KEY = "BotsingServerConfig";

	private String baseUrl;
	private String user;
	private String password;

	public BotsingServerConfig(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public BotsingServerConfig(String baseUrl, String user, String password) {
		this.baseUrl = baseUrl;
		this.user = user;
		this.password = password;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
