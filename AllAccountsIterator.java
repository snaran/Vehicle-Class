/**
 * Created by Sam on 4/30/17.
 */
public class AllAccountsIterator implements AccountsIterator
{
    private Account[] accounts_list;
    private int current;

    public AllAccountsIterator(Account[] accounts_list)
    {
        this.accounts_list = accounts_list;
        current = 0;
    }

    @Override
    public boolean hasNext()
    {
        if(current < (accounts_list.length-1))
            if(accounts_list[current+1] != null)
                return true;
        return false;
    }

    @Override
    public Account next()
    {
        return accounts_list[++current];
    }
}
