package self;

import java.security.PublicKey;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(StringContainsVowels("Nrgs"));

	}
	public static boolean StringContainsVowels(String s) {
		return s.toLowerCase().matches(".*[aeiou].*");
	}
	

}
