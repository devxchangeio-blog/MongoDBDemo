import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * 
 * @author karthy
 *
 */
public class MongodbDAO {

	private Logger logger = Logger.getLogger(MongodbDAO.class);

	private DB db = null;

	public void createCollection(String collectionName, BasicDBObject createData) {

		try {

			db = MongodbConnector.getDefaultConnection("", "");

			db.createCollection(collectionName, createData);

		} catch (UnknownHostException e) {
			
			logger.error("Exception thrown from createCollection method = >"+ e.getMessage());
		}

	}

	public void findCollection(BasicDBObject insertData) {
		
		try {

			db = MongodbConnector.getDefaultConnection("", "");


		} catch (UnknownHostException e) {
			
			logger.error("Exception thrown from findCollection method = >"+ e.getMessage());
		}

	}

	public void dropCollection() {
		
		try {

			db = MongodbConnector.getDefaultConnection("", "");


		} catch (UnknownHostException e) {
			
			logger.error("Exception thrown from dropCollection method = >"+ e.getMessage());
		}

	}

	public void insertDocument(BasicDBObject insertData, String collectionName) {
		
		try {

			db = MongodbConnector.getDefaultConnection("", "");


		} catch (UnknownHostException e) {
			
			logger.error("Exception thrown from insertDocument method = >"+ e.getMessage());
		}

	}

	public void updateDocument(BasicDBObject updateData) {
		
		try {

			db = MongodbConnector.getDefaultConnection("", "");


		} catch (UnknownHostException e) {
			
			logger.error("Exception thrown from updateDocument method = >"+ e.getMessage());
		}

	}

	public DBObject findDocument(BasicDBObject query) {
		
		try {

			db = MongodbConnector.getDefaultConnection("", "");


		} catch (UnknownHostException e) {
			
			logger.error("Exception thrown from findDocument method = >"+ e.getMessage());
		}

		return null;
	}

	public DBCursor findAllDocument(BasicDBObject query) {
		
		try {

			db = MongodbConnector.getDefaultConnection("", "");


		} catch (UnknownHostException e) {
			
			logger.error("Exception thrown from findAllDocument method = >"+ e.getMessage());
		}
		return null;
	}

	public void deleteDocument(BasicDBObject deleteData) {
		
		try {

			db = MongodbConnector.getDefaultConnection("", "");


		} catch (UnknownHostException e) {
			
			logger.error("Exception thrown from deleteDocument method = >"+ e.getMessage());
		}

	}

}
