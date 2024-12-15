.PHONY: run

all: run

main.jar: src/
	kotlinc src/ -include-runtime -d main.jar

run: main.jar
	java -jar main.jar here are some arguments

clean:
	rm *.jar
