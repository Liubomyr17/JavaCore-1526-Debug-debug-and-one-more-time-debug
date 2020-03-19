package com.company;

/*

1526. Level 15 Lection 12. Debug, debug, and debug again
The program displays 0 9, and should 6 9. Find one! mistake and correct.
Use debug. To do this, set breakpoints (Ctrl + F8), then go to the Run -> Debug menu.
F9 - code execution until the next breakpoint
F8 - go to the next line of code

Requirements:
1. The program should display data on the screen.
2. The output to the screen should correspond to the condition of the task.
3. The initialize method in class A must have the most stringent access modifier.
4. The program should not read data from the keyboard.


 */

public class Solution {
    public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        private int f1 = 7;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        private void initialize() {//3.Ну и здесь модификатор поменять
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialized();// 2.Потоми здесь тоже исправить
        }

        protected void initialized() { //1.Сначала нужно переименовать этот метод
            System.out.println(f1);
        }
    }
}



