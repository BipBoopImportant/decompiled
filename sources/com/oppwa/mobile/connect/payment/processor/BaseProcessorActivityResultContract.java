package com.oppwa.mobile.connect.payment.processor;

import android.content.Context;
import android.content.Intent;
import com.oppwa.mobile.connect.provider.Transaction;
import h.C5403a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/BaseProcessorActivityResultContract;", "Lh/a;", "Lcom/oppwa/mobile/connect/provider/Transaction;", "Lcom/oppwa/mobile/connect/payment/processor/ProcessorActivityResult;", "<init>", "()V", "", "getTransactionExtraKey", "()Ljava/lang/String;", "getPaymentErrorExtraKey", "Ljava/lang/Class;", "getActivityClass", "()Ljava/lang/Class;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/oppwa/mobile/connect/provider/Transaction;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/oppwa/mobile/connect/payment/processor/ProcessorActivityResult;", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseProcessorActivityResultContract extends C5403a<Transaction, ProcessorActivityResult> {
    public abstract Class<?> getActivityClass();

    public abstract String getPaymentErrorExtraKey();

    public abstract String getTransactionExtraKey();

    public Intent createIntent(Context context, Transaction transaction) {
        C17542s.j(context, "context");
        C17542s.j(transaction, "input");
        Intent intent = new Intent(context, getActivityClass());
        intent.putExtra(getTransactionExtraKey(), transaction);
        return intent;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.os.Parcelable} */
    /* JADX WARNING: type inference failed for: r7v2, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.oppwa.mobile.connect.payment.processor.ProcessorActivityResult parseResult(int r6, android.content.Intent r7) {
        /*
            r5 = this;
            com.oppwa.mobile.connect.payment.processor.ProcessorActivityResult r6 = new com.oppwa.mobile.connect.payment.processor.ProcessorActivityResult
            r0 = 33
            r1 = 0
            if (r7 == 0) goto L_0x0026
            com.oppwa.mobile.connect.utils.Extensions r2 = com.oppwa.mobile.connect.utils.Extensions.INSTANCE
            java.lang.String r2 = r5.getTransactionExtraKey()
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r0) goto L_0x0018
            java.lang.Class<com.oppwa.mobile.connect.provider.Transaction> r3 = com.oppwa.mobile.connect.provider.Transaction.class
            java.lang.Object r2 = r7.getParcelableExtra(r2, r3)
            goto L_0x0023
        L_0x0018:
            android.os.Parcelable r2 = r7.getParcelableExtra(r2)
            boolean r3 = r2 instanceof com.oppwa.mobile.connect.provider.Transaction
            if (r3 != 0) goto L_0x0021
            r2 = r1
        L_0x0021:
            com.oppwa.mobile.connect.provider.Transaction r2 = (com.oppwa.mobile.connect.provider.Transaction) r2
        L_0x0023:
            com.oppwa.mobile.connect.provider.Transaction r2 = (com.oppwa.mobile.connect.provider.Transaction) r2
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            if (r7 == 0) goto L_0x004a
            com.oppwa.mobile.connect.utils.Extensions r3 = com.oppwa.mobile.connect.utils.Extensions.INSTANCE
            java.lang.String r3 = r5.getPaymentErrorExtraKey()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r0) goto L_0x003a
            java.lang.Class<com.oppwa.mobile.connect.exception.PaymentError> r0 = com.oppwa.mobile.connect.exception.PaymentError.class
            java.lang.Object r7 = r7.getParcelableExtra(r3, r0)
            goto L_0x0047
        L_0x003a:
            android.os.Parcelable r7 = r7.getParcelableExtra(r3)
            boolean r0 = r7 instanceof com.oppwa.mobile.connect.exception.PaymentError
            if (r0 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = r7
        L_0x0044:
            r7 = r1
            com.oppwa.mobile.connect.exception.PaymentError r7 = (com.oppwa.mobile.connect.exception.PaymentError) r7
        L_0x0047:
            r1 = r7
            com.oppwa.mobile.connect.exception.PaymentError r1 = (com.oppwa.mobile.connect.exception.PaymentError) r1
        L_0x004a:
            r6.<init>(r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.payment.processor.BaseProcessorActivityResultContract.parseResult(int, android.content.Intent):com.oppwa.mobile.connect.payment.processor.ProcessorActivityResult");
    }
}
