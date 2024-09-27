public class Scoreboard 
{
    private int Score1;
    private int Score2;
    private String team1;
    private String team2;
    private int swap;
    private String selected;
    public Scoreboard (String one, String two)
    {
     team1=one;
     team2=two;
    }

    public void recordPlay(int scored)
    {
     if (swap%2==0)
      {
       Score1=Score1+scored;
      }
     else 
      {
       Score2=Score2+scored;
      }

    if (scored==0)
      {
       swap++;
      }
   }

  public String getScore()
  {
    if (swap%2==0)
    {
     selected=team1;
    }
   else 
    {
      selected=team2;
    }
    return Score1+"-"+Score2+"-"+selected;


  }

}