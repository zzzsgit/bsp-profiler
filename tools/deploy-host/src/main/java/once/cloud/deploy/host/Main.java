// ===============================================================
// Copyright(c) Institute of Software, Chinese Academy of Sciences
// ===============================================================
// Author : Zhen Tang <tangzhen12@otcaix.iscas.ac.cn>
// Date   : 2016/11/11

package once.cloud.deploy.host;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import once.cloud.deploy.host.server.ShutdownHandler;
import once.cloud.deploy.host.server.StandaloneServer;

public class Main {
	private static Logger LOGGER = LoggerFactory.getLogger(Main.class);
	public static final int PORT = 10011;

	public static void main(String[] args) {
		LOGGER.trace("main(): enter function.");
		StandaloneServer standaloneServer = new StandaloneServer(Main.PORT);
		Runtime.getRuntime().addShutdownHook(new ShutdownHandler(standaloneServer));
		standaloneServer.start();
		LOGGER.trace("main(): exit function.");
	}
}
