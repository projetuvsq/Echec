SCRPTPIECE=lib/src/pieces
SCRPTECHEC=lib/src/echec
JARNAME=JeuEchec.jar
SS=-sourcepath

.PHONY: all compile clean mrproper jar

all: mrproper compile jar

compile:
	javac $(SCRPTECHEC)/*.java
	javac $(SCRPTPIECE)/*.java
	javac Chess.java

run:
	java -jar $(JARNAME)

jar:
	jar cfm $(JARNAME) META-INF/MANIFEST.MF Chess.class $(SCRPTECHEC)/*.class $(SCRPTPIECE)/*.class

clean:
	rm -f $(SCRPTPIECE)/*.class $(SCRPTECHEC)/*.class

mrproper: clean
	rm -f $(JARNAME)
