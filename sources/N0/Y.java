package n0;

import android.view.View;
import android.widget.Magnifier;
import c2.d;
import kotlin.Metadata;
import n0.X;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import pI.C17752b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Ln0/Y;", "Ln0/W;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Lc2/k;", "size", "Lc2/h;", "cornerRadius", "elevation", "clippingEnabled", "Lc2/d;", "density", "", "initialZoom", "Ln0/Y$a;", "c", "(Landroid/view/View;ZJFFZLc2/d;F)Ln0/Y$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Y implements W {

    /* renamed from: b  reason: collision with root package name */
    public static final Y f26389b = new Y();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f26390c = true;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Ln0/Y$a;", "Ln0/X$a;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "Lo1/g;", "sourceCenter", "magnifierCenter", "", "zoom", "LXH/N;", "b", "(JJF)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends X.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        public void b(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                d().setZoom(f10);
            }
            if (C5668h.c(j11)) {
                d().show(C5667g.m(j10), C5667g.n(j10), C5667g.m(j11), C5667g.n(j11));
            } else {
                d().show(C5667g.m(j10), C5667g.n(j10));
            }
        }
    }

    private Y() {
    }

    public boolean b() {
        return f26390c;
    }

    /* renamed from: c */
    public a a(View view, boolean z10, long j10, float f10, float f11, boolean z11, d dVar, float f12) {
        if (z10) {
            return new a(new Magnifier(view));
        }
        long O10 = dVar.O(j10);
        float H12 = dVar.H1(f10);
        float H13 = dVar.H1(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (O10 != 9205357640488583168L) {
            builder.setSize(C17752b.e(C5673m.l(O10)), C17752b.e(C5673m.i(O10)));
        }
        if (!Float.isNaN(H12)) {
            builder.setCornerRadius(H12);
        }
        if (!Float.isNaN(H13)) {
            builder.setElevation(H13);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new a(builder.build());
    }
}
