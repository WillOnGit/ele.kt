.PHONY: run

all: run

main.jar: src/
	kotlinc src/ -include-runtime -d main.jar

run: main.jar
	java -jar main.jar here are some arguments

docs:
	mkdir -p dokka/html
	java -jar dokka/cli/dokka-cli-2.0.0.jar dokka.json

clean:
	rm -rf *.jar dokka/html
