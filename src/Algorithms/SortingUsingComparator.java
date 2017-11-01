/*
Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array. 
The Player class is provided in the editor below; it has two fields:

1. A string, "name".
2. An integer, "score".

Sample Input: - 
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Sample Output: - 
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50

Explanation: - 
As you can see, the players are first sorted by decreasing score and then sorted alphabetically by name.


 */

package Algorithms;

import java.util.*;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p2.score == p1.score) {
            return p1.name.compareTo(p2.name);
        } else {
            return p1.score > p2.score ? -1 : 1;    
        }
    }
}


class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}


public class SortingUsingComparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
	}

}
