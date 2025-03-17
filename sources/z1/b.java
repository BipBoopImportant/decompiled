package Z1;

import I0.b1;
import N1.Y;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.j;
import Y1.k;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f14954a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static p<C4889m, Integer, C16807N> f14955b = c.c(-426398407, false, a.f14956c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f14956c = new a();

        a() {
            super(2);
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-426398407, i11, -1, "androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.lambda-1.<anonymous> (PreviewActivity.android.kt:124)");
                }
                b1.d("Next", (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, (C17642l) null, (Y) null, mVar, 6, 0, 65534);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final p<C4889m, Integer, C16807N> a() {
        return f14955b;
    }
}
