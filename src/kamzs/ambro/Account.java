package kamzs.ambro;

public class Account
{
    private int cash;

    public Account(int cash)
    {
        this.cash = cash;
    }

    public int getCash()
    {
        return cash;
    }

    public void setCash(int cash)
    {
        this.cash = cash;
    }



    public String deposit (int amount)
    {
        cash = cash + amount;

        return amount + " has been added to you fund. " + "You have " + cash + " right now";

    }

    public String withdraw (int amount)
    {

        try
        {
            cash = cash - amount;

            if (cash < 0)

                throw new NegativeBalanceExcept();

            else
            return amount + " has been withdrawn from your account. " + "You have " + cash + " right now";

        }
        catch (NegativeBalanceExcept ex)
        {

            cash = cash + amount;
            return "not sufficient funds on account to perfrom operation";
        }

    }


}
