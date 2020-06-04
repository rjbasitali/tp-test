# Segregating and sorting evens and odds

Program that segregates even and odd numbers in an array and then sorts both sub-arrays separately and outputs it to the console.


## Run


### Program

1. You can run this command line project using intellij IDE

2. Or you can compile and run the Main.java class in src folder using command line: 

```
cd src
javac Main.java
java Main
```

the default input it runs on is {1, 2, 4, 3, 7, 16}, but you can pass an array of integers as command line args to use a different input:

```
java Main 1 2 5 3 8 9 4
```

### Tests

1. You can run the test cases directly using intellij IDE

2. Or you can compile and run the MainTest.java class in tests folder using command line,
additionally you'll need to use the [junit-platform-console-standalone-1.6.2.jar](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.6.2/junit-platform-console-standalone-1.6.2.jar
) to compile and run junit 5 tests through command line:

```
cd tests
java -jar junit-platform-console-standalone-1.6.2.jar
	-cp 'tests'
	-c MainTPTest
java -jar junit-platform-console-standalone-1.6.2.jar
	-cp 'tests'
	--select-class MainTPTest
```