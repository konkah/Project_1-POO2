
# Project I

## Project I: Pre-text analyzer

Objective: to develop a Java program to perform the pre-processing step of a text to be analyzed as a digraph by the free software tool Gephi. The program must accept a list of filenames of the type plain text (.txt) and, for each one of them, record an output in .csv format containing lists of adjacencies indicating succession of words for later construction of digraphs, as described next :

- each word is a unique node of the digraph (beginning of an adjacency list);
- node A has an arc for node B if and only if the word represented by B follows that represented by A in the text;
- each line of the output file starts with the word that represents the origin node, followed by the words that are the destinations of the arcs that start from it, separated by spaces or commas (Gephi format).

Note that all punctuation, quotation marks, dashes and such must be eliminated, while all text must be converted to lowercase. Each word in the text appears once and once as the initial word of the lines, in alphabetical order. The destination list can have one or more words, but without repetition on the line.

## Digraph:

Your output files will be submitted to Gephi to reveal the digraph corresponding to word sequences.

The program must consist of at least four classes with the following responsibilities:

- start the program, instantiate the control object and handle exceptions;
- control the execution of the program, coordinating the other classes;
- read text files, separate words, convert them to lowercase and remove punctuation;
- save the output file in the appropriate format with the words ordered.

Use more classes if you wish. If you find it convenient, research how to implement a multimap, as this class is not available in the standard language library. The following classes and interfaces in the Java library can be useful:

- ArrayList
- Map
- TreeMap

Implement and debug the program, generate the documentation with the javadoc tool. The teacher will provide examples of input and output texts, so that you can test your program, and two validation texts. Submit the validation files to your program and, with the outputs produced, generate the corresponding digraphs in the gephi, taking care that they are legible.

The project will be delivered as follows in Moodle:

- 1 compressed file containing all the source code (zip);
- 1 executable jar file (.jar);
- 1 contribution report file (.pdf);
- 1 figure file with the project's UML class diagram (.jpg);
- 2 files of figures of the validation graphs (.jpg);
- 1 link to the presentation video (directly in the text).

The video must have up to 12 minutes with the presentation of the project by the group, enumerating the main challenges encountered, the solutions adopted, the functionalities of the classes and the data structures used. Also show the program running on your video.

If the group used a standardized development methodology (XP, Scum, Rup, ...), describe in the video its application in the project (it is not to say what it is or how it works, but to indicate how it was used).
