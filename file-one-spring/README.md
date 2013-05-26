Camel Example One: Using camel+spring to copy file from one folder to another.
========================================================================

The file is copied from the "sourceFolder" i.e.the From URI to the
"destinationFolder" i.e. the To URI. Upon successful copy, a ".camel" 
folder is created inside the "sourceFolder" and the file in "sourceFolder" 
is moved into it.

To run this example, copy a file into the sourceFolder folder
and execute the following command

mvn exec:java -Dexec.mainClass=com.evolvus.examples.camel.fileOneSpring.App


What is happening?
===================

When using Spring with camel, the Camel context is started as soon as the 
Spring Application context starts - there is no need to explicitly start 
the camel context, Camel then polls the sourceFolder every 1 second to check 
if there are any new files added to the folder, if so it copies them to the 
destinationFolder. If the file copy is successful then the source file is moved 
to the ".camel" folder.

If the copy fails for any reason the file is moved to a ".error" folder
is created inside sourceFolder and the file moved to it.


