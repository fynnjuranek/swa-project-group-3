package payment.structure;

public class PayPalPayment extends Payment {

    @Override
    protected void currencyAmountFromSenderToReceiver(Account senderAccount, Account receiverAccount) {


        CurrencyAmount senderAmountNew = new CurrencyAmount(0);
        CurrencyAmount senderAmountOld = senderAccount.getCurrencyAmount();
        CurrencyAmount receiverAmountNew = senderAccount.getCurrencyAmount();
        CurrencyAmount receiverAmountOld = receiverAccount.getCurrencyAmount();
        senderAccount.setCurrencyAmount(senderAmountNew);
        int receiverAccountOld = receiverAmountOld.getAmount();
        receiverAccount.getCurrencyAmount().setAmount(receiverAmountOld.getAmount() + receiverAmountNew.getAmount());


        int senderAccountOld = senderAmountOld.getAmount();

        int senderAccountNew = senderAccount.getCurrencyAmount().getAmount();
        int receiverAccountNew = receiverAccount.getCurrencyAmount().getAmount();

        System.out.printf("""
                The amount %d was transferred from the sender account to the receiver account using %s
                The old account balance from the sender is: %d
                The old account balance from the receiver is: %d
                The new account balance from the sender is: %d
                The new account balance from the receiver is: %d
                %n""",senderAccountOld,PayPalPayment.class.getSimpleName(),senderAccountOld,receiverAccountOld,senderAccountNew,receiverAccountNew);

    }
}
