<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float i=0; i < prices.length; i++){
            System.out.println(prices[(int) i] + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i=0; i<prices.length; i++){
            if(prices[i] < 1000){
                prices[i]*=2;
            } else{
                prices[i]*=1.5;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if(prices.length==0) {
            return new int []{};
        } else if (prices.length==1) {
            return new int []{prices[0]};
        } else {
            int minPrice = prices[0];
            int maxPrice = prices[0];
            for (int i = 1; i<prices.length; i++) {
                if (prices[i]< minPrice){
                    minPrice = prices [i];
                }
                if(prices[i]>maxPrice){
                    maxPrice = prices[i];
                }
            }
            if(minPrice==maxPrice){
                return new int[]{minPrice};
            } else{
                return new int[]{minPrice, maxPrice};
            }
        }
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length==0){
            return 0;
        }
        int minPrice = prices[0];
        int count = 1;
        for (int i=1; i<prices.length;i++){
            if (prices[i]<minPrice){
                minPrice=prices[i];
                count = 1;
            } else if (prices[i]==minPrice){
                count++;
            }
        }
        return count;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int smallPrice = 0;
        for (int i = 0; i <prices.length; i++) {
            if (prices[i]==toRemove){
                smallPrice++;
            }
        }
        int[] removeSmallPrice = new int[prices.length - smallPrice];
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                removeSmallPrice[index] = prices[i];
                index++;
            }
        }
        return removeSmallPrice;
    }

    public int[] leavePrice9(int[] prices) {
        int[] pricesLoop = new int[prices.length];
        int index = 0; //додаєм змінну index для відслідковування теперішньої позиції в масиві pricesLoop
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] % 10 == 9) {
                pricesLoop[index] = prices[i]; /*операція pricesLoop[index] = prices[i] копіює значення елемента prices[i]
                в елемент масива pricesLoop з індексом index. В даному коді це виконується при виконанні умови if(prices[i] % 10 == 9)
                тобто якщо остання цифра числа prices[i] дорівнює 9. Таким чином, якщо ця умова виконана, то значення
                цього числа буде додано у новий масив pricesLoop на наступну позицію визначенною змінною index.
                Кожен раз, коли додається новий елемент в масив pricesLoop - значення змінної index збільшується на 1,
                щоб указати на наступну пусту позицію в масиві.
                */
                index++;
            }
        }
        return Arrays.copyOf(pricesLoop, index); /* Операція Arrays.copyOf(pricesLoop, index) створює новий масив, який
        містить тільки перші index елементи масиву pricesLoop. У цьому коді це використовується щоб повернути масив,
        який містить лише відфільтровані елементи. Перший аргумент методу  Arrays.copyOf - це вихідний масив, який
        потрібно скопіювати, а другий аргумент - це кількість елементів, які потрібно скопіювати.
        Таким чином Arrays.copyOf(pricesLoop, index створює новий масив, який містить тільки елементи додані в pricesLoop
        при виконанні умови if(prices[i] % 10 == 9) і повертає цей масив як результат роботи методу leavePrice9.
        Це дозволяє отримати масив, що містить ті числа, які закінчуються на 5 і не містить порожніх елементв в кінці.*/
    }


    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] mergedLoops = new String[showcaseStocks.length + warehouseStocks.length];
        int indexOfLoop = 0;
        for (int i = 0; i < showcaseStocks.length; i++) {
            mergedLoops[indexOfLoop] = showcaseStocks[i];
            indexOfLoop++;
        }
        for (int i = 0; i < warehouseStocks.length; i++) {
            mergedLoops[indexOfLoop] = warehouseStocks[i];
            indexOfLoop++;
        }
        return mergedLoops;
    }

    public int getPricesSum (int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]>=minPrice && prices[i]<= maxPrice) {
                sum += prices[i];
            }
        }
        return sum;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}


