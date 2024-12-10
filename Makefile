.PHONY: run

all: run

main.jar: src/main.kt src/test.kt
	kotlinc src/ -include-runtime -d main.jar

run: main.jar
	java -jar main.jar

clean:
	rm *.jar
