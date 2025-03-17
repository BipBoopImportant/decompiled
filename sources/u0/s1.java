package U0;

import QJ.C16310i;
import QJ.Q;
import SJ.C16434j;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import W0.d;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import g1.C5327H;
import g1.C5338g;
import g1.C5342k;
import j0.O;
import j0.Z;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"T", "LTJ/P;", "LdI/i;", "context", "LU0/A1;", "c", "(LTJ/P;LdI/i;LU0/m;II)LU0/A1;", "R", "LTJ/g;", "initial", "b", "(LTJ/g;Ljava/lang/Object;LdI/i;LU0/m;II)LU0/A1;", "Lkotlin/Function0;", "block", "e", "(LnI/a;)LTJ/g;", "Lj0/O;", "", "", "set", "", "d", "(Lj0/O;Ljava/util/Set;)Z", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class s1 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LU0/G0;", "LXH/N;", "<anonymous>", "(LU0/G0;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {68, 69}, m = "invokeSuspend")
    static final class a extends l implements p<G0<R>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f14114c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f14115d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17168i f14116e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f14117f;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: U0.s1$a$a  reason: collision with other inner class name */
        static final class C0204a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G0<R> f14118a;

            C0204a(G0<R> g02) {
                this.f14118a = g02;
            }

            public final Object emit(T t10, C17164e<? super C16807N> eVar) {
                this.f14118a.setValue(t10);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {70}, m = "invokeSuspend")
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f14119c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C16532g<T> f14120d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ G0<R> f14121e;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: U0.s1$a$b$a  reason: collision with other inner class name */
            static final class C0205a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ G0<R> f14122a;

                C0205a(G0<R> g02) {
                    this.f14122a = g02;
                }

                public final Object emit(T t10, C17164e<? super C16807N> eVar) {
                    this.f14122a.setValue(t10);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C16532g<? extends T> gVar, G0<R> g02, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f14120d = gVar;
                this.f14121e = g02;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f14120d, this.f14121e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f14119c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<T> gVar = this.f14120d;
                    C0205a aVar = new C0205a(this.f14121e);
                    this.f14119c = 1;
                    if (gVar.collect(aVar, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17168i iVar, C16532g<? extends T> gVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f14116e = iVar;
            this.f14117f = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f14116e, this.f14117f, eVar);
            aVar.f14115d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(G0<R> g02, C17164e<? super C16807N> eVar) {
            return ((a) create(g02, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f14114c;
            if (i10 == 0) {
                y.b(obj);
                G0 g02 = (G0) this.f14115d;
                if (C17542s.e(this.f14116e, C17169j.f142968a)) {
                    C16532g<T> gVar = this.f14117f;
                    C0204a aVar = new C0204a(g02);
                    this.f14114c = 1;
                    if (gVar.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else {
                    C17168i iVar = this.f14116e;
                    b bVar = new b(this.f14117f, g02, (C17164e<? super b>) null);
                    this.f14114c = 2;
                    if (C16310i.g(iVar, bVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {148, 152, 174}, m = "invokeSuspend")
    static final class b extends l implements p<C16533h<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f14123c;

        /* renamed from: d  reason: collision with root package name */
        Object f14124d;

        /* renamed from: e  reason: collision with root package name */
        Object f14125e;

        /* renamed from: f  reason: collision with root package name */
        Object f14126f;

        /* renamed from: g  reason: collision with root package name */
        Object f14127g;

        /* renamed from: h  reason: collision with root package name */
        int f14128h;

        /* renamed from: i  reason: collision with root package name */
        int f14129i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f14130j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17631a<T> f14131k;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<Object, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ O<Object> f14132c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(O<Object> o10) {
                super(1);
                this.f14132c = o10;
            }

            public final void a(Object obj) {
                if (obj instanceof C5327H) {
                    ((C5327H) obj).s(C5338g.a(4));
                }
                this.f14132c.h(obj);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "", "", "changed", "Lg1/k;", "<anonymous parameter 1>", "LXH/N;", "a", "(Ljava/util/Set;Lg1/k;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: U0.s1$b$b  reason: collision with other inner class name */
        static final class C0206b extends C17544u implements p<Set<? extends Object>, C5342k, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16434j<Set<Object>> f14133c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0206b(C16434j<Set<Object>> jVar) {
                super(2);
                this.f14133c = jVar;
            }

            public final void a(Set<? extends Object> set, C5342k kVar) {
                Set<? extends Object> set2 = set;
                if (set2 instanceof d) {
                    Z b10 = ((d) set2).b();
                    Object[] objArr = b10.f24576b;
                    long[] jArr = b10.f24575a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        loop0:
                        while (true) {
                            long j10 = jArr[i10];
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((255 & j10) < 128) {
                                        Object obj = objArr[(i10 << 3) + i12];
                                        if (!(obj instanceof C5327H) || ((C5327H) obj).d(C5338g.a(4))) {
                                            break loop0;
                                        }
                                    }
                                    j10 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                        }
                    }
                    return;
                }
                Iterable iterable = set2;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (Object next : iterable) {
                        if (next instanceof C5327H) {
                            if (((C5327H) next).d(C5338g.a(4))) {
                            }
                        }
                    }
                }
                return;
                this.f14133c.k(set2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Set) obj, (C5342k) obj2);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17631a<? extends T> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f14131k = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f14131k, eVar);
            bVar.f14130j = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: TJ.h} */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x013f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0141, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            r14.s(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0145, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            r14.d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0149, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            r14 = th;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0028, B:20:0x009c, B:22:0x00a0] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1 A[Catch:{ all -> 0x012f, all -> 0x012d, all -> 0x0055 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9 A[Catch:{ all -> 0x012f, all -> 0x012d, all -> 0x0055 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r13.f14129i
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0070
                if (r1 == r5) goto L_0x0059
                if (r1 == r3) goto L_0x0038
                if (r1 != r2) goto L_0x0030
                java.lang.Object r1 = r13.f14127g
                java.lang.Object r6 = r13.f14126f
                g1.f r6 = (g1.C5337f) r6
                java.lang.Object r7 = r13.f14125e
                SJ.j r7 = (SJ.C16434j) r7
                java.lang.Object r8 = r13.f14124d
                nI.l r8 = (nI.C17642l) r8
                java.lang.Object r9 = r13.f14123c
                j0.O r9 = (j0.O) r9
                java.lang.Object r10 = r13.f14130j
                TJ.h r10 = (TJ.C16533h) r10
            L_0x0028:
                XH.y.b(r14)     // Catch:{ all -> 0x002d }
                goto L_0x00bf
            L_0x002d:
                r14 = move-exception
                goto L_0x014a
            L_0x0030:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0038:
                int r1 = r13.f14128h
                java.lang.Object r6 = r13.f14127g
                java.lang.Object r7 = r13.f14126f
                g1.f r7 = (g1.C5337f) r7
                java.lang.Object r8 = r13.f14125e
                SJ.j r8 = (SJ.C16434j) r8
                java.lang.Object r9 = r13.f14124d
                nI.l r9 = (nI.C17642l) r9
                java.lang.Object r10 = r13.f14123c
                j0.O r10 = (j0.O) r10
                java.lang.Object r11 = r13.f14130j
                TJ.h r11 = (TJ.C16533h) r11
                XH.y.b(r14)     // Catch:{ all -> 0x0055 }
                goto L_0x00dd
            L_0x0055:
                r14 = move-exception
                r6 = r7
                goto L_0x014a
            L_0x0059:
                java.lang.Object r1 = r13.f14127g
                java.lang.Object r6 = r13.f14126f
                g1.f r6 = (g1.C5337f) r6
                java.lang.Object r7 = r13.f14125e
                SJ.j r7 = (SJ.C16434j) r7
                java.lang.Object r8 = r13.f14124d
                nI.l r8 = (nI.C17642l) r8
                java.lang.Object r9 = r13.f14123c
                j0.O r9 = (j0.O) r9
                java.lang.Object r10 = r13.f14130j
                TJ.h r10 = (TJ.C16533h) r10
                goto L_0x0028
            L_0x0070:
                XH.y.b(r14)
                java.lang.Object r14 = r13.f14130j
                r10 = r14
                TJ.h r10 = (TJ.C16533h) r10
                j0.O r9 = new j0.O
                r14 = 0
                r9.<init>(r4, r5, r14)
                U0.s1$b$a r8 = new U0.s1$b$a
                r8.<init>(r9)
                r1 = 2147483647(0x7fffffff, float:NaN)
                r6 = 6
                SJ.j r7 = SJ.C16437m.b(r1, r14, r14, r6, r14)
                g1.k$a r14 = g1.C5342k.f23395e
                U0.s1$b$b r1 = new U0.s1$b$b
                r1.<init>(r7)
                g1.f r6 = r14.j(r1)
                g1.k r14 = r14.q(r8)     // Catch:{ all -> 0x002d }
                nI.a<T> r1 = r13.f14131k     // Catch:{ all -> 0x002d }
                g1.k r11 = r14.l()     // Catch:{ all -> 0x013f }
                java.lang.Object r1 = r1.invoke()     // Catch:{ all -> 0x0141 }
                r14.s(r11)     // Catch:{ all -> 0x013f }
                r14.d()     // Catch:{ all -> 0x002d }
                r13.f14130j = r10     // Catch:{ all -> 0x002d }
                r13.f14123c = r9     // Catch:{ all -> 0x002d }
                r13.f14124d = r8     // Catch:{ all -> 0x002d }
                r13.f14125e = r7     // Catch:{ all -> 0x002d }
                r13.f14126f = r6     // Catch:{ all -> 0x002d }
                r13.f14127g = r1     // Catch:{ all -> 0x002d }
                r13.f14129i = r5     // Catch:{ all -> 0x002d }
                java.lang.Object r14 = r10.emit(r1, r13)     // Catch:{ all -> 0x002d }
                if (r14 != r0) goto L_0x00bf
                return r0
            L_0x00bf:
                r13.f14130j = r10     // Catch:{ all -> 0x002d }
                r13.f14123c = r9     // Catch:{ all -> 0x002d }
                r13.f14124d = r8     // Catch:{ all -> 0x002d }
                r13.f14125e = r7     // Catch:{ all -> 0x002d }
                r13.f14126f = r6     // Catch:{ all -> 0x002d }
                r13.f14127g = r1     // Catch:{ all -> 0x002d }
                r13.f14128h = r4     // Catch:{ all -> 0x002d }
                r13.f14129i = r3     // Catch:{ all -> 0x002d }
                java.lang.Object r14 = r7.j(r13)     // Catch:{ all -> 0x002d }
                if (r14 != r0) goto L_0x00d6
                return r0
            L_0x00d6:
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r4
            L_0x00dd:
                java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0055 }
            L_0x00df:
                if (r1 != 0) goto L_0x00ea
                boolean r14 = U0.s1.d(r10, r14)     // Catch:{ all -> 0x0055 }
                if (r14 == 0) goto L_0x00e8
                goto L_0x00ea
            L_0x00e8:
                r1 = r4
                goto L_0x00eb
            L_0x00ea:
                r1 = r5
            L_0x00eb:
                java.lang.Object r14 = r8.r()     // Catch:{ all -> 0x0055 }
                java.lang.Object r14 = SJ.C16438n.f(r14)     // Catch:{ all -> 0x0055 }
                java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0055 }
                if (r14 != 0) goto L_0x00df
                if (r1 == 0) goto L_0x0138
                r10.m()     // Catch:{ all -> 0x0055 }
                g1.k$a r14 = g1.C5342k.f23395e     // Catch:{ all -> 0x0055 }
                g1.k r14 = r14.q(r9)     // Catch:{ all -> 0x0055 }
                nI.a<T> r1 = r13.f14131k     // Catch:{ all -> 0x0055 }
                g1.k r12 = r14.l()     // Catch:{ all -> 0x012d }
                java.lang.Object r1 = r1.invoke()     // Catch:{ all -> 0x012f }
                r14.s(r12)     // Catch:{ all -> 0x012d }
                r14.d()     // Catch:{ all -> 0x0055 }
                boolean r14 = kotlin.jvm.internal.C17542s.e(r1, r6)     // Catch:{ all -> 0x0055 }
                if (r14 != 0) goto L_0x0138
                r13.f14130j = r11     // Catch:{ all -> 0x0055 }
                r13.f14123c = r10     // Catch:{ all -> 0x0055 }
                r13.f14124d = r9     // Catch:{ all -> 0x0055 }
                r13.f14125e = r8     // Catch:{ all -> 0x0055 }
                r13.f14126f = r7     // Catch:{ all -> 0x0055 }
                r13.f14127g = r1     // Catch:{ all -> 0x0055 }
                r13.f14129i = r2     // Catch:{ all -> 0x0055 }
                java.lang.Object r14 = r11.emit(r1, r13)     // Catch:{ all -> 0x0055 }
                if (r14 != r0) goto L_0x0139
                return r0
            L_0x012d:
                r0 = move-exception
                goto L_0x0134
            L_0x012f:
                r0 = move-exception
                r14.s(r12)     // Catch:{ all -> 0x012d }
                throw r0     // Catch:{ all -> 0x012d }
            L_0x0134:
                r14.d()     // Catch:{ all -> 0x0055 }
                throw r0     // Catch:{ all -> 0x0055 }
            L_0x0138:
                r1 = r6
            L_0x0139:
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                goto L_0x00bf
            L_0x013f:
                r0 = move-exception
                goto L_0x0146
            L_0x0141:
                r0 = move-exception
                r14.s(r11)     // Catch:{ all -> 0x013f }
                throw r0     // Catch:{ all -> 0x013f }
            L_0x0146:
                r14.d()     // Catch:{ all -> 0x002d }
                throw r0     // Catch:{ all -> 0x002d }
            L_0x014a:
                r6.b()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: U0.s1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nI.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends R, R> U0.A1<R> b(TJ.C16532g<? extends T> r6, R r7, dI.C17168i r8, U0.C4889m r9, int r10, int r11) {
        /*
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0006
            dI.j r8 = dI.C17169j.f142968a
        L_0x0006:
            r2 = r8
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0016
            r8 = -1
            java.lang.String r11 = "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)"
            r0 = -606625098(0xffffffffdbd7a2b6, float:-1.21392045E17)
            U0.C4895p.S(r0, r10, r8, r11)
        L_0x0016:
            boolean r8 = r9.F(r2)
            boolean r11 = r9.F(r6)
            r8 = r8 | r11
            java.lang.Object r11 = r9.D()
            if (r8 != 0) goto L_0x002d
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x0036
        L_0x002d:
            U0.s1$a r11 = new U0.s1$a
            r8 = 0
            r11.<init>(r2, r6, r8)
            r9.u(r11)
        L_0x0036:
            r3 = r11
            nI.p r3 = (nI.p) r3
            int r8 = r10 >> 3
            r8 = r8 & 14
            int r11 = r10 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r8 = r8 | r11
            r10 = r10 & 896(0x380, float:1.256E-42)
            r5 = r8 | r10
            r0 = r7
            r1 = r6
            r4 = r9
            U0.A1 r6 = U0.p1.l(r0, r1, r2, r3, r4, r5)
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0056
            U0.C4895p.R()
        L_0x0056:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.s1.b(TJ.g, java.lang.Object, dI.i, U0.m, int, int):U0.A1");
    }

    public static final <T> A1<T> c(C16519P<? extends T> p10, C17168i iVar, C4889m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        C17168i iVar2 = iVar;
        if (C4895p.J()) {
            C4895p.S(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        A1<T> a10 = p1.a(p10, p10.getValue(), iVar2, mVar, (i10 & 14) | ((i10 << 3) & 896), 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return a10;
    }

    /* access modifiers changed from: private */
    public static final boolean d(O<Object> o10, Set<? extends Object> set) {
        Object[] objArr = o10.f24576b;
        long[] jArr = o10.f24575a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && set.contains(objArr[(i10 << 3) + i12])) {
                        return true;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return false;
                }
            }
            if (i10 == length) {
                return false;
            }
            i10++;
        }
    }

    public static final <T> C16532g<T> e(C17631a<? extends T> aVar) {
        return C16534i.H(new b(aVar, (C17164e<? super b>) null));
    }
}
