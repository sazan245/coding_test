package com.kuebiko.it.Sajan;

/**
 * Given a positive integer "num" and number "limit"
 * find factorial for the total given "limit"
 * eg. num = 7, limit = 2 => 42 (7*6)
 *  num = 11, limit = 3 => 990 (11*10*9)
 *  num = 4, limit = 1 => 4 (4)
 *  num = 9, limit = 5 => 15120 (9*8*7*6*5)
 *  num = 21, limit = 4 => 143640 (9*8*7*6*5)
 */
public class FindLimitFactorial {

  public long findLimitFactorial(int num, int limit) {
    if(limit>num){
      limit=num;
    }
    int total=num;
    for (int i = 2; i<=limit;i++){
      total = total * (num-(i-1));
    }
    return total;
  }

}
