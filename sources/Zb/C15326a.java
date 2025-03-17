package zB;

import EB.C12829a;
import EB.C12832d;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import cD.C14029a;
import dI.C17164e;
import eI.C17187b;
import kD.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import yB.C15281a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LzB/a;", "LyB/a;", "LcD/a;", "editProfileRepository", "<init>", "(LcD/a;)V", "LTJ/g;", "LEB/d;", "invoke", "()LTJ/g;", "a", "LcD/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zB.a  reason: case insensitive filesystem */
public final class C15326a implements C15281a {

    /* renamed from: a  reason: collision with root package name */
    private final C14029a f132355a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LkD/h;", "profile", "LEB/d;", "<anonymous>", "(LkD/h;)LEB/d;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.store.datalayer.impl.GetProfileStoreUseCaseImpl$invoke$1", f = "GetProfileStoreUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: zB.a$a  reason: collision with other inner class name */
    static final class C3271a extends l implements p<h, C17164e<? super C12832d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f132356c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f132357d;

        C3271a(C17164e<? super C3271a> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C3271a aVar = new C3271a(eVar);
            aVar.f132357d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(h hVar, C17164e<? super C12832d> eVar) {
            return ((C3271a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String i10;
            C17187b.f();
            if (this.f132356c == 0) {
                y.b(obj);
                h hVar = (h) this.f132357d;
                if (hVar == null || (i10 = hVar.i()) == null) {
                    return null;
                }
                return new C12832d(i10, (String) null, (String) null, false, (C12829a) null, 30, (DefaultConstructorMarker) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C15326a(C14029a aVar) {
        C17542s.j(aVar, "editProfileRepository");
        this.f132355a = aVar;
    }

    public C16532g<C12832d> invoke() {
        return C16534i.N(this.f132355a.l(), new C3271a((C17164e<? super C3271a>) null));
    }
}
