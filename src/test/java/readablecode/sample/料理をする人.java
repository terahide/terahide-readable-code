package readablecode.sample;

import org.junit.Test;

public class 料理をする人 {
	@Test
	public void 料理を始める(){
		レシピを見る();
	}

	private void レシピを見る() {
		レシピ レシピ = new レシピ();
		レシピ.コンソールに表示する();
	}
}
