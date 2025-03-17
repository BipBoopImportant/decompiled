package e7;

import GK.C15776D;
import GK.C15777E;
import GK.C15786e;
import GK.C15787f;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.C16320n;
import QJ.C16324p;
import QJ.Q;
import XH.C16807N;
import XH.x;
import XH.y;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import dI.C17164e;
import eI.C17187b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGK/e;", "", "a", "(LGK/e;LdI/e;)Ljava/lang/Object;", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: e7.a  reason: case insensitive filesystem */
public final class C7794a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)[B"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.appmattus.certificatetransparency.internal.loglist.CallExtKt$await$2", f = "CallExt.kt", l = {74}, m = "invokeSuspend")
    /* renamed from: e7.a$a  reason: collision with other inner class name */
    static final class C0834a extends l implements p<Q, C17164e<? super byte[]>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f50847c;

        /* renamed from: d  reason: collision with root package name */
        int f50848d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15786e f50849e;

        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"e7/a$a$a", "LGK/f;", "LGK/e;", "call", "LGK/D;", "response", "LXH/N;", "e", "(LGK/e;LGK/D;)V", "Ljava/io/IOException;", "c", "(LGK/e;Ljava/io/IOException;)V", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: e7.a$a$a  reason: collision with other inner class name */
        public static final class C0835a implements C15787f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16320n<byte[]> f50850a;

            C0835a(C16320n<? super byte[]> nVar) {
                this.f50850a = nVar;
            }

            public void c(C15786e eVar, IOException iOException) {
                C17542s.j(eVar, "call");
                C17542s.j(iOException, "e");
                if (!this.f50850a.isCancelled()) {
                    C16320n<byte[]> nVar = this.f50850a;
                    x.a aVar = x.f139812b;
                    nVar.resumeWith(x.b(y.a(iOException)));
                }
            }

            public void e(C15786e eVar, C15776D d10) {
                C17542s.j(eVar, "call");
                C17542s.j(d10, "response");
                try {
                    C15777E c10 = d10.c();
                    byte[] d11 = c10 != null ? c10.d() : null;
                    if (!d10.e1()) {
                        C16320n<byte[]> nVar = this.f50850a;
                        x.a aVar = x.f139812b;
                        nVar.resumeWith(x.b(y.a(new IOException("Invalid response " + d10.g()))));
                    } else if (d11 == null) {
                        C16320n<byte[]> nVar2 = this.f50850a;
                        x.a aVar2 = x.f139812b;
                        nVar2.resumeWith(x.b(y.a(new IOException("No data"))));
                    } else {
                        this.f50850a.resumeWith(x.b(d11));
                    }
                } catch (Exception e10) {
                    C16320n<byte[]> nVar3 = this.f50850a;
                    x.a aVar3 = x.f139812b;
                    nVar3.resumeWith(x.b(y.a(e10)));
                }
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: e7.a$a$b */
        static final class b implements C17642l<Throwable, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15786e f50851a;

            b(C15786e eVar) {
                this.f50851a = eVar;
            }

            public final void a(Throwable th2) {
                try {
                    this.f50851a.cancel();
                } catch (Throwable unused) {
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0834a(C15786e eVar, C17164e<? super C0834a> eVar2) {
            super(2, eVar2);
            this.f50849e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0834a(this.f50849e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super byte[]> eVar) {
            return ((C0834a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f50848d;
            if (i10 == 0) {
                y.b(obj);
                C15786e eVar = this.f50849e;
                this.f50847c = eVar;
                this.f50848d = 1;
                C16324p pVar = new C16324p(C17187b.c(this), 1);
                pVar.C();
                FirebasePerfOkHttpClient.enqueue(eVar, new C0835a(pVar));
                pVar.K(new b(eVar));
                obj = pVar.w();
                if (obj == C17187b.f()) {
                    h.c(this);
                }
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C15786e eVar2 = (C15786e) this.f50847c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public static final Object a(C15786e eVar, C17164e<? super byte[]> eVar2) {
        return C16310i.g(C16311i0.b(), new C0834a(eVar, (C17164e<? super C0834a>) null), eVar2);
    }
}
