package androidx.compose.animation;

import G1.V;
import c2.n;
import c2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.k;
import l0.p;
import m0.C5556n;
import m0.v0;
import nI.C17631a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b*\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010-\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/\"\u0004\b6\u00101R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b\u0013\u0010E\"\u0004\bF\u0010GR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006N"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "LG1/V;", "Landroidx/compose/animation/h;", "Lm0/v0;", "Ll0/k;", "transition", "Lm0/v0$a;", "Lc2/r;", "Lm0/n;", "sizeAnimation", "Lc2/n;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/i;", "enter", "Landroidx/compose/animation/k;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Ll0/p;", "graphicsLayerBlock", "<init>", "(Lm0/v0;Lm0/v0$a;Lm0/v0$a;Lm0/v0$a;Landroidx/compose/animation/i;Landroidx/compose/animation/k;LnI/a;Ll0/p;)V", "c", "()Landroidx/compose/animation/h;", "node", "LXH/N;", "f", "(Landroidx/compose/animation/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lm0/v0;", "getTransition", "()Lm0/v0;", "e", "Lm0/v0$a;", "getSizeAnimation", "()Lm0/v0$a;", "setSizeAnimation", "(Lm0/v0$a;)V", "getOffsetAnimation", "setOffsetAnimation", "g", "getSlideAnimation", "setSlideAnimation", "h", "Landroidx/compose/animation/i;", "getEnter", "()Landroidx/compose/animation/i;", "setEnter", "(Landroidx/compose/animation/i;)V", "i", "Landroidx/compose/animation/k;", "getExit", "()Landroidx/compose/animation/k;", "setExit", "(Landroidx/compose/animation/k;)V", "j", "LnI/a;", "()LnI/a;", "setEnabled", "(LnI/a;)V", "k", "Ll0/p;", "getGraphicsLayerBlock", "()Ll0/p;", "setGraphicsLayerBlock", "(Ll0/p;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class EnterExitTransitionElement extends V<h> {

    /* renamed from: d  reason: collision with root package name */
    private final v0<k> f17272d;

    /* renamed from: e  reason: collision with root package name */
    private v0<k>.a<r, C5556n> f17273e;

    /* renamed from: f  reason: collision with root package name */
    private v0<k>.a<n, C5556n> f17274f;

    /* renamed from: g  reason: collision with root package name */
    private v0<k>.a<n, C5556n> f17275g;

    /* renamed from: h  reason: collision with root package name */
    private i f17276h;

    /* renamed from: i  reason: collision with root package name */
    private k f17277i;

    /* renamed from: j  reason: collision with root package name */
    private C17631a<Boolean> f17278j;

    /* renamed from: k  reason: collision with root package name */
    private p f17279k;

    public EnterExitTransitionElement(v0<k> v0Var, v0<k>.a<r, C5556n> aVar, v0<k>.a<n, C5556n> aVar2, v0<k>.a<n, C5556n> aVar3, i iVar, k kVar, C17631a<Boolean> aVar4, p pVar) {
        this.f17272d = v0Var;
        this.f17273e = aVar;
        this.f17274f = aVar2;
        this.f17275g = aVar3;
        this.f17276h = iVar;
        this.f17277i = kVar;
        this.f17278j = aVar4;
        this.f17279k = pVar;
    }

    /* renamed from: c */
    public h a() {
        return new h(this.f17272d, this.f17273e, this.f17274f, this.f17275g, this.f17276h, this.f17277i, this.f17278j, this.f17279k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return C17542s.e(this.f17272d, enterExitTransitionElement.f17272d) && C17542s.e(this.f17273e, enterExitTransitionElement.f17273e) && C17542s.e(this.f17274f, enterExitTransitionElement.f17274f) && C17542s.e(this.f17275g, enterExitTransitionElement.f17275g) && C17542s.e(this.f17276h, enterExitTransitionElement.f17276h) && C17542s.e(this.f17277i, enterExitTransitionElement.f17277i) && C17542s.e(this.f17278j, enterExitTransitionElement.f17278j) && C17542s.e(this.f17279k, enterExitTransitionElement.f17279k);
    }

    /* renamed from: f */
    public void b(h hVar) {
        hVar.N2(this.f17272d);
        hVar.L2(this.f17273e);
        hVar.K2(this.f17274f);
        hVar.M2(this.f17275g);
        hVar.G2(this.f17276h);
        hVar.H2(this.f17277i);
        hVar.F2(this.f17278j);
        hVar.I2(this.f17279k);
    }

    public int hashCode() {
        int hashCode = this.f17272d.hashCode() * 31;
        v0<k>.a<r, C5556n> aVar = this.f17273e;
        int i10 = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        v0<k>.a<n, C5556n> aVar2 = this.f17274f;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        v0<k>.a<n, C5556n> aVar3 = this.f17275g;
        if (aVar3 != null) {
            i10 = aVar3.hashCode();
        }
        return ((((((((hashCode3 + i10) * 31) + this.f17276h.hashCode()) * 31) + this.f17277i.hashCode()) * 31) + this.f17278j.hashCode()) * 31) + this.f17279k.hashCode();
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.f17272d + ", sizeAnimation=" + this.f17273e + ", offsetAnimation=" + this.f17274f + ", slideAnimation=" + this.f17275g + ", enter=" + this.f17276h + ", exit=" + this.f17277i + ", isEnabled=" + this.f17278j + ", graphicsLayerBlock=" + this.f17279k + ')';
    }
}
