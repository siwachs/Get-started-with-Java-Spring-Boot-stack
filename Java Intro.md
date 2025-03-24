# Why Java?

Java is compiled and interpreted language.
We have two env in programming -> Compiletime and Runtime

source.java
Run on a machine -> Compiler -> Convert using javac to get bytecode which use by JVM.

The above phase is compiletime.

Now bytecode go to JVM -> It convert code to machine code compatible by OS

Why?

1. Platform Independent
2. Compiletime (check for typos and error) and Runtime

In interpreted language it check on every line ie Runtime

# JVM (Java Virtual Machine)

Convert Java bytecode to machine code.

# VM

A VM (Virtual Machine) is a software-based simulation of a physical computer that runs an operating system and applications just like a real computer. It allows multiple operating systems to run on a single physical machine by using virtualization technology.

Key Features of a VM:

1. Isolation – Each VM operates independently with its own OS and applications.

2. Resource Allocation – VMs share CPU, memory, storage, and network resources from the host machine.

3. Portability – A VM can be moved across different physical machines easily.

4. Scalability – Useful for cloud computing and server management.

5. Snapshots & Rollbacks – You can take snapshots of a VM and restore them if needed.

Why need this?
Let says a machine playing a video (Handle my thread) Let say is T1

And VM run a file.java that VM need a thred let say T2

And we need RAM both T1 and T2. In here T1 go to machine's RAM and T2 go to VM's RAM. ie Isolation

But Heap is sharable.

And Also Java is slower than CPP. But it give us platform independency.

# What happen in JVM

file.java -> javac -> It generate file.class (A bytecode)
Now it goes to JVM

```
           +---------------------------------------+
           |        Java Virtual Machine (JVM)    |
           +---------------------------------------+
           |        ClassLoader Subsystem         |
           |  (Loads, Links, and Initializes)     |
           +---------------------------------------+
           |         Runtime Data Areas           |
           |  +---------------------------------+  |
           |  | Method Area (Class Metadata)   |  |
           |  | Heap (Objects, Instances)      |  |
           |  | Stack (Method Call Frames)     |  |
           |  | PC Register (Current Inst.)    |  |
           |  | Native Method Stack            |  |
           |  +---------------------------------+  |
           +---------------------------------------+
           |          Execution Engine            |
           |  +-------------------------------+  |
           |  | Interpreter                   |  |
           |  | JIT Compiler (Optimized Code) |  |
           |  | Garbage Collector             |  |
           |  +-------------------------------+  |
           +---------------------------------------+
           |        Native Interface (JNI)        |
           | (Interacts with Native Libraries)    |
           +---------------------------------------+

```
