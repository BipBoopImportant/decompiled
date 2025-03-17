package androidx.compose.foundation.selection;

import G1.x0;
import L1.i;
import L1.v;
import L1.x;
import XH.C16807N;
import androidx.compose.foundation.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17631a;
import nI.C17642l;
import r0.m;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJR\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/selection/d;", "Landroidx/compose/foundation/e;", "", "value", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "enabled", "LL1/i;", "role", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "<init>", "(ZLr0/m;Ln0/I;ZLL1/i;LnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "f3", "(ZLr0/m;Ln0/I;ZLL1/i;LnI/l;)V", "LL1/x;", "O2", "(LL1/x;)V", "J", "Z", "K", "LnI/l;", "Lkotlin/Function0;", "L", "LnI/a;", "get_onClick", "()LnI/a;", "_onClick", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d extends e {
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public boolean f18499J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public C17642l<? super Boolean, C16807N> f18500K;

    /* renamed from: L  reason: collision with root package name */
    private final C17631a<C16807N> f18501L;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f18502c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f18503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super Boolean, C16807N> lVar, boolean z10) {
            super(0);
            this.f18502c = lVar;
            this.f18503d = z10;
        }

        public final void invoke() {
            this.f18502c.invoke(Boolean.valueOf(!this.f18503d));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f18504c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.f18504c = dVar;
        }

        public final void invoke() {
            this.f18504c.f18500K.invoke(Boolean.valueOf(!this.f18504c.f18499J));
        }
    }

    public /* synthetic */ d(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, mVar, i10, z11, iVar, lVar);
    }

    public void O2(x xVar) {
        v.z0(xVar, M1.b.a(this.f18499J));
    }

    public final void f3(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17642l<? super Boolean, C16807N> lVar) {
        if (this.f18499J != z10) {
            this.f18499J = z10;
            x0.b(this);
        }
        this.f18500K = lVar;
        super.c3(mVar, i10, z11, (String) null, iVar, this.f18501L);
    }

    private d(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17642l<? super Boolean, C16807N> lVar) {
        super(mVar, i10, z11, (String) null, iVar, new a(lVar, z10), (DefaultConstructorMarker) null);
        this.f18499J = z10;
        this.f18500K = lVar;
        this.f18501L = new b(this);
    }
}
