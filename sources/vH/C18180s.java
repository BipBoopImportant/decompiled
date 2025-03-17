package vH;

import AH.C15412c;
import AH.C15415f;
import JH.C15954a;
import NH.e;
import QJ.C16283A;
import QJ.F0;
import QJ.b1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;
import pH.C17746a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LvH/s;", "", "<init>", "()V", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.s  reason: case insensitive filesystem */
public final class C18180s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f148987a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C15954a<C18180s> f148988b = new C15954a<>("RequestLifecycle");

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LvH/s$a;", "LvH/m;", "LXH/N;", "LvH/s;", "<init>", "()V", "Lkotlin/Function1;", "block", "d", "(LnI/l;)LvH/s;", "plugin", "LpH/a;", "scope", "c", "(LvH/s;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.s$a */
    public static final class a implements C18174m<C16807N, C18180s> {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "it", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", f = "HttpRequestLifecycle.kt", l = {38}, m = "invokeSuspend")
        /* renamed from: vH.s$a$a  reason: collision with other inner class name */
        static final class C4296a extends l implements q<e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f148989c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f148990d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17746a f148991e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4296a(C17746a aVar, C17164e<? super C4296a> eVar) {
                super(3, eVar);
                this.f148991e = aVar;
            }

            /* renamed from: i */
            public final Object invoke(e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
                C4296a aVar = new C4296a(this.f148991e, eVar2);
                aVar.f148990d = eVar;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C16283A a10;
                Object f10 = C17187b.f();
                int i10 = this.f148989c;
                if (i10 == 0) {
                    y.b(obj);
                    e eVar = (e) this.f148990d;
                    C16283A a11 = b1.a(((C15412c) eVar.b()).g());
                    C17168i.b bVar = this.f148991e.getCoroutineContext().get(F0.f137562d0);
                    C17542s.g(bVar);
                    C18181t.a(a11, (F0) bVar);
                    try {
                        ((C15412c) eVar.b()).m(a11);
                        this.f148990d = a11;
                        this.f148989c = 1;
                        if (eVar.e(this) == f10) {
                            return f10;
                        }
                        a10 = a11;
                    } catch (Throwable th2) {
                        th = th2;
                        a10 = a11;
                        try {
                            a10.g(th);
                            throw th;
                        } catch (Throwable th3) {
                            a10.l();
                            throw th3;
                        }
                    }
                } else if (i10 == 1) {
                    a10 = (C16283A) this.f148990d;
                    try {
                        y.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a10.l();
                return C16807N.f139792a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(C18180s sVar, C17746a aVar) {
            C17542s.j(sVar, "plugin");
            C17542s.j(aVar, "scope");
            aVar.i().l(C15415f.f132953h.a(), new C4296a(aVar, (C17164e<? super C4296a>) null));
        }

        /* renamed from: d */
        public C18180s a(C17642l<? super C16807N, C16807N> lVar) {
            C17542s.j(lVar, "block");
            return new C18180s((DefaultConstructorMarker) null);
        }

        public C15954a<C18180s> getKey() {
            return C18180s.f148988b;
        }

        private a() {
        }
    }

    public /* synthetic */ C18180s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18180s() {
    }
}
