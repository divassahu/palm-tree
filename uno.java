--> Difference between JDK,JRE,JVM
------------------------------------------------------------------------------------
1. JDK (Java Development Kit) is a Kit that provides the environment to develop and execute(run) the Java program. JDK is a kit(or package) that includes two things

Development Tools(to provide an environment to develop your java programs)
JRE (to execute your java program).
 
2. JRE (Java Runtime Environment) is an installation package that provides an environment to only run(not develop) the java program(or application)onto your machine. JRE is only used by those who only want to run Java programs that are end-users of your system.
 

3. JVM (Java Virtual Machine) is a very important part of both JDK and JRE because it is contained or inbuilt in both. Whatever Java program you run using JRE or JDK goes into JVM and JVM is responsible for executing the java program line by line, hence it is also known as an interpreter.
------------------------------------------------------------------------------------

---> difference between JSE, JEE and JME?
------------------------------------------------------------------------------------
JSE − Java Standard Edition using this, you can develop stand-alone applications. This provides the following packages −

java.lang − This package provides the language basics.

java.util − This package provides classes and interfaces (API’s) related to collection framework, events, data structure and other utility classes such as date.

java.io − This package provides classes and interfaces for file operations, and other input and output operations.

java.math − This package provides classes and interfaces for multiprecision arithmetics.

java.nio − This package provides classes and interfaces the Non-blocking I/O framework for Java

java.net − This package provides classes and interfaces related to networking.

java.security − This package provides classes and interfaces such as key generation, encryption, and decryption which belongs to the security framework.

java.sql − This package provides classes and interfaces for accessing/manipulating the data stored in databases and data sources.

java.awt − This package provides classes and interfaces to create GUI components in Java.

java.text − This package provides classes and interfaces to handle text, dates, numbers, and messages.

java.rmi − Provides the RMI package.

java.time − The main API for dates, times, instants, and durations.

java.beans − The java.beans package contains classes and interfaces related to JavaBeans components.

JEE − Java Enterprise Edition using this, you can develop Enterprise applications. This includes

API’s like Servlets, WebSocket, JavaServerFaces, Unified Expression Language.

Web service specifications like API for Restful web services, API for JSON processing, API for JSON Bonding, Architecture for XML binding, API for XML web services.

Enterprise specifications like Dependency Injection, Enterprise JavaBean, Java Persistence API, Java Transaction API.

JME − Java Micro Edition using this, you can develop applications that run on small scale devices like mobile phones.
------------------------------------------------------------------------------------

---> How does java achieve platform independency?
------------------------------------------------------------------------------------
In Java, the main point here is that the JVM depends on the operating system – so if you are running Mac OS X you will have a different JVM than if you are running Windows or some other operating system. This fact can be verified by trying to download the JVM for your particular machine – when trying to download it, you will be given a list of JVMs corresponding to different operating systems, and you will obviously pick whichever JVM is targeted for the operating system that you are running. So we can conclude that JVM is platform-dependent and it is the reason why Java is able to become “Platform Independent”.
------------------------------------------------------------------------------------

---> What are features of Java and explain them?
------------------------------------------------------------------------------------
The following are some important features of Java Programming Language:

Simple
Platform Independent
Architectural Neutral
Dynamic and Extensible
Portable
Multi Threading
Distributed
Networked
Robust
Secured
High Performance
Object Oriented



 
------------------------------------------------------------------------------------

class Demo{
	public static void main(String[] args){
		System.out.println("Name : Parmeshwar");
		System.out.println("Father's Name : Raju");
		System.out.println("Mother's Name : Gayatri");
		System.out.println("Age : 26");
		System.out.println("Gender : Male");
		System.out.println("Address : c-59, Vikas Nagar");
		System.out.println("Mobile : 2277891873");
		}
	}