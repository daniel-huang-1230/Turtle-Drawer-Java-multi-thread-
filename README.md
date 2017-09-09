# Project Overview 

This small program has two java files: **CS8BTurtle.java** and **CS8BTurtle_Threaded.java**. The first one is a **single-threaded** program
that use one turtle instance to draw the characters (which show my course ID back in winter 2016 at **UC San Diego**).
The second program use multiple threads to draw the same characters all at once.
The code is, naturally, way far from clean and efficient since it's one of the first few programs I wrote 
back when I started learning how to code in 2016. But I think we all have to start somewhere and I  would like to keep this 
repo public for future improvements.

# Date: 03/10/2016

# Language
The program is written in **Java**

# Program Description:
Explain how to run your program. What happens when you run it? How did you test your program to ensure correct output? 
To run this program,  I will have to type in the following line in my command terminal(mac):java -cp ./turtleClasses.jar:. xxxxxx   
The xxxxx represents the java file name of the one we want to run.
For the CS8BTurtle.java, when I run it you will see a cute little turtle appear in a blank rectangular space. And it will draw three lines of texts containing my CS8B login, 
Winter term, and the year 2016.
For the second one, the CS8BTurtle_Threaded.java, you will see MANY turtles appear in the 
blank space. Each turtle is responsible for one single character. So they will draw the same three lines of texts simultaneously!

The way I test/make sure my code draw exactly what I intend it to be is to figure out the width and height of each character first, calculate the spacings between each character, and then put them in the center of the world(the blank space),which is not hard since I know the dimension of the world in advance.


# ScreenShots of the drawing 


<img width="884" alt="2017-09-09 02 56 04 am" src="https://user-images.githubusercontent.com/19476654/30239212-2ac18428-950c-11e7-943f-b339841f1bd9.png">

<img width="912" alt="2017-09-09 02 57 21 am" src="https://user-images.githubusercontent.com/19476654/30239215-2c2f0b8c-950c-11e7-9fa6-54ed57bbbb1b.png">




# Author 
[@Daniel](https://www.linkedin.com/in/daniel-huang-443546115/)
