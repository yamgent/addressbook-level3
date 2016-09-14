# Developer Guide

* [Setting Up](#setting-up)
* [Design](#design)
* [Testing](#testing)
* [Appendix A: User Stories](#appendix-a--user-stories)
* [Appendix B: Use Cases](#appendix-b--use-cases)
* [Appendix C: Non Functional Requirements](#appendix-c--non-functional-requirements)
* [Appendix D: Gloassary](#appendix-d--glossary)

## Setting up

#### Prerequisites

1. **JDK 8** or later 
2. **Eclipse** IDE
3. **e(fx)clipse** plugin for Eclipse (Do the steps 2 onwards given in 
   [this page](http://www.eclipse.org/efxclipse/install.html#for-the-ambitious))


#### Importing the project into Eclipse

0. Fork this repo, and clone the fork to your computer
1. Open Eclipse (Note: Ensure you have installed the **e(fx)clipse plugin** as given in the prerequisites above)
2. Click `File` > `Import`
3. Click `General` > `Existing Projects into Workspace` > `Next`
4. Click `Browse`, then locate the project's directory
5. Click `Finish`

## Design
<img src="images/mainClassDiagram.png"/>

## Testing

* In Eclipse, right-click on the `test/java` folder and choose `Run as` > `JUnit Test`

## Appendix A : User Stories

Priorities: High (must have) - `* * *`, Medium (nice to have)  - `* *`,  Low (unlikely to have) - `*`


Priority | As a ... | I want to ... | So that I can...
-------- | :-------- | :--------- | :-----------
`* * *` | new user | see usage instructions | refer to instructions when I forget how to use the App
`* * *` | new user | import contacts from other file formats (like .csv) | easily copy my contacts from another program
`* * *` | user | add a new person | 
`* * *` | user | delete a person | can remove entries that I no longer need
`* * *` | user | find a person by name | locate details of persons without having to go through the entire list
`* * *` | user | add tags to person | categories each contact in terms of my relationship with the person
`* * *` | user | remove tags from person | remove outdated relationship descriptors with the person
`* *` | user | list persons with a specific tag | locate persons within a certain group without having to go through the entire list
`* *` | user | hide [private contact details](#private-contact-detail) by default | to minimize chance of someone else seeing them by accident
`* *` | user holding supervising role | email persons with a specific tag | easily communicate with team members without leaving out anyone
`*` | user with many persons in the address book | delete all entries | start anew if all my contacts are stale
`*` | user with many persons in the address book | sort persons by name | locate a person easily
`*` | migrating user | export contacts to other file formats (like .csv) | easily move my contacts into another program


## Appendix B : Use Cases

(For all use cases below, the **System** is the `AddressBook` and the **Actor** is the `user`, unless specified otherwise)

#### Use case: Delete person

**MSS**

1. User requests to list persons
2. AddressBook shows a list of persons
3. User requests to delete a specific person in the list
4. AddressBook deletes the person <br>
Use case ends.

**Extensions**

2a. The list is empty

> Use case ends

3a. The given index is invalid

> 3a1. AddressBook shows an error message <br>
  Use case resumes at step 2
  
#### Use case: Edit tag

*Pre-conditions:* 
* User have adminstrative rights to change tags.

*Guarantees:*
* The change made will be logged by the application (see last week tutorial).

**MSS**

1. User requests to list persons
2. AddressBook shows a list of persons
3. User requests to change tag of specific person from 'A' to 'B' in the list
4. AddressBook requests for change confirmation
5. User confirms the changes
6. AddressBook updates the person's tag <br>
Use case ends.

**Extensions**

2a. There are no persons in the list

> Use case ends.

3a. The given index is invalid

> 3a1. AddressBook shows an error message <br>
  Use case resumes at step 2.
  
3b. Tag 'A' does not exist

> 3b1. AddressBook shows an error message <br>
  Use case resumes at step 2.
  
3c. Tag 'B' is empty

> 3c1. AddressBook shows an error message <br>
  3c2. AddressBook requests User to enter a non-blank tag <br>
  3c3. User enters a non-blank tag 'C' <br>
  Use case resumes at step 4.
  
5a. User declines the changes

> 5a1. AddressBook shows a 'changes not saved' message <br>
  Use case ends.

## Appendix C : Non Functional Requirements

1. Should work on any [mainstream OS](#mainstream-os) as long as it has Java 8 or higher installed.
2. Should be able to hold up to 1000 persons.
3. Should come with automated unit tests and open source code.
4. Should favor DOS style commands over Unix-style commands.
5. Should work on both 32-bits and 64-bits system.
6. Should boot up and be ready for user input within 2 seconds.
7. Should comply with [IAAB-1337](#iaab-1337) standards set by [IAAB](#iaab).

## Appendix D : Glossary

##### IAAB

> International Association of Address Booking. Founded by Wang Leng, the organization
  provides several internationally recognized standards in regards to interoperability 
  of address book programs.

##### IAAB-1337

> Proposed format that address book programs should ideally follow in order to ensure 
  compatibility with other address book programs.

##### Mainstream OS

> Windows, Linux, Unix, OS-X

##### Private contact detail

> A contact detail that is not meant to be shared with others

