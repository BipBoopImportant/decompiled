package Bs;

import IC.C13023e;
import IC.C13026h;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import YH.C16877v;
import bI.C17035a;
import com.ingka.ikea.core.model.Image;
import dI.C17164e;
import eI.C17187b;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import ys.C12505d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, d2 = {"LBs/h;", "LBs/g;", "LGs/b;", "repository", "LCs/b;", "inboxDateTimeHelper", "<init>", "(LGs/b;LCs/b;)V", "", "LPs/d;", "list", "Lys/d;", "c", "(Ljava/util/List;)Ljava/util/List;", "notification", "b", "(LPs/d;)Lys/d;", "LTJ/g;", "invoke", "()LTJ/g;", "a", "LGs/b;", "LCs/b;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Gs.b f79392a;

    /* renamed from: b  reason: collision with root package name */
    private final Cs.b f79393b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<List<? extends C12505d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f79394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f79395b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bs.h$a$a  reason: collision with other inner class name */
        public static final class C1476a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f79396a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f79397b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.inbox.impl.usecase.GetNotificationMessagesUseCaseImpl$invoke$$inlined$map$1$2", f = "GetNotificationMessagesUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Bs.h$a$a$a  reason: collision with other inner class name */
            public static final class C1477a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f79398c;

                /* renamed from: d  reason: collision with root package name */
                int f79399d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1476a f79400e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1477a(C1476a aVar, C17164e eVar) {
                    super(eVar);
                    this.f79400e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f79398c = obj;
                    this.f79399d |= Integer.MIN_VALUE;
                    return this.f79400e.emit((Object) null, this);
                }
            }

            public C1476a(C16533h hVar, h hVar2) {
                this.f79396a = hVar;
                this.f79397b = hVar2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Bs.h.a.C1476a.C1477a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Bs.h$a$a$a r0 = (Bs.h.a.C1476a.C1477a) r0
                    int r1 = r0.f79399d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f79399d = r1
                    goto L_0x0018
                L_0x0013:
                    Bs.h$a$a$a r0 = new Bs.h$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f79398c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f79399d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f79396a
                    java.util.List r5 = (java.util.List) r5
                    Bs.h r2 = r4.f79397b
                    java.util.List r5 = r2.c(r5)
                    r0.f79399d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Bs.h.a.C1476a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, h hVar) {
            this.f79394a = gVar;
            this.f79395b = hVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f79394a.collect(new C1476a(hVar, this.f79395b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Long.valueOf(((C12505d) t11).j()), Long.valueOf(((C12505d) t10).j()));
        }
    }

    public h(Gs.b bVar, Cs.b bVar2) {
        C17542s.j(bVar, "repository");
        C17542s.j(bVar2, "inboxDateTimeHelper");
        this.f79392a = bVar;
        this.f79393b = bVar2;
    }

    private final C12505d b(Ps.d dVar) {
        Instant b10 = this.f79393b.b(dVar.b());
        String h10 = dVar.h();
        C13023e c10 = C13026h.c(dVar.k());
        C13023e c11 = C13026h.c(dVar.a());
        Image f10 = dVar.f();
        boolean j10 = dVar.j();
        return new C12505d(h10, c10, c11, this.f79393b.a(b10), b10.toEpochMilli(), f10, j10, dVar.i(), dVar.g());
    }

    /* access modifiers changed from: private */
    public final List<C12505d> c(List<Ps.d> list) {
        Iterable<Ps.d> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Ps.d b10 : iterable) {
            arrayList.add(b(b10));
        }
        return C16877v.g1(arrayList, new b());
    }

    public C16532g<List<C12505d>> invoke() {
        return C16534i.s(new a(this.f79392a.a(), this));
    }
}
