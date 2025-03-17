package androidx.compose.animation;

import XH.C16807N;
import androidx.compose.ui.d;
import c2.r;
import c2.s;
import i1.C5437c;
import kotlin.Metadata;
import m0.C5548j;
import m0.N;
import m0.P0;
import m1.e;
import nI.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/d;", "Lm0/N;", "Lc2/r;", "animationSpec", "Lkotlin/Function2;", "LXH/N;", "finishedListener", "a", "(Landroidx/compose/ui/d;Lm0/N;LnI/p;)Landroidx/compose/ui/d;", "J", "c", "()J", "InvalidSize", "", "d", "(J)Z", "isValid", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final long f17373a = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public static final d a(d dVar, N<r> n10, p<? super r, ? super r, C16807N> pVar) {
        return e.b(dVar).s(new SizeAnimationModifierElement(n10, C5437c.f24302a.o(), pVar));
    }

    public static /* synthetic */ d b(d dVar, N n10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, r.b(P0.d(r.f23053b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        return a(dVar, n10, pVar);
    }

    public static final long c() {
        return f17373a;
    }

    public static final boolean d(long j10) {
        return !r.f(j10, f17373a);
    }
}
