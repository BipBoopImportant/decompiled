package Y1;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import p1.C5728l0;
import p1.C5747v0;
import p1.e1;
import p1.j1;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\tJ\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"LY1/n;", "", "other", "e", "(LY1/n;)LY1/n;", "Lkotlin/Function0;", "c", "(LnI/a;)LY1/n;", "Lp1/v0;", "b", "()J", "color", "Lp1/l0;", "d", "()Lp1/l0;", "brush", "", "a", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14805a = a.f14806a;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LY1/n$a;", "", "<init>", "()V", "Lp1/v0;", "color", "LY1/n;", "b", "(J)LY1/n;", "Lp1/l0;", "brush", "", "alpha", "a", "(Lp1/l0;F)LY1/n;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f14806a = new a();

        private a() {
        }

        public final n a(C5728l0 l0Var, float f10) {
            if (l0Var == null) {
                return b.f14807b;
            }
            if (l0Var instanceof j1) {
                return b(m.c(((j1) l0Var).b(), f10));
            }
            if (l0Var instanceof e1) {
                return new c((e1) l0Var, f10);
            }
            throw new t();
        }

        public final n b(long j10) {
            return j10 != 16 ? new d(j10, (DefaultConstructorMarker) null) : b.f14807b;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"LY1/n$b;", "LY1/n;", "<init>", "()V", "Lp1/v0;", "b", "()J", "color", "Lp1/l0;", "d", "()Lp1/l0;", "brush", "", "a", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements n {

        /* renamed from: b  reason: collision with root package name */
        public static final b f14807b = new b();

        private b() {
        }

        public float a() {
            return Float.NaN;
        }

        public long b() {
            return C5747v0.f27350b.i();
        }

        public C5728l0 d() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f14808c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f14808c = nVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(this.f14808c.a());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LY1/n;", "b", "()LY1/n;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f14809c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(0);
            this.f14809c = nVar;
        }

        /* renamed from: b */
        public final n invoke() {
            return this.f14809c;
        }
    }

    float a();

    long b();

    n c(C17631a<? extends n> aVar) {
        return !C17542s.e(this, b.f14807b) ? this : (n) aVar.invoke();
    }

    C5728l0 d();

    n e(n nVar) {
        boolean z10 = nVar instanceof c;
        return (!z10 || !(this instanceof c)) ? (!z10 || (this instanceof c)) ? (z10 || !(this instanceof c)) ? nVar.c(new d(this)) : this : nVar : new c(((c) nVar).f(), m.d(nVar.a(), new c(this)));
    }
}
