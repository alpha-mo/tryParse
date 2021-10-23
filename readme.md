# tryParseInt - tryParseDouble

**C#** has a lovely feature which is **pass by reference**, for every Java beginner it's not the easiest thing to implement the same logic or something similar.

the most useful method that I used in C# was **tryParse** which made my life easier **to work around input mismatches**.
> the method in C# will take in a string and a reference object, then will try to spit out a value of the desired type + that it actually returns a boolean weather it succeeded or not which in my opinion is awesome!

well this is what I tried to **simulate** here in java by creating a **Ref** class which will hold an object of a **generic type** that will be used to send in the data type that you wish to the **Parser class** *tryParse method*!
and that's it actually not that complicated for a beginner!

#### an example would look like this:

```java
Ref<Parser> out = new Ref<>(); // create instance of ref object "out"
boolean check = Parser.tryParseInt(scanner.nextLine(), out); // hint C#

	while (!check) {
		System.out.print("invalid! not an integer, try again: ");
		check = Parser.tryParseInt(scanner.nextLine(), out); // hint C#
	}
 System.out.println("Congrats! you have entered the integer: " + out);
```

&copy;Mohamad Ojail 2021
2021-10-24