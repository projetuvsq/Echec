CLASSPIECE=lib/class/pieces
CLASSECHEC=lib/class/echec
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
	mv $(SCRPTECHEC)/*.class $(CLASSECHEC)
	mv $(SCRPTPIECE)/*.class $(CLASSPIECE)

jar:
	jar cfm $(JARNAME) META-INF/MANIFEST.MF Chess.class $(CLASSECHEC)/*.class $(CLASSPIECE)/*.class

clean:
	rm -f $(CLASSPIECE)/*.class $(CLASSECHEC)/*.class *.class

mrproper: clean
	rm -f $(JARNAME)
