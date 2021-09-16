package org.lang;

public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("tamil langauge");

	}
	private void englishLanguage() {
		System.out.println("english language");
	}
	private void hindiLanguage() {
		System.out.println("hindi language");

	}
	public static void main(String[] args) {
		LanguageInfo a = new LanguageInfo();
		a.tamilLanguage();
		a.englishLanguage();
		a.hindiLanguage();
		a.southIndia();
		a.northIndia();
	}

}
