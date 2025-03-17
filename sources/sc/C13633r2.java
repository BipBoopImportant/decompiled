package SC;

import I0.C4559g0;
import U0.C4889m;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import s0.C5834E;
import wK.R8;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"LSC/r2;", "T", "", "", "items", "Lkotlin/Function1;", "LXH/N;", "itemContent", "onItemSelected", "Lkotlin/Function0;", "onDismissRequest", "Ls0/E;", "itemContentPadding", "", "fluidMenu", "<init>", "(Ljava/util/List;LnI/q;LnI/l;LnI/a;Ls0/E;Z)V", "LwK/R8;", "a", "()LwK/R8;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b", "LnI/q;", "getItemContent", "()LnI/q;", "c", "LnI/l;", "getOnItemSelected", "()LnI/l;", "d", "LnI/a;", "getOnDismissRequest", "()LnI/a;", "e", "Ls0/E;", "getItemContentPadding", "()Ls0/E;", "f", "Z", "getFluidMenu", "()Z", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.r2  reason: case insensitive filesystem */
public final class C13633r2<T> {

    /* renamed from: g  reason: collision with root package name */
    public static final int f116415g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List<T> f116416a;

    /* renamed from: b  reason: collision with root package name */
    private final q<T, C4889m, Integer, C16807N> f116417b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<T, C16807N> f116418c;

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<C16807N> f116419d;

    /* renamed from: e  reason: collision with root package name */
    private final C5834E f116420e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f116421f;

    public C13633r2(List<? extends T> list, q<? super T, ? super C4889m, ? super Integer, C16807N> qVar, C17642l<? super T, C16807N> lVar, C17631a<C16807N> aVar, C5834E e10, boolean z10) {
        C17542s.j(list, "items");
        C17542s.j(qVar, "itemContent");
        C17542s.j(lVar, "onItemSelected");
        C17542s.j(aVar, "onDismissRequest");
        C17542s.j(e10, "itemContentPadding");
        this.f116416a = list;
        this.f116417b = qVar;
        this.f116418c = lVar;
        this.f116419d = aVar;
        this.f116420e = e10;
        this.f116421f = z10;
    }

    public final R8<T> a() {
        return new R8(this.f116416a, this.f116417b, this.f116418c, this.f116419d, this.f116420e, this.f116421f, (Object) null, 64, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13633r2)) {
            return false;
        }
        C13633r2 r2Var = (C13633r2) obj;
        return C17542s.e(this.f116416a, r2Var.f116416a) && C17542s.e(this.f116417b, r2Var.f116417b) && C17542s.e(this.f116418c, r2Var.f116418c) && C17542s.e(this.f116419d, r2Var.f116419d) && C17542s.e(this.f116420e, r2Var.f116420e) && this.f116421f == r2Var.f116421f;
    }

    public int hashCode() {
        return (((((((((this.f116416a.hashCode() * 31) + this.f116417b.hashCode()) * 31) + this.f116418c.hashCode()) * 31) + this.f116419d.hashCode()) * 31) + this.f116420e.hashCode()) * 31) + Boolean.hashCode(this.f116421f);
    }

    public String toString() {
        List<T> list = this.f116416a;
        q<T, C4889m, Integer, C16807N> qVar = this.f116417b;
        C17642l<T, C16807N> lVar = this.f116418c;
        C17631a<C16807N> aVar = this.f116419d;
        C5834E e10 = this.f116420e;
        boolean z10 = this.f116421f;
        return "SkapaSelectItemsParams(items=" + list + ", itemContent=" + qVar + ", onItemSelected=" + lVar + ", onDismissRequest=" + aVar + ", itemContentPadding=" + e10 + ", fluidMenu=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13633r2(List list, q qVar, C17642l lVar, C17631a aVar, C5834E e10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, qVar, lVar, aVar, (i10 & 16) != 0 ? C4559g0.f8074a.a() : e10, (i10 & 32) != 0 ? false : z10);
    }
}
