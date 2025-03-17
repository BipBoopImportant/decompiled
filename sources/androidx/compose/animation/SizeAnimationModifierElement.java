package androidx.compose.animation;

import G1.V;
import XH.C16807N;
import c2.r;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.N;
import nI.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "LG1/V;", "Landroidx/compose/animation/m;", "Lm0/N;", "Lc2/r;", "animationSpec", "Li1/c;", "alignment", "Lkotlin/Function2;", "LXH/N;", "finishedListener", "<init>", "(Lm0/N;Li1/c;LnI/p;)V", "c", "()Landroidx/compose/animation/m;", "node", "f", "(Landroidx/compose/animation/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lm0/N;", "getAnimationSpec", "()Lm0/N;", "e", "Li1/c;", "getAlignment", "()Li1/c;", "LnI/p;", "getFinishedListener", "()LnI/p;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SizeAnimationModifierElement extends V<m> {

    /* renamed from: d  reason: collision with root package name */
    private final N<r> f17280d;

    /* renamed from: e  reason: collision with root package name */
    private final C5437c f17281e;

    /* renamed from: f  reason: collision with root package name */
    private final p<r, r, C16807N> f17282f;

    public SizeAnimationModifierElement(N<r> n10, C5437c cVar, p<? super r, ? super r, C16807N> pVar) {
        this.f17280d = n10;
        this.f17281e = cVar;
        this.f17282f = pVar;
    }

    /* renamed from: c */
    public m a() {
        return new m(this.f17280d, this.f17281e, this.f17282f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return C17542s.e(this.f17280d, sizeAnimationModifierElement.f17280d) && C17542s.e(this.f17281e, sizeAnimationModifierElement.f17281e) && C17542s.e(this.f17282f, sizeAnimationModifierElement.f17282f);
    }

    /* renamed from: f */
    public void b(m mVar) {
        mVar.J2(this.f17280d);
        mVar.K2(this.f17282f);
        mVar.H2(this.f17281e);
    }

    public int hashCode() {
        int hashCode = ((this.f17280d.hashCode() * 31) + this.f17281e.hashCode()) * 31;
        p<r, r, C16807N> pVar = this.f17282f;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f17280d + ", alignment=" + this.f17281e + ", finishedListener=" + this.f17282f + ')';
    }
}
