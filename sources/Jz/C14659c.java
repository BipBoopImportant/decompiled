package jz;

import QJ.Q;
import Ry.e;
import Ry.f;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Ljz/c;", "LRy/f;", "LRy/a;", "settingsRepo", "LRy/e;", "orderCartRepository", "caasCartRepository", "<init>", "(LRy/a;LRy/e;LRy/e;)V", "invoke", "()LRy/e;", "a", "LRy/a;", "b", "LRy/e;", "c", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jz.c  reason: case insensitive filesystem */
public final class C14659c implements f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Ry.a f128235a;

    /* renamed from: b  reason: collision with root package name */
    private final e f128236b;

    /* renamed from: c  reason: collision with root package name */
    private final e f128237c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.repository.ScanAndGoCartRepositoryFactoryImpl$invoke$useCaasCart$1", f = "ScanAndGoCartRepositoryFactoryImpl.kt", l = {22}, m = "invokeSuspend")
    /* renamed from: jz.c$a */
    static final class a extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f128238c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14659c f128239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14659c cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f128239d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f128239d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f128238c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<ScanAndGoSettings> b10 = this.f128239d.f128235a.b();
                this.f128238c = 1;
                obj = C16534i.B(b10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ScanAndGoSettings scanAndGoSettings = (ScanAndGoSettings) obj;
            return b.a(scanAndGoSettings != null ? scanAndGoSettings.e() : false);
        }
    }

    public C14659c(Ry.a aVar, e eVar, e eVar2) {
        C17542s.j(aVar, "settingsRepo");
        C17542s.j(eVar, "orderCartRepository");
        C17542s.j(eVar2, "caasCartRepository");
        this.f128235a = aVar;
        this.f128236b = eVar;
        this.f128237c = eVar2;
    }

    public e invoke() {
        return ((Boolean) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null)).booleanValue() ? this.f128237c : this.f128236b;
    }
}
