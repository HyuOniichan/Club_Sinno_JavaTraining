# Bank Account UML diagram 

| BankAccount                            |
|----------------------------------------| 
|                                        |
| - holderName: String                   |
| - balance: int                         |
| - interestRate: double                 |
| - transactionHistory: List<String>     |
|                                        |
| + CheckAccountName(): String           |
| + CheckAccountBalance(): int           |
| + Deposit(int): void                   |
| + Withdraw(int): void                  |
| + ShowTransactionHistory: List<String> | 
| + UpdateInterest(double): int          | 

