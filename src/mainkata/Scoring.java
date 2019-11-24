package mainkata;

public class Scoring
{
  private int score;
  
  public int getScore()
  {
    return this.score;
  }
  
  public void setScore(int score)
  {
    this.score = score;
  }
  
  public void minScore()
  {
    this.score -= 20;
  }
}
