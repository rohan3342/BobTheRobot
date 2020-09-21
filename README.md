# Bob The Robot

## Overview
The primary objective of the game is for the user to search for a way out of a 2D Maze. Throughout the maze, there are some speed boosters placed on different locations where the user can pick up and use to aid there way out of the maze. However, there are also several obstacles that the user must avoid in order to exit the maze successfully. This section elaborates on the description of the game play and user controls

### Game Description
In the game, the player is playing as a Robot named "Bob" that has to find the exit through a maze. To escape from the maze, the player must avoid getting caught by enemies. Throughout the maze, the player can find speed boosters, that can speed up their walk, to help to escape enemies and to get out of the maze as soon as possible. 

### User Manual 
Direction Keys: 
Key "w & arrow up" : Move the mouse forward
Key "s & arrow down" : Move the mouse backward
Key "a & arrow left" : Turn left
Key "d & arrow right" : Turn right

## Game Design
BOB the robot, is a labyrinth game for Pc. The objective of the game is for the player(BOB) to find their way out of a challenging maze.  Solver must find a route, and to simpler non-branching patterns that lead unambiguously through a convoluted layout to a goal. The game can be played by every age group from 6-adults.
Mazes have been built with walls by setting the location of blocks in pixels. Mazes can be very large; depending on the levels, in which many of the apparent pathways are imaginary routes seen. A total of 5 levels have been designed on increasing order of difficulty.
A particular levels contain the following items: Maze walls, BOB, Boosters, Enemy Fliers, Enemy Walkers, Start Block, Final Block.
1. Collision detection with the walls of the player slower the speed of player, takes a step back and regains the speed from the position. 
2. Enemies are placed on different locations to increase the complexity to reach the final block. 2 types of enemies are present   i.e.  Enemy walker and Enemy Fliers which on hitting the player resets its position to the beginning and resets its speed.
3. The enemy fliers can fly across all the block in a fixed position, whereas Enemy walkers are placed on particular gaps between walls and can move only there. 
4. Speed boosters have been provided to the player at different positions to increase its speed. The speed range is within 0-6. As soon as the player touches the booster, the speed increments by 1 from the previous speed.
5. Three lives are given to the player. The value of  lives are set to 3. The lives decrease every time the layers collides with the enemy. After three collisions, YOU LOSE screen appears, which is the redirected to start screen on pressing enter.

## Implementation 
### Java
Entire logic part was done on Java running on Greenfoot IDE. The platform provides all the Greenfoot APIs and runtime environment for developing and running application on your development machine. For Java, JDK has to be installed and the system environment PATH has to be set up for the proper functioning of Greenfoot IDE.
### Greenfoot
Greenfoot is an integrated development environment using Java or Stride designed. It allows development of two-dimensional graphical applications, such as simulations and interactive games. The Greenfoot programming model consists of a World class (represented by a rectangular screen area) and any number of actor objects that are present in the world and can be programmed to act independently. The world and actors are represented by Java objects and defined by Java classes.

