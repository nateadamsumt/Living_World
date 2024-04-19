# Living_World
CSCI 152 Assignment 3

This assignment is made to use implementation of other class files and create a living world of different characters in different cultures. These creatures have different actions based on theur cultures and can interact among those parameters. Below is the full description of the assignment given.

Assignment Description:

This assignment is meant to help you create a base which could be augmented and built on in the future. Whether it be for assignments to come, classes to come (for example AI), or even just for fun (if you think genetic algorithms are fun).

Essentially, what you will be building here is a world with creature objects in it. This creature object will need to be built in such a way that one day it could move, sense, eat, starve, etc. But to begin with, it just needs to be created, die, and reproduce based on preset odds.'

So in terms of proper requirements, this assignment must include the following:

    At least three classes and/or interfaces (3 total not 3 of each).
    At least two relationships.
    A creature class with space for creature attributes and methods (eg. chances of replicating and dying). Required creature-specific methods:
        die()
        reproduce()
    A World class with world and environment attributes and methods (eg. chances of spawning new creatures without replication). Required World specific methods:
        createCreature()
        This method might hit the names.txt file in this project to get a random name for your creatures.
        spawnFood(), etc.
    Support for multiple creatures within the world.
    Main loop where these chances are 'rolled' for a number of times in a row.

If you would like you may diverge from the Biologic theming in this assignment but please keep the broad requirements intact. For example, follow requirements 1, 2, 3, etc. but not 1.1, 1.2, 4.1.1, etc.3