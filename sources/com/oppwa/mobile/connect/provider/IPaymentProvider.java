package com.oppwa.mobile.connect.provider;

import android.content.Context;
import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.listener.BinInfoListener;
import com.oppwa.mobile.connect.provider.listener.ResponseListener;

public interface IPaymentProvider {
    Context getContext();

    Connect.ProviderMode getProviderMode();

    void registerTransaction(Transaction transaction, ITransactionListener iTransactionListener);

    void requestBinInfo(String str, String str2, BinInfoListener binInfoListener);

    void requestBrandsValidation(String str, String[] strArr, ITransactionListener iTransactionListener);

    void requestCheckoutData(String str, ResponseListener<CheckoutData> responseListener);

    void requestCheckoutInfo(String str, ITransactionListener iTransactionListener);

    @Deprecated
    void requestIdealBanks(String str, IdealBanksListener idealBanksListener);

    void requestImages(String[] strArr, ITransactionListener iTransactionListener);

    void sendTransaction(Transaction transaction, String str, ITransactionListener iTransactionListener);

    void setProviderMode(Connect.ProviderMode providerMode);

    void submitTransaction(Transaction transaction, ITransactionListener iTransactionListener);
}
