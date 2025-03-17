package n0;

import android.view.View;
import android.widget.Magnifier;
import c2.d;
import c2.s;
import kotlin.Metadata;
import o1.C5667g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Ln0/X;", "Ln0/W;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Lc2/k;", "size", "Lc2/h;", "cornerRadius", "elevation", "clippingEnabled", "Lc2/d;", "density", "", "initialZoom", "Ln0/X$a;", "c", "(Landroid/view/View;ZJFFZLc2/d;F)Ln0/X$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class X implements W {

    /* renamed from: b  reason: collision with root package name */
    public static final X f26386b = new X();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f26387c = false;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00158VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Ln0/X$a;", "Ln0/V;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "LXH/N;", "c", "()V", "Lo1/g;", "sourceCenter", "magnifierCenter", "", "zoom", "b", "(JJF)V", "dismiss", "a", "Landroid/widget/Magnifier;", "d", "()Landroid/widget/Magnifier;", "Lc2/r;", "()J", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a implements V {

        /* renamed from: a  reason: collision with root package name */
        private final Magnifier f26388a;

        public a(Magnifier magnifier) {
            this.f26388a = magnifier;
        }

        public long a() {
            return s.a(this.f26388a.getWidth(), this.f26388a.getHeight());
        }

        public void b(long j10, long j11, float f10) {
            this.f26388a.show(C5667g.m(j10), C5667g.n(j10));
        }

        public void c() {
            this.f26388a.update();
        }

        public final Magnifier d() {
            return this.f26388a;
        }

        public void dismiss() {
            this.f26388a.dismiss();
        }
    }

    private X() {
    }

    public boolean b() {
        return f26387c;
    }

    /* renamed from: c */
    public a a(View view, boolean z10, long j10, float f10, float f11, boolean z11, d dVar, float f12) {
        return new a(new Magnifier(view));
    }
}
