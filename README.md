# Jets Application

### Description
The Jets Application has jets that load as the program starts.
Once the program has started you have 9 options to choose from.

1. List fleet
2. Fly all jets
3. View fastest jet
4. View jet with longest range
5. Load all Cargo Jets
6. Dogfight!
7. Add a jet to Fleet
8. Remove a jet from Fleet
9. Quit

Number one will list the fleet of stored Jets. Number 2 will list all the jets and how long they can fly until they run out of fuel. Number 3 will show the fastest jet in the fleet. Number 4 will show the jet with the longest range. Number five will load all available cargo trucks. Number 6 will put fighter jets into fight mode. Number 7 will allow the user to add a jet to the fleet. Number 8 allows the user to remove a jet from the fleet. Finally you can end the program by pressing the number 9.

When adding a jet to the fleet, the program allows you to enter a model name.  When entering a model name, start all entries with entering a "C" to store a Cargo Plane or, "F" to store a fighter jet.

For example,

Model: FTF150 Fighter. (Stores a Fighter Jet)
Model: CTF130 Cargo. (Stores a Cargo Carrier)

### Applied Concepts
Loops
BufferReader
Methods
Class
Constructors
exceptions
extends
interface
Lists

### User Stories
User Story #1
Create a JetsApplication with a main method to launch your program.

User Story #2
Jets are found at an AirField. Create the AirField class, which has an empty List of Jets.

User Story #3
On program startup, populate the AirField with at least 5 Jets of different types.

These jets must be read from a text file, where each line in the file contains data for a single Jet object.

This file exists at the root of your Eclipse project. It can be comma- or tab-separated; either implementation is acceptable.
The method to parse a file into Jet objects should return a List<Jet>. Its parameter can be a String file name.
Remember to use String.split(regex) to break each line in the file into data to create an individual jet.
User Story #4
There is a menu with these options:

List fleet
Fly all jets
View fastest jet
View jet with longest range
Load all Cargo Jets
Dogfight!
Add a jet to Fleet
Remove a jet from Fleet
Quit
  
User Story #5
List fleet prints out the model, speed, range, and price of each jet. (There must be at least 5 jets stored when the program starts).

User Story #6
Fly all Jets calls the fly() method on the entire fleet of jets. fly() prints out the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range).

User Story #7
The view fastest jet and longest range options both print out all of the information about a jet.

Note: these methods must search the collection of jets to find the appropriate jet.
  
User Story #8
The user is presented with an option specific to the interfaces you created. For example, Load all Cargo Jets, above, finds all implementors of the CargoCarrier interface and calls loadCargo() on each. (Note that the menu text is italicized because your options may be different, depending on your interfaces.)

User Story #9
A user can add custom jets to the fleet.

This can be a JetImpl.
Stretch Goal: This leads to a sub-menu where the user chooses the type of Jet.
Users then enter information for the Jet, and it is added to the AirField.

User Story #10
A user can remove a jet from the fleet.

The user is presented with a sub-menu to select a jet to delete by number.
Stretch Goal: a user can remove a jet (or jets) by name.
User Story #11
Quit exits the program.

### Things Learned
After a bump in the road that had me stuck over the weekend, I was able to complete my project. I learned how important the details are over the weekend. I was stuck on importing from a text file, so I thought. My text file had extra lines that were not being occupied with text. I didn't think anything of it, but it was causing an array out of bounds error. Once I recieved help, I was able to move on and complete the project. There are a couple of bugs that I was not able to work out up to this point.

I need to work on writing README's to practice speaking the language.
