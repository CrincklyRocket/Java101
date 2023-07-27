import java.util.*;
public class Game {
    private int row;
    public int column;
    MineMap mineMap;
    GameMap gameMap;

    public Game() {
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz.");
        Scanner inp = new Scanner(System.in);
        boolean isCorrect = true;
        do {
            isCorrect = true;

            System.out.print("Satır giriniz :");
            this.row = inp.nextInt();
            if(this.row < 2) {
                System.out.println("Harita en az 2x2'lik olmalıdır. Tekrar giriş yapınız.");
                isCorrect = false;
                continue;
            }
            System.out.print("Sütun giriniz :");
            this.column = inp.nextInt();
            if(column < 2){
                System.out.println("Harita en az 2x2'lik olmalıdır. Tekrar giriş yapınız.");
                isCorrect = false;

            }
        }while (!isCorrect);


        mineMap = new MineMap(this.row, this.column);
        gameMap = new GameMap(this.row, this.column);
        run();
    }


    public void run(){
        Scanner inp = new Scanner(System.in);

        System.out.println("Mayınlı Haritayı Görmek için 1'e, Oyuna Geçmek İçin 2'ye Basınız.");
        System.out.print("Seçiminiz : ");
        int i = inp.nextInt();

        switch (i){

            default:
                System.out.println("hatalı giriş yaptınız");
                break;

            case 1:
                System.out.println("==================");
                System.out.println("Mayınlı Harita.");
                mineMap.getMineMap();
                System.out.println("==================");

            case 2:
                while (!isMapCleared()) {

                    System.out.println("==================");
                    System.out.println("Oyun Haritası.");
                    gameMap.getGameMap();
                    System.out.println("==================");

                    System.out.print("Satır giriniz "+"(0-"+row+ "):");
                    int rowS = inp.nextInt();

                    System.out.print("Sütun giriniz "+"(0-"+column+ "):");
                    int columnS = inp.nextInt();

                    if (rowS < 0 ) {
                        System.out.println("Geçersiz konum. Lütfen geçerli bir konum giriniz.");
                    }

                    if (!gameMap.gameMap[rowS][columnS].equals("o")) {
                        System.out.println("Bu konum zaten açılmış.");
                    }

                    if (isMine(rowS, columnS)) {
                        System.out.println("Mayına bastınız! Oyun bitti!");
                        System.exit(0);
                    } else {
                        String nearbyMines = countNearbyMines(rowS, columnS);
                        gameMap.gameMap[rowS][columnS] = nearbyMines;
                    }

                }
                    System.out.println("Oyunu kazandınız tebrikler");
                    System.exit(0);

        }
    }

    public boolean isMine(int rowS, int columnS){
        return mineMap.mineMap[rowS][columnS].equals("*");
    }

    public String countNearbyMines(int rowS,int columnS){

        int mineCount = 0;
        for (int i = rowS - 1; i <= rowS + 1; i++) {
            for (int j = columnS - 1; j <= columnS + 1; j++) {
                if (i >= 0 && i < this.row && j >= 0 && j < this.column && mineMap.mineMap[i][j].equals("*")) {
                    mineCount++;
                }
            }
        }
        return Integer.toString(mineCount);
    }

    public boolean isMapCleared() {
        int elementNo = this.row * this.column;
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (gameMap.gameMap[i][j].equals("o")){
                    counter++;
                }
            }
        }
        return counter == elementNo / 4;
    }
}
