package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import HJ.C15854t;
import Hx.f;
import XH.t;
import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseTypeRemote;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "ORDER", "RECEIPT", "RETURN", "UNKNOWN", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum PurchaseTypeRemote {
    ORDER("ORDER"),
    RECEIPT("RECEIPT"),
    RETURN("RETURN"),
    UNKNOWN("UNKNOWN");
    
    public static final a Companion = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseTypeRemote$a;", "", "<init>", "()V", "", "rawValue", "LHx/f;", "a", "(Ljava/lang/String;)LHx/f;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2988a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f119562a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote[] r0 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote r1 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote.ORDER     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote r1 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote.RECEIPT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote r1 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote.RETURN     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote r1 = com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f119562a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseTypeRemote.a.C2988a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String str) {
            T t10;
            Iterator<T> it = PurchaseTypeRemote.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C15854t.H(((PurchaseTypeRemote) t10).getRawValue(), str, true)) {
                    break;
                }
            }
            PurchaseTypeRemote purchaseTypeRemote = (PurchaseTypeRemote) t10;
            if (purchaseTypeRemote == null) {
                purchaseTypeRemote = PurchaseTypeRemote.UNKNOWN;
            }
            int i10 = C2988a.f119562a[purchaseTypeRemote.ordinal()];
            if (i10 == 1) {
                return f.ORDER;
            }
            if (i10 == 2) {
                return f.RECEIPT;
            }
            if (i10 == 3) {
                return f.RETURN;
            }
            if (i10 == 4) {
                return f.UNKNOWN;
            }
            throw new t();
        }

        private a() {
        }
    }

    static {
        PurchaseTypeRemote[] $values;
        $ENTRIES = C17221b.a($values);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private PurchaseTypeRemote(String str) {
        this.rawValue = str;
    }

    public static C17220a<PurchaseTypeRemote> getEntries() {
        return $ENTRIES;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
