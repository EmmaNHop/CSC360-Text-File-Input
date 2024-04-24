# CSC360 Text File Input
 
Write a program, AverageNumbers.java, that prompts the user for the name of a text file. The file should
consist of a sequence of integers, one integer per line. The program will read in each line (using
nextLine()), parse it as an int (using Integer.parseInt()), and report the number of values and their average.
The average should be computed as a double.


Your program should do some basic exception handling:

    (1) If the file cannot be found then the program should print a message to that effect and terminate by executing System.exit(1).

    (2) If the file can be found then every time that the program reads in a line that cannot be parsed (i.e. Integer.parseInt() throws a NumberFormatException) the program should print an error message with the bad line.

To summarize, your program will need code to catch FileNotFoundException and
NumberFormatException.

The final printout should display the number of good (i.e. parsable) lines, the average of the parsable
values as a double, and the number of bad (unparsable) lines. Two sample runs are shown below:

Enter name of input file: numbers.txt
Cannot parse eight as an integer.
Cannot parse seven as an integer.
Cannot parse eighty-five thousand and sixty-two as an integer.
Cannot parse 13 98 as an integer.
Number of parsable lines: 6
Average value: 80.83333333333333
Number of unparsable lines: 4


Enter name of input file: Nums.txt
Could not find file: Nums.txt