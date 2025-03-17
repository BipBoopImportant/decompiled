package y0;

import E1.C4488v;
import E1.C4489w;
import G1.C4507j;
import G1.C4509l;
import XH.C16807N;
import android.graphics.Rect;
import android.view.View;
import dI.C17164e;
import kotlin.Metadata;
import nI.C17631a;
import o1.C5669i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LG1/j;", "Ly0/a;", "b", "(LG1/j;)Ly0/a;", "Lo1/i;", "Landroid/graphics/Rect;", "c", "(Lo1/i;)Landroid/graphics/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.d  reason: case insensitive filesystem */
public final class C6250d {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LE1/v;", "childCoordinates", "Lkotlin/Function0;", "Lo1/i;", "boundsProvider", "LXH/N;", "z0", "(LE1/v;LnI/a;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: y0.d$a */
    static final class a implements C6247a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4507j f31967a;

        a(C4507j jVar) {
            this.f31967a = jVar;
        }

        public final Object z0(C4488v vVar, C17631a<C5669i> aVar, C17164e<? super C16807N> eVar) {
            View a10 = C4509l.a(this.f31967a);
            long f10 = C4489w.f(vVar);
            C5669i invoke = aVar.invoke();
            C5669i A10 = invoke != null ? invoke.A(f10) : null;
            if (A10 != null) {
                a10.requestRectangleOnScreen(C6250d.c(A10), false);
            }
            return C16807N.f139792a;
        }
    }

    public static final C6247a b(C4507j jVar) {
        return new a(jVar);
    }

    /* access modifiers changed from: private */
    public static final Rect c(C5669i iVar) {
        return new Rect((int) iVar.o(), (int) iVar.r(), (int) iVar.p(), (int) iVar.j());
    }
}
