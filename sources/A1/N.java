package A1;

import XH.C16807N;
import android.view.MotionEvent;
import kotlin.Metadata;
import nI.C17642l;
import o1.C5667g;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"LA1/p;", "Lo1/g;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "LXH/N;", "block", "c", "(LA1/p;JLnI/l;)V", "b", "", "nowMillis", "a", "(JLnI/l;)V", "", "cancel", "d", "(LA1/p;JLnI/l;Z)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class N {
    public static final void a(long j10, C17642l<? super MotionEvent, C16807N> lVar) {
        MotionEvent obtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        lVar.invoke(obtain);
        obtain.recycle();
    }

    public static final void b(C4349p pVar, long j10, C17642l<? super MotionEvent, C16807N> lVar) {
        d(pVar, j10, lVar, true);
    }

    public static final void c(C4349p pVar, long j10, C17642l<? super MotionEvent, C16807N> lVar) {
        d(pVar, j10, lVar, false);
    }

    private static final void d(C4349p pVar, long j10, C17642l<? super MotionEvent, C16807N> lVar, boolean z10) {
        MotionEvent f10 = pVar.f();
        if (f10 != null) {
            int action = f10.getAction();
            if (z10) {
                f10.setAction(3);
            }
            f10.offsetLocation(-C5667g.m(j10), -C5667g.n(j10));
            lVar.invoke(f10);
            f10.offsetLocation(C5667g.m(j10), C5667g.n(j10));
            f10.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
