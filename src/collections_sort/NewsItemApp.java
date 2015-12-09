package collections_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<NewsItem>();
		news.add(new NewsItem("习近平将出席世界互联网大会并发表演讲",100, new Date()));
		news.add(new NewsItem("北京今日PM2.5浓度达峰值 周六重污染再来袭",200, new Date(System.currentTimeMillis() - 1000 * 60 * 60)));
		news.add(new NewsItem("世界互联网大会",300, new Date(System.currentTimeMillis() - 1000 * 60 * 60)));
		System.out.println("Before SORT:" + news);
		Collections.sort(news);
		System.out.println("After SORT:" + news);
	}
}
