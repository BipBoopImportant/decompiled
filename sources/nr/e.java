package nr;

import HJ.C15854t;
import Qq.o;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import nr.c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lnr/e;", "Lnr/d;", "LJq/c;", "repository", "<init>", "(LJq/c;)V", "LTJ/g;", "Lnr/c;", "b", "(LJq/c;)LTJ/g;", "", "filterYear", "LXH/N;", "a", "(Ljava/lang/String;)V", "LTJ/B;", "LTJ/B;", "currentYear", "LTJ/g;", "getData", "()LTJ/g;", "data", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final C16505B<String> f100007a = C16521S.a(null);

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<c> f100008b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "filterYear", "LQq/o;", "familyRewardsHistory", "Lnr/c$a;", "<anonymous>", "(Ljava/lang/String;LQq/o;)Lnr/c$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.familyrewards.implementation.usecase.FamilyRewardsBalanceHistoryUseCaseImpl$createContentFlow$1", f = "FetchFamilyRewardsBalanceHistoryUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<String, o, C17164e<? super c.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100009c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f100010d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100011e;

        a(C17164e<? super a> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(String str, o oVar, C17164e<? super c.a> eVar) {
            a aVar = new a(eVar);
            aVar.f100010d = str;
            aVar.f100011e = oVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: Qq.t} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                eI.C17187b.f()
                int r0 = r4.f100009c
                if (r0 != 0) goto L_0x00ad
                XH.y.b(r5)
                java.lang.Object r5 = r4.f100010d
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r0 = r4.f100011e
                Qq.o r0 = (Qq.o) r0
                Qq.p r1 = r0.b()
                java.util.List r1 = r1.a()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x0020:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x003c
                java.lang.Object r2 = r1.next()
                r3 = r2
                Qq.t r3 = (Qq.t) r3
                if (r5 != 0) goto L_0x0031
                r3 = 1
                goto L_0x0039
            L_0x0031:
                java.lang.String r3 = r3.b()
                boolean r3 = kotlin.jvm.internal.C17542s.e(r5, r3)
            L_0x0039:
                if (r3 == 0) goto L_0x0020
                goto L_0x003d
            L_0x003c:
                r2 = 0
            L_0x003d:
                Qq.t r2 = (Qq.t) r2
                if (r2 != 0) goto L_0x0060
                Qq.p r5 = r0.b()
                java.util.List r5 = r5.a()
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L_0x0060
                Qq.p r5 = r0.b()
                java.util.List r5 = r5.a()
                java.lang.Object r5 = YH.C16877v.w0(r5)
                r2 = r5
                Qq.t r2 = (Qq.t) r2
            L_0x0060:
                Qq.p r5 = r0.b()
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 10
                int r3 = YH.C16877v.y(r5, r3)
                r1.<init>(r3)
                java.util.Iterator r5 = r5.iterator()
            L_0x0079:
                boolean r3 = r5.hasNext()
                if (r3 == 0) goto L_0x008d
                java.lang.Object r3 = r5.next()
                Qq.t r3 = (Qq.t) r3
                java.lang.String r3 = r3.b()
                r1.add(r3)
                goto L_0x0079
            L_0x008d:
                nr.c$a r5 = new nr.c$a
                if (r2 == 0) goto L_0x0097
                java.util.List r3 = r2.a()
                if (r3 != 0) goto L_0x009b
            L_0x0097:
                java.util.List r3 = YH.C16877v.n()
            L_0x009b:
                Qq.a r0 = r0.a()
                if (r2 == 0) goto L_0x00a7
                java.lang.String r2 = r2.b()
                if (r2 != 0) goto L_0x00a9
            L_0x00a7:
                java.lang.String r2 = ""
            L_0x00a9:
                r5.<init>(r1, r3, r0, r2)
                return r5
            L_0x00ad:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: nr.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lnr/c;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.familyrewards.implementation.usecase.FamilyRewardsBalanceHistoryUseCaseImpl$data$1", f = "FetchFamilyRewardsBalanceHistoryUseCase.kt", l = {44}, m = "invokeSuspend")
    static final class b extends l implements p<C16533h<? super c>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100012c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100013d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f100013d = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super c> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100012c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f100013d;
                c.b bVar = c.b.f100006a;
                this.f100013d = hVar;
                this.f100012c = 1;
                if (hVar.emit(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f100013d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lnr/c;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.familyrewards.implementation.usecase.FamilyRewardsBalanceHistoryUseCaseImpl$data$2", f = "FetchFamilyRewardsBalanceHistoryUseCase.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements q<C16533h<? super c>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100014c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100015d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100016e;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super c> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar);
            cVar.f100015d = hVar;
            cVar.f100016e = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f100014c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f100015d;
                Throwable th2 = (Throwable) this.f100016e;
                qv.e eVar = qv.e.DEBUG;
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
                        String a10 = C11818a.a((String) null, th2);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = hVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, th2, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(Jq.c cVar) {
        C17542s.j(cVar, "repository");
        this.f100008b = C16534i.g(C16534i.S(b(cVar), new b((C17164e<? super b>) null)), new c((C17164e<? super c>) null));
    }

    private final C16532g<c> b(Jq.c cVar) {
        return C16534i.n(this.f100007a, cVar.i(), new a((C17164e<? super a>) null));
    }

    public void a(String str) {
        String value;
        C16505B<String> b10 = this.f100007a;
        do {
            value = b10.getValue();
            String str2 = value;
        } while (!b10.e(value, str));
    }

    public C16532g<c> getData() {
        return this.f100008b;
    }
}
