package RB;

import FB.C12860a;
import FB.C12861b;
import Ry.f;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LRB/h;", "LRB/g;", "LFB/a;", "localStoreSelectionRepository", "LRy/f;", "scanAndGoCartRepositoryFactory", "<init>", "(LFB/a;LRy/f;)V", "LTJ/g;", "", "c", "()LTJ/g;", "a", "LFB/a;", "b", "LRy/f;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.h  reason: case insensitive filesystem */
public final class C13511h implements C13510g {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f115278a;

    /* renamed from: b  reason: collision with root package name */
    private final f f115279b;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "isScanAndGoStoreSelected", "cartQuantity", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.IsScanAndGoActiveUseCaseImpl$isActive$1", f = "IsScanAndGoActiveUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: RB.h$a */
    static final class a extends l implements q<Boolean, Integer, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115280c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f115281d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ int f115282e;

        a(C17164e<? super a> eVar) {
            super(3, eVar);
        }

        public final Object i(boolean z10, int i10, C17164e<? super Boolean> eVar) {
            a aVar = new a(eVar);
            aVar.f115281d = z10;
            aVar.f115282e = i10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f115280c == 0) {
                y.b(obj);
                return b.a(this.f115281d && this.f115282e > 0);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C13511h(C12860a aVar, f fVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        this.f115278a = aVar;
        this.f115279b = fVar;
    }

    public C16532g<Boolean> c() {
        return C16534i.s(C16534i.n(C12861b.b(this.f115278a), this.f115279b.invoke().a(), new a((C17164e<? super a>) null)));
    }
}
