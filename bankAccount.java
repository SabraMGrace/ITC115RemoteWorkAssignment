/* Sabra Grace
ITC 115 Remote Work Assignment
bankAccount.java
November 30, 2019
*/

// create method for transaction fee.
public boolean transactionFee(double fee) {
    double deduction = 0.0;
    
    for (int i = 1; i <= transactions; i++) {
        deduction += i * fee;
    }
    
    if (deduction < balance) {
        balance -= deduction;
        return true;
    }
    
    balance = 0.0;
    return false;
}
