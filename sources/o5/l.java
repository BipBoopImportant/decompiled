package O5;

import O5.c;
import QJ.C16320n;
import QJ.C16324p;
import XH.C16807N;
import XH.x;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ)\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"LO5/l;", "Landroid/view/View;", "T", "LO5/j;", "LO5/i;", "a", "()LO5/i;", "LO5/c;", "getWidth", "()LO5/c;", "getHeight", "", "paramSize", "viewSize", "paddingSize", "f", "(III)LO5/c;", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "LXH/N;", "g", "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "b", "(LdI/e;)Ljava/lang/Object;", "c", "()Landroid/view/View;", "view", "", "i", "()Z", "subtractPadding", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface l<T extends View> extends j {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<T> f39257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f39258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f39259c;

        a(l<T> lVar, ViewTreeObserver viewTreeObserver, b bVar) {
            this.f39257a = lVar;
            this.f39258b = viewTreeObserver;
            this.f39259c = bVar;
        }

        public final void a(Throwable th2) {
            this.f39257a.g(this.f39258b, this.f39259c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"O5/l$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "a", "Z", "isResumed", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f39260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<T> f39261b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f39262c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16320n<i> f39263d;

        b(l<T> lVar, ViewTreeObserver viewTreeObserver, C16320n<? super i> nVar) {
            this.f39261b = lVar;
            this.f39262c = viewTreeObserver;
            this.f39263d = nVar;
        }

        public boolean onPreDraw() {
            i k10 = this.f39261b.a();
            if (k10 != null) {
                this.f39261b.g(this.f39262c, this);
                if (!this.f39260a) {
                    this.f39260a = true;
                    this.f39263d.resumeWith(x.b(k10));
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    i a() {
        c height;
        c width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new i(width, height);
    }

    private c f(int i10, int i11, int i12) {
        if (i10 == -2) {
            return c.b.f39248a;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return a.a(i13);
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return a.a(i14);
        }
        return null;
    }

    /* access modifiers changed from: private */
    void g(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            c().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    private c getHeight() {
        ViewGroup.LayoutParams layoutParams = c().getLayoutParams();
        return f(layoutParams != null ? layoutParams.height : -1, c().getHeight(), i() ? c().getPaddingTop() + c().getPaddingBottom() : 0);
    }

    private c getWidth() {
        ViewGroup.LayoutParams layoutParams = c().getLayoutParams();
        return f(layoutParams != null ? layoutParams.width : -1, c().getWidth(), i() ? c().getPaddingLeft() + c().getPaddingRight() : 0);
    }

    static /* synthetic */ <T extends View> Object l(l<T> lVar, C17164e<? super i> eVar) {
        i a10 = lVar.a();
        if (a10 != null) {
            return a10;
        }
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        ViewTreeObserver viewTreeObserver = lVar.c().getViewTreeObserver();
        b bVar = new b(lVar, viewTreeObserver, pVar);
        viewTreeObserver.addOnPreDrawListener(bVar);
        pVar.K(new a(lVar, viewTreeObserver, bVar));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }

    Object b(C17164e<? super i> eVar) {
        return l(this, eVar);
    }

    T c();

    boolean i() {
        return true;
    }
}
