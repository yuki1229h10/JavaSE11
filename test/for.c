#include "stdio.h"
#include "stdlib.h"

int main(void)
{

    for (int y = 1; y <= 8; y++)
    {
        printf("内側のループ開始¥n");

        for (int x = 1; x <= 4; x++)
        {
            printf("%d-%d", y, x);
        }
        printf("内側のループ終了¥n");
    }
    printf("外側のループ終了¥n");

    return 0;
}