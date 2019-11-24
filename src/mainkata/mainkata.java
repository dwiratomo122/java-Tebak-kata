package mainkata;

public class mainkata
{
  private String lvl = "";
  
  public static void main(String[] args)
  {
    Menuke2 gui = new Menuke2();
    gui.setVisible(true);
  }
  
  public String getLvl()
  {
    return this.lvl;
  }
  
  public void setLvl(String lvl)
  {
    this.lvl = lvl;
  }
}
