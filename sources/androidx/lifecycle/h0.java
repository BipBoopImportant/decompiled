package androidx.lifecycle;

import XH.C16824o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;
import nI.C17631a;
import uI.C18055d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/h0;", "Landroidx/lifecycle/f0;", "VM", "LXH/o;", "LuI/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/j0;", "storeProducer", "Landroidx/lifecycle/i0$c;", "factoryProducer", "Ll3/a;", "extrasProducer", "<init>", "(LuI/d;LnI/a;LnI/a;LnI/a;)V", "", "isInitialized", "()Z", "a", "LuI/d;", "b", "LnI/a;", "c", "d", "e", "Landroidx/lifecycle/f0;", "cached", "()Landroidx/lifecycle/f0;", "value", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0<VM extends f0> implements C16824o<VM> {

    /* renamed from: a  reason: collision with root package name */
    private final C18055d<VM> f22283a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<j0> f22284b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<i0.c> f22285c;

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<a> f22286d;

    /* renamed from: e  reason: collision with root package name */
    private VM f22287e;

    public h0(C18055d<VM> dVar, C17631a<? extends j0> aVar, C17631a<? extends i0.c> aVar2, C17631a<? extends a> aVar3) {
        C17542s.j(dVar, "viewModelClass");
        C17542s.j(aVar, "storeProducer");
        C17542s.j(aVar2, "factoryProducer");
        C17542s.j(aVar3, "extrasProducer");
        this.f22283a = dVar;
        this.f22284b = aVar;
        this.f22285c = aVar2;
        this.f22286d = aVar3;
    }

    /* renamed from: a */
    public VM getValue() {
        VM vm2 = this.f22287e;
        if (vm2 != null) {
            return vm2;
        }
        VM d10 = i0.f22291b.a(this.f22284b.invoke(), this.f22285c.invoke(), this.f22286d.invoke()).d(this.f22283a);
        this.f22287e = d10;
        return d10;
    }

    public boolean isInitialized() {
        return this.f22287e != null;
    }
}
