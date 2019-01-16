PS E:\LINKEDIN\BecomeAJavaDevelopment\JSHELL_PLAY> jshell
|  Welcome to JShell -- Version 11.0.1
|  For an introduction type: /help intro

jshell> /list

jshell> /list --all

  s1 : import java.io.*;
  s2 : import java.math.*;
  s3 : import java.net.*;
  s4 : import java.nio.file.*;
  s5 : import java.util.*;
  s6 : import java.util.concurrent.*;
  s7 : import java.util.function.*;
  s8 : import java.util.prefs.*;
  s9 : import java.util.regex.*;
 s10 : import java.util.stream.*;

jshell> int x = 45;
x ==> 45

jshell> String printTwice(String str){
   ...> System.out.println(str + '\n' + str);
   ...> return str;
   ...> }
|  created method printTwice(String)

jshell> printTwice("Happy every day!")
Happy every day!
Happy every day!
$3 ==> "Happy every day!"

jshell> String x;
x ==> null

jshell> System.out.println("Topic: forward references example below");
Topic: forward references example below

jshell> double volume(double radius){
   ...> return 4.0 / 3.0 * PI * cube(radius);
   ...> }
|  created method volume(double), however, it cannot be invoked until variable PI, and method cube(double) are declared

jshell> double PI = 3.1415926535;
PI ==> 3.1415926535

jshell> double cube(double x){
   ...> return x*x*x;
   ...> }
|  created method cube(double)

jshell> volume(2)
$9 ==> 33.510321637333334

jshell> /
/!          /?          /drop       /edit       /env        /exit       /help       /history    /imports    /list
/methods    /open       /reload     /reset      /save       /set        /types      /vars

<press tab again to see synopsis>

jshell> /list -
-all       -history   -start

<press tab again to see synopsis>

jshell> /list -
list the source you have typed

<press tab again to see full documentation>

jshell> /list -
Show the snippets, prefaced with their snippet IDs.

/list
        List the currently active snippets of code that you typed or read with /open

/list -start
        List the evaluated startup snippets

/list -all
        List all snippets including failed, overwritten, dropped, and startup

/list <name>
        List snippets with the specified name (preference for active snippets)

/list <id>
        List the snippet with the specified snippet ID.
        One or more IDs or ID ranges may used, see '/help id'

jshell> /list -all

  s1 : import java.io.*;
  s2 : import java.math.*;
  s3 : import java.net.*;
  s4 : import java.nio.file.*;
  s5 : import java.util.*;
  s6 : import java.util.concurrent.*;
  s7 : import java.util.function.*;
  s8 : import java.util.prefs.*;
  s9 : import java.util.regex.*;
 s10 : import java.util.stream.*;
   1 : int x = 45;
   2 : String printTwice(String str){
       System.out.println(str + '\n' + str);
       return str;
       }
   3 : printTwice("Happy every day!")
   4 : String x;
   5 : System.out.println("Topic: forward references example below");
   6 : double volume(double radius){
       return 4.0 / 3.0 * PI * cube(radius);
       }
   7 : double PI = 3.1415926535;
   8 : double cube(double x){
       return x*x*x;
       }
   9 : volume(2)

jshell> /save testLog.jsh

jshell> /list -all

  s1 : import java.io.*;
  s2 : import java.math.*;
  s3 : import java.net.*;
  s4 : import java.nio.file.*;
  s5 : import java.util.*;
  s6 : import java.util.concurrent.*;
  s7 : import java.util.function.*;
  s8 : import java.util.prefs.*;
  s9 : import java.util.regex.*;
 s10 : import java.util.stream.*;
   1 : int x = 45;
   2 : String printTwice(String str){
       System.out.println(str + '\n' + str);
       return str;
       }
   3 : printTwice("Happy every day!")
   4 : String x;
   5 : System.out.println("Topic: forward references example below");
   6 : double volume(double radius){
       return 4.0 / 3.0 * PI * cube(radius);
       }
   7 : double PI = 3.1415926535;
   8 : double cube(double x){
       return x*x*x;
       }
   9 : volume(2)

jshell> /history

/list
/list --all
int x = 45;
String printTwice(String str){
System.out.println(str + '\n' + str);
return str;
}
printTwice("Happy every day!")
String x;
System.out.println("Topic: forward references example below");
double volume(double radius){
return 4.0 / 3.0 * PI * cube(radius);
}
double PI = 3.1415926535;
double cube(double x){
return x*x*x;
}
volume(2)
/list -all
/save testLog.jsh
/list -all
/history

jshell> /save -history historyLog.jsh

jshell> /save -start startLog.jsh

jshell> /save codeLog.jsh

jshell> /exit
|  Goodbye


