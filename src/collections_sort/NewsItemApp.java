package collections_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<NewsItem>();
		news.add(new NewsItem("ϰ��ƽ����ϯ���绥������Ტ�����ݽ�",100, new Date()));
		news.add(new NewsItem("��������PM2.5Ũ�ȴ��ֵ ��������Ⱦ����Ϯ",200, new Date(System.currentTimeMillis() - 1000 * 60 * 60)));
		news.add(new NewsItem("���绥�������",300, new Date(System.currentTimeMillis() - 1000 * 60 * 60)));
		System.out.println("Before SORT:" + news);
		Collections.sort(news);
		System.out.println("After SORT:" + news);
	}
}
