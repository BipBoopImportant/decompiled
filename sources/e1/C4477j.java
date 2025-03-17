package E1;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: E1.j  reason: case insensitive filesystem */
public final class C4477j {

    /* renamed from: a  reason: collision with root package name */
    public static final C4477j f5910a = new C4477j();

    /* renamed from: b  reason: collision with root package name */
    public static p<C4889m, Integer, C16807N> f5911b = c.c(-1741544742, false, a.f5912c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: E1.j$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f5912c = new a();

        a() {
            super(2);
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1741544742, i10, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda-1.<anonymous> (SubcomposeLayout.kt:473)");
                }
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
        return f5911b;
    }
}
