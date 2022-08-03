
delegate bool Check(int number);

    

class Summation
{   
    public int Low { get; set; }
    public int High { get; set; }

    public Summation(int l, int h)
    {
        Low = l;
        High = h;    
    }

    public int TotalSum(Check chk)
    {
        int sum = 0;
        for(int i = Low; i <= High; i++)
        {
            if (chk.Invoke(i))   // chk(i)
                sum = sum + i ;
        }
        return sum;
    }

}