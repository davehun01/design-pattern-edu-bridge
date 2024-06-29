# design-pattern-edu-bridge
Exercise to showcase the bridge pattern

This is a solution to a software dev interview assignment. The task was to create an exercise that helps beginner programmers understand the concept of the Bridge design pattern.

________________________________________________________

Create an exercise that helps students understand the use of an object-oriented design pattern of your choice! The exercise is defined by these parts:
- A reference solution that can be expected from OOP learners (1-5 short classes).
- A starter code to be shared with students at the beginning (usually created from the above by deleting lines).
- 1-3 paragraphs of instruction text that describes students what to do.
A good exercise not just requires a certain way of coding but tries to make it visible why that design is preferable in professional coding practice. 

reference solution: src folder
starter code: src_skeleton folder
instructions: bridge_exercise_description.txt

________________________________________________________

Bridge pattern exercise:
The bridge design pattern is used to take a large monolithic class (or multiple monolithic classes) and separate them into an abstraction hierarchy and an implementation hierarchy. This allows us to change both hierarchies independently of each other, adding more flexibility to the code and avoids exponential growth of subclasses.
Suppose we want to render certain shapes. The 2 known methods of rendering are via bitmap and vector graphics. Let's say, we want to draw squares and circles in both rendering methods. This results in 4 implementations, since we need to draw squares in both bitmap and vector rendering, same for the circles. So far it's not super complex, however as we add more and more shapes, the number of subclasses grows massively. Same goes for if we add more rendering methods. We cannot keep expanding in 2 dimensions and have a simple codebase with a monolithic architecture.
This is where bridge pattern comes in. 

Motivation: we want to separate the logic for shapes and rendering methods. For the sake of focusing on learning the design pattern, only the square class is required of the 2 shapes. Fill in the skeleton classes to implement the bridge pattern. Use Demo.java to test the results.
