package com.oppwa.mobile.connect.payment.processor.cashapppay;

import android.content.Context;
import android.content.Intent;
import com.oppwa.mobile.connect.payment.processor.ProcessorActivityResult;
import com.oppwa.mobile.connect.provider.Transaction;
import h.C5403a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayProcessorActivityResultContract;", "Lh/a;", "Lcom/oppwa/mobile/connect/provider/Transaction;", "Lcom/oppwa/mobile/connect/payment/processor/ProcessorActivityResult;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/oppwa/mobile/connect/provider/Transaction;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/oppwa/mobile/connect/payment/processor/ProcessorActivityResult;", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CashAppPayProcessorActivityResultContract extends C5403a<Transaction, ProcessorActivityResult> {
    public Intent createIntent(Context context, Transaction transaction) {
        C17542s.j(context, "context");
        C17542s.j(transaction, "input");
        Intent intent = new Intent(context, CashAppPayProcessorActivity.class);
        intent.putExtra(CashAppPayProcessorActivity.TRANSACTION_EXTRA, transaction);
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
            if (r7 == 0) goto L_0x0024
            com.oppwa.mobile.connect.utils.Extensions r2 = com.oppwa.mobile.connect.utils.Extensions.INSTANCE
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "com.oppwa.mobile.connect.payment.processor.cashapppay.transaction"
            if (r2 < r0) goto L_0x0016
            java.lang.Class<com.oppwa.mobile.connect.provider.Transaction> r2 = com.oppwa.mobile.connect.provider.Transaction.class
            java.lang.Object r2 = r7.getParcelableExtra(r3, r2)
            goto L_0x0021
        L_0x0016:
            android.os.Parcelable r2 = r7.getParcelableExtra(r3)
            boolean r3 = r2 instanceof com.oppwa.mobile.connect.provider.Transaction
            if (r3 != 0) goto L_0x001f
            r2 = r1
        L_0x001f:
            com.oppwa.mobile.connect.provider.Transaction r2 = (com.oppwa.mobile.connect.provider.Transaction) r2
        L_0x0021:
            com.oppwa.mobile.connect.provider.Transaction r2 = (com.oppwa.mobile.connect.provider.Transaction) r2
            goto L_0x0025
        L_0x0024:
            r2 = r1
        L_0x0025:
            if (r7 == 0) goto L_0x0046
            com.oppwa.mobile.connect.utils.Extensions r3 = com.oppwa.mobile.connect.utils.Extensions.INSTANCE
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "com.oppwa.mobile.connect.payment.processor.cashapppay.error"
            if (r3 < r0) goto L_0x0036
            java.lang.Class<com.oppwa.mobile.connect.exception.PaymentError> r0 = com.oppwa.mobile.connect.exception.PaymentError.class
            java.lang.Object r7 = r7.getParcelableExtra(r4, r0)
            goto L_0x0043
        L_0x0036:
            android.os.Parcelable r7 = r7.getParcelableExtra(r4)
            boolean r0 = r7 instanceof com.oppwa.mobile.connect.exception.PaymentError
            if (r0 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r7
        L_0x0040:
            r7 = r1
            com.oppwa.mobile.connect.exception.PaymentError r7 = (com.oppwa.mobile.connect.exception.PaymentError) r7
        L_0x0043:
            r1 = r7
            com.oppwa.mobile.connect.exception.PaymentError r1 = (com.oppwa.mobile.connect.exception.PaymentError) r1
        L_0x0046:
            r6.<init>(r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivityResultContract.parseResult(int, android.content.Intent):com.oppwa.mobile.connect.payment.processor.ProcessorActivityResult");
    }
}
