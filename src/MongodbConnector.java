import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

import java.net.UnknownHostException;
import java.util.ArrayList;

/**
 * 
 * @author karthy
 *
 */
public class MongodbConnector {

	public static MongoClient mongoClient = null;

	public static DB getDefaultConnection(String serverName, String table) throws UnknownHostException {

		mongoClient = new MongoClient(serverName);
		return getDB(table);
	}

	public static DB getDefaultConnection(String serverName, int port, String table) throws UnknownHostException {

		mongoClient = new MongoClient(serverName, port);
		return getDB(table);

	}

	public static DB getReplicationSetConnection(ArrayList<ServerAddress> replicationServer, int port, String table)
			throws UnknownHostException {

		mongoClient = new MongoClient(replicationServer);
		return getDB(table);

	}

	private static DB getDB(String table) {

		return mongoClient.getDB(table);
	}
}
