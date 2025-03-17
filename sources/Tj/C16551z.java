package TJ;

import UJ.C16619l;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import nI.C17631a;
import nI.q;
import nI.r;
import nI.s;
import nI.t;

@Metadata(d1 = {"\u0000>\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001ai\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001ak\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0004\b\f\u0010\n\u001a\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\b\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a¹\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0017\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\b\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e0\u001d\"\u0004\b\u0000\u0010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"T1", "T2", "R", "LTJ/g;", "flow", "Lkotlin/Function3;", "LdI/e;", "", "transform", "f", "(LTJ/g;LTJ/g;LnI/q;)LTJ/g;", "flow2", "e", "T3", "flow3", "Lkotlin/Function4;", "d", "(LTJ/g;LTJ/g;LTJ/g;LnI/r;)LTJ/g;", "T4", "flow4", "Lkotlin/Function5;", "c", "(LTJ/g;LTJ/g;LTJ/g;LTJ/g;LnI/s;)LTJ/g;", "T5", "flow5", "Lkotlin/Function6;", "b", "(LTJ/g;LTJ/g;LTJ/g;LTJ/g;LTJ/g;LnI/t;)LTJ/g;", "T", "Lkotlin/Function0;", "", "g", "()LnI/a;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: TJ.z  reason: case insensitive filesystem */
final /* synthetic */ class C16551z {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.z$a */
    public static final class a implements C16532g<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f138889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f138890b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
        /* renamed from: TJ.z$a$a  reason: collision with other inner class name */
        public static final class C3399a extends l implements q<C16533h<? super R>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f138891c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f138892d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f138893e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ r f138894f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3399a(C17164e eVar, r rVar) {
                super(3, eVar);
                this.f138894f = rVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super R> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                C3399a aVar = new C3399a(eVar, this.f138894f);
                aVar.f138892d = hVar;
                aVar.f138893e = objArr;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r7.f138891c
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    XH.y.b(r8)
                    goto L_0x0056
                L_0x0012:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L_0x001a:
                    java.lang.Object r1 = r7.f138892d
                    TJ.h r1 = (TJ.C16533h) r1
                    XH.y.b(r8)
                    goto L_0x004a
                L_0x0022:
                    XH.y.b(r8)
                    java.lang.Object r8 = r7.f138892d
                    r1 = r8
                    TJ.h r1 = (TJ.C16533h) r1
                    java.lang.Object r8 = r7.f138893e
                    java.lang.Object[] r8 = (java.lang.Object[]) r8
                    nI.r r4 = r7.f138894f
                    r5 = 0
                    r5 = r8[r5]
                    r6 = r8[r3]
                    r8 = r8[r2]
                    r7.f138892d = r1
                    r7.f138891c = r3
                    r3 = 6
                    kotlin.jvm.internal.C17541q.c(r3)
                    java.lang.Object r8 = r4.l(r5, r6, r8, r7)
                    r3 = 7
                    kotlin.jvm.internal.C17541q.c(r3)
                    if (r8 != r0) goto L_0x004a
                    return r0
                L_0x004a:
                    r3 = 0
                    r7.f138892d = r3
                    r7.f138891c = r2
                    java.lang.Object r8 = r1.emit(r8, r7)
                    if (r8 != r0) goto L_0x0056
                    return r0
                L_0x0056:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: TJ.C16551z.a.C3399a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(C16532g[] gVarArr, r rVar) {
            this.f138889a = gVarArr;
            this.f138890b = rVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object a10 = C16619l.a(hVar, this.f138889a, C16551z.g(), new C3399a((C17164e) null, this.f138890b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.z$b */
    public static final class b implements C16532g<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f138895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f138896b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
        /* renamed from: TJ.z$b$a */
        public static final class a extends l implements q<C16533h<? super R>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f138897c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f138898d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f138899e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ s f138900f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C17164e eVar, s sVar) {
                super(3, eVar);
                this.f138900f = sVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super R> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                a aVar = new a(eVar, this.f138900f);
                aVar.f138898d = hVar;
                aVar.f138899e = objArr;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r10.f138897c
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    XH.y.b(r11)
                    goto L_0x005a
                L_0x0012:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x001a:
                    java.lang.Object r1 = r10.f138898d
                    TJ.h r1 = (TJ.C16533h) r1
                    XH.y.b(r11)
                    goto L_0x004e
                L_0x0022:
                    XH.y.b(r11)
                    java.lang.Object r11 = r10.f138898d
                    r1 = r11
                    TJ.h r1 = (TJ.C16533h) r1
                    java.lang.Object r11 = r10.f138899e
                    java.lang.Object[] r11 = (java.lang.Object[]) r11
                    nI.s r4 = r10.f138900f
                    r5 = 0
                    r5 = r11[r5]
                    r6 = r11[r3]
                    r7 = r11[r2]
                    r8 = 3
                    r8 = r11[r8]
                    r10.f138898d = r1
                    r10.f138897c = r3
                    r11 = 6
                    kotlin.jvm.internal.C17541q.c(r11)
                    r9 = r10
                    java.lang.Object r11 = r4.z(r5, r6, r7, r8, r9)
                    r3 = 7
                    kotlin.jvm.internal.C17541q.c(r3)
                    if (r11 != r0) goto L_0x004e
                    return r0
                L_0x004e:
                    r3 = 0
                    r10.f138898d = r3
                    r10.f138897c = r2
                    java.lang.Object r11 = r1.emit(r11, r10)
                    if (r11 != r0) goto L_0x005a
                    return r0
                L_0x005a:
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: TJ.C16551z.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(C16532g[] gVarArr, s sVar) {
            this.f138895a = gVarArr;
            this.f138896b = sVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object a10 = C16619l.a(hVar, this.f138895a, C16551z.g(), new a((C17164e) null, this.f138896b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.z$c */
    public static final class c implements C16532g<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f138901a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f138902b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
        /* renamed from: TJ.z$c$a */
        public static final class a extends l implements q<C16533h<? super R>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f138903c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f138904d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f138905e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t f138906f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C17164e eVar, t tVar) {
                super(3, eVar);
                this.f138906f = tVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super R> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                a aVar = new a(eVar, this.f138906f);
                aVar.f138904d = hVar;
                aVar.f138905e = objArr;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r11.f138903c
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    XH.y.b(r12)
                    goto L_0x005d
                L_0x0012:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x001a:
                    java.lang.Object r1 = r11.f138904d
                    TJ.h r1 = (TJ.C16533h) r1
                    XH.y.b(r12)
                    goto L_0x0051
                L_0x0022:
                    XH.y.b(r12)
                    java.lang.Object r12 = r11.f138904d
                    r1 = r12
                    TJ.h r1 = (TJ.C16533h) r1
                    java.lang.Object r12 = r11.f138905e
                    java.lang.Object[] r12 = (java.lang.Object[]) r12
                    nI.t r4 = r11.f138906f
                    r5 = 0
                    r5 = r12[r5]
                    r6 = r12[r3]
                    r7 = r12[r2]
                    r8 = 3
                    r8 = r12[r8]
                    r9 = 4
                    r9 = r12[r9]
                    r11.f138904d = r1
                    r11.f138903c = r3
                    r12 = 6
                    kotlin.jvm.internal.C17541q.c(r12)
                    r10 = r11
                    java.lang.Object r12 = r4.o(r5, r6, r7, r8, r9, r10)
                    r3 = 7
                    kotlin.jvm.internal.C17541q.c(r3)
                    if (r12 != r0) goto L_0x0051
                    return r0
                L_0x0051:
                    r3 = 0
                    r11.f138904d = r3
                    r11.f138903c = r2
                    java.lang.Object r12 = r1.emit(r12, r11)
                    if (r12 != r0) goto L_0x005d
                    return r0
                L_0x005d:
                    XH.N r12 = XH.C16807N.f139792a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: TJ.C16551z.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(C16532g[] gVarArr, t tVar) {
            this.f138901a = gVarArr;
            this.f138902b = tVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object a10 = C16619l.a(hVar, this.f138901a, C16551z.g(), new a((C17164e) null, this.f138902b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"TJ/z$d", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.z$d */
    public static final class d implements C16532g<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f138907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16532g f138908b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f138909c;

        public d(C16532g gVar, C16532g gVar2, q qVar) {
            this.f138907a = gVar;
            this.f138908b = gVar2;
            this.f138909c = qVar;
        }

        public Object collect(C16533h<? super R> hVar, C17164e<? super C16807N> eVar) {
            Object a10 = C16619l.a(hVar, new C16532g[]{this.f138907a, this.f138908b}, C16551z.g(), new e(this.f138909c, (C17164e<? super e>) null), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "LTJ/h;", "", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
    /* renamed from: TJ.z$e */
    static final class e extends l implements q<C16533h<? super R>, Object[], C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f138910c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f138911d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f138912e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q<T1, T2, C17164e<? super R>, Object> f138913f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(q<? super T1, ? super T2, ? super C17164e<? super R>, ? extends Object> qVar, C17164e<? super e> eVar) {
            super(3, eVar);
            this.f138913f = qVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super R> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
            e eVar2 = new e(this.f138913f, eVar);
            eVar2.f138911d = hVar;
            eVar2.f138912e = objArr;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f138910c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r7)
                goto L_0x004c
            L_0x0012:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001a:
                java.lang.Object r1 = r6.f138911d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                goto L_0x0040
            L_0x0022:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f138911d
                r1 = r7
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r7 = r6.f138912e
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                nI.q<T1, T2, dI.e<? super R>, java.lang.Object> r4 = r6.f138913f
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f138911d = r1
                r6.f138910c = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L_0x0040
                return r0
            L_0x0040:
                r3 = 0
                r6.f138911d = r3
                r6.f138910c = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L_0x004c
                return r0
            L_0x004c:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16551z.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.z$f */
    static final class f implements C17631a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f138914a = new f();

        f() {
        }

        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    public static final <T1, T2, T3, T4, T5, R> C16532g<R> b(C16532g<? extends T1> gVar, C16532g<? extends T2> gVar2, C16532g<? extends T3> gVar3, C16532g<? extends T4> gVar4, C16532g<? extends T5> gVar5, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super C17164e<? super R>, ? extends Object> tVar) {
        return new c(new C16532g[]{gVar, gVar2, gVar3, gVar4, gVar5}, tVar);
    }

    public static final <T1, T2, T3, T4, R> C16532g<R> c(C16532g<? extends T1> gVar, C16532g<? extends T2> gVar2, C16532g<? extends T3> gVar3, C16532g<? extends T4> gVar4, s<? super T1, ? super T2, ? super T3, ? super T4, ? super C17164e<? super R>, ? extends Object> sVar) {
        return new b(new C16532g[]{gVar, gVar2, gVar3, gVar4}, sVar);
    }

    public static final <T1, T2, T3, R> C16532g<R> d(C16532g<? extends T1> gVar, C16532g<? extends T2> gVar2, C16532g<? extends T3> gVar3, r<? super T1, ? super T2, ? super T3, ? super C17164e<? super R>, ? extends Object> rVar) {
        return new a(new C16532g[]{gVar, gVar2, gVar3}, rVar);
    }

    public static final <T1, T2, R> C16532g<R> e(C16532g<? extends T1> gVar, C16532g<? extends T2> gVar2, q<? super T1, ? super T2, ? super C17164e<? super R>, ? extends Object> qVar) {
        return C16534i.I(gVar, gVar2, qVar);
    }

    public static final <T1, T2, R> C16532g<R> f(C16532g<? extends T1> gVar, C16532g<? extends T2> gVar2, q<? super T1, ? super T2, ? super C17164e<? super R>, ? extends Object> qVar) {
        return new d(gVar, gVar2, qVar);
    }

    /* access modifiers changed from: private */
    public static final <T> C17631a<T[]> g() {
        return f.f138914a;
    }
}
