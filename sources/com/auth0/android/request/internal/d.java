package com.auth0.android.request.internal;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import jI.C17416c;
import jI.C17431r;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import s7.C8743b;
import u7.C8884a;
import w7.C8929b;
import w7.C8930c;
import w7.C8931d;
import w7.C8932e;
import w7.f;
import w7.g;
import w7.h;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BE\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u00102\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/auth0/android/request/internal/d;", "T", "Ls7/b;", "U", "Lw7/f;", "Lw7/c;", "method", "", "url", "Lw7/e;", "client", "Lw7/d;", "resultAdapter", "Lw7/b;", "errorAdapter", "Lcom/auth0/android/request/internal/k;", "threadSwitcher", "<init>", "(Lw7/c;Ljava/lang/String;Lw7/e;Lw7/d;Lw7/b;Lcom/auth0/android/request/internal/k;)V", "name", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Lw7/f;", "", "parameters", "b", "(Ljava/util/Map;)Lw7/f;", "Lu7/a;", "callback", "LXH/N;", "a", "(Lu7/a;)V", "f", "(LdI/e;)Ljava/lang/Object;", "LQJ/M;", "dispatcher", "Lkotlin/Function0;", "runnable", "m", "(LQJ/M;LnI/a;LdI/e;)Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "Ljava/lang/String;", "Lw7/e;", "Lw7/d;", "d", "Lw7/b;", "e", "Lcom/auth0/android/request/internal/k;", "Lw7/g;", "Lw7/g;", "options", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class d<T, U extends C8743b> implements f<T, U> {

    /* renamed from: a  reason: collision with root package name */
    private final String f46439a;

    /* renamed from: b  reason: collision with root package name */
    private final C8932e f46440b;

    /* renamed from: c  reason: collision with root package name */
    private final C8931d<T> f46441c;

    /* renamed from: d  reason: collision with root package name */
    private final C8929b<U> f46442d;

    /* renamed from: e  reason: collision with root package name */
    private final k f46443e;

    /* renamed from: f  reason: collision with root package name */
    private final g f46444f;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ls7/b;", "U", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d<T, U> f46445c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d<T, U> dVar) {
            super(0);
            this.f46445c = dVar;
        }

        public final T invoke() {
            return this.f46445c.i();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H@"}, d2 = {"T", "Ls7/b;", "U", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.auth0.android.request.internal.BaseRequest$switchRequestContext$2", f = "BaseRequest.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super T>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f46446c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<T> f46447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17631a<? extends T> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f46447d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f46447d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super T> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f46446c == 0) {
                y.b(obj);
                return this.f46447d.invoke();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public d(C8930c cVar, String str, C8932e eVar, C8931d<T> dVar, C8929b<U> bVar, k kVar) {
        C17542s.j(cVar, "method");
        C17542s.j(str, "url");
        C17542s.j(eVar, "client");
        C17542s.j(dVar, "resultAdapter");
        C17542s.j(bVar, "errorAdapter");
        C17542s.j(kVar, "threadSwitcher");
        this.f46439a = str;
        this.f46440b = eVar;
        this.f46441c = dVar;
        this.f46442d = bVar;
        this.f46443e = kVar;
        this.f46444f = new g(cVar);
    }

    /* access modifiers changed from: private */
    public static final void j(d dVar, C8884a aVar) {
        C17542s.j(dVar, "this$0");
        C17542s.j(aVar, "$callback");
        try {
            dVar.f46443e.b(new b(aVar, dVar.i()));
        } catch (C8743b e10) {
            dVar.f46443e.b(new c(aVar, e10));
        }
    }

    /* access modifiers changed from: private */
    public static final void k(C8884a aVar, Object obj) {
        C17542s.j(aVar, "$callback");
        aVar.a(obj);
    }

    /* access modifiers changed from: private */
    public static final void l(C8884a aVar, C8743b bVar) {
        C17542s.j(aVar, "$callback");
        C17542s.j(bVar, "$uError");
        aVar.b(bVar);
    }

    public void a(C8884a<T, U> aVar) {
        C17542s.j(aVar, "callback");
        this.f46443e.a(new a(this, aVar));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w7.f<T, U> b(java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.util.Map r0 = YH.X.z(r4)
            java.lang.String r1 = "scope"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x0020
            com.auth0.android.request.internal.i r2 = com.auth0.android.request.internal.i.f46457a
            java.lang.Object r4 = YH.X.k(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r2.b(r4)
            r0.put(r1, r4)
        L_0x0020:
            w7.g r4 = r3.f46444f
            java.util.Map r4 = r4.c()
            r4.putAll(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.auth0.android.request.internal.d.b(java.util.Map):w7.f");
    }

    public f<T, U> c(String str, String str2) {
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
        this.f46444f.a().put(str, str2);
        return this;
    }

    public /* synthetic */ Object f(C17164e eVar) {
        return m(C16311i0.b(), new a(this), eVar);
    }

    public T i() {
        C8743b bVar;
        try {
            h a10 = this.f46440b.a(this.f46439a, this.f46444f);
            InputStreamReader inputStreamReader = new InputStreamReader(a10.a(), StandardCharsets.UTF_8);
            if (a10.e()) {
                try {
                    T a11 = this.f46441c.a(inputStreamReader);
                    C17416c.a(inputStreamReader, (Throwable) null);
                    return a11;
                } catch (Exception e10) {
                    throw ((C8743b) this.f46442d.b(e10));
                } catch (Throwable th2) {
                    C17416c.a(inputStreamReader, r0);
                    throw th2;
                }
            } else {
                try {
                    bVar = a10.d() ? (C8743b) this.f46442d.a(a10.c(), inputStreamReader) : (C8743b) this.f46442d.c(a10.c(), C17431r.h(inputStreamReader), a10.b());
                } catch (Exception e11) {
                    bVar = (C8743b) this.f46442d.b(e11);
                }
                throw bVar;
            }
        } catch (IOException e12) {
            throw ((C8743b) this.f46442d.b(e12));
        }
    }

    public final Object m(M m10, C17631a<? extends T> aVar, C17164e<? super T> eVar) {
        return C16310i.g(m10, new b(aVar, (C17164e<? super b>) null), eVar);
    }
}
