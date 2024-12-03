.PHONY: run

all: run

main.jar: main.kt
	kotlinc main.kt -include-runtime -d main.jar

run: main.jar
	java -jar main.jar

clean:
	rm *.jar
