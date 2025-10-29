BIN_DIR = bin 

JC = javac

SOURCE=src/A.java src/B.java src/Main.java
#Built repräsentiert den Zustand des Gesamten builts
CLASSES = $(BIN_DIR)/.built


all: version run


run: $(CLASSES)
	java -cp $(BIN_DIR) Main
$(CLASSES):$(SOURCE) $(BIN_DIR)
	$(JC) $(SOURCE) -d $(BIN_DIR)
	touch $(CLASSES)	
#Erstelle bin Ordner falls noch nicht existiert
$(BIN_DIR):
	mkdir $(BIN_DIR)

#Gib die Java Version aus
version:
	java --version
#Lösche den bin Ordner zwangsweise
clean:
	rm -r -f $(BIN_DIR)
	
