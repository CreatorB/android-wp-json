package id.or.siber.models.post;

import com.google.gson.annotations.SerializedName;

public class AboutItem{

	@SerializedName("href")
	private String href;

	public String getHref(){
		return href;
	}
}