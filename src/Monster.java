import java.util.Arrays;

public class Monster{
    static char[][] battleBoard = new char[10][10];

    public static void buildBattleBoard()
    {
        for(char[] row : battleBoard)
        {
            Arrays.fill(row, '*');
        }
    }
    public static void redrawBoard()
    {
        int k = 1;
        while(k <= 30)
        {
            System.out.print('-');
            k++;
        }
        System.out.println();

        for(int i = 0; i < battleBoard.length; i++)
        {
            for (int j = 0; j < battleBoard[i].length; j++)
            {
                System.out.print("|" + battleBoard[i][j] + "|");
            }
            System.out.println();
        }
        int x = 1;
        while(x <= 30)
        {
            System.out.print('-');
            x++;
        }
        System.out.println();
    }

    public final String TOMBSTONE = "Here Lies a Dead Monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    public int xPosition = 0;
    public int yPosition= 0;
    private boolean alive= true;
    public String name = "Big Monster";
    public char nameChar1 = 'B';
    public static int numOfMonster = 0;
    public int getAttack()
    {
        return attack;
    }
    public int getMovement()
    {
        return movement;
    }
    public int getHealth()
    {
        return health;
    }
    public boolean getAlive()
    {
        return alive;
    }
    public void setHealth(int decreasedHealth)
    {
        health = health - decreasedHealth;
        if(health<0)
        {
            alive = false;
        }
    }
    public void setHealth(double decrease)
    {
        int intDecreasedHealth = (int) decrease;
        health = health - intDecreasedHealth;
        if(health < 0)
        {
            alive = false;
        }
    }

    public Monster(int newHealth, int newAttack, int newMovement, String newName)
    {
        health = newHealth;
        attack = newAttack;
        movement = newMovement;
        name = newName;

        int maxXBoardSpace = battleBoard.length-1;
        int maxYBoardSpace = battleBoard[0].length-1;

        int randNumX, randNumY;
        do
        {
            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY = (int) (Math.random() * maxYBoardSpace);
        }
        while(battleBoard[randNumX][randNumY] != '*');
        this.xPosition = randNumX;
        this.yPosition = randNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

        numOfMonster++;
    }
//     Default construction
    public Monster()
    {
        numOfMonster++;

    }


}