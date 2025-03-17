package G0;

import E1.C4488v;
import N1.P;
import Y1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.U0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0010B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"LG0/i;", "", "LE1/v;", "layoutCoordinates", "LN1/P;", "textLayoutResult", "<init>", "(LE1/v;LN1/P;)V", "", "start", "end", "Lp1/U0;", "e", "(II)Lp1/U0;", "b", "(LE1/v;LN1/P;)LG0/i;", "a", "LE1/v;", "d", "()LE1/v;", "LN1/P;", "g", "()LN1/P;", "", "f", "()Z", "shouldClip", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f6173c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f6174d = 8;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final i f6175e = new i((C4488v) null, (P) null);

    /* renamed from: a  reason: collision with root package name */
    private final C4488v f6176a;

    /* renamed from: b  reason: collision with root package name */
    private final P f6177b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LG0/i$a;", "", "<init>", "()V", "LG0/i;", "Empty", "LG0/i;", "a", "()LG0/i;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f6175e;
        }

        private a() {
        }
    }

    public i(C4488v vVar, P p10) {
        this.f6176a = vVar;
        this.f6177b = p10;
    }

    public static /* synthetic */ i c(i iVar, C4488v vVar, P p10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                vVar = iVar.f6176a;
            }
            if ((i10 & 2) != 0) {
                p10 = iVar.f6177b;
            }
            return iVar.b(vVar, p10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final i b(C4488v vVar, P p10) {
        return new i(vVar, p10);
    }

    public final C4488v d() {
        return this.f6176a;
    }

    public U0 e(int i10, int i11) {
        P p10 = this.f6177b;
        if (p10 != null) {
            return p10.z(i10, i11);
        }
        return null;
    }

    public boolean f() {
        P p10 = this.f6177b;
        return p10 != null && !t.e(p10.l().f(), t.f14827a.c()) && p10.i();
    }

    public final P g() {
        return this.f6177b;
    }
}
