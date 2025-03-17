package hq;

import HJ.C15854t;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import am.C11070a;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import eq.b;
import fq.c;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rw.g;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nHB¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhq/a;", "Leq/b;", "Lfq/b;", "dynamicLinks", "Lam/a;", "appApi", "LQJ/M;", "coroutineDispatcher", "<init>", "(Lfq/b;Lam/a;LQJ/M;)V", "Landroid/net/Uri;", "uri", "Leq/b$a;", "a", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "Lfq/b;", "b", "Lam/a;", "c", "LQJ/M;", "dynamiclink-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hq.a  reason: case insensitive filesystem */
public final class C11378a implements b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final fq.b f98149a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C11070a f98150b;

    /* renamed from: c  reason: collision with root package name */
    private final M f98151c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Leq/b$a;", "<anonymous>", "(LQJ/Q;)Leq/b$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.dynamiclink.impl.domain.ResolveDynamicLinkUseCaseImpl$invoke$2", f = "ResolveDynamicLinkUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hq.a$a  reason: collision with other inner class name */
    static final class C2210a extends l implements p<Q, C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98152c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f98153d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Uri f98154e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11378a f98155f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2210a(Uri uri, C11378a aVar, C17164e<? super C2210a> eVar) {
            super(2, eVar);
            this.f98154e = uri;
            this.f98155f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2210a aVar = new C2210a(this.f98154e, this.f98155f, eVar);
            aVar.f98153d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super b.a> eVar) {
            return ((C2210a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98152c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f98153d;
                g.d(this.f98154e, "checkDynamicLink uri");
                try {
                    Uri a10 = this.f98155f.f98149a.a(this.f98154e, this.f98155f.f98150b.d());
                    if (a10 != null) {
                        g.d(a10, "Found embedded deep link");
                    }
                    return a10 != null ? new b.a.C2158a(a10) : b.a.C2159b.f97163a;
                } catch (c unused) {
                    return b.a.c.f97164a;
                } catch (ExecutionException e10) {
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
                            String a11 = C11818a.a((String) null, e10);
                            if (a11 == null) {
                                break;
                            }
                            str = C11820c.a(a11);
                        }
                        if (str2 == null) {
                            String name = q10.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        bVar.a(eVar, str2, false, e10, str);
                    }
                    return b.a.C2159b.f97163a;
                } catch (InterruptedException e11) {
                    e eVar2 = e.WARN;
                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                    for (Object next2 : d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar2, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    String str3 = null;
                    String str4 = null;
                    for (C11819b bVar2 : arrayList2) {
                        if (str3 == null) {
                            String a12 = C11818a.a((String) null, e11);
                            if (a12 == null) {
                                break;
                            }
                            str3 = C11820c.a(a12);
                        }
                        if (str4 == null) {
                            String name2 = q10.getClass().getName();
                            C17542s.g(name2);
                            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                        }
                        bVar2.a(eVar2, str4, false, e11, str3);
                    }
                    return b.a.C2159b.f97163a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public C11378a(fq.b bVar, C11070a aVar, M m10) {
        C17542s.j(bVar, "dynamicLinks");
        C17542s.j(aVar, "appApi");
        C17542s.j(m10, "coroutineDispatcher");
        this.f98149a = bVar;
        this.f98150b = aVar;
        this.f98151c = m10;
    }

    public Object a(Uri uri, C17164e<? super b.a> eVar) {
        return C16310i.g(this.f98151c, new C2210a(uri, this, (C17164e<? super C2210a>) null), eVar);
    }
}
