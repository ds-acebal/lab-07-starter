# Lab 7: File system

## Introduction

We are developing the operating system of a mobile phone, focusing on the functionality for copying files to different destinations. Currently, files can be copied in three ways:

- Copying them to another location on the device (to the project root if no other location is specified).
- Sending them over the internet to a specified address.
- Sending them to another device via Bluetooth.

This functionality has already been implemented in the `FileSystem` class.

Before starting the assignment, examine this implementation and consider how you would improve its design. **Can you identify its main design problems? How would you address them? Does your proposed solution resemble any design pattern you know?**

Once you have discussed your ideas with the instructor, switch to the improved version by running:

```bash
git switch initial-redesign
```

You can now proceed with the assignment.

## What to do

We need to introduce several changes to the application.

First, redesign the provided implementation to accommodate the initial requirements described below, following good design principles. Then, implement the five extensions, one at a time and in the order given, to put the quality of your design to the test.

### Initial requirements

The application must process files differently depending on their destination:

- **Disk:** Normalise line breaks by replacing `\r\n` with `\n`.
- **Internet:** Encrypt the contents by shifting each letter or digit forward by one.
- **Bluetooth:** Apply the same encryption and remove repeated spaces.

The design resulting from these changes will serve as the starting point for the following extensions.

### Extension 1: Optional encryption

When copying a file to disk, we sometimes want to encrypt it in addition to normalising its line breaks.

The `main` method should allow us to specify whether each copy should be encrypted:

```java
// Copy without encryption
system.copy("private.txt", ..., "a.txt");

// Copy with encryption
system.copy("private.txt", ..., "b.txt");
```

### Extension 2: Combining transformations

When sending a file over the internet, in addition to encrypting it, we want to be able to normalise line breaks, remove repeated spaces, or apply both transformations.

The `main` method should allow us to specify the desired combination:

```java
// Normalise line breaks
system.copy("private.txt", ..., "1.1.1.1");

// Remove repeated spaces
system.copy("private.txt", ..., "1.1.1.2");

// Apply both transformations
system.copy("private.txt", ..., "1.1.1.3");
```

### Extension 3: Counting characters

Regardless of the destination (disk, internet or Bluetooth), we want to know how many characters have been copied or sent.

The `main` method should be able to retrieve and display this information:

```java
system.copy("private.txt", ..., "1.1.1.1");

System.out.println("Number of characters copied: " + ...);
```

### Extension 4: Counting characters before and after processing

When normalising line breaks or removing repeated spaces, we also want to know how many characters there were before processing.

For example, after copying a file with normalised line breaks, the `main` method should be able to display both counts:

```java
system.copy("private.txt", ..., "1.1.1.1");

System.out.println("Before normalisation: " + ... + " characters");
System.out.println("After normalisation: " + ... + " characters");
```

### Extension 5: Avoiding redundant encryption

Encrypting a large file is a slow operation. If the same file needs to be sent over both the internet and Bluetooth, we want to encrypt it only once to save time.

The `main` method should allow us to send the encrypted contents to both destinations:

```java
// Encrypt once and send to both destinations
system.copy("private.txt", ..., "1.1.1.1", ..., "Galaxy S");
```

## Submitting the assignment

Your work must be committed and pushed to your Classroom50 repository before the next lab session.

When you have finished, run:

```bash
git add -A
git commit -m "Final submission"
git push
```

## Solution

At the beginning of the next lab session, once the solution has been discussed in class, you will be able to access it in the following repository:

<https://github.com/ds-acebal/lab-07-solution>

**You are strongly encouraged to clone the solution repository and spend a few minutes comparing it with your own solution before moving on to the next lab.**
