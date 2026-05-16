// (\x min max-> if x<min then min else if x>max then max else x)

#include <stdio.h>

int func(int x, int min, int max) {
    if (x < min) return min;
    else if (x > max) return max;
    else return x;
}

int main() {

    printf("%d\n", func(20, 3, 15));

    return 0;
}