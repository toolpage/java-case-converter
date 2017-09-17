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

Get more information and online tools for this implementation on 
https://en.toolpage.org/cat/case-converter

* [Upper case converter](https://en.toolpage.org/tool/uppercase)
* [Lower case converter](https://en.toolpage.org/tool/lowercase)
* [Camel case converter](https://en.toolpage.org/tool/camelcase)
* [Start case converter](https://en.toolpage.org/tool/startcase)
* [Snake case converter](https://en.toolpage.org/tool/snakecase)
* [Kebab case converter](https://en.toolpage.org/tool/kebabcase)
* [Alternating case converter](https://en.toolpage.org/tool/alternatingcase)
* [Studly caps converter](https://en.toolpage.org/tool/studlycaps)
* [Case inverter](https://en.toolpage.org/tool/case-inverter)
