package chapter20;
import java.util.List;

/*
 * 本を表すレコードです
 * 例題CalculatingExample.java、SummarizingExample.java で使います
 * クイズや演習問題でも使用します。
 */

public record Book(
	int number,			// 番号
	String title,		// 書名
	String genre,		// 分野
	String author,		// 著者
	int price,			// 価格
	boolean stock) 	// 在庫の有無

	implements Comparable<Book>

{
	public static List<Book> getList(){
		var list = List.of(
			new Book(1010,"情報倫理","OTHER","小川洋子",1250,true),
			new Book(1020,"テンプル騎士団","HISTORY","水野昭二",1600,true),
			new Book(1030,"材料工学","SCIENCE","田中宏",3000,true),
			new Book(1040,"スポーツ統計","SCIENCE","新森明子",2100,true),
			new Book(1050,"太平記縁起","NOVEL","佐藤秀夫",1500,true),
			new Book(1060,"データ分析","SCIENCE","千田正樹",1800,true),
			new Book(1070,"社会保障政策","OTHER","浦中恵子",2200,false),
			new Book(1080,"社会経済史","HISTORY","木村花子",2200,true),
			new Book(1090,"イスラム建国史","HISTORY","吉村敬",1800,true),
			new Book(1100,"鋳物の化学","SCIENCE","田中宏",3200,true),
			new Book(1110,"健康科学のはなし","SCIENCE","角田圭吾",1200,true),
			new Book(1120,"世界の鉱山","OTHER","田中宏",2300,true),
			new Book(1130,"日本史","HISTORY","木村花子",2000,true),
			new Book(1140,"正覚寺","NOVEL","田中一郎",1000,false),
			new Book(1150,"粉末冶金科学","SCIENCE","田中宏",2800,false)	);
		return list;
	}

	@Override
	public int compareTo(Book other) {
		return Integer.compare(number, other.number);
	}	

}
