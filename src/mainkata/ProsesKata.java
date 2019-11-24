package mainkata;

import java.util.Random;

public class ProsesKata
{
  private Random r = new Random();
  private String kataPilih;
  private String kataAcak;
  
  public String pilihKata(String[] kataArr)
  {
    Random r = new Random();
    int randomInt = r.nextInt(kataArr.length);
    
    String kataPilih = kataArr[randomInt];
    return kataPilih;
  }
  
  public String acakKata(String kataPilih, String lvl)
  {
    String kataAcakConcat = "";
    if (lvl.equalsIgnoreCase("1"))
    {
      char[] kataAcak = new char[kataPilih.length()];
      int[] tempCheck = new int[kataPilih.length()];
      for (int i = 0; i < kataPilih.length(); i++) {
        if (i == 0)
        {
          int randIntKataAcak = getR().nextInt(kataPilih.length());
          tempCheck[i] = randIntKataAcak;
          
          kataAcak[i] = kataPilih.charAt(randIntKataAcak);
        }
        else
        {
          boolean temp2 = true;
          do
          {
            boolean temp = true;
            int randIntKataAcak = getR().nextInt(kataPilih.length());
            for (int j = 0; j < i; j++) {
              if (randIntKataAcak == tempCheck[j])
              {
                temp = false;
                break;
              }
            }
            if (temp)
            {
              kataAcak[i] = kataPilih.charAt(randIntKataAcak);
              tempCheck[i] = randIntKataAcak;
              
              temp2 = false;
            }
          } while (temp2);
        }
      }
      kataAcakConcat = String.valueOf(kataAcak);
    }
    else if ((lvl.equalsIgnoreCase("2")) || (lvl.equalsIgnoreCase("3")))
    {
      int[] tempCheck = new int[kataPilih.length()];
      
      String[] splitKataPilih = kataPilih.split(" ");
      kataAcakConcat = "";
      for (int z = 0; z < splitKataPilih.length; z++)
      {
        char[] kataAcak = new char[splitKataPilih[z].length()];
        boolean temp2 = true;
        boolean temp = true;
        for (int i = 0; i < splitKataPilih[z].length(); i++) {
          if (i == 0)
          {
            int randIntKataAcak = getR().nextInt(splitKataPilih[z].length());
            tempCheck[i] = randIntKataAcak;
            
            kataAcak[i] = splitKataPilih[z].charAt(randIntKataAcak);
          }
          else
          {
            temp2 = true;
            do
            {
              temp = true;
              int randIntKataAcak = getR().nextInt(splitKataPilih[z].length());
              for (int j = 0; j < i; j++) {
                if (randIntKataAcak == tempCheck[j])
                {
                  temp = false;
                  break;
                }
              }
              if (temp)
              {
                kataAcak[i] = splitKataPilih[z].charAt(randIntKataAcak);
                tempCheck[i] = randIntKataAcak;
                
                temp2 = false;
              }
            } while (temp2);
          }
        }
        if (z == 0) {
          kataAcakConcat = String.valueOf(kataAcak);
        } else {
          kataAcakConcat = kataAcakConcat + " " + String.valueOf(kataAcak);
        }
      }
      if (lvl.equalsIgnoreCase("2"))
      {
        kataAcakConcat = kataAcakConcat;
      }
      else if (lvl.equalsIgnoreCase("3"))
      {
        int test = this.r.nextInt(kataPilih.length());
        char[] charArray = kataAcakConcat.toCharArray();
        charArray[test] = '*';
        kataAcakConcat = String.valueOf(charArray);
      }
    }
    return kataAcakConcat;
  }
  
  public boolean bandingkanKata(String kata1, String kata2)
  {
    if (kata1.equalsIgnoreCase(kata2)) {
      return true;
    }
    return false;
  }
  
  public Random getR()
  {
    return this.r;
  }
  
  public void setR(Random r)
  {
    this.r = r;
  }
  
  public String getKataPilih()
  {
    return this.kataPilih;
  }
  
  public void setKataPilih(String kataPilih)
  {
    this.kataPilih = kataPilih;
  }
  
  public String getKataAcak()
  {
    return this.kataAcak;
  }
  
  public void setKataAcak(String kataAcak)
  {
    this.kataAcak = kataAcak;
  }
}
