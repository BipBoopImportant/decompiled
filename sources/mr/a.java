package Mr;

import HJ.C15854t;
import QJ.Q;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import aA.C13909a;
import com.sugarcube.app.base.network.ITokenStoreV2;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u0014\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LMr/a;", "Lcom/sugarcube/app/base/network/ITokenStoreV2;", "LaA/a;", "sessionManager", "LQJ/Q;", "scope", "<init>", "(LaA/a;LQJ/Q;)V", "", "getToken", "(LdI/e;)Ljava/lang/Object;", "LTJ/P;", "getTokenFlow", "()LTJ/P;", "", "code", "LXH/N;", "handleFailure", "(I)V", "", "isTokenValid", "a", "LaA/a;", "b", "LQJ/Q;", "c", "LTJ/P;", "tokenStateFlow", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements ITokenStoreV2 {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f83659a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f83660b;

    /* renamed from: c  reason: collision with root package name */
    private final C16519P<String> f83661c;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "token", "isLoggedIn", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.geomagical.impl.sugarcube.networking.GeomagicalTokenStore$tokenStateFlow$1", f = "GeomagicalTokenStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Mr.a$a  reason: collision with other inner class name */
    static final class C1676a extends l implements q<String, Boolean, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f83662c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f83663d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f83664e;

        C1676a(C17164e<? super C1676a> eVar) {
            super(3, eVar);
        }

        public final Object i(String str, boolean z10, C17164e<? super String> eVar) {
            C1676a aVar = new C1676a(eVar);
            aVar.f83663d = str;
            aVar.f83664e = z10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((String) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f83662c == 0) {
                y.b(obj);
                String str = (String) this.f83663d;
                if (this.f83664e) {
                    return str;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(C13909a aVar, Q q10) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(q10, "scope");
        this.f83659a = aVar;
        this.f83660b = q10;
        this.f83661c = C16534i.c0(C16534i.n(aVar.getToken(), aVar.n(), new C1676a((C17164e<? super C1676a>) null)), q10, C16515L.f138570a.c(), null);
    }

    public Object getToken(C17164e<? super String> eVar) {
        String value = this.f83661c.getValue();
        return value == null ? "" : value;
    }

    public C16519P<String> getTokenFlow() {
        return this.f83661c;
    }

    public void handleFailure(int i10) {
        Exception exc = new Exception("Failed to obtain token for geomagical feature, error code = " + i10);
        e eVar = e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, exc);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, exc, str3);
            str = str3;
            str2 = str4;
        }
    }

    public Object isTokenValid(C17164e<? super Boolean> eVar) {
        CharSequence value = this.f83661c.getValue();
        return b.a(!(value == null || value.length() == 0));
    }
}
