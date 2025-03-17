package androidx.compose.ui.platform;

import G1.n0;
import L1.j;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u001b\u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/e1;", "LG1/n0;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "LL1/j;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LL1/j;LL1/j;)V", "a", "I", "d", "()I", "b", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "g", "(Ljava/lang/Float;)V", "h", "e", "LL1/j;", "()LL1/j;", "f", "(LL1/j;)V", "i", "", "f1", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.e1  reason: case insensitive filesystem */
public final class C5098e1 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f19445a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C5098e1> f19446b;

    /* renamed from: c  reason: collision with root package name */
    private Float f19447c;

    /* renamed from: d  reason: collision with root package name */
    private Float f19448d;

    /* renamed from: e  reason: collision with root package name */
    private j f19449e;

    /* renamed from: f  reason: collision with root package name */
    private j f19450f;

    public C5098e1(int i10, List<C5098e1> list, Float f10, Float f11, j jVar, j jVar2) {
        this.f19445a = i10;
        this.f19446b = list;
        this.f19447c = f10;
        this.f19448d = f11;
        this.f19449e = jVar;
        this.f19450f = jVar2;
    }

    public final j a() {
        return this.f19449e;
    }

    public final Float b() {
        return this.f19447c;
    }

    public final Float c() {
        return this.f19448d;
    }

    public final int d() {
        return this.f19445a;
    }

    public final j e() {
        return this.f19450f;
    }

    public final void f(j jVar) {
        this.f19449e = jVar;
    }

    public boolean f1() {
        return this.f19446b.contains(this);
    }

    public final void g(Float f10) {
        this.f19447c = f10;
    }

    public final void h(Float f10) {
        this.f19448d = f10;
    }

    public final void i(j jVar) {
        this.f19450f = jVar;
    }
}
