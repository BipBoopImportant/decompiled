package Wn;

import XH.t;
import Yn.P;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LWn/h;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "HOME", "COLLECT", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum h {
    HOME("Deliver"),
    COLLECT("Collect");
    
    public static final a Companion = null;
    private final String key;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LWn/h$a;", "", "<init>", "()V", "LYn/P;", "deliveryMethod", "", "a", "(LYn/P;)Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Wn.h$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1898a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f89088a = null;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    Yn.P[] r0 = Yn.P.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Yn.P r1 = Yn.P.HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Yn.P r1 = Yn.P.COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f89088a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Wn.h.a.C1898a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(P p10) {
            C17542s.j(p10, "deliveryMethod");
            int i10 = C1898a.f89088a[p10.ordinal()];
            if (i10 == 1) {
                return h.HOME.b();
            }
            if (i10 == 2) {
                return h.COLLECT.b();
            }
            throw new t();
        }

        private a() {
        }
    }

    static {
        h[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private h(String str) {
        this.key = str;
    }

    public final String b() {
        return this.key;
    }
}
