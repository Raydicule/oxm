Camel Example One: Using camel to copy file from one folder to another.
========================================================================

The file is copied from the "sourceFolder" (value set to "data/inbox)" to the
"destinationFolder" (value set to "data/outbox" folder). Upon successful
copy, a ".camel" folder is created inside the "sourceFolder" and the file in
"sourceFolder" is moved into it.

To run this example, copy a file into the sourceFolder("data/inbox") folder
and execute the following command

mvn exec:java -Dexec.mainClass=com.evolvus.examples.camel.fileOne.App


What is happening?
===================

Camel polls the sourceFolder every 1 second to check if there are any new
files added to the folder, if so it copies them to the destinationFolder. If
the file copy is successful then the source file is moved to the ".camel"
folder.

If the copy fails for any reason the file is moved to a ".error" folder
is created inside sourceFolder and the file moved to it.


