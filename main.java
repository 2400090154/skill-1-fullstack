mkdir MyProject
cd MyProject
git init
git config --global user.name "KARTHIK"
git config --global user.email "chennamvenkatakarthik@gmail.com"
echo public class Main { public static void main(String[] args) { System.out.println("Hello, Git!"); } } > main.java
echo This is my Git practice project. > notes.txt
git status
git add main.java notes.txt
git add .
  git status
