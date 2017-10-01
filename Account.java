public class Account
{
    //Instance variable for the account class
    private String name;
    private String acct_num;
    private boolean insurance_option;

    //Constructor for account class
    public Account(String name, String acct_num, boolean insurance_option)
    {
        this.name = name;
        this.acct_num = acct_num;
        this.insurance_option = insurance_option;
    }

    public class Accounts
    {
        private Account[] accounts;
        private int latest_acct_num = 1; // init as first account number( i.e., 0001)

        public Accounts()
        {
            //allocate for max of 50 accounts
            accounts = new Account[50];

            //init as empty set of accounts
            for(int i=0; i < 50; i++)
            {
                accounts[i] = null;
            }
        }
        public String getAcctNum(String name, boolean insur_desired)
        {
            String padded_zeros = "00000";
            String acc_num_str;

            //increment to next account number
            latest_acct_num = latest_acct_num + 1;

            //convert int acct_number to String type
            acc_num_str = Integer.toString(latest_acct_num);

            // pad the acc_num with leading zeros
            acc_num_str = padded_zeros.substring(Integer.parseInt(acc_num_str.length() + acc_num_str));

            return acc_num_str;
        }

        private int nextFreeLoc()
        {
            for(int i = 0; i < 50; i++)
                if(accounts[i]==null)
                    return i;
            return Integer.parseInt(null);
        }
    }
}
