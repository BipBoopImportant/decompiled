package androidx.compose.animation;

import c2.r;
import kotlin.Metadata;
import l0.v;
import m0.N;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/n;", "Ll0/v;", "", "clip", "Lkotlin/Function2;", "Lc2/r;", "Lm0/N;", "sizeAnimationSpec", "<init>", "(ZLnI/p;)V", "initialSize", "targetSize", "b", "(JJ)Lm0/N;", "a", "Z", "()Z", "LnI/p;", "getSizeAnimationSpec", "()LnI/p;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class n implements v {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f17475a;

    /* renamed from: b  reason: collision with root package name */
    private final p<r, r, N<r>> f17476b;

    public n(boolean z10, p<? super r, ? super r, ? extends N<r>> pVar) {
        this.f17475a = z10;
        this.f17476b = pVar;
    }

    public boolean a() {
        return this.f17475a;
    }

    public N<r> b(long j10, long j11) {
        return this.f17476b.invoke(r.b(j10), r.b(j11));
    }
}
