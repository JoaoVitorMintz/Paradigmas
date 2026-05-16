// (\x y z-> if x>=y && x>=z then x else if y>=z then y else z)

#include <stdio.h>

int func(int x, int y, int z) {
    if (x >= y && x >= z) return x;
    else if (y>=z) return y;
    else return z;
}

int main() {

    printf("%d\n", func(126, 3, 200));

    return 0;
}