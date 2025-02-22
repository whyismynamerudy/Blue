## Blue
A cross-platform dating application for (lonely) university students @ uoft.
Developed using SOLID design principles, Clean Architecture design philosophies, and MVP design patterns.

### Main features:
* Creating and managing an account:
* Check the validity of a new username and password
* Setting and editing account info and preferences
* Interacting with users:
	* Opening a chat between users who have matched
* Matching users:
* Utilizing an algorithm to form compatible matches between users

### Feature Summary:
* Unique Usernames
* Liking and Disliking Other Users
* Ability to Add Courses to your Profile
* Setting Dealbreakers
* Chat System for Matched Users
* Matching Algorithm to Show Similar Users
* Ability to Hide Attributes from Others
* Edit Information at any Time
* Delete Account

## Intructions for TA on running current work
To build the project, go to the main folder, the java folder, and finally the Main file. 
In the Main file run the main method which initializes the front-end and back-end. 

A login screen will appear, and from there you can either log in to a preexisting account or sign up for
a new account. After logging/signing in to your account, you may choose your interests/preferences which
will help the program determine whose profiles you will see. After selecting your interests/preferences,
you can view other users' profiles and like or dislike them. If you match, you may message them in the chat
page.

# Project Template
This is a template repository for CSC 207 projects. 
This repository contains starter code for a gradle project.
It also contains workflow documents that give instructions on how to manage your Github repository and how to use Github Projects for efficient collaboration.

## Checklist For Your Project
- [ ] Verify the correct settings for your project repository
- [ ] Set up Github Projects
- [ ] Create the implementation plan using issues and Github Projects
- [ ] Create deveopment branches for your features
- [ ] Use pull requests to merge finished features into main branch
- [ ] Conduct code reviews

**If your team has trouble with any of these steps, please ask on Piazza. For example, with how GitHub Classroom works, your team *may* not have permissions to do some of the first few steps, in which case we'll post alternative instructions as needed.**

## Workflow Documents

* Github Workflow: Please refer to the workflow that was introduced in the first lab. You should follow this when working on your code. The following document provides additional details too.

* [Project Planning and Development Guide](project_plan_dev.md): This document helps you to understand how to create and maintain a project plan for your class project. **This document helps you to complete the Implementation Plan Milestone.**

## Gradle Project
Import this project into your Intellij editor. It should automatically recognise this as a gradle repository.
The starter code was built using SDK version 11.0.1. Ensure that you are using this version for this project. (You can, of course, change the SDK version as per your requirement if your team has all agreed to use a different version)

You have been provided with two starter files for demonstration: HelloWorld and HelloWorldTest.

You will find HelloWorld in `src/main/java/tutorial` directory. Right click on the HelloWorld file and click on `Run HelloWorld.main()`.
This should run the program and print on your console.

You will find HelloWorldTest in `src/test/java/tutorial` directory. Right click on the HelloWorldTest file and click on `Run HelloWorldTest`.
All tests should pass. Your team can remove this sample of how testing works once you start adding your project code to the repo.

Moving forward, we expect you to maintain this project structure. You *should* use Gradle as the build environment, but it is fine if your team prefers to use something else -- just remove the gradle files and push your preferred project setup. Assuming you stick with Gradle, your source code should go into `src/main/java` (you can keep creating more subdirectories as per your project requirement). Every source class can auto-generate a test file for you. For example, open HelloWorld.java file and click on the `HelloWorld` variable as shown in the image below. You should see an option `Generate` and on clicking this your should see an option `Test`. Clicking on this will generate a JUnit test file for `HelloWorld` class. This was used to generate the `HelloWorldTest`.

![image](https://user-images.githubusercontent.com/5333020/196066655-d3c97bf4-fdbd-46b0-b6ae-aeb8dbcf351d.png)

You can create another simple class and try generating a test for this class.


