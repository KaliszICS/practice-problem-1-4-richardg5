[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18582089)
# Instructions  

  ## Questions

1. Write a function for each of the following:</br>

getName(int Line, String file)</br>
getAge(int Line, String file)</br>
getNumber(int Line, String file)</br>

Each of these functions will return the name, age or student number of student on that line in the file.</br>

The file will be setup in the following manner:</br>

Jacob Park 17 123456789</br>
Eric Lan 17 987654321</br>
Tiffany Chiu 17 123654789</br>

getName(2) would return Eric Lan.</br>
getNumber(1) would return 123456789.</br>
getAge(3) would return 17.</br>

For getName If the line number does not exist in the file return "".</br>
For getNumber and getAge If the line number does not exist in the file return -1.</br>

2. Write a function called fileAppend(String output, String filename).</br>

This will append the String you provide into the filename provided. It should return nothing.</br>