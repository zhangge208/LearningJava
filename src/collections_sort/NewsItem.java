package collections_sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsItem implements java.lang.Comparable<NewsItem> {
	private String title;
	private int hits;
	private Date publishtime;
	public NewsItem() {
		
	}
	public NewsItem(String title, int hits, Date publishtime) {
		super();
		this.title = title;
		this.hits = hits;
		this.publishtime = publishtime;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Title:").append(this.title).append("\n");
		sb.append("Time:").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.publishtime)).append("\n");
		sb.append("Hits:").append(this.hits).append("\n");
		return sb.toString();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getPublictime() {
		return publishtime;
	}
	public void setPublictime(Date publishtime) {
		this.publishtime = publishtime;
	}
	@Override
	public int compareTo(NewsItem o) {
		int result = 0;
		result = -this.publishtime.compareTo(o.publishtime);
		if (result == 0) {
			result = this.hits - o.hits;
			if (result == 0) {
				result = -this.title.compareTo(o.title);
				
			}
		}
		return result;
	}
}
 