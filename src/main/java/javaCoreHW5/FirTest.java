<<<<<<< HEAD
package main.java.javaCoreHW5;
=======
package javaCoreHW5;
>>>>>>> 855ebd8 (rebuilded project)

public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = n;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calc(n-1);
        }
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int num = 1;
        for (int i = 0; i <=n ; i++) {
            if(i % 2 != 0){
                num *= i;
            }
        }
        return num;
    }
}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            if(i % 3 ==0 || i % 5 == 0) {
                if (i % 15 != 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for (int i = 1; i <= n ; i++) {
            if(i % 2 == 0) {
                result += i;
            }
        }
        return result / 2;
    }
}