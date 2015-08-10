import java.util.Scanner;

/**
 * Created by HARISH on 8/8/2015.
 */
public final class CoinChange
{
    // Dynamic programming algorithm to solve change making problem.
    // As a result, the coinsUsed array is filled with the
    // minimum number of coins needed for change from 0 -> maxChange
    // and lastCoin contains one of the coins needed to make the change.
    public static void makeChange( int [ ] coins, int differentCoins,
                                   int maxChange, int [ ] coinsUsed, int [ ] lastCoin )
    {
        coinsUsed[ 0 ] = 0; lastCoin[ 0 ] = 1;

        for( int cents = 1; cents <= maxChange; cents++ )
        {
            int minCoins = cents;
            int newCoin  = 1;

            for( int j = 0; j < differentCoins; j++ )
            {
                if( coins[ j ] > cents )   // Cannot use coin j
                    continue;
                if( coinsUsed[ cents - coins[ j ] ] + 1 < minCoins )
                {
                    minCoins = coinsUsed[ cents - coins[ j ] ] + 1;
                    newCoin  = coins[ j ];
                }
            }

            coinsUsed[ cents ] = minCoins;
            lastCoin[ cents ]  = newCoin;
        }
    }

    // Simple test program
    public static void main( String [ ] args )
    {
        // The coins and the total amount of change
        int numCoins = 4;
        int [ ] coins = { 1,5,7,10 };
        Scanner kb = new Scanner(System.in);
        int tt = kb.nextInt();
        for (int i = 0; i < tt; i++) {


            int change = kb.nextInt();





            int[] used = new int[change + 1];
            int[] last = new int[change + 1];

            makeChange(coins, numCoins, change, used, last);

            System.out.println(used[change]);
        }



    }
}
