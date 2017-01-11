# Makefile
# Creator: John Squier
#
# This file exists because I can not currently determine how to
# 	use ANT to remove backup (*~) files
#
# Usage: make clena, make clean

clena:	
	rm -f *~ ;
	rm -f src/*~
clean:
	rm -f *~ ;
	rm -f src/*~
