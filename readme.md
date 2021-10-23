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
		System.out.print("invalid! not and integer, try again: ");
		check = Parser.tryParseInt(scanner.nextLine(), out); // hint C#
	}
 System.out.println("Congrats! you have entered the integer: " + out);
```

![](<svg role="img" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><title>Aseprite</title><path d="M4.006 0v1.6h15.988V0zm15.988 1.6v1.6h1.6V1.6zm1.6 1.6v14.4h-1.6v1.6H4.006v-1.6h-1.6V3.2H.809v17.6h1.599v1.6h1.599V24h15.988v-1.6h1.6v-1.6h1.598V3.2zm-19.187 0h1.599V1.6h-1.6zm4.796 3.2v6.4h1.6V6.4zm7.995 0v6.4h1.599V6.4z"/></svg>)

&copy;Mohamad Ojail 2021
2021-10-24