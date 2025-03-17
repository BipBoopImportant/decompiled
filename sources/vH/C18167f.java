package vH;

import BH.C15458c;
import JH.C15954a;
import MH.C16039a;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import org.slf4j.Logger;
import pH.C17747b;
import vH.C18172k;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0018\u0010\f\u001a\u00060\bj\u0002`\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LpH/b;", "LXH/N;", "c", "(LpH/b;)V", "LJH/a;", "a", "LJH/a;", "ValidateMark", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "b", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.f  reason: case insensitive filesystem */
public final class C18167f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C15954a<C16807N> f148866a = new C15954a<>("ValidateMark");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f148867b = C16039a.a("io.ktor.client.plugins.DefaultResponseValidation");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LvH/k$b;", "LXH/N;", "a", "(LvH/k$b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vH.f$a */
    static final class a extends C17544u implements C17642l<C18172k.b, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17747b<?> f148868c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBH/c;", "response", "LXH/N;", "<anonymous>", "(LBH/c;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", l = {42, 48}, m = "invokeSuspend")
        /* renamed from: vH.f$a$a  reason: collision with other inner class name */
        static final class C4289a extends l implements p<C15458c, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f148869c;

            /* renamed from: d  reason: collision with root package name */
            int f148870d;

            /* renamed from: e  reason: collision with root package name */
            int f148871e;

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f148872f;

            C4289a(C17164e<? super C4289a> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C4289a aVar = new C4289a(eVar);
                aVar.f148872f = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C15458c cVar, C17164e<? super C16807N> eVar) {
                return ((C4289a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x00fb  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r10.f148871e
                    r2 = 300(0x12c, float:4.2E-43)
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0032
                    if (r1 == r4) goto L_0x0027
                    if (r1 != r3) goto L_0x001f
                    int r0 = r10.f148870d
                    java.lang.Object r1 = r10.f148869c
                    BH.c r1 = (BH.C15458c) r1
                    java.lang.Object r3 = r10.f148872f
                    BH.c r3 = (BH.C15458c) r3
                    XH.y.b(r11)     // Catch:{ c -> 0x00d3 }
                    goto L_0x00cd
                L_0x001f:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x0027:
                    int r1 = r10.f148870d
                    java.lang.Object r5 = r10.f148872f
                    BH.c r5 = (BH.C15458c) r5
                    XH.y.b(r11)
                    goto L_0x00a6
                L_0x0032:
                    XH.y.b(r11)
                    java.lang.Object r11 = r10.f148872f
                    BH.c r11 = (BH.C15458c) r11
                    qH.b r1 = r11.h0()
                    JH.b r1 = r1.getAttributes()
                    JH.a r5 = vH.C18173l.e()
                    java.lang.Object r1 = r1.a(r5)
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L_0x0078
                    org.slf4j.Logger r0 = vH.C18167f.f148867b
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Skipping default response validation for "
                    r1.append(r2)
                    qH.b r11 = r11.h0()
                    AH.b r11 = r11.e()
                    EH.Q r11 = r11.getUrl()
                    r1.append(r11)
                    java.lang.String r11 = r1.toString()
                    r0.trace(r11)
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                L_0x0078:
                    EH.w r1 = r11.f()
                    int r1 = r1.x0()
                    qH.b r5 = r11.h0()
                    if (r1 < r2) goto L_0x012d
                    JH.b r6 = r5.getAttributes()
                    JH.a r7 = vH.C18167f.f148866a
                    boolean r6 = r6.f(r7)
                    if (r6 == 0) goto L_0x0096
                    goto L_0x012d
                L_0x0096:
                    r10.f148872f = r11
                    r10.f148870d = r1
                    r10.f148871e = r4
                    java.lang.Object r5 = qH.C17779d.a(r5, r10)
                    if (r5 != r0) goto L_0x00a3
                    return r0
                L_0x00a3:
                    r9 = r5
                    r5 = r11
                    r11 = r9
                L_0x00a6:
                    qH.b r11 = (qH.C17777b) r11
                    JH.b r6 = r11.getAttributes()
                    JH.a r7 = vH.C18167f.f148866a
                    XH.N r8 = XH.C16807N.f139792a
                    r6.c(r7, r8)
                    BH.c r11 = r11.f()
                    r10.f148872f = r5     // Catch:{ c -> 0x00d0 }
                    r10.f148869c = r11     // Catch:{ c -> 0x00d0 }
                    r10.f148870d = r1     // Catch:{ c -> 0x00d0 }
                    r10.f148871e = r3     // Catch:{ c -> 0x00d0 }
                    r3 = 0
                    java.lang.Object r3 = BH.C15460e.b(r11, r3, r10, r4, r3)     // Catch:{ c -> 0x00d0 }
                    if (r3 != r0) goto L_0x00c9
                    return r0
                L_0x00c9:
                    r0 = r1
                    r1 = r11
                    r11 = r3
                    r3 = r5
                L_0x00cd:
                    java.lang.String r11 = (java.lang.String) r11     // Catch:{ c -> 0x00d3 }
                    goto L_0x00d5
                L_0x00d0:
                    r0 = r1
                    r3 = r5
                    r1 = r11
                L_0x00d3:
                    java.lang.String r11 = "<body failed decoding>"
                L_0x00d5:
                    r4 = 400(0x190, float:5.6E-43)
                    if (r2 > r0) goto L_0x00e2
                    if (r0 < r4) goto L_0x00dc
                    goto L_0x00e2
                L_0x00dc:
                    vH.y r0 = new vH.y
                    r0.<init>(r1, r11)
                    goto L_0x0100
                L_0x00e2:
                    r2 = 500(0x1f4, float:7.0E-43)
                    if (r4 > r0) goto L_0x00ef
                    if (r0 < r2) goto L_0x00e9
                    goto L_0x00ef
                L_0x00e9:
                    vH.c r0 = new vH.c
                    r0.<init>(r1, r11)
                    goto L_0x0100
                L_0x00ef:
                    if (r2 > r0) goto L_0x00fb
                    r2 = 600(0x258, float:8.41E-43)
                    if (r0 >= r2) goto L_0x00fb
                    vH.D r0 = new vH.D
                    r0.<init>(r1, r11)
                    goto L_0x0100
                L_0x00fb:
                    vH.A r0 = new vH.A
                    r0.<init>(r1, r11)
                L_0x0100:
                    org.slf4j.Logger r11 = vH.C18167f.f148867b
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Default response validation for "
                    r1.append(r2)
                    qH.b r2 = r3.h0()
                    AH.b r2 = r2.e()
                    EH.Q r2 = r2.getUrl()
                    r1.append(r2)
                    java.lang.String r2 = " failed with "
                    r1.append(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    r11.trace(r1)
                    throw r0
                L_0x012d:
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: vH.C18167f.a.C4289a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17747b<?> bVar) {
            super(1);
            this.f148868c = bVar;
        }

        public final void a(C18172k.b bVar) {
            C17542s.j(bVar, "$this$HttpResponseValidator");
            bVar.d(this.f148868c.d());
            bVar.e(new C4289a((C17164e<? super C4289a>) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C18172k.b) obj);
            return C16807N.f139792a;
        }
    }

    public static final void c(C17747b<?> bVar) {
        C17542s.j(bVar, "<this>");
        C18173l.b(bVar, new a(bVar));
    }
}
