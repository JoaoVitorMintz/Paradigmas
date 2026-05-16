/*
funcao :: Int-> Int-> Int-> Bool
funcao a b c = if a*a + b*b == c*c then True else if a*a +
c*c == b*b then True else if b*b + c*c == a*a then True else
False
*/

#include <stdio.h>
#include <stdbool.h>

bool func(int a, int b, int c) {
    if (a*a + b*b == c*c) return true;
    else if (a*a + c*c == b*b) return true;
    else if (b*b + c*c == a*a) return true;
    else return false;
}

int main() {

    if (func(5, 3, 4)) {
        printf("True\n");
    } else {
        printf("False\n");
    }

    return 0;
}