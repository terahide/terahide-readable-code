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

	@SuppressWarnings("unchecked")
	private List<String> 料理名を読み込む() {
		try {
			return FileUtils.readLines(new File("料理.txt"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void コンソールに表示する(String 料理名){
		String id = システム都合のヘルパ.createId();
		System.out.println(String.format("%s:%s", id,料理名));
	}

	private static class システム都合のヘルパ{
		private static String createId() {
			return UUID.randomUUID().toString();
		}
	}
}
