# JAVA Case Converter
The JAVA Case Converter collection helps changing the cases of existing texts.

## Usage

```java
import org.toolpage.util.text.CaseConverter;

public class Example {
	public static void main(String args[]) {
		String input = "The quick brown fox jumps over the lazy dog";
		CaseConverter.convertToUpperCase(input); 	// THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
		CaseConverter.convertToLowerCase(input); 	// the quick brown fox jumps over the lazy dog
		CaseConverter.convertToStartCase(input); 	// The Quick Brown Fox Jumps Over The Lazy Dog
		CaseConverter.convertToCamelCase(input); 	// TheQuickBrownFoxJumpsOverTheLazyDog
		CaseConverter.convertToSnakeCase(input); 	// The_Quick_Brown_Fox_Jumps_Over_The_Lazy_Dog
		CaseConverter.convertToKebabCase(input); 	// the-quick-brown-fox-jumps-over-the-lazy-dog
		CaseConverter.convertToStudlyCaps(input); 	// thE qUIck BRoWN foX jUMPs oVeR tHe lAZY doG
		CaseConverter.invertCase(input); 		// tHE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
	}
}
```

## Online Resources

Get more information and online tools for this implementation on:
https://en.toolpage.org/cat/text-conversion

* Uppercase converter: https://en.toolpage.org/tool/uppercase
* Lowercase converter: https://en.toolpage.org/tool/lowercase
* Camelcase converter: https://en.toolpage.org/tool/camelcase
* Startcase converter: https://en.toolpage.org/tool/startcase
* Case inverter: https://en.toolpage.org/tool/case-inverter
