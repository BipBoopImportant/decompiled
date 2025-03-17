package O0;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"LO0/T;", "", "<init>", "()V", "LO0/S;", "b", "(LU0/m;I)LO0/S;", "LO0/t;", "Lp1/v0;", "localContentColor", "a", "(LO0/t;J)LO0/S;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public static final T f10004a = new T();

    private T() {
    }

    public final S a(C4753t tVar, long j10) {
        S e10 = tVar.e();
        if (e10 != null) {
            return e10;
        }
        C5747v0.a aVar = C5747v0.f27350b;
        S s10 = new S(aVar.h(), j10, aVar.h(), C5747v0.o(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        tVar.V(s10);
        return s10;
    }

    public final S b(C4889m mVar, int i10) {
        C4889m mVar2 = mVar;
        mVar2.W(-1519621781);
        if (C4895p.J()) {
            C4895p.S(-1519621781, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long y10 = ((C5747v0) mVar2.Q(E.a())).y();
        S a10 = a(X.f10101a.a(mVar2, 6), y10);
        if (C5747v0.q(a10.e(), y10)) {
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return a10;
        }
        S d10 = S.d(a10, 0, y10, 0, C5747v0.o(y10, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 5, (Object) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return d10;
    }
}
