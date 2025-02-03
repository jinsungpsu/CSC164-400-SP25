class Main {
  public static void main(String[] args) {
  
    float[] lukaPointsPerSeason = {32.2f, 36.6f, 34.3f, 35.4f, 36.2f};
    float lukasAvgOverThreeSeasons = (32.2f+ 36.6f+ 34.3f) / 3;
  
    float totalYearlyAverages = 0;
  
    System.out.println("Luka's Average Points Per Season: ");
    for (int i = 0; i < lukaPointsPerSeason.length; i++) {
        System.out.printf("Season #%d: %.2f\n", (i+1), lukaPointsPerSeason[i]);
        totalYearlyAverages += lukaPointsPerSeason[i];
        // same as
        // totalYearlyAverages = totalYearlyAverages + lukaPointsPerSeason[i];
        // i += 1 same as i++
    }
  
    float lukasCareerAverage = totalYearlyAverages / lukaPointsPerSeason.length;
  
  
    // each row is a season
    // each column is a game within that season
    int[][] lukaPoints = {
            {35, 33, 40, 29, 31},
            {50, 19, 25, 33, 35},
            {1, 1, 1, 1, 99}
    };
  
    for (int seasonNumber = 1; seasonNumber < lukaPoints.length+1; seasonNumber++) {
        for (int gameNumber = 1; gameNumber < lukaPoints[seasonNumber-1].length+1; gameNumber++) {
            System.out.println("For season #" + seasonNumber + ", game #" + gameNumber + ", Luka scored: " + lukaPoints[seasonNumber-1][gameNumber-1]);
        }
    }
    System.out.println("##############################");
    System.out.println("##############################");
    System.out.println("## Luka's point tracker!!! ###");
    System.out.println("##############################");
    System.out.println("##############################");
    for (int i = 0; i < lukaPoints.length; i++) {
        System.out.print("\nSeason #" + (i+1) + "\nGames | ");
        for (int j=0; j < lukaPoints[i].length; j++) {
            System.out.printf("%-4d  | ", lukaPoints[i][j]);
        }
    }
  
    System.out.println(lukaPoints[0][0]);
  
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
  }
}
