package pragma.rocks.dataLit.container;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublishType {
	private String _id;
	private String _rev;
	private String PID;
	private String objectID;
	private String objectRevID;
	private String title;

	public PublishType() {

	}

	public PublishType(String PID, String objectID, String objectRevID, String title) {
		this.PID = PID;
		this.objectID = objectID;
		this.objectRevID = objectRevID;
		this.title = title;
	}

	@JsonProperty("_id")
	public String getId() {
		return _id;
	}

	@JsonProperty("_id")
	public void setId(String s) {
		_id = s;
	}

	@JsonProperty("_rev")
	public String getRevision() {
		return _rev;
	}

	@JsonProperty("_rev")
	public void setRevision(String s) {
		_rev = s;
	}

	public String getPID() {
		return PID;
	}

	public void setPID(String pID) {
		PID = pID;
	}

	public String getObjectID() {
		return objectID;
	}

	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}

	public String getObjectRevID() {
		return objectRevID;
	}

	public void setObjectRevID(String objectRevID) {
		this.objectRevID = objectRevID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
