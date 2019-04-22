TARNAME=Echec.tar

.PHONY: run tar clean

run:
	./github.sh

tar:
	tar cvf $(TARNAME) *

clean:
	rm -f $(TARNAME)
