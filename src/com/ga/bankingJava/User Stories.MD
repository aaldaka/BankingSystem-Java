# ACME Banking System (Java)
# User Stories

### Authentication
- As a customer, I want to set a password during account creation.
- As a customer, I want to be able to create an account and request approval from a banker to open the account.
- As a user, I want to log into the application so I can access my account securely 
and my password is encrypted, making my credentials secure.
- As a user, I want my account to lock after 3 failed attempts so unauthorized access is prevented and 
unlocks after a minute so I can try to log in again.

### Account Management
- As a customer, I want notifications for important account activity ie when my acoount/card requests are approved.
- As a banker, I want to add a new customer by approving their account 
creation request so they can use the system.
- As a banker, I want to approve the assigning of savings to a customer.
(default is the checking)
- As a banker, I want to be notified when customers send requests for account creations or card upgrades.
- As a customer, I want to view my current balances.

### Transactions
- As a customer, I want to withdraw from my checking account.
- As a customer, I want to withdraw from my savings account.
- As a customer, I want to deposit into my checking account.
- As a customer, I want to deposit into my savings account.
- As a customer, I want to transfer between my own accounts.
- As a customer, I want to transfer to another customer's account.

### Overdraft Protection
- As a customer, I want a $35 overdraft fee charged when I overdraft.
- As a customer, I want withdrawals blocked over $100 when my balance is negative.
- As a customer, I want my account deactivated after 2 overdrafts.
- As a customer, I want my account reactivated when I resolve the negative balance.

### Debit Card Limits
- As a customer, I want daily withdrawal limits based on my card type.
- As a customer, I want daily transfer limits based on my card type.
- As a customer, I want daily deposit limits based on my card type.

### Transaction History & Filtering
- As a customer, I want to view my full transaction history.
- As a customer, I want all transactions recorded with date, type, and transaction/account details.
- As a customer, I want to filter transactions by today, last 7 days, 30 days, or a custom date range.
- As a customer, I want a detailed account statement with total balance and transactions.
