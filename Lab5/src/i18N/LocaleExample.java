package i18N;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		
//		System.out.println(locale.getDisplayCountry());
//		System.out.println(locale.getDisplayLanguage());
//		System.out.println(locale.getDisplayName());
//		System.out.println(locale.getISO3Country());
//		System.out.println(locale.getISO3Language());
//		System.out.println(locale.getLanguage());
//		System.out.println(locale.getCountry());
		
		//print in different languages
//		Locale enlocale = new Locale("en", "US");
//		Locale frlocale = new Locale("fr", "FR");
//		Locale eslocale = new Locale("es", "ES");
//		Locale jplocale = new Locale("jp", "JP"); //not sure
//		Locale delocale = new Locale("de", "DE");
//		
//		System.out.println("English language name in (default): " + enlocale.getDisplayLanguage());
//		System.out.println("English language name in French: " + enlocale.getDisplayLanguage(frlocale));
//		System.out.println("English language name in Spanish " + enlocale.getDisplayLanguage(eslocale));
//		System.out.println("English language name in Japanese: " + enlocale.getDisplayLanguage(jplocale));
//		System.out.println("English language name in German: " + enlocale.getDisplayLanguage(delocale));
		
		//Get ISO3 language for default locale
//		Locale defaultlocale = Locale.getDefault();
//		System.out.println(defaultlocale.getISO3Language());
//		System.out.println(defaultlocale.getDisplayLanguage());
//		System.out.println(defaultlocale.getDisplayLanguage(Locale.CANADA_FRENCH));
//		System.out.println(defaultlocale.getDisplayLanguage(Locale.GERMANY));
		
		//display the country codes
		String[] countries = Locale.getISOCountries();
		System.out.println("Countries: \n");
		for(int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}
		
		//display the languages
		String[] languages = Locale.getISOCountries();
		System.out.println("Languages: \n");
		for(int i = 0; i < languages.length; i++) {
			System.out.println(languages[i]);
		}
		
		
	}
	

}
