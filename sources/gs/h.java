package gs;

import T5.l;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lgs/h;", "", "<init>", "()V", "LT5/l$c;", "", "b", "LT5/l$c;", "a", "()LT5/l$c;", "disableDensityFeatureKey", "c", "imageSizeKey", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f97970a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final l.c<String> f97971b = new l.c<>("DisableDensityFeatureKey");

    /* renamed from: c  reason: collision with root package name */
    private static final l.c<String> f97972c = new l.c<>("ImageSizeKey");

    /* renamed from: d  reason: collision with root package name */
    public static final int f97973d = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lgs/h$a;", "", "", "imWidth", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "RAW", "XXU", "XU", "U", "XXXS", "XXS", "XS", "S", "M", "L", "XL", "XXL", "XXXL", "SG", "G", "XG", "XXG", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        RAW("1400"),
        XXU("40"),
        XU("80"),
        U("160"),
        XXXS("300"),
        XXS("400"),
        XS("500"),
        S("600"),
        M("700"),
        L("750"),
        XL("900"),
        XXL("1100"),
        XXXL("1400"),
        SG("1600"),
        G("2000"),
        XG("3000"),
        XXG("4000");
        
        public static final C2194a Companion = null;
        private final String imWidth;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgs/h$a$a;", "", "<init>", "()V", "", "px", "Lgs/h$a;", "a", "(I)Lgs/h$a;", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gs.h$a$a  reason: collision with other inner class name */
        public static final class C2194a {
            public /* synthetic */ C2194a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(int i10) {
                if (i10 >= 0 && i10 < 160) {
                    return a.XU;
                }
                if (160 <= i10 && i10 < 400) {
                    return a.XXXS;
                }
                if (400 <= i10 && i10 < 600) {
                    return a.XS;
                }
                if (600 <= i10 && i10 < 750) {
                    return a.M;
                }
                if (750 <= i10 && i10 < 1100) {
                    return a.XL;
                }
                if (1100 <= i10 && i10 < 1600) {
                    return a.XXXL;
                }
                if (1600 <= i10 && i10 < 3000) {
                    return a.G;
                }
                if (3000 > i10 || i10 > Integer.MAX_VALUE) {
                    return null;
                }
                return a.XG;
            }

            private C2194a() {
            }
        }

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C2194a((DefaultConstructorMarker) null);
        }

        private a(String str) {
            this.imWidth = str;
        }

        public final String b() {
            return this.imWidth;
        }
    }

    private h() {
    }

    public final l.c<String> a() {
        return f97971b;
    }

    public final l.c<String> b() {
        return f97972c;
    }
}
