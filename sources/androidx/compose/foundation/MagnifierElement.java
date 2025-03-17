package androidx.compose.foundation;

import G1.V;
import XH.C16807N;
import c2.d;
import c2.h;
import c2.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5587J;
import n0.W;
import nI.C17642l;
import o1.C5667g;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u00020\b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0011\u001a\u00020\u00108\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010(R\u001a\u0010\u0012\u001a\u00020\u00108\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "LG1/V;", "Ln0/J;", "Lkotlin/Function1;", "Lc2/d;", "Lo1/g;", "sourceCenter", "magnifierCenter", "Lc2/k;", "LXH/N;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lc2/h;", "cornerRadius", "elevation", "clippingEnabled", "Ln0/W;", "platformMagnifierFactory", "<init>", "(LnI/l;LnI/l;LnI/l;FZJFFZLn0/W;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Ln0/J;", "node", "f", "(Ln0/J;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "LnI/l;", "e", "g", "F", "h", "Z", "i", "J", "j", "k", "l", "m", "Ln0/W;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MagnifierElement extends V<C5587J> {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<d, C5667g> f17506d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<d, C5667g> f17507e;

    /* renamed from: f  reason: collision with root package name */
    private final C17642l<k, C16807N> f17508f;

    /* renamed from: g  reason: collision with root package name */
    private final float f17509g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f17510h;

    /* renamed from: i  reason: collision with root package name */
    private final long f17511i;

    /* renamed from: j  reason: collision with root package name */
    private final float f17512j;

    /* renamed from: k  reason: collision with root package name */
    private final float f17513k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f17514l;

    /* renamed from: m  reason: collision with root package name */
    private final W f17515m;

    public /* synthetic */ MagnifierElement(C17642l lVar, C17642l lVar2, C17642l lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, W w10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, lVar2, lVar3, f10, z10, j10, f11, f12, z11, w10);
    }

    /* renamed from: c */
    public C5587J a() {
        return new C5587J(this.f17506d, this.f17507e, this.f17508f, this.f17509g, this.f17510h, this.f17511i, this.f17512j, this.f17513k, this.f17514l, this.f17515m, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f17506d == magnifierElement.f17506d && this.f17507e == magnifierElement.f17507e && this.f17509g == magnifierElement.f17509g && this.f17510h == magnifierElement.f17510h && k.f(this.f17511i, magnifierElement.f17511i) && h.D(this.f17512j, magnifierElement.f17512j) && h.D(this.f17513k, magnifierElement.f17513k) && this.f17514l == magnifierElement.f17514l && this.f17508f == magnifierElement.f17508f && C17542s.e(this.f17515m, magnifierElement.f17515m);
    }

    /* renamed from: f */
    public void b(C5587J j10) {
        j10.K2(this.f17506d, this.f17507e, this.f17509g, this.f17510h, this.f17511i, this.f17512j, this.f17513k, this.f17514l, this.f17508f, this.f17515m);
    }

    public int hashCode() {
        int hashCode = this.f17506d.hashCode() * 31;
        C17642l<d, C5667g> lVar = this.f17507e;
        int i10 = 0;
        int hashCode2 = (((((((((((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + Float.hashCode(this.f17509g)) * 31) + Boolean.hashCode(this.f17510h)) * 31) + k.i(this.f17511i)) * 31) + h.E(this.f17512j)) * 31) + h.E(this.f17513k)) * 31) + Boolean.hashCode(this.f17514l)) * 31;
        C17642l<k, C16807N> lVar2 = this.f17508f;
        if (lVar2 != null) {
            i10 = lVar2.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f17515m.hashCode();
    }

    private MagnifierElement(C17642l<? super d, C5667g> lVar, C17642l<? super d, C5667g> lVar2, C17642l<? super k, C16807N> lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, W w10) {
        this.f17506d = lVar;
        this.f17507e = lVar2;
        this.f17508f = lVar3;
        this.f17509g = f10;
        this.f17510h = z10;
        this.f17511i = j10;
        this.f17512j = f11;
        this.f17513k = f12;
        this.f17514l = z11;
        this.f17515m = w10;
    }
}
