package v6;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t6.C8835d;
import t6.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B;\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\fj\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lv6/d;", "", "", "title", "description", "badgeForeground", "badgeForegroundCropped", "lockup", "<init>", "(Ljava/lang/String;IIIIII)V", "I", "b", "()I", "getDescription", "getBadgeForeground", "getBadgeForegroundCropped", "getLockup", "Companion", "a", "AFTERPAY", "CLEARPAY", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum d {
    AFTERPAY(g.f56642a, g.f56643b, C8835d.f56631a, C8835d.f56632b, C8835d.f56633c),
    CLEARPAY(g.f56645d, g.f56646e, C8835d.f56634d, C8835d.f56635e, C8835d.f56636f);
    
    public static final a Companion = null;
    private final int badgeForeground;
    private final int badgeForegroundCropped;
    private final int description;
    private final int lockup;
    private final int title;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv6/d$a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Lv6/d;", "a", "(Ljava/util/Locale;)Lv6/d;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
            r4 = (v6.d) r1.getValue();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final v6.d a(java.util.Locale r4) {
            /*
                r3 = this;
                java.lang.String r0 = "locale"
                kotlin.jvm.internal.C17542s.j(r4, r0)
                java.util.Map r0 = v6.e.f56906a
                java.util.Set r0 = r0.entrySet()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0013:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x002d
                java.lang.Object r1 = r0.next()
                r2 = r1
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r2 = r2.getKey()
                java.util.Set r2 = (java.util.Set) r2
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto L_0x0013
                goto L_0x002e
            L_0x002d:
                r1 = 0
            L_0x002e:
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                if (r1 == 0) goto L_0x003a
                java.lang.Object r4 = r1.getValue()
                v6.d r4 = (v6.d) r4
                if (r4 != 0) goto L_0x003c
            L_0x003a:
                v6.d r4 = v6.d.AFTERPAY
            L_0x003c:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: v6.d.a.a(java.util.Locale):v6.d");
        }

        private a() {
        }
    }

    static {
        Companion = new a((DefaultConstructorMarker) null);
    }

    private d(int i10, int i11, int i12, int i13, int i14) {
        this.title = i10;
        this.description = i11;
        this.badgeForeground = i12;
        this.badgeForegroundCropped = i13;
        this.lockup = i14;
    }

    public final int b() {
        return this.title;
    }
}
