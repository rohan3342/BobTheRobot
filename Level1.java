import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World 
{
    //https://pixelworlds.fandom.com/wiki/Tier_7_Props  

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,600,1);   
        prepare();
        }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    
    private void prepare()
    {
        //------------------------------ Frame Start -------------------------
        MazeBlock mazeBlock1 = new MazeBlock();
        MazeBlock mazeBlock2 = new MazeBlock();
        MazeBlock mazeBlock3 = new MazeBlock();
        MazeBlock mazeBlock4 = new MazeBlock();
        MazeBlock mazeBlock5 = new MazeBlock();
        MazeBlock mazeBlock6 = new MazeBlock();
        MazeBlock mazeBlock7 = new MazeBlock();
        MazeBlock mazeBlock8 = new MazeBlock();
        MazeBlock mazeBlock9 = new MazeBlock();
        MazeBlock mazeBlock10 = new MazeBlock();
        MazeBlock mazeBlock11 = new MazeBlock();
        MazeBlock mazeBlock12 = new MazeBlock();
        MazeBlock mazeBlock13 = new MazeBlock();
        MazeBlock mazeBlock14 = new MazeBlock();
        MazeBlock mazeBlock15 = new MazeBlock();
        MazeBlock mazeBlock16 = new MazeBlock();
        MazeBlock mazeBlock17 = new MazeBlock();
        MazeBlock mazeBlock18 = new MazeBlock();
        MazeBlock mazeBlock19 = new MazeBlock();
        MazeBlock mazeBlock20 = new MazeBlock();
        MazeBlock mazeBlock21 = new MazeBlock();
        MazeBlock mazeBlock22= new MazeBlock();
        MazeBlock mazeBlock23 = new MazeBlock();
        MazeBlock mazeBlock24 = new MazeBlock();
        MazeBlock mazeBlock25 = new MazeBlock();
        MazeBlock mazeBlock26 = new MazeBlock();
        MazeBlock mazeBlock27 = new MazeBlock();
        MazeBlock mazeBlock28 = new MazeBlock();
        MazeBlock mazeBlock29 = new MazeBlock();
        MazeBlock mazeBlock30 = new MazeBlock();
        MazeBlock mazeBlock31 = new MazeBlock();
        MazeBlock mazeBlock32 = new MazeBlock();
        MazeBlock mazeBlock33 = new MazeBlock();
        MazeBlock mazeBlock34 = new MazeBlock();
        MazeBlock mazeBlock35 = new MazeBlock();
        MazeBlock mazeBlock36 = new MazeBlock();
        MazeBlock mazeBlock37 = new MazeBlock();
        MazeBlock mazeBlock38 = new MazeBlock();
        MazeBlock mazeBlock39 = new MazeBlock();
        MazeBlock mazeBlock40 = new MazeBlock();
        MazeBlock mazeBlock41 = new MazeBlock();
        MazeBlock mazeBlock42 = new MazeBlock();
        MazeBlock mazeBlock43 = new MazeBlock();
        MazeBlock mazeBlock44 = new MazeBlock();
        MazeBlock mazeBlock45 = new MazeBlock();
        MazeBlock mazeBlock46 = new MazeBlock();
        MazeBlock mazeBlock47 = new MazeBlock();
        MazeBlock mazeBlock48 = new MazeBlock();

        //-----------------------------

        addObject(mazeBlock1,20,20);
        addObject(mazeBlock2,20,20);
        addObject(mazeBlock3,20,20);
        addObject(mazeBlock4,20,20);
        addObject(mazeBlock5,20,20);
        addObject(mazeBlock6,20,20);
        addObject(mazeBlock7,20,20);   
        addObject(mazeBlock8,20,20);
        addObject(mazeBlock9,20,20);
        addObject(mazeBlock10,20,20);
        addObject(mazeBlock11,20,20);
        addObject(mazeBlock12,20,20);
        addObject(mazeBlock13,20,20);
        addObject(mazeBlock14,20,20);
        addObject(mazeBlock15,20,20);   
        addObject(mazeBlock16,20,20);
        addObject(mazeBlock17,20,20);
        addObject(mazeBlock18,20,20);
        addObject(mazeBlock19,20,20);
        addObject(mazeBlock20,20,20);
        addObject(mazeBlock21,20,20);
        addObject(mazeBlock22,20,20);
        addObject(mazeBlock23,20,20);
        //addObject(mazeBlock24,20,20);   
        addObject(mazeBlock25,20,20);
        addObject(mazeBlock26,20,20);
        addObject(mazeBlock27,20,20);
        addObject(mazeBlock28,20,20);
        addObject(mazeBlock29,20,20);
        addObject(mazeBlock30,20,20);
        addObject(mazeBlock31,20,20);
        addObject(mazeBlock32,20,20);
        addObject(mazeBlock33,20,20);
        addObject(mazeBlock34,20,20);   
        addObject(mazeBlock35,20,20);
        addObject(mazeBlock36,20,20);
        addObject(mazeBlock37,20,20);
        //addObject(mazeBlock38,20,20);
        addObject(mazeBlock39,20,20);
        addObject(mazeBlock40,20,20);
        addObject(mazeBlock41,20,20);
        addObject(mazeBlock42,20,20);
        addObject(mazeBlock43,20,20);
        addObject(mazeBlock44,20,20);   
        addObject(mazeBlock45,20,20);
        addObject(mazeBlock46,20,20);
        addObject(mazeBlock47,20,20);
        addObject(mazeBlock48,20,20);

        //-----------------------------

        mazeBlock1.setLocation(0,0);
        mazeBlock2.setLocation(50,0);
        mazeBlock3.setLocation(100,0);
        mazeBlock4.setLocation(150,0);
        mazeBlock5.setLocation(200,0);
        mazeBlock6.setLocation(250,0);
        mazeBlock7.setLocation(300,0);
        mazeBlock8.setLocation(350,0);
        mazeBlock9.setLocation(400,0);
        mazeBlock10.setLocation(450,0);
        mazeBlock11.setLocation(500,0);
        mazeBlock12.setLocation(550,0);
        mazeBlock13.setLocation(600,0);
        mazeBlock14.setLocation(600,50);
        mazeBlock15.setLocation(600,100);
        mazeBlock16.setLocation(600,150);
        mazeBlock17.setLocation(600,200);
        mazeBlock18.setLocation(600,250);
        mazeBlock19.setLocation(600,300);
        mazeBlock20.setLocation(600,350);
        mazeBlock21.setLocation(600,400);
        mazeBlock22.setLocation(600,450);
        mazeBlock23.setLocation(600,500);
        //mazeBlock24.setLocation(600,550);
        mazeBlock25.setLocation(600,600);
        mazeBlock26.setLocation(550,600);
        mazeBlock27.setLocation(500,600);
        mazeBlock28.setLocation(450,600);
        mazeBlock29.setLocation(400,600);
        mazeBlock30.setLocation(350,600);
        mazeBlock31.setLocation(300,600);
        mazeBlock32.setLocation(250,600);
        mazeBlock33.setLocation(200,600);
        mazeBlock34.setLocation(150,600);
        mazeBlock35.setLocation(100,600);
        mazeBlock36.setLocation(50,600);
        mazeBlock37.setLocation(0,600);
        //mazeBlock38.setLocation(0,550);
        mazeBlock39.setLocation(0,500);
        mazeBlock40.setLocation(0,450);
        mazeBlock41.setLocation(0,400);
        mazeBlock42.setLocation(0,350);
        mazeBlock43.setLocation(0,300);
        mazeBlock44.setLocation(0,250);
        mazeBlock45.setLocation(0,200);
        mazeBlock46.setLocation(0,150);
        mazeBlock47.setLocation(0,100);
        mazeBlock48.setLocation(0,50);

        //----------------------------- Frame End ---------------------------
        //----------------------------- Internal Walls ----------------------
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,20,20);
        mazeBlock49.setLocation(150,550);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,20,20);
        mazeBlock50.setLocation(150,500);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,20,20);
        mazeBlock51.setLocation(150,450);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,20,20);
        mazeBlock52.setLocation(100,450);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,20,20);
        mazeBlock53.setLocation(50,350);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,20,20);
        mazeBlock54.setLocation(100,350);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,20,20);
        mazeBlock55.setLocation(150,350);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,20,20);
        mazeBlock56.setLocation(200,350);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,20,20);
        mazeBlock57.setLocation(250,350);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,20,20);
        mazeBlock58.setLocation(250,400);
        MazeBlock mazeBlock59 = new MazeBlock();
        addObject(mazeBlock59,20,20);
        mazeBlock59.setLocation(250,500);
        MazeBlock mazeBlock60 = new MazeBlock();
        addObject(mazeBlock60,20,20);
        mazeBlock60.setLocation(300,500);
        MazeBlock mazeBlock61 = new MazeBlock();
        addObject(mazeBlock61,20,20);
        mazeBlock61.setLocation(300,450);

        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,20,20);
        mazeBlock62.setLocation(400,550);
        MazeBlock mazeBlock63 = new MazeBlock();
        addObject(mazeBlock63,20,20);
        mazeBlock63.setLocation(400,500);
        MazeBlock mazeBlock64 = new MazeBlock();
        addObject(mazeBlock64,20,20);
        mazeBlock64.setLocation(400,450);
        MazeBlock mazeBlock65 = new MazeBlock();
        addObject(mazeBlock65,20,20);
        mazeBlock65.setLocation(450,400);
        MazeBlock mazeBlock66 = new MazeBlock();
        addObject(mazeBlock66,20,20);
        mazeBlock66.setLocation(500,350);
        MazeBlock mazeBlock67 = new MazeBlock();
        addObject(mazeBlock67,20,20);
        mazeBlock67.setLocation(450,300);
        MazeBlock mazeBlock68 = new MazeBlock();
        addObject(mazeBlock68,20,20);
        mazeBlock68.setLocation(400,300);
        MazeBlock mazeBlock69 = new MazeBlock();
        addObject(mazeBlock69,20,20);
        mazeBlock69.setLocation(350,300);
        MazeBlock mazeBlock70 = new MazeBlock();
        addObject(mazeBlock70,20,20);
        mazeBlock70.setLocation(350,350);
        MazeBlock mazeBlock71 = new MazeBlock();
        addObject(mazeBlock71,20,20);
        mazeBlock71.setLocation(250,300);
        MazeBlock mazeBlock72 = new MazeBlock();
        addObject(mazeBlock72,20,20);
        mazeBlock72.setLocation(50,300);
        MazeBlock mazeBlock73 = new MazeBlock();
        addObject(mazeBlock73,20,20);
        mazeBlock73.setLocation(150,250);
        MazeBlock mazeBlock74 = new MazeBlock();
        addObject(mazeBlock74,20,20);
        mazeBlock74.setLocation(100,200);
        MazeBlock mazeBlock75 = new MazeBlock();
        addObject(mazeBlock75,20,20);
        mazeBlock75.setLocation(150,200);
        MazeBlock mazeBlock76 = new MazeBlock();
        addObject(mazeBlock76,20,20);
        mazeBlock76.setLocation(200,200);
        MazeBlock mazeBlock77 = new MazeBlock();
        addObject(mazeBlock77,20,20);
        mazeBlock77.setLocation(250,200);
        MazeBlock mazeBlock78 = new MazeBlock();
        addObject(mazeBlock78,20,20);
        mazeBlock78.setLocation(300,200);
        MazeBlock mazeBlock79 = new MazeBlock();
        addObject(mazeBlock79,20,20);
        mazeBlock79.setLocation(350,200);
        MazeBlock mazeBlock80 = new MazeBlock();
        addObject(mazeBlock80,20,20);
        mazeBlock80.setLocation(350,250);
        MazeBlock mazeBlock81 = new MazeBlock();
        addObject(mazeBlock81,20,20);
        mazeBlock81.setLocation(200,150);
        MazeBlock mazeBlock82 = new MazeBlock();
        addObject(mazeBlock82,20,20);
        mazeBlock82.setLocation(250,150);
        MazeBlock mazeBlock83 = new MazeBlock();
        addObject(mazeBlock83,20,20);
        mazeBlock83.setLocation(150,100);
        MazeBlock mazeBlock84 = new MazeBlock();
        addObject(mazeBlock84,20,20);
        mazeBlock84.setLocation(100,100);
        MazeBlock mazeBlock85 = new MazeBlock();
        addObject(mazeBlock85,20,20);
        mazeBlock85.setLocation(250,50);
        MazeBlock mazeBlock86 = new MazeBlock();
        addObject(mazeBlock86,20,20);
        mazeBlock86.setLocation(350,100);
        MazeBlock mazeBlock87 = new MazeBlock();
        addObject(mazeBlock87,20,20);
        mazeBlock87.setLocation(500,100);
        MazeBlock mazeBlock88 = new MazeBlock();
        addObject(mazeBlock88,20,20);
        mazeBlock88.setLocation(450,100);
        MazeBlock mazeBlock89 = new MazeBlock();
        addObject(mazeBlock89,20,20);
        mazeBlock89.setLocation(450,150);
        MazeBlock mazeBlock90 = new MazeBlock();
        addObject(mazeBlock90,20,20);
        mazeBlock90.setLocation(450,200);
        MazeBlock mazeBlock91 = new MazeBlock();
        addObject(mazeBlock91,20,20);
        mazeBlock91.setLocation(500,200);
        MazeBlock mazeBlock92 = new MazeBlock();
        addObject(mazeBlock92,20,20);
        mazeBlock92.setLocation(550,200);
        MazeBlock mazeBlock93 = new MazeBlock();
        addObject(mazeBlock93,20,20);
        mazeBlock93.setLocation(550,250);
        MazeBlock mazeBlock94 = new MazeBlock();
        addObject(mazeBlock94,20,20);
        mazeBlock94.setLocation(550,450);
        MazeBlock mazeBlock95 = new MazeBlock();
        addObject(mazeBlock95,20,20);
        mazeBlock95.setLocation(550,500);
        MazeBlock mazeBlock96 = new MazeBlock();
        addObject(mazeBlock96,20,20);
        mazeBlock96.setLocation(500,500);
                
        //////----------- Runner
        MazeRunner R1 = new MazeRunner(3);
        addObject(R1,20,20);
        R1.setLocation(20,550);
        ///// --- SpeedBoost
        SpeedBoost SP1 = new SpeedBoost();
        addObject(SP1,20,20);
        SP1.setLocation(250,450);
        SpeedBoost SP2 = new SpeedBoost();
        addObject(SP2,20,20);
        SP2.setLocation(450,350);
        SpeedBoost SP3 = new SpeedBoost();
        addObject(SP3,20,20);
        SP3.setLocation(150,150);
        SpeedBoost SP4 = new SpeedBoost();
        addObject(SP4,20,20);
        SP4.setLocation(500,150);
        SpeedBoost SP5 = new SpeedBoost();
        addObject(SP5,20,20);
        SP5.setLocation(100,550);
        /////--------- EnemyFlyer (Rocket)
        EnemyFlyer EF1 = new EnemyFlyer();
        addObject(EF1,20,20);
        EF1.setLocation(100,300);
        EnemyFlyer EF2 = new EnemyFlyer();
        addObject(EF2,20,20);
        EF2.setLocation(100,400);

        /////--------- EnemyWalker (Dog)
        EnemyWalker EW1 = new EnemyWalker(false);// False = Horizontal Movement and True = Vertical Movement
        addObject(EW1,20,20);
        EW1.setLocation(300,50);
        EnemyWalker EW2 = new EnemyWalker(true);
        addObject(EW2,20,20);
        EW2.setLocation(50,250);
        
        /////--------- YouWinPlateForm 
        YouWinPlatform YW = new YouWinPlatform();
        addObject(YW,20,20);
        YW.setLocation(580,550);
    }

        
    }
    
