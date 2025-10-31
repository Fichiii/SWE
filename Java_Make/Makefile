BIN_DIR = bin 

JC = javac

SRC = src/A.java src/B.java src/Main.java

CLASSES = bin/A.class bin/B.class bin/Main.class


all: version run


run: $(BIN_DIR) $(CLASSES)
	java -cp $(BIN_DIR) Main
#Kompiliere Java Dateien, falls sich was geändert hat
$(CLASSES): $(SRC)
	$(JC) $(SRC) -d $(BIN_DIR)
#Erstelle bin Ordner falls noch nicht existiert
$(BIN_DIR):
	mkdir $(BIN_DIR)
#Gib die Java Version aus
version:
	java --version
#Lösche den bin Ordner zwangsweise
clean:
	rm -r -f $(BIN_DIR)
	
