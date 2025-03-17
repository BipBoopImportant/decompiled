package VI;

import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lJ.C17558e;

/* renamed from: VI.s  reason: case insensitive filesystem */
public abstract class C16687s {

    /* renamed from: a  reason: collision with root package name */
    public static final b f139408a = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final d f139409b = new d(C17558e.BOOLEAN);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final d f139410c = new d(C17558e.CHAR);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final d f139411d = new d(C17558e.BYTE);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final d f139412e = new d(C17558e.SHORT);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final d f139413f = new d(C17558e.INT);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final d f139414g = new d(C17558e.FLOAT);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final d f139415h = new d(C17558e.LONG);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final d f139416i = new d(C17558e.DOUBLE);

    /* renamed from: VI.s$a */
    public static final class a extends C16687s {

        /* renamed from: j  reason: collision with root package name */
        private final C16687s f139417j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C16687s sVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(sVar, "elementType");
            this.f139417j = sVar;
        }

        public final C16687s i() {
            return this.f139417j;
        }
    }

    /* renamed from: VI.s$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return C16687s.f139409b;
        }

        public final d b() {
            return C16687s.f139411d;
        }

        public final d c() {
            return C16687s.f139410c;
        }

        public final d d() {
            return C16687s.f139416i;
        }

        public final d e() {
            return C16687s.f139414g;
        }

        public final d f() {
            return C16687s.f139413f;
        }

        public final d g() {
            return C16687s.f139415h;
        }

        public final d h() {
            return C16687s.f139412e;
        }

        private b() {
        }
    }

    /* renamed from: VI.s$c */
    public static final class c extends C16687s {

        /* renamed from: j  reason: collision with root package name */
        private final String f139418j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "internalName");
            this.f139418j = str;
        }

        public final String i() {
            return this.f139418j;
        }
    }

    /* renamed from: VI.s$d */
    public static final class d extends C16687s {

        /* renamed from: j  reason: collision with root package name */
        private final C17558e f139419j;

        public d(C17558e eVar) {
            super((DefaultConstructorMarker) null);
            this.f139419j = eVar;
        }

        public final C17558e i() {
            return this.f139419j;
        }
    }

    public /* synthetic */ C16687s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return C16689u.f139420a.d(this);
    }

    private C16687s() {
    }
}
