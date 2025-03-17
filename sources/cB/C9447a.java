package cb;

import SJ.C16423B;
import SJ.C16438n;
import SJ.C16447w;
import SJ.C16449y;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import Ya.C9364a;
import Ya.C9365b;
import ab.C9403a;
import ab.C9404b;
import cb.C9449c;
import com.google.android.play.core.install.InstallState;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import xa.C8966g;
import xa.C8967h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LYa/b;", "LTJ/g;", "Lcb/c;", "a", "(LYa/b;)LTJ/g;", "E", "LSJ/B;", "element", "", "b", "(LSJ/B;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: cb.a  reason: case insensitive filesystem */
public final class C9447a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSJ/y;", "Lcb/c;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", f = "AppUpdateManagerKtx.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: cb.a$a  reason: collision with other inner class name */
    static final class C1156a extends l implements p<C16449y<? super C9449c>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f65661c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f65662d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C9365b f65663e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LYa/a;", "kotlin.jvm.PlatformType", "updateInfo", "LXH/N;", "b", "(LYa/a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cb.a$a$a  reason: collision with other inner class name */
        static final class C1157a<TResult> implements C8967h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16449y<C9449c> f65664a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C9365b f65665b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C9448b f65666c;

            C1157a(C16449y<? super C9449c> yVar, C9365b bVar, C9448b bVar2) {
                this.f65664a = yVar;
                this.f65665b = bVar;
                this.f65666c = bVar2;
            }

            /* renamed from: b */
            public final void a(C9364a aVar) {
                int c10 = aVar.c();
                if (c10 == 0) {
                    this.f65664a.a(new C9403a(-2));
                } else if (c10 == 1) {
                    C9447a.b(this.f65664a, C9449c.d.f65679a);
                    C16423B.a.a(this.f65664a, (Throwable) null, 1, (Object) null);
                } else if (c10 == 2 || c10 == 3) {
                    C17542s.i(aVar, "updateInfo");
                    if (aVar.a() == 11) {
                        C9447a.b(this.f65664a, new C9449c.b(this.f65665b));
                        C16423B.a.a(this.f65664a, (Throwable) null, 1, (Object) null);
                        return;
                    }
                    this.f65665b.c(this.f65666c);
                    C9447a.b(this.f65664a, new C9449c.a(this.f65665b, aVar));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Exception;", "exception", "LXH/N;", "c", "(Ljava/lang/Exception;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cb.a$a$b */
        static final class b implements C8966g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16449y<C9449c> f65667a;

            b(C16449y<? super C9449c> yVar) {
                this.f65667a = yVar;
            }

            public final void c(Exception exc) {
                C17542s.j(exc, "exception");
                this.f65667a.a(exc);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cb.a$a$c */
        static final class c extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C9365b f65668c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C9448b f65669d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C9365b bVar, C9448b bVar2) {
                super(0);
                this.f65668c = bVar;
                this.f65669d = bVar2;
            }

            public final void invoke() {
                this.f65668c.b(this.f65669d);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/play/core/install/InstallState;", "installState", "LXH/N;", "b", "(Lcom/google/android/play/core/install/InstallState;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cb.a$a$d */
        static final class d implements C9404b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16449y<C9449c> f65670a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C9365b f65671b;

            d(C16449y<? super C9449c> yVar, C9365b bVar) {
                this.f65670a = yVar;
                this.f65671b = bVar;
            }

            /* renamed from: b */
            public final void a(InstallState installState) {
                C17542s.j(installState, "installState");
                if (installState.c() == 11) {
                    C9447a.b(this.f65670a, new C9449c.b(this.f65671b));
                } else {
                    C9447a.b(this.f65670a, new C9449c.C1158c(installState));
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcb/b;", "LXH/N;", "a", "(Lcb/b;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cb.a$a$e */
        static final class e extends C17544u implements C17642l<C9448b, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16449y<C9449c> f65672c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(C16449y<? super C9449c> yVar) {
                super(1);
                this.f65672c = yVar;
            }

            public final void a(C9448b bVar) {
                C17542s.j(bVar, "$this$$receiver");
                C16423B.a.a(this.f65672c, (Throwable) null, 1, (Object) null);
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C9448b) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1156a(C9365b bVar, C17164e<? super C1156a> eVar) {
            super(2, eVar);
            this.f65663e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1156a aVar = new C1156a(this.f65663e, eVar);
            aVar.f65662d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16449y<? super C9449c> yVar, C17164e<? super C16807N> eVar) {
            return ((C1156a) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f65661c;
            if (i10 == 0) {
                y.b(obj);
                C16449y yVar = (C16449y) this.f65662d;
                C9448b bVar = new C9448b(new d(yVar, this.f65663e), new e(yVar));
                this.f65663e.e().g(new C1157a(yVar, this.f65663e, bVar)).e(new b(yVar));
                c cVar = new c(this.f65663e, bVar);
                this.f65661c = 1;
                if (C16447w.a(yVar, cVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public static final C16532g<C9449c> a(C9365b bVar) {
        C17542s.j(bVar, "<this>");
        return C16534i.o(C16534i.f(new C1156a(bVar, (C17164e<? super C1156a>) null)));
    }

    public static final <E> boolean b(C16423B<? super E> b10, E e10) {
        C17542s.j(b10, "<this>");
        return C16438n.j(b10.k(e10));
    }
}
