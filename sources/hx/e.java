package Hx;

import HJ.C15854t;
import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0012\u0010\n¨\u0006\u0018"}, d2 = {"LHx/e;", "", "LHx/e$a;", "group", "", "information", "amountFormatted", "<init>", "(LHx/e$a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHx/e$a;", "b", "()LHx/e$a;", "Ljava/lang/String;", "c", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final a f110807a;

    /* renamed from: b  reason: collision with root package name */
    private final String f110808b;

    /* renamed from: c  reason: collision with root package name */
    private final String f110809c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LHx/e$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "CASH", "CARD", "ELECTRONIC_PAYMENT", "INVOICE", "GIFT_REFUND_CARD", "REFUND", "OTHER", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        CASH("CASH"),
        CARD("CARD"),
        ELECTRONIC_PAYMENT("ELECTRONIC_PAYMENT"),
        INVOICE("INVOICE"),
        GIFT_REFUND_CARD("GIFT_REFUND_CARD"),
        REFUND("REFUND"),
        OTHER("OTHER");
        
        public static final C2667a Companion = null;
        private final String rawValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHx/e$a$a;", "", "<init>", "()V", "", "rawValue", "LHx/e$a;", "a", "(Ljava/lang/String;)LHx/e$a;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hx.e$a$a  reason: collision with other inner class name */
        public static final class C2667a {
            public /* synthetic */ C2667a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                T t10;
                Iterator<T> it = a.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C15854t.H(((a) t10).j(), str, true)) {
                        break;
                    }
                }
                a aVar = (a) t10;
                return aVar == null ? a.OTHER : aVar;
            }

            private C2667a() {
            }
        }

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C2667a((DefaultConstructorMarker) null);
        }

        private a(String str) {
            this.rawValue = str;
        }

        public static C17220a<a> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.rawValue;
        }
    }

    public e(a aVar, String str, String str2) {
        C17542s.j(aVar, "group");
        this.f110807a = aVar;
        this.f110808b = str;
        this.f110809c = str2;
    }

    public final String a() {
        return this.f110809c;
    }

    public final a b() {
        return this.f110807a;
    }

    public final String c() {
        return this.f110808b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f110807a == eVar.f110807a && C17542s.e(this.f110808b, eVar.f110808b) && C17542s.e(this.f110809c, eVar.f110809c);
    }

    public int hashCode() {
        int hashCode = this.f110807a.hashCode() * 31;
        String str = this.f110808b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110809c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        a aVar = this.f110807a;
        String str = this.f110808b;
        String str2 = this.f110809c;
        return "PurchasePayment(group=" + aVar + ", information=" + str + ", amountFormatted=" + str2 + ")";
    }
}
