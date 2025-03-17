package FB;

import EB.C12832d;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LFB/a;", "LTJ/g;", "", "b", "(LFB/a;)LTJ/g;", "LEB/d;", "a", "(LFB/a;)LEB/d;", "datalayer_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: FB.b  reason: case insensitive filesystem */
public final class C12861b {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FB.b$a */
    public static final class a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f109746a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: FB.b$a$a  reason: collision with other inner class name */
        public static final class C2619a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f109747a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.store.datalayer.repository.LocalStoreSelectionRepositoryKt$isStoreSelected$$inlined$map$1$2", f = "LocalStoreSelectionRepository.kt", l = {50}, m = "emit")
            /* renamed from: FB.b$a$a$a  reason: collision with other inner class name */
            public static final class C2620a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f109748c;

                /* renamed from: d  reason: collision with root package name */
                int f109749d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2619a f109750e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2620a(C2619a aVar, C17164e eVar) {
                    super(eVar);
                    this.f109750e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f109748c = obj;
                    this.f109749d |= Integer.MIN_VALUE;
                    return this.f109750e.emit((Object) null, this);
                }
            }

            public C2619a(C16533h hVar) {
                this.f109747a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof FB.C12861b.a.C2619a.C2620a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    FB.b$a$a$a r0 = (FB.C12861b.a.C2619a.C2620a) r0
                    int r1 = r0.f109749d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f109749d = r1
                    goto L_0x0018
                L_0x0013:
                    FB.b$a$a$a r0 = new FB.b$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f109748c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f109749d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004a
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f109747a
                    EB.d r5 = (EB.C12832d) r5
                    if (r5 == 0) goto L_0x003c
                    r5 = r3
                    goto L_0x003d
                L_0x003c:
                    r5 = 0
                L_0x003d:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f109749d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004a
                    return r1
                L_0x004a:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: FB.C12861b.a.C2619a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f109746a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f109746a.collect(new C2619a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public static final C12832d a(C12860a aVar) {
        C17542s.j(aVar, "<this>");
        C12832d c10 = aVar.c();
        if (c10 == null || !c10.f()) {
            return null;
        }
        return c10;
    }

    public static final C16532g<Boolean> b(C12860a aVar) {
        C17542s.j(aVar, "<this>");
        return new a(aVar.b());
    }
}
