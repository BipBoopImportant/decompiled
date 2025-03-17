package l0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import m0.B0;
import m0.C5560p;
import m0.z0;
import nI.C17642l;
import p1.C5747v0;
import p1.C5751x0;
import q1.C5776c;
import q1.C5780g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\",\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0000*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lq1/c;", "Lm0/z0;", "Lp1/v0;", "Lm0/p;", "a", "LnI/l;", "ColorToVector", "Lp1/v0$a;", "(Lp1/v0$a;)LnI/l;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final C17642l<C5776c, z0<C5747v0, C5560p>> f25389a = a.f25390c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq1/c;", "colorSpace", "Lm0/z0;", "Lp1/v0;", "Lm0/p;", "a", "(Lq1/c;)Lm0/z0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C5776c, z0<C5747v0, C5560p>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f25390c = new a();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/v0;", "color", "Lm0/p;", "a", "(J)Lm0/p;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: l0.h$a$a  reason: collision with other inner class name */
        static final class C0405a extends C17544u implements C17642l<C5747v0, C5560p> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0405a f25391c = new C0405a();

            C0405a() {
                super(1);
            }

            public final C5560p a(long j10) {
                long m10 = C5747v0.m(j10, C5780g.f27664a.t());
                return new C5560p(C5747v0.r(m10), C5747v0.v(m10), C5747v0.u(m10), C5747v0.s(m10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((C5747v0) obj).y());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/p;", "vector", "Lp1/v0;", "a", "(Lm0/p;)J"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17642l<C5560p, C5747v0> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5776c f25392c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C5776c cVar) {
                super(1);
                this.f25392c = cVar;
            }

            public final long a(C5560p pVar) {
                float g10 = pVar.g();
                float f10 = 0.0f;
                if (g10 < 0.0f) {
                    g10 = 0.0f;
                }
                float f11 = 1.0f;
                if (g10 > 1.0f) {
                    g10 = 1.0f;
                }
                float h10 = pVar.h();
                float f12 = -0.5f;
                if (h10 < -0.5f) {
                    h10 = -0.5f;
                }
                float f13 = 0.5f;
                if (h10 > 0.5f) {
                    h10 = 0.5f;
                }
                float i10 = pVar.i();
                if (i10 >= -0.5f) {
                    f12 = i10;
                }
                if (f12 <= 0.5f) {
                    f13 = f12;
                }
                float f14 = pVar.f();
                if (f14 >= 0.0f) {
                    f10 = f14;
                }
                if (f10 <= 1.0f) {
                    f11 = f10;
                }
                return C5747v0.m(C5751x0.a(g10, h10, f13, f11, C5780g.f27664a.t()), this.f25392c);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return C5747v0.k(a((C5560p) obj));
            }
        }

        a() {
            super(1);
        }

        /* renamed from: a */
        public final z0<C5747v0, C5560p> invoke(C5776c cVar) {
            return B0.a(C0405a.f25391c, new b(cVar));
        }
    }

    public static final C17642l<C5776c, z0<C5747v0, C5560p>> a(C5747v0.a aVar) {
        return f25389a;
    }
}
