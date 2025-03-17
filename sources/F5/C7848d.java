package f5;

import android.graphics.Rect;
import d5.C7744b;
import f5.C7847c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002\u0015\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010#R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010&R\u0014\u0010*\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010)¨\u0006,"}, d2 = {"Lf5/d;", "Lf5/c;", "Ld5/b;", "featureBounds", "Lf5/d$b;", "type", "Lf5/c$c;", "state", "<init>", "(Ld5/b;Lf5/d$b;Lf5/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ld5/b;", "b", "Lf5/d$b;", "getType$window_release", "()Lf5/d$b;", "c", "Lf5/c$c;", "getState", "()Lf5/c$c;", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "()Z", "isSeparating", "Lf5/c$a;", "()Lf5/c$a;", "occlusionType", "Lf5/c$b;", "()Lf5/c$b;", "orientation", "d", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: f5.d  reason: case insensitive filesystem */
public final class C7848d implements C7847c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f51125d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C7744b f51126a;

    /* renamed from: b  reason: collision with root package name */
    private final b f51127b;

    /* renamed from: c  reason: collision with root package name */
    private final C7847c.C0840c f51128c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf5/d$a;", "", "<init>", "()V", "Ld5/b;", "bounds", "LXH/N;", "a", "(Ld5/b;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f5.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(C7744b bVar) {
            C17542s.j(bVar, "bounds");
            if (bVar.d() == 0 && bVar.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            } else if (bVar.b() != 0 && bVar.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lf5/d$b;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f5.d$b */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f51129b = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final b f51130c = new b("FOLD");
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final b f51131d = new b("HINGE");

        /* renamed from: a  reason: collision with root package name */
        private final String f51132a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lf5/d$b$a;", "", "<init>", "()V", "Lf5/d$b;", "FOLD", "Lf5/d$b;", "a", "()Lf5/d$b;", "HINGE", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: f5.d$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a() {
                return b.f51130c;
            }

            public final b b() {
                return b.f51131d;
            }

            private a() {
            }
        }

        private b(String str) {
            this.f51132a = str;
        }

        public String toString() {
            return this.f51132a;
        }
    }

    public C7848d(C7744b bVar, b bVar2, C7847c.C0840c cVar) {
        C17542s.j(bVar, "featureBounds");
        C17542s.j(bVar2, "type");
        C17542s.j(cVar, "state");
        this.f51126a = bVar;
        this.f51127b = bVar2;
        this.f51128c = cVar;
        f51125d.a(bVar);
    }

    public C7847c.b a() {
        return this.f51126a.d() > this.f51126a.a() ? C7847c.b.f51119d : C7847c.b.f51118c;
    }

    public boolean b() {
        b bVar = this.f51127b;
        b.a aVar = b.f51129b;
        if (C17542s.e(bVar, aVar.b())) {
            return true;
        }
        return C17542s.e(this.f51127b, aVar.a()) && C17542s.e(getState(), C7847c.C0840c.f51123d);
    }

    public C7847c.a c() {
        return (this.f51126a.d() == 0 || this.f51126a.a() == 0) ? C7847c.a.f51114c : C7847c.a.f51115d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C7848d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C7848d dVar = (C7848d) obj;
        return C17542s.e(this.f51126a, dVar.f51126a) && C17542s.e(this.f51127b, dVar.f51127b) && C17542s.e(getState(), dVar.getState());
    }

    public Rect getBounds() {
        return this.f51126a.f();
    }

    public C7847c.C0840c getState() {
        return this.f51128c;
    }

    public int hashCode() {
        return (((this.f51126a.hashCode() * 31) + this.f51127b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return C7848d.class.getSimpleName() + " { " + this.f51126a + ", type=" + this.f51127b + ", state=" + getState() + " }";
    }
}
