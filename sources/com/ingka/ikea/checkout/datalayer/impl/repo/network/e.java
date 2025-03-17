package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/e;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "GIFTCARD_ERROR", "GIFTCARD_VALIDATION_ERROR", "PAYMENTCONTEXT_ERROR", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum e {
    GIFTCARD_ERROR("GIFTCARD_ERROR"),
    GIFTCARD_VALIDATION_ERROR("GIFTCARD_VALIDATION_ERROR"),
    PAYMENTCONTEXT_ERROR("PAYMENTCONTEXT_ERROR");
    
    public static final a Companion = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/e$a;", "", "<init>", "()V", "", "errorCode", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/e;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/e;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String str) {
            T t10;
            Iterator<T> it = e.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((e) t10).j(), str)) {
                    break;
                }
            }
            return (e) t10;
        }

        private a() {
        }
    }

    static {
        e[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private e(String str) {
        this.rawValue = str;
    }

    public static C17220a<e> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.rawValue;
    }
}
