BIN_DIR = bin 

JC = javac

SOURCE=src/A.java src/B.java src/Main.java
	


all: version run


run: $(BIN_DIR)
	$(JC) -d $(BIN_DIR) $(SOURCE)
	java -cp $(BIN_DIR) Main
#Erstelle bin Ordner falls noch nicht existiert
$(BIN_DIR):
	mkdir $(BIN_DIR)
#Gib die Java Version aus
version:
	java --version
#Lösche den bin Ordner zwangsweise
clean:
	rm -r -f $(BIN_DIR)
	
