# Adjust List By Normalizing
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
The AdjustListByNormalizing program is a Java application that reads a list of numbers, identifies the highest value in the list, and normalizes the entire list by dividing each number by the highest value. The program then outputs the normalized values, each formatted to two decimal places. This normalization process scales all values to be between 0 and 1, which is useful for comparing datasets with different ranges.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

- Clone or download the repository: 
```Java 
- git clone https://github.com/EMK2473/AdjustListByNormalizing.git 
```

- Navigate to the project directory: 
```Java
- cd AdjustListByNormalizing 
```
- Compile the AdjustListByNormalizing.java file: 
```Java
- javac AdjustListByNormalizing.java 
```
- Run the program: 
```Java
- java AdjustListByNormalizing
```

## Application Usage
Once the program is running, it will prompt you to input an integer representing the number of elements to be processed, followed by the actual elements (double values). The program will find the highest value and divide all values in the list by this number, producing a normalized list where each value falls between 0 and 1.  Example:  

- Number of inputs: 3 
- Input Values: 4.0 8.0 6.0

Input:

```Java 
3
4.0 8.0 6.0 
```
The highest value in this case is 8.0 

Output:
```Java
0.50 1.00 0.75
```

## Contributions
Eric Keeton

## Test Commands
Test the program with various sets of numbers to ensure that it correctly finds the maximum value and normalizes the list.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)