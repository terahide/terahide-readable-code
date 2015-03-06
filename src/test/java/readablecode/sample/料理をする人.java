package readablecode.sample;

import org.junit.Test;

public class 料理をする人 {
	@Test
	public void 料理を始める(){
		//FIXME 下記の仮説が正しいならばレシピにはコンソールに表示を持つことが不自然
		//when 料理を始めるとき
		//given その料理を知らない料理をする人は
		//then 画面でレシピを見て料理を確認する
		
		レシピを見る();
	}

	private void レシピを見る() {
		//TODO 変数の名前変えたい
		レシピ レシピ = new レシピ();
		レシピ.コンソールに表示する();
	}
}
