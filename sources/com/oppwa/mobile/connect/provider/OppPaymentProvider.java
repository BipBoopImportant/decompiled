package com.oppwa.mobile.connect.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.nsoftware.ipworks3ds.sdk.ThreeDS2Service;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.ThreeDS2Info;
import com.oppwa.mobile.connect.provider.listener.BinInfoListener;
import com.oppwa.mobile.connect.provider.listener.ResponseListener;
import com.oppwa.mobile.connect.provider.model.BinInfo;
import com.oppwa.mobile.connect.provider.threeds.v2.ThreeDS2TransactionManager;
import com.oppwa.mobile.connect.provider.threeds.v2.model.ThreeDSConfig;
import com.oppwa.mobile.connect.utils.FeatureSwitch;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import qE.C14953m;

public class OppPaymentProvider extends C14153c {

    /* renamed from: c  reason: collision with root package name */
    private C14151a f121968c = new C14151a();

    /* renamed from: d  reason: collision with root package name */
    private ThreeDSWorkflowListener f121969d;

    /* renamed from: e  reason: collision with root package name */
    private PaymentError f121970e;

    /* renamed from: f  reason: collision with root package name */
    private String f121971f;

    /* renamed from: g  reason: collision with root package name */
    private CountDownLatch f121972g;

    public OppPaymentProvider(Context context, Connect.ProviderMode providerMode) {
        super(context, providerMode);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String[] strArr, ITransactionListener iTransactionListener) {
        try {
            iTransactionListener.brandsValidationRequestSucceeded(this.f121968c.a(this.f122005a, str, strArr));
        } catch (PaymentException e10) {
            iTransactionListener.brandsValidationRequestFailed(e10.getError());
        }
    }

    /* access modifiers changed from: protected */
    public void c(Transaction transaction) {
        if (transaction.getRedirectUrl() != null) {
            a(transaction.getRedirectUrl(), (String) null, transaction.getPaymentParams().getCheckoutId());
        }
    }

    /* access modifiers changed from: protected */
    public boolean d(Transaction transaction) {
        return transaction.getThreeDS2Info() != null;
    }

    /* access modifiers changed from: protected */
    public void e(Transaction transaction) {
        ThreeDS2Info.ThreeDSFlow requireThreeDSFlow = transaction.requireThreeDS2Info().requireThreeDSFlow();
        Logger.info("ThreeDSFlow: " + requireThreeDSFlow);
        if (requireThreeDSFlow == ThreeDS2Info.ThreeDSFlow.APP || requireThreeDSFlow == ThreeDS2Info.ThreeDSFlow.APPONLY) {
            a();
            a(transaction, requireThreeDSFlow == ThreeDS2Info.ThreeDSFlow.APPONLY);
        } else if (requireThreeDSFlow == ThreeDS2Info.ThreeDSFlow.WEB) {
            c(transaction);
        }
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public /* bridge */ /* synthetic */ Connect.ProviderMode getProviderMode() {
        return super.getProviderMode();
    }

    public List<C14953m> getThreeDS2Warnings() {
        return a((ThreeDSConfig) Optional.ofNullable(this.f121969d).map(new p()).orElseGet(new q())).getWarnings();
    }

    public void registerTransaction(Transaction transaction, ITransactionListener iTransactionListener) {
        sendTransaction(transaction, CheckoutConstants.ENDPOINT_REGISTRATION, iTransactionListener);
    }

    public void requestBinInfo(String str, String str2, BinInfoListener binInfoListener) {
        new Thread(new C14158h(this, str2, str, binInfoListener)).start();
    }

    public void requestBrandsValidation(String str, String[] strArr, ITransactionListener iTransactionListener) {
        new Thread(new r(this, str, strArr, iTransactionListener)).start();
    }

    public void requestCheckoutData(String str, ResponseListener<CheckoutData> responseListener) {
        new Thread(new k(this, str, responseListener)).start();
    }

    public void requestCheckoutInfo(String str, ITransactionListener iTransactionListener) {
        Logger.setCurrentCheckoutId(str);
        new Thread(new o(this, str, iTransactionListener)).start();
    }

    @Deprecated
    public void requestIdealBanks(String str, IdealBanksListener idealBanksListener) {
        new Thread(new C14159i(this, str, idealBanksListener)).start();
    }

    public void requestImages(String[] strArr, ITransactionListener iTransactionListener) {
        new Thread(new j(this, strArr, iTransactionListener)).start();
    }

    public void sendTransaction(Transaction transaction, String str, ITransactionListener iTransactionListener) {
        Logger.checkOutdatedFiles(getContext());
        Logger.setCurrentCheckoutId(transaction.getPaymentParams().getCheckoutId());
        transaction.getPaymentParams().setProviderMode(this.f122005a);
        new Thread(new n(this, transaction, str, iTransactionListener)).start();
    }

    public /* bridge */ /* synthetic */ void setProviderMode(Connect.ProviderMode providerMode) {
        super.setProviderMode(providerMode);
    }

    public void setThreeDSWorkflowListener(ThreeDSWorkflowListener threeDSWorkflowListener) {
        this.f121969d = threeDSWorkflowListener;
    }

    public void submitTransaction(Transaction transaction, ITransactionListener iTransactionListener) {
        sendTransaction(transaction, CheckoutConstants.ENDPOINT_PAYMENT, iTransactionListener);
    }

    private Activity d() {
        ThreeDSWorkflowListener threeDSWorkflowListener = this.f121969d;
        if (threeDSWorkflowListener == null) {
            throw new PaymentException(PaymentError.getThreeDS2Error("ThreeDSWorkflowListener is not set."));
        } else if (threeDSWorkflowListener.onThreeDSChallengeRequired() != null) {
            return this.f121969d.onThreeDSChallengeRequired();
        } else {
            throw new PaymentException(PaymentError.getThreeDS2Error("ThreeDSWorkflowListener.onActivityRequired() returns null."));
        }
    }

    /* access modifiers changed from: protected */
    public void b(Transaction transaction) {
        if (((Boolean) Optional.ofNullable(this.f121969d).map(new p()).map(new s()).orElse(Boolean.FALSE)).booleanValue()) {
            a(transaction);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String[] strArr, ITransactionListener iTransactionListener) {
        try {
            iTransactionListener.imagesRequestSucceeded(this.f121968c.a(this.f122005a, strArr));
        } catch (PaymentException unused) {
            iTransactionListener.imagesRequestFailed();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException c() {
        return new PaymentException(PaymentError.getThreeDS2Error("ThreeDSWorkflowListener can't be null"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, BinInfoListener binInfoListener) {
        PaymentError paymentError;
        BinInfo binInfo = null;
        try {
            binInfo = this.f121968c.a(this.f122005a, str, str2);
            paymentError = null;
        } catch (PaymentException e10) {
            paymentError = e10.getError();
            Logger.error(paymentError.getErrorMessage());
        }
        binInfoListener.onResult(binInfo, paymentError);
    }

    private void b(String str) {
        Optional.ofNullable(str).map(new C14157g()).ifPresent(new l());
    }

    private ThreeDSWorkflowListener e() {
        return (ThreeDSWorkflowListener) Optional.ofNullable(this.f121969d).orElseThrow(new t());
    }

    private void b(String str, String str2, String str3) {
        Activity onThreeDSChallengeRequired = e().onThreeDSChallengeRequired();
        Intent intent = new Intent(onThreeDSChallengeRequired, AsyncPaymentActivity.class);
        intent.setFlags(268435456);
        intent.putExtra(AsyncPaymentActivity.EXTRA_REDIRECT_URL, str);
        intent.putExtra(AsyncPaymentActivity.EXTRA_THREEDS_METHOD_REDIRECT_URL, str2);
        intent.putExtra(AsyncPaymentActivity.EXTRA_CHECKOUT_ID, str3);
        onThreeDSChallengeRequired.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, IdealBanksListener idealBanksListener) {
        try {
            HashMap<String, String> c10 = this.f121968c.c(this.f122005a, str);
            if (c10 != null) {
                idealBanksListener.idealBanksRequestSucceeded(c10);
            } else {
                idealBanksListener.idealBanksRequestFailed();
            }
        } catch (PaymentException unused) {
            idealBanksListener.idealBanksRequestFailed();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(java.lang.String r5, com.oppwa.mobile.connect.provider.ITransactionListener r6) {
        /*
            r4 = this;
            r0 = 0
            com.oppwa.mobile.connect.provider.a r1 = r4.f121968c     // Catch:{ PaymentException -> 0x0015 }
            com.oppwa.mobile.connect.provider.Connect$ProviderMode r2 = r4.f122005a     // Catch:{ PaymentException -> 0x0015 }
            com.oppwa.mobile.connect.payment.CheckoutInfo r5 = r1.b(r2, r5)     // Catch:{ PaymentException -> 0x0015 }
            java.lang.String r1 = r5.getLogLevel()     // Catch:{ PaymentException -> 0x0013 }
            r4.b((java.lang.String) r1)     // Catch:{ PaymentException -> 0x0013 }
            goto L_0x001d
        L_0x0011:
            r5 = move-exception
            goto L_0x002a
        L_0x0013:
            r0 = move-exception
            goto L_0x0019
        L_0x0015:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
        L_0x0019:
            com.oppwa.mobile.connect.exception.PaymentError r0 = r0.getError()     // Catch:{ all -> 0x0011 }
        L_0x001d:
            com.oppwa.mobile.connect.utils.Logger.sendLogs()
            if (r0 == 0) goto L_0x0026
            r6.paymentConfigRequestFailed(r0)
            goto L_0x0029
        L_0x0026:
            r6.paymentConfigRequestSucceeded(r5)
        L_0x0029:
            return
        L_0x002a:
            com.oppwa.mobile.connect.utils.Logger.sendLogs()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.provider.OppPaymentProvider.a(java.lang.String, com.oppwa.mobile.connect.provider.ITransactionListener):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ResponseListener responseListener) {
        try {
            responseListener.onResult(this.f121968c.a(this.f122005a, str), (PaymentError) null);
        } catch (PaymentException e10) {
            responseListener.onResult(null, e10.getError());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r5 != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r5 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        r6.transactionFailed(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r6.transactionCompleted(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        com.oppwa.mobile.connect.utils.Logger.sendLogs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(com.oppwa.mobile.connect.provider.Transaction r4, java.lang.String r5, com.oppwa.mobile.connect.provider.ITransactionListener r6) {
        /*
            r3 = this;
            com.oppwa.mobile.connect.provider.b r0 = com.oppwa.mobile.connect.provider.C14152b.a()
            r0.a(r3)
            r0 = 0
            r3.f121970e = r0
            r3.f121971f = r0
            r3.b((com.oppwa.mobile.connect.provider.Transaction) r4)     // Catch:{ PaymentException -> 0x0023 }
            com.oppwa.mobile.connect.provider.a r1 = r3.f121968c     // Catch:{ PaymentException -> 0x0023 }
            com.oppwa.mobile.connect.provider.Connect$ProviderMode r2 = r3.f122005a     // Catch:{ PaymentException -> 0x0023 }
            r1.a((com.oppwa.mobile.connect.provider.Connect.ProviderMode) r2, (java.lang.String) r5, (com.oppwa.mobile.connect.provider.Transaction) r4)     // Catch:{ PaymentException -> 0x0023 }
            boolean r5 = r3.d(r4)     // Catch:{ PaymentException -> 0x0023 }
            if (r5 == 0) goto L_0x0025
            r3.e(r4)     // Catch:{ PaymentException -> 0x0023 }
            goto L_0x0025
        L_0x0020:
            r5 = move-exception
            goto L_0x00a2
        L_0x0023:
            r5 = move-exception
            goto L_0x005a
        L_0x0025:
            com.oppwa.mobile.connect.provider.b r5 = com.oppwa.mobile.connect.provider.C14152b.a()
            r5.a(r0)
            r3.f121972g = r0
            com.oppwa.mobile.connect.payment.PaymentParams r5 = r4.getPaymentParams()
            r5.mask()
            java.lang.String r5 = r3.f121971f
            if (r5 == 0) goto L_0x0055
            com.oppwa.mobile.connect.payment.PaymentParams r5 = r4.getPaymentParams()
            java.lang.String r5 = r5.getShopperResultUrl()
            if (r5 == 0) goto L_0x0055
            java.lang.String r0 = r3.f121971f
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = r3.f121971f
            r4.setRedirectUrl(r5)
            com.oppwa.mobile.connect.provider.TransactionType r5 = com.oppwa.mobile.connect.provider.TransactionType.ASYNC
            r4.setTransactionType(r5)
        L_0x0055:
            com.oppwa.mobile.connect.exception.PaymentError r5 = r3.f121970e
            if (r5 == 0) goto L_0x009b
            goto L_0x0097
        L_0x005a:
            com.oppwa.mobile.connect.utils.Logger.error((java.lang.Throwable) r5)     // Catch:{ all -> 0x0020 }
            com.oppwa.mobile.connect.exception.PaymentError r5 = r5.getError()     // Catch:{ all -> 0x0020 }
            r3.f121970e = r5     // Catch:{ all -> 0x0020 }
            com.oppwa.mobile.connect.provider.b r5 = com.oppwa.mobile.connect.provider.C14152b.a()
            r5.a(r0)
            r3.f121972g = r0
            com.oppwa.mobile.connect.payment.PaymentParams r5 = r4.getPaymentParams()
            r5.mask()
            java.lang.String r5 = r3.f121971f
            if (r5 == 0) goto L_0x0093
            com.oppwa.mobile.connect.payment.PaymentParams r5 = r4.getPaymentParams()
            java.lang.String r5 = r5.getShopperResultUrl()
            if (r5 == 0) goto L_0x0093
            java.lang.String r0 = r3.f121971f
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x0093
            java.lang.String r5 = r3.f121971f
            r4.setRedirectUrl(r5)
            com.oppwa.mobile.connect.provider.TransactionType r5 = com.oppwa.mobile.connect.provider.TransactionType.ASYNC
            r4.setTransactionType(r5)
        L_0x0093:
            com.oppwa.mobile.connect.exception.PaymentError r5 = r3.f121970e
            if (r5 == 0) goto L_0x009b
        L_0x0097:
            r6.transactionFailed(r4, r5)
            goto L_0x009e
        L_0x009b:
            r6.transactionCompleted(r4)
        L_0x009e:
            com.oppwa.mobile.connect.utils.Logger.sendLogs()
            return
        L_0x00a2:
            com.oppwa.mobile.connect.provider.b r1 = com.oppwa.mobile.connect.provider.C14152b.a()
            r1.a(r0)
            r3.f121972g = r0
            com.oppwa.mobile.connect.payment.PaymentParams r0 = r4.getPaymentParams()
            r0.mask()
            java.lang.String r0 = r3.f121971f
            if (r0 == 0) goto L_0x00d2
            com.oppwa.mobile.connect.payment.PaymentParams r0 = r4.getPaymentParams()
            java.lang.String r0 = r0.getShopperResultUrl()
            if (r0 == 0) goto L_0x00d2
            java.lang.String r1 = r3.f121971f
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = r3.f121971f
            r4.setRedirectUrl(r0)
            com.oppwa.mobile.connect.provider.TransactionType r0 = com.oppwa.mobile.connect.provider.TransactionType.ASYNC
            r4.setTransactionType(r0)
        L_0x00d2:
            com.oppwa.mobile.connect.exception.PaymentError r0 = r3.f121970e
            if (r0 == 0) goto L_0x00da
            r6.transactionFailed(r4, r0)
            goto L_0x00dd
        L_0x00da:
            r6.transactionCompleted(r4)
        L_0x00dd:
            com.oppwa.mobile.connect.utils.Logger.sendLogs()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.provider.OppPaymentProvider.a(com.oppwa.mobile.connect.provider.Transaction, java.lang.String, com.oppwa.mobile.connect.provider.ITransactionListener):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Logger.LogLevel a(String str) {
        try {
            return Logger.LogLevel.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(Transaction transaction, boolean z10) {
        ThreeDSWorkflowListener e10 = e();
        ThreeDS2TransactionManager threeDS2TransactionManager = null;
        try {
            ThreeDS2Info requireThreeDS2Info = transaction.requireThreeDS2Info();
            threeDS2TransactionManager = a(e10.onThreeDSConfigRequired());
            threeDS2TransactionManager.initialize(requireThreeDS2Info);
            String requireAuthRequest = threeDS2TransactionManager.requireAuthRequest();
            ThreeDS2Info a10 = this.f121968c.a(requireThreeDS2Info.requireCallbackUrl(), requireAuthRequest);
            transaction.setThreeDS2Info(a10);
            if (a10.isChallengeRequired()) {
                threeDS2TransactionManager.doChallenge(e10.onThreeDSChallengeRequired(), a10.requireAuthResponse(), a10.getChallengeCompletionCallbackUrl());
            }
        } catch (PaymentException e11) {
            if (!FeatureSwitch.isActivated(FeatureSwitch.THREEDS_FALLBACK)) {
                throw e11;
            } else if (a(e11, z10)) {
                a(transaction, (Throwable) e11);
            } else {
                throw e11;
            }
        } finally {
            Optional.ofNullable(threeDS2TransactionManager).ifPresent(new m());
        }
    }

    private boolean a(PaymentException paymentException, boolean z10) {
        ErrorCode errorCode;
        if (z10 || (errorCode = paymentException.getError().getErrorCode()) == ErrorCode.ERROR_CODE_THREEDS2_CANCELED || errorCode == ErrorCode.ERROR_CODE_THREEDS2_TIMED_OUT) {
            return false;
        }
        return true;
    }

    private void a(Transaction transaction, Throwable th2) {
        Logger.error(th2);
        Logger.info("Executing fallback to the WEB flow.");
        c(transaction);
    }

    /* access modifiers changed from: protected */
    public ThreeDS2TransactionManager a(ThreeDSConfig threeDSConfig) {
        return new ThreeDS2TransactionManager(getContext().getApplicationContext(), ThreeDS2Service.f120780a, threeDSConfig);
    }

    /* access modifiers changed from: protected */
    public void a(String str, String str2, String str3) {
        this.f121972g = new CountDownLatch(1);
        b(str, str2, str3);
        a(this.f121972g);
    }

    /* access modifiers changed from: package-private */
    public void a(PaymentError paymentError, String str) {
        this.f121970e = paymentError;
        this.f121971f = str;
        CountDownLatch countDownLatch = this.f121972g;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private void a(CountDownLatch countDownLatch) {
        try {
            countDownLatch.await();
            countDownLatch.countDown();
        } catch (InterruptedException e10) {
            throw new PaymentException(PaymentError.getUnexpectedExceptionError(e10));
        } catch (Throwable th2) {
            countDownLatch.countDown();
            throw th2;
        }
    }

    private void a() {
        if (!LibraryHelper.isThreeDS2Available) {
            throw new PaymentException(PaymentError.getPaymentProviderInternalError("The ipworks3ds library is required for 3-D Secure 2 card transaction with APP flow"));
        }
    }

    /* access modifiers changed from: protected */
    public void a(Transaction transaction) {
        C14154d.a(d(), transaction.getPaymentParams());
    }
}
