# TDT4250-Assignment-1

This repository is for assignment 1 in course TDT4250 for autumn 2020. It consists of the following subjects:

  - Repo structure
  - Content

## Repo structure:

The model folder contains the ecore-file (.ecore) for modeling the project, and a generator-file (.genmodel) for generating the model file.

The generator created the src folder with the interface, implementation and utility packages. Inside the utility package there are a validator for checking constraints.

## Content:

### Model:
Assignment 1 is the first version of the study plan model and may be changed later during this course.

Study plan is the root for the model and can be distinguish by the student number. Study plan has programmes which are containment and opposites for the year class, and has a reference to the specialisation class. Specialication has a reference to itself for when there are a second specialisation in that programme.

Further a year consists for semester classes, that references to relations class, "CourseInSemester". This is for knowing if it is mandatory that semester, or elected in that study plan. This naturally references to a course to get the name, code and credits.

The model has a data type class that which knows the pattern for the course codes.

### Generated files:
In the validation file there are "handwritten" constraints for the model. E.g. if the course is mandatory for the programme/specialisation, it is also elected. Also it checks if the the year at least contains courses with a credit sum of 60 points.
