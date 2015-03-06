package readablecode.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

public class レシピ {
	public void コンソールに表示する(){
		List<String> 料理名たち = 料理名を読み込む();
		for (String 料理名 : 料理名たち) {
			コンソールに表示する(料理名);
		}
	}

	private List<String> 料理名を読み込む() {
		return システム都合のヘルパ.read料理File();
	}

	public void コンソールに表示する(String 料理名){
		//FIXME idの生成と表示のフォーマットはコンソールに表示するコンテクストの範疇外なんでなんとかしたい

		String id = システム都合のヘルパ.createId();
		System.out.println(String.format("%s:%s", id,料理名));
	}

	private static class システム都合のヘルパ{
		private static List<String> read料理File(){
			return readFile("料理.txt");
		}
		private static List<String> readFile(String f){
			return read(new File(f));
		}
		@SuppressWarnings("unchecked")
		private static List<String> read(File f){
			try {
				return FileUtils.readLines(f);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		private static String createId() {
			return UUID.randomUUID().toString();
		}
	}
}
