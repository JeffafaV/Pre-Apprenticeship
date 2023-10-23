function nameInfo()
{
  var firstName = document.getElementById("firstName").value;
  var middleName = document.getElementById("middleName").value;
  var lastName = document.getElementById("lastName").value;
  var fullName = firstName + " " + middleName + " " + lastName;
  document.getElementById("fullName").innerHTML = fullName;
}