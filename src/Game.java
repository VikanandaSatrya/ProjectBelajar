public class Game
{
    public static void main(String[] args) {
        Monster.buildBattleBoard();

//        char[][] tempBattleBoard = new char[10][10];

        Monster[] Monsters = new Monster[4];
        Monsters[0] = new Monster(1000, 20, 2, "Frank");
        Monsters[1] = new Monster(2000, 5, 7, "Sonic");
        Monsters[2] = new Monster(4000,1 , 1, "Tank");
        Monsters[3] = new Monster(500, 100, 5,"Ninja");

    Monster.redrawBoard();
    }
}