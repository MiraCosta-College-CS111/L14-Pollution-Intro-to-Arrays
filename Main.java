// /**
// Yearly Global Atmospheric CO₂ Levels (parts per million)
// 2001: 371.32 ppm
// 2002: 373.45 ppm
// 2003: 375.98 ppm
// 2004: 377.70 ppm
// 2005: 379.98 ppm
// 2006: 382.09 ppm
// 2007: 384.03 ppm
// 2008: 385.83 ppm
// 2009: 387.64 ppm
// 2010: 390.10 ppm
// 2011: 391.85 ppm
// 2012: 394.06 ppm
// 2013: 396.74 ppm
// 2014: 398.87 ppm
// 2015: 401.01 ppm
// 2016: 404.41 ppm
// 2017: 406.76 ppm
// 2018: 408.72 ppm
// 2019: 411.66 ppm
// 2020: 414.24 ppm
// (Data from: https://www.esrl.noaa.gov/gmd/webdata/ccgg/trends/co2/co2_annmean_mlo.txt)
// **/
class Main {

  public static void main(String[] args) 
  {
    int size = 20;
    double[] co2Levels = new double[size]; //To store data from 2001-2020
    int[] years = new int[size];//Stores the years for each measurement

    //Store real data in co2Levels array
    co2Levels[0] = 371.32;
    co2Levels[1] = 373.45;
    co2Levels[2] = 375.98; 
    co2Levels[3] = 377.70;
    co2Levels[4] = 379.98; 
    co2Levels[5] = 382.09; 
    co2Levels[6] = 384.03; 
    co2Levels[7] = 385.83; 
    co2Levels[8] = 387.64; 
    co2Levels[9] = 390.10; 
    co2Levels[10] = 391.85; 
    co2Levels[11] = 394.06; 
    co2Levels[12] = 396.74; 
    co2Levels[13] = 398.87; 
    co2Levels[14] = 401.01; 
    co2Levels[15] = 404.41; 
    co2Levels[16] = 406.76; 
    co2Levels[17] = 408.72; 
    co2Levels[18] = 411.66; 
    co2Levels[19] = 414.24;

    //fill years array with values 2001-2020
    int year = 2001;
    for(int i = 0; i<size; i++)
    {
      years[i] = year;
      year++;
    }
    //first time 2001
    //second 2002

    //Explanation of oil drum units
    System.out.println("\nData displayed for each year begins at 360 ppm.\nEach additional oil drum (🛢 ) represents an additional 10 ppm.\n");

    //Column titles of graph
    System.out.print("Year");
    UtilityBelt.printCentered(55,"CO₂ in Atmosphere (ppm)");

    Main.printGraph(co2Levels,years);

    System.out.printf("From 2001 to 2020, the average atmospheric CO₂ levels across the globe has grown %.2f ppm.",(co2Levels[19]-co2Levels[0]));
  }

/**
* Displays the CO2 levels in a bar graph labeled with the year the data is from on the left and it's value on the right
*
* @param dataArray amount of CO2 parts per million for a given year
* @param yearArray the year the CO2 data was measured
*/
  public static void printGraph(double[] dataArray, int[] yearArray)
  {

    for(int i = 0; i < dataArray.length; i++)
    {
      System.out.print(yearArray[i]+" ");//Print the year
      double origData = dataArray[i]; //Access data
      Main.printBar(origData); //Print Bar
    }
  }

/**
* Prints a single horizontal bar with one 💭 (smoke cloud) for every whole number over 360, representing that year's CO2 level, and displays the actual value to the right of the bar.
* @param data the CO2 level for that year
*/
  public static void printBar(double data)
  {
    int numStars = (int)(data - 360);

      //Print the string of astrisks with the number of stars calculated
      for(int i = 0; i < numStars; i++)
      {
        System.out.print("🛢");
      }
			//🏭🛢🧨⚠️💭█ Optional: Can choose different style bar graph
      System.out.printf(" %.2f",data);
      System.out.println();
  }
}