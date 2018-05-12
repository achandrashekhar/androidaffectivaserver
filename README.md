# androidaffectivaserver

This is the server for the android app
The server is non-blocking socket and will continuously listen for data from clients
This is a raw socket and is entirely written in Java

As soon as the server detects some data, this data will be written to a file locally on disk, be sure to change the name to match your disk location (line 24 of Server.java)

Steps to run:
1. Clone this repo
2. Open the project in IntelliJ or Eclipse and run Server.java
3. You will be able to see an IP address after the name of your computer's localhost/ copy this IP on line126 of MainActivity.java on the android app. The app will error out without this crucial step

This is written in Java 7, JRE SDK 1.8
