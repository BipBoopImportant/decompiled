package M0;

import XH.C16807N;
import androidx.compose.ui.graphics.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import m0.M;
import nI.C17642l;
import o1.C5673m;
import p1.C5745u0;
import r1.C5817c;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "LM0/g;", "state", "", "scale", "a", "(Landroidx/compose/ui/d;LM0/g;Z)Landroidx/compose/ui/d;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/c;", "LXH/N;", "a", "(Lr1/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C5817c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f9105c = new a();

        a() {
            super(1);
        }

        public final void a(C5817c cVar) {
            int b10 = C5745u0.f27347a.b();
            r1.d I12 = cVar.I1();
            long b11 = I12.b();
            I12.e().t();
            try {
                I12.c().c(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, b10);
                cVar.V1();
            } finally {
                I12.e().n();
                I12.g(b11);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5817c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f9106c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f9107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, boolean z10) {
            super(1);
            this.f9106c = gVar;
            this.f9107d = z10;
        }

        public final void a(c cVar) {
            cVar.e(this.f9106c.i() - C5673m.i(cVar.b()));
            if (this.f9107d && !this.f9106c.k()) {
                float a10 = M.f().a(this.f9106c.i() / this.f9106c.l());
                if (a10 < 0.0f) {
                    a10 = 0.0f;
                }
                if (a10 > 1.0f) {
                    a10 = 1.0f;
                }
                cVar.g(a10);
                cVar.m(a10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return C16807N.f139792a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, g gVar, boolean z10) {
        return androidx.compose.ui.graphics.b.a(androidx.compose.ui.draw.b.d(dVar, a.f9105c), new b(gVar, z10));
    }
}
