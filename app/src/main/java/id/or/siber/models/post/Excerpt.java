package id.or.siber.models.post;

import com.google.gson.annotations.SerializedName;

public class Excerpt{

	@SerializedName("rendered")
	private String rendered;

	@SerializedName("protected")
	private boolean jsonMemberProtected;

	public String getRendered(){
		return rendered;
	}

	public boolean isJsonMemberProtected(){
		return jsonMemberProtected;
	}
}