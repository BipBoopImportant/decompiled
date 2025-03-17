package androidx.fragment.app;

import XH.C16824o;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import uI.C18055d;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u0002"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "LuI/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/j0;", "storeProducer", "Ll3/a;", "extrasProducer", "Landroidx/lifecycle/i0$c;", "factoryProducer", "LXH/o;", "b", "(Landroidx/fragment/app/o;LuI/d;LnI/a;LnI/a;LnI/a;)LXH/o;", "Landroidx/lifecycle/k0;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class W {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f21986c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5187o oVar) {
            super(0);
            this.f21986c = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            return this.f21986c.getDefaultViewModelCreationExtras();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f21987c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5187o oVar) {
            super(0);
            this.f21987c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f21987c.getDefaultViewModelProviderFactory();
        }
    }

    public static final <VM extends f0> C16824o<VM> b(C5187o oVar, C18055d<VM> dVar, C17631a<? extends j0> aVar, C17631a<? extends l3.a> aVar2, C17631a<? extends i0.c> aVar3) {
        if (aVar3 == null) {
            aVar3 = new b(oVar);
        }
        return new h0(dVar, aVar, aVar3, aVar2);
    }

    public static /* synthetic */ C16824o c(C5187o oVar, C18055d dVar, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar2 = new a(oVar);
        }
        if ((i10 & 8) != 0) {
            aVar3 = null;
        }
        return b(oVar, dVar, aVar, aVar2, aVar3);
    }

    /* access modifiers changed from: private */
    public static final k0 d(C16824o<? extends k0> oVar) {
        return (k0) oVar.getValue();
    }
}
