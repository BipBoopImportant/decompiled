package androidx.compose.ui.viewinterop;

import G1.m0;
import U0.r;
import XH.C16807N;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.z1;
import f1.C5306h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import z1.C6272b;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010/\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8\u0002@BX\u000e¢\u0006\f\n\u0004\b+\u0010,\"\u0004\b-\u0010.RB\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105RB\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105RB\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u000e¢\u0006\u0012\n\u0004\b$\u00101\u001a\u0004\b;\u00103\"\u0004\b<\u00105R\u0014\u0010@\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/z1;", "Landroid/content/Context;", "context", "LU0/r;", "parentContext", "typedView", "Lz1/b;", "dispatcher", "Lf1/h;", "saveStateRegistry", "", "compositeKeyHash", "LG1/m0;", "owner", "<init>", "(Landroid/content/Context;LU0/r;Landroid/view/View;Lz1/b;Lf1/h;ILG1/m0;)V", "Lkotlin/Function1;", "factory", "(Landroid/content/Context;LnI/l;LU0/r;Lf1/h;ILG1/m0;)V", "LXH/N;", "y", "()V", "z", "A", "Landroid/view/View;", "B", "Lz1/b;", "getDispatcher", "()Lz1/b;", "C", "Lf1/h;", "D", "I", "", "E", "Ljava/lang/String;", "saveStateKey", "Lf1/h$a;", "value", "F", "Lf1/h$a;", "setSavableRegistryEntry", "(Lf1/h$a;)V", "savableRegistryEntry", "G", "LnI/l;", "getUpdateBlock", "()LnI/l;", "setUpdateBlock", "(LnI/l;)V", "updateBlock", "H", "getResetBlock", "setResetBlock", "resetBlock", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements z1 {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final T f19766A;

    /* renamed from: B  reason: collision with root package name */
    private final C6272b f19767B;

    /* renamed from: C  reason: collision with root package name */
    private final C5306h f19768C;

    /* renamed from: D  reason: collision with root package name */
    private final int f19769D;

    /* renamed from: E  reason: collision with root package name */
    private final String f19770E;

    /* renamed from: F  reason: collision with root package name */
    private C5306h.a f19771F;

    /* renamed from: G  reason: collision with root package name */
    private C17642l<? super T, C16807N> f19772G;

    /* renamed from: H  reason: collision with root package name */
    private C17642l<? super T, C16807N> f19773H;

    /* renamed from: I  reason: collision with root package name */
    private C17642l<? super T, C16807N> f19774I;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements C17631a<Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewFactoryHolder<T> f19775c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f19775c = viewFactoryHolder;
        }

        public final Object invoke() {
            SparseArray sparseArray = new SparseArray();
            this.f19775c.f19766A.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewFactoryHolder<T> f19776c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f19776c = viewFactoryHolder;
        }

        public final void invoke() {
            this.f19776c.getReleaseBlock().invoke(this.f19776c.f19766A);
            this.f19776c.z();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewFactoryHolder<T> f19777c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f19777c = viewFactoryHolder;
        }

        public final void invoke() {
            this.f19777c.getResetBlock().invoke(this.f19777c.f19766A);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewFactoryHolder<T> f19778c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f19778c = viewFactoryHolder;
        }

        public final void invoke() {
            this.f19778c.getUpdateBlock().invoke(this.f19778c.f19766A);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ ViewFactoryHolder(Context context, r rVar, View view, C6272b bVar, C5306h hVar, int i10, m0 m0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : rVar, view, (i11 & 8) != 0 ? new C6272b() : bVar, hVar, i10, m0Var);
    }

    private final void setSavableRegistryEntry(C5306h.a aVar) {
        C5306h.a aVar2 = this.f19771F;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f19771F = aVar;
    }

    private final void y() {
        C5306h hVar = this.f19768C;
        if (hVar != null) {
            setSavableRegistryEntry(hVar.b(this.f19770E, new a(this)));
        }
    }

    /* access modifiers changed from: private */
    public final void z() {
        setSavableRegistryEntry((C5306h.a) null);
    }

    public final C6272b getDispatcher() {
        return this.f19767B;
    }

    public final C17642l<T, C16807N> getReleaseBlock() {
        return this.f19774I;
    }

    public final C17642l<T, C16807N> getResetBlock() {
        return this.f19773H;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final C17642l<T, C16807N> getUpdateBlock() {
        return this.f19772G;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(C17642l<? super T, C16807N> lVar) {
        this.f19774I = lVar;
        setRelease(new b(this));
    }

    public final void setResetBlock(C17642l<? super T, C16807N> lVar) {
        this.f19773H = lVar;
        setReset(new c(this));
    }

    public final void setUpdateBlock(C17642l<? super T, C16807N> lVar) {
        this.f19772G = lVar;
        setUpdate(new d(this));
    }

    private ViewFactoryHolder(Context context, r rVar, T t10, C6272b bVar, C5306h hVar, int i10, m0 m0Var) {
        super(context, rVar, i10, bVar, t10, m0Var);
        this.f19766A = t10;
        this.f19767B = bVar;
        this.f19768C = hVar;
        this.f19769D = i10;
        setClipChildren(false);
        String valueOf = String.valueOf(i10);
        this.f19770E = valueOf;
        SparseArray sparseArray = null;
        Object e10 = hVar != null ? hVar.e(valueOf) : null;
        sparseArray = e10 instanceof SparseArray ? (SparseArray) e10 : sparseArray;
        if (sparseArray != null) {
            t10.restoreHierarchyState(sparseArray);
        }
        y();
        this.f19772G = e.e();
        this.f19773H = e.e();
        this.f19774I = e.e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(Context context, C17642l<? super Context, ? extends T> lVar, r rVar, C5306h hVar, int i10, m0 m0Var) {
        this(context, rVar, (View) lVar.invoke(context), (C6272b) null, hVar, i10, m0Var, 8, (DefaultConstructorMarker) null);
        C17642l<? super Context, ? extends T> lVar2 = lVar;
    }
}
