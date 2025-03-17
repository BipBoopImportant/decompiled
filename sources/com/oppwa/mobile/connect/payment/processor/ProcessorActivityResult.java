package com.oppwa.mobile.connect.payment.processor;

import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.Transaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/ProcessorActivityResult;", "", "Lcom/oppwa/mobile/connect/provider/Transaction;", "component1", "Lcom/oppwa/mobile/connect/exception/PaymentError;", "component2", "transaction", "paymentError", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/oppwa/mobile/connect/provider/Transaction;", "getTransaction", "()Lcom/oppwa/mobile/connect/provider/Transaction;", "b", "Lcom/oppwa/mobile/connect/exception/PaymentError;", "getPaymentError", "()Lcom/oppwa/mobile/connect/exception/PaymentError;", "<init>", "(Lcom/oppwa/mobile/connect/provider/Transaction;Lcom/oppwa/mobile/connect/exception/PaymentError;)V", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1})
public final class ProcessorActivityResult {

    /* renamed from: a  reason: collision with root package name */
    private final Transaction f121885a;

    /* renamed from: b  reason: collision with root package name */
    private final PaymentError f121886b;

    public ProcessorActivityResult() {
        this((Transaction) null, (PaymentError) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProcessorActivityResult copy$default(ProcessorActivityResult processorActivityResult, Transaction transaction, PaymentError paymentError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transaction = processorActivityResult.f121885a;
        }
        if ((i10 & 2) != 0) {
            paymentError = processorActivityResult.f121886b;
        }
        return processorActivityResult.copy(transaction, paymentError);
    }

    public final Transaction component1() {
        return this.f121885a;
    }

    public final PaymentError component2() {
        return this.f121886b;
    }

    public final ProcessorActivityResult copy(Transaction transaction, PaymentError paymentError) {
        return new ProcessorActivityResult(transaction, paymentError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessorActivityResult)) {
            return false;
        }
        ProcessorActivityResult processorActivityResult = (ProcessorActivityResult) obj;
        return C17542s.e(this.f121885a, processorActivityResult.f121885a) && C17542s.e(this.f121886b, processorActivityResult.f121886b);
    }

    public final PaymentError getPaymentError() {
        return this.f121886b;
    }

    public final Transaction getTransaction() {
        return this.f121885a;
    }

    public int hashCode() {
        Transaction transaction = this.f121885a;
        int i10 = 0;
        int hashCode = (transaction == null ? 0 : transaction.hashCode()) * 31;
        PaymentError paymentError = this.f121886b;
        if (paymentError != null) {
            i10 = paymentError.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ProcessorActivityResult(transaction=" + this.f121885a + ", paymentError=" + this.f121886b + ')';
    }

    public ProcessorActivityResult(Transaction transaction, PaymentError paymentError) {
        this.f121885a = transaction;
        this.f121886b = paymentError;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProcessorActivityResult(Transaction transaction, PaymentError paymentError, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : transaction, (i10 & 2) != 0 ? null : paymentError);
    }
}
