package R2;

import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"LR2/g;", "T", "", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12298a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH@¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LR2/g$a;", "", "<init>", "()V", "T", "", "LR2/f;", "migrations", "LR2/m;", "api", "LXH/N;", "c", "(Ljava/util/List;LR2/m;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "LdI/e;", "b", "(Ljava/util/List;)LnI/p;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LR2/m;", "api", "LXH/N;", "<anonymous>", "(LR2/m;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: R2.g$a$a  reason: collision with other inner class name */
        static final class C0190a extends l implements p<m<T>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f12299c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f12300d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List<f<T>> f12301e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0190a(List<? extends f<T>> list, C17164e<? super C0190a> eVar) {
                super(2, eVar);
                this.f12301e = list;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0190a aVar = new C0190a(this.f12301e, eVar);
                aVar.f12300d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(m<T> mVar, C17164e<? super C16807N> eVar) {
                return ((C0190a) create(mVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f12299c;
                if (i10 == 0) {
                    y.b(obj);
                    a aVar = g.f12298a;
                    List<f<T>> list = this.f12301e;
                    this.f12299c = 1;
                    if (aVar.c(list, (m) this.f12300d, this) == f10) {
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

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        static final class b<T> extends d {

            /* renamed from: c  reason: collision with root package name */
            Object f12302c;

            /* renamed from: d  reason: collision with root package name */
            Object f12303d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f12304e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f12305f;

            /* renamed from: g  reason: collision with root package name */
            int f12306g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, C17164e<? super b> eVar) {
                super(eVar);
                this.f12305f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f12304e = obj;
                this.f12306g |= Integer.MIN_VALUE;
                return this.f12305f.c((List) null, (m) null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        static final class c extends l implements p<T, C17164e<? super T>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f12307c;

            /* renamed from: d  reason: collision with root package name */
            Object f12308d;

            /* renamed from: e  reason: collision with root package name */
            Object f12309e;

            /* renamed from: f  reason: collision with root package name */
            int f12310f;

            /* renamed from: g  reason: collision with root package name */
            /* synthetic */ Object f12311g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List<f<T>> f12312h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ List<C17642l<C17164e<? super C16807N>, Object>> f12313i;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            /* renamed from: R2.g$a$c$a  reason: collision with other inner class name */
            static final class C0191a extends l implements C17642l<C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f12314c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ f<T> f12315d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0191a(f<T> fVar, C17164e<? super C0191a> eVar) {
                    super(1, eVar);
                    this.f12315d = fVar;
                }

                public final C17164e<C16807N> create(C17164e<?> eVar) {
                    return new C0191a(this.f12315d, eVar);
                }

                /* renamed from: i */
                public final Object invoke(C17164e<? super C16807N> eVar) {
                    return ((C0191a) create(eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f12314c;
                    if (i10 == 0) {
                        y.b(obj);
                        f<T> fVar = this.f12315d;
                        this.f12314c = 1;
                        if (fVar.b(this) == f10) {
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
            c(List<? extends f<T>> list, List<C17642l<C17164e<? super C16807N>, Object>> list2, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f12312h = list;
                this.f12313i = list2;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                c cVar = new c(this.f12312h, this.f12313i, eVar);
                cVar.f12311g = obj;
                return cVar;
            }

            /* renamed from: i */
            public final Object invoke(T t10, C17164e<? super T> eVar) {
                return ((c) create(t10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r9.f12310f
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0037
                    if (r1 == r3) goto L_0x0022
                    if (r1 != r2) goto L_0x001a
                    java.lang.Object r1 = r9.f12307c
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f12311g
                    java.util.List r4 = (java.util.List) r4
                    XH.y.b(r10)
                    goto L_0x0046
                L_0x001a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L_0x0022:
                    java.lang.Object r1 = r9.f12309e
                    java.lang.Object r4 = r9.f12308d
                    R2.f r4 = (R2.f) r4
                    java.lang.Object r5 = r9.f12307c
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f12311g
                    java.util.List r6 = (java.util.List) r6
                    XH.y.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L_0x0068
                L_0x0037:
                    XH.y.b(r10)
                    java.lang.Object r10 = r9.f12311g
                    java.util.List<R2.f<T>> r1 = r9.f12312h
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<nI.l<dI.e<? super XH.N>, java.lang.Object>> r4 = r9.f12313i
                    java.util.Iterator r1 = r1.iterator()
                L_0x0046:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L_0x008e
                    java.lang.Object r5 = r1.next()
                    R2.f r5 = (R2.f) r5
                    r9.f12311g = r4
                    r9.f12307c = r1
                    r9.f12308d = r5
                    r9.f12309e = r10
                    r9.f12310f = r3
                    java.lang.Object r6 = r5.a(r10, r9)
                    if (r6 != r0) goto L_0x0063
                    return r0
                L_0x0063:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L_0x0068:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L_0x008c
                    R2.g$a$c$a r10 = new R2.g$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f12311g = r4
                    r9.f12307c = r5
                    r9.f12308d = r7
                    r9.f12309e = r7
                    r9.f12310f = r2
                    java.lang.Object r10 = r6.c(r1, r9)
                    if (r10 != r0) goto L_0x008a
                    return r0
                L_0x008a:
                    r1 = r5
                    goto L_0x0046
                L_0x008c:
                    r10 = r1
                    goto L_0x008a
                L_0x008e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: R2.g.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object c(java.util.List<? extends R2.f<T>> r7, R2.m<T> r8, dI.C17164e<? super XH.C16807N> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof R2.g.a.b
                if (r0 == 0) goto L_0x0013
                r0 = r9
                R2.g$a$b r0 = (R2.g.a.b) r0
                int r1 = r0.f12306g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f12306g = r1
                goto L_0x0018
            L_0x0013:
                R2.g$a$b r0 = new R2.g$a$b
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f12304e
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f12306g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.f12303d
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f12302c
                kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
                XH.y.b(r9)     // Catch:{ all -> 0x0034 }
                goto L_0x006b
            L_0x0034:
                r9 = move-exception
                goto L_0x0084
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                java.lang.Object r7 = r0.f12302c
                java.util.List r7 = (java.util.List) r7
                XH.y.b(r9)
                goto L_0x0060
            L_0x0046:
                XH.y.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                R2.g$a$c r2 = new R2.g$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f12302c = r9
                r0.f12306g = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r7 = r9
            L_0x0060:
                kotlin.jvm.internal.O r8 = new kotlin.jvm.internal.O
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L_0x006b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0094
                java.lang.Object r9 = r7.next()
                nI.l r9 = (nI.C17642l) r9
                r0.f12302c = r8     // Catch:{ all -> 0x0034 }
                r0.f12303d = r7     // Catch:{ all -> 0x0034 }
                r0.f12306g = r3     // Catch:{ all -> 0x0034 }
                java.lang.Object r9 = r9.invoke(r0)     // Catch:{ all -> 0x0034 }
                if (r9 != r1) goto L_0x006b
                return r1
            L_0x0084:
                T r2 = r8.f144348a
                if (r2 != 0) goto L_0x008b
                r8.f144348a = r9
                goto L_0x006b
            L_0x008b:
                kotlin.jvm.internal.C17542s.g(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                XH.C16816g.a(r2, r9)
                goto L_0x006b
            L_0x0094:
                T r7 = r8.f144348a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L_0x009d
                XH.N r7 = XH.C16807N.f139792a
                return r7
            L_0x009d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: R2.g.a.c(java.util.List, R2.m, dI.e):java.lang.Object");
        }

        public final <T> p<m<T>, C17164e<? super C16807N>, Object> b(List<? extends f<T>> list) {
            C17542s.j(list, "migrations");
            return new C0190a(list, (C17164e<? super C0190a>) null);
        }

        private a() {
        }
    }
}
