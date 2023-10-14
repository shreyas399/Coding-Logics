class demo
{
  public static void main(String []args)
  {
    int n=5;

      for(int i=n;i>0;i--)
    {
      for(int j=n;j>0;j--)
      {
        for(int k=i;k>0;k--)
        {
          System.out.print(j+" ");
        }
      }
      System.out.println(" ");
    }
  }
}
