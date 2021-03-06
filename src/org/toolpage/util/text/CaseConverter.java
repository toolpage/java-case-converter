package org.toolpage.util.text;

import java.util.Random;
import java.util.regex.Pattern;

/**
 * The text conversion class helps changing the cases of an existing text. Get
 * more information and online tools for this implementation on: <a href=
 * "https://en.toolpage.org/cat/text-conversion">https://en.toolpage.org/cat/text-conversion</a>
 * 
 * @author Yves Sorge <yves.sorge@toolpage.org>
 *
 */
public class CaseConverter {

	/**
	 * Converts a text into uppercase. The converted text will only 
	 * consist of uppercase letters.
	 * 
	 * @param value
	 * @return converted string
	 */
	public static String convertToUpperCase(String value) {
		return value.toUpperCase();
	}

	/**
	 * Converts a text into lowercase. The converted text will only 
	 * consist of lowercase letters.
	 * 
	 * @param value
	 * @return converted string
	 */
	public static String convertToLowerCase(String value) {
		return value.toLowerCase();
	}

	/**
	 * Converts a text into start case / title case.
	 * 
	 * @param value
	 * @return converted string
	 */
	public static String convertToStartCase(String value) {
		StringBuilder returnValue = new StringBuilder();
		value = value.toLowerCase();
		boolean makeNextUppercase = true;
		for (char c : value.toCharArray()) {
			if (Character.isSpaceChar(c) || Character.isWhitespace(c) || "()[]{}\\/".indexOf(c) != -1) {
				makeNextUppercase = true;
			} else if (makeNextUppercase) {
				c = Character.toTitleCase(c);
				makeNextUppercase = false;
			}

			returnValue.append(c);
		}
		return returnValue.toString();
	}

	/**
	 * Converts a text into alternating case.
 	 * Example: "Alternating CASE" into "AlTeRnAtInG cAsE".
	 * 
	 * @param value
	 * @return converted string
	 */
	public static String convertToAlternatingCase(String value) {
		return CaseConverter.convertToAlternatingCase(value, true);
	}

	/**
	 * Converts a text into alternating case.
 	 * Example #1: "Alternating CASE" into "AlTeRnAtInG cAsE" (with startWithCapitalLetter = true).
 	 * Example #2: "Alternating CASE" into "aLtErNaTiNg CaSe" (with startWithCapitalLetter = false).
	 * 
	 * @param value
	 * @param startWithCapitalLetter
	 * @return converted string
	 */
	public static String convertToAlternatingCase(String value, boolean startWithCapitalLetter) {
		StringBuilder returnValue = new StringBuilder();
		value = value.toLowerCase();
		int i = 0;
		if (!startWithCapitalLetter) {
			i = 1;
		}
		for (char c : value.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				if (i % 2 == 0) {
					c = Character.toUpperCase(c);
				}
				i++;
			}
			returnValue.append(c);
		}
		return returnValue.toString();
	}

	/**
	 * Converts a text into camel case.
	 * Example: "camel case" into "CamelCase".
	 * 
	 * @param value
	 * @return converted string
	 */
	public static String convertToCamelCase(String value) {
		String throwAwayChars = "()[]{}=?!.:,-_+\\\"#~/";
		value = value.replaceAll("[" + Pattern.quote(throwAwayChars) + "]", " ");
		value = CaseConverter.convertToStartCase(value);
		return value.replaceAll("\\s+", "");
	}

	/**
	 * Converts a text into snake case.
	 * Example: "snake case" into "Snake_Case".
	 * 
	 * @param value
	 * @return converted string
	 */
	public static String convertToSnakeCase(String value) {
		String throwAwayChars = "()[]{}=?!.:,-_+\\\"#~/";
		value = value.replaceAll("[" + Pattern.quote(throwAwayChars) + "]", " ");
		value = CaseConverter.convertToStartCase(value);
		return value.trim().replaceAll("\\s+", "_");
	}

	/**
	 * Converts a text into kebab case.
	 * Example: "Kebab Case" into "kebab-case".
	 * 
	 * @param value
	 * @return converted string
	 */
	public static String convertToKebabCase(String value) {
		String throwAwayChars = "()[]{}=?!.:,-_+\\\"#~/";
		value = value.replaceAll("[" + Pattern.quote(throwAwayChars) + "]", " ");
		value = value.toLowerCase();
		return value.trim().replaceAll("\\s+", "-");
	}

	/**
	 * Converts a text into studly caps. Studly caps is a text case where the 
	 * capitalization of letters varies randomly.
	 * Example: "Studly Caps" into "stuDLY CaPS" or "STudLy CAps".
	 * 
	 * @param value
	 * @return converted string
	 */
	public static String convertToStudlyCaps(String value) {
		StringBuilder returnValue = new StringBuilder();
		value = value.toLowerCase();
		int numOfFollowingUppercase = 0;
		int numOfFollowingLowercase = 0;
		boolean doCapitalLetter = false;
		Random randomizer = new Random();
		for (char c : value.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				if (numOfFollowingUppercase < 2) {
					if (randomizer.nextInt(100) % 2 == 0) {
						doCapitalLetter = true;
						numOfFollowingUppercase++;
					} else {
						doCapitalLetter = false;
						numOfFollowingUppercase = 0;
					}
				} else {
					doCapitalLetter = false;
					numOfFollowingUppercase = 0;
				}
				if (!doCapitalLetter) {
					numOfFollowingLowercase++;
				}
				if (numOfFollowingLowercase > 3) {
					doCapitalLetter = true;
					numOfFollowingLowercase = 0;
					numOfFollowingUppercase++;
				}
				if (doCapitalLetter) {
					c = Character.toUpperCase(c);
				}
			}
			returnValue.append(c);
		}
		return returnValue.toString();
	}

	/**
	 * Inverts the case of a given text.
	 * Converts the spelling of each letter in the reverse order:
	 * lowercase letters are converted to uppercase and vice versa.
	 * Example: "Inverted Case" into "iNVERTED cASE".
	 * 
	 * @param value
	 * @return converted string
	 */
	public static String invertCase(String value) {
		StringBuilder returnValue = new StringBuilder();
		for (char c : value.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				if (Character.isLowerCase(c)) {
					c = Character.toUpperCase(c);
				} else {
					c = Character.toLowerCase(c);
				}
			}
			returnValue.append(c);
		}
		return returnValue.toString();
	}

}
