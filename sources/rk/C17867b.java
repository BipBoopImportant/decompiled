package rK;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import c2.n;
import c2.t;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import o1.C5667g;
import o1.C5669i;
import o1.C5673m;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u0002"}, d2 = {"Lo1/i;", "Lo1/m;", "destination", "Li1/c;", "alignment", "Lc2/t;", "layoutDirection", "Lo1/g;", "a", "(Lo1/i;JLi1/c;Lc2/t;)J", "Lc2/n;", "alignedOffset", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.b  reason: case insensitive filesystem */
public final class C17867b {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc2/n;", "b", "()J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rK.b$a */
    static final class a extends C17544u implements C17631a<n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5437c f146740c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5669i f146741d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f146742e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t f146743f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5437c cVar, C5669i iVar, long j10, t tVar) {
            super(0);
            this.f146740c = cVar;
            this.f146741d = iVar;
            this.f146742e = j10;
            this.f146743f = tVar;
        }

        public final long b() {
            return this.f146740c.a(C17871f.o(this.f146741d.q()), C17871f.o(this.f146742e), this.f146743f);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n.b(b());
        }
    }

    public static final long a(C5669i iVar, long j10, C5437c cVar, t tVar) {
        C17542s.j(iVar, "$this$calculateTopLeftToOverlapWith");
        C17542s.j(cVar, "alignment");
        C17542s.j(tVar, "layoutDirection");
        if (j10 != C5673m.f26722b.a()) {
            C16824o a10 = C16825p.a(s.NONE, new a(cVar, iVar, j10, tVar));
            return C5667g.f(iVar.s(), iVar.t() >= C5673m.l(j10) ? C17978n.l(C5667g.m(iVar.s()), C17978n.h(C5673m.l(j10) - iVar.t(), 0.0f), 0.0f) : (float) n.h(b(a10)), iVar.n() >= C5673m.i(j10) ? C17978n.l(C5667g.n(iVar.s()), C17978n.h(C5673m.i(j10) - iVar.n(), 0.0f), 0.0f) : (float) n.i(b(a10)));
        }
        throw new IllegalStateException("Whoops Modifier.zoomable() is not supposed to handle gestures yet. Please file an issue on https://github.com/saket/telephoto/issues?");
    }

    private static final long b(C16824o<n> oVar) {
        return oVar.getValue().n();
    }
}
