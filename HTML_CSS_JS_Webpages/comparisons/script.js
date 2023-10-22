var inputGrade = prompt("Enter a grade:");

var numberGrade = parseInt(inputGrade);

var letterGrade;

// Add your code below
if (numberGrade >= 90)
{
  letterGrade = "A";
}
else if (numberGrade >= 80)
{
  letterGrade = "B";
}
else if (numberGrade >= 70)
{
  letterGrade = "C";
}
else if (numberGrade >= 60)
{
  letterGrade = "D";
}
else
{
  letterGrade = "F";
}

alert(letterGrade);