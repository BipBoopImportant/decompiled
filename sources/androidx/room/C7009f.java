package androidx.room;

import QJ.C16310i;
import QJ.C16320n;
import QJ.C16324p;
import QJ.C16342y0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import android.os.CancellationSignal;
import androidx.room.r;
import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import eI.C17187b;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/f;", "", "a", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.f  reason: case insensitive filesystem */
public final class C7009f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44305a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/room/f$a;", "", "<init>", "()V", "R", "Landroidx/room/x;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "c", "(Landroidx/room/x;ZLjava/util/concurrent/Callable;LdI/e;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "b", "(Landroidx/room/x;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;LdI/e;)Ljava/lang/Object;", "", "", "tableNames", "LTJ/g;", "a", "(Landroidx/room/x;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)LTJ/g;", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.f$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: androidx.room.f$a$a  reason: collision with other inner class name */
        static final class C0758a extends l implements p<C16533h<R>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f44306c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f44307d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f44308e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ x f44309f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String[] f44310g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Callable<R> f44311h;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {137}, m = "invokeSuspend")
            /* renamed from: androidx.room.f$a$a$a  reason: collision with other inner class name */
            static final class C0759a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f44312c;

                /* renamed from: d  reason: collision with root package name */
                private /* synthetic */ Object f44313d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ boolean f44314e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ x f44315f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ C16533h<R> f44316g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ String[] f44317h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ Callable<R> f44318i;

                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
                @f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {128, 130}, m = "invokeSuspend")
                /* renamed from: androidx.room.f$a$a$a$a  reason: collision with other inner class name */
                static final class C0760a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    Object f44319c;

                    /* renamed from: d  reason: collision with root package name */
                    int f44320d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ x f44321e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ b f44322f;

                    /* renamed from: g  reason: collision with root package name */
                    final /* synthetic */ C16434j<C16807N> f44323g;

                    /* renamed from: h  reason: collision with root package name */
                    final /* synthetic */ Callable<R> f44324h;

                    /* renamed from: i  reason: collision with root package name */
                    final /* synthetic */ C16434j<R> f44325i;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0760a(x xVar, b bVar, C16434j jVar, Callable callable, C16434j jVar2, C17164e eVar) {
                        super(2, eVar);
                        this.f44321e = xVar;
                        this.f44322f = bVar;
                        this.f44323g = jVar;
                        this.f44324h = callable;
                        this.f44325i = jVar2;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C0760a(this.f44321e, this.f44322f, this.f44323g, this.f44324h, this.f44325i, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C0760a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[Catch:{ all -> 0x0017 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053 A[Catch:{ all -> 0x0017 }] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                        /*
                            r6 = this;
                            java.lang.Object r0 = eI.C17187b.f()
                            int r1 = r6.f44320d
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L_0x0029
                            if (r1 == r3) goto L_0x0021
                            if (r1 != r2) goto L_0x0019
                            java.lang.Object r1 = r6.f44319c
                            SJ.l r1 = (SJ.C16436l) r1
                            XH.y.b(r7)     // Catch:{ all -> 0x0017 }
                        L_0x0015:
                            r7 = r1
                            goto L_0x003d
                        L_0x0017:
                            r7 = move-exception
                            goto L_0x0077
                        L_0x0019:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L_0x0021:
                            java.lang.Object r1 = r6.f44319c
                            SJ.l r1 = (SJ.C16436l) r1
                            XH.y.b(r7)     // Catch:{ all -> 0x0017 }
                            goto L_0x004b
                        L_0x0029:
                            XH.y.b(r7)
                            androidx.room.x r7 = r6.f44321e
                            androidx.room.r r7 = r7.getInvalidationTracker()
                            androidx.room.f$a$a$a$b r1 = r6.f44322f
                            r7.c(r1)
                            SJ.j<XH.N> r7 = r6.f44323g     // Catch:{ all -> 0x0017 }
                            SJ.l r7 = r7.iterator()     // Catch:{ all -> 0x0017 }
                        L_0x003d:
                            r6.f44319c = r7     // Catch:{ all -> 0x0017 }
                            r6.f44320d = r3     // Catch:{ all -> 0x0017 }
                            java.lang.Object r1 = r7.a(r6)     // Catch:{ all -> 0x0017 }
                            if (r1 != r0) goto L_0x0048
                            return r0
                        L_0x0048:
                            r5 = r1
                            r1 = r7
                            r7 = r5
                        L_0x004b:
                            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0017 }
                            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0017 }
                            if (r7 == 0) goto L_0x0069
                            r1.next()     // Catch:{ all -> 0x0017 }
                            java.util.concurrent.Callable<R> r7 = r6.f44324h     // Catch:{ all -> 0x0017 }
                            java.lang.Object r7 = r7.call()     // Catch:{ all -> 0x0017 }
                            SJ.j<R> r4 = r6.f44325i     // Catch:{ all -> 0x0017 }
                            r6.f44319c = r1     // Catch:{ all -> 0x0017 }
                            r6.f44320d = r2     // Catch:{ all -> 0x0017 }
                            java.lang.Object r7 = r4.y(r7, r6)     // Catch:{ all -> 0x0017 }
                            if (r7 != r0) goto L_0x0015
                            return r0
                        L_0x0069:
                            androidx.room.x r7 = r6.f44321e
                            androidx.room.r r7 = r7.getInvalidationTracker()
                            androidx.room.f$a$a$a$b r0 = r6.f44322f
                            r7.p(r0)
                            XH.N r7 = XH.C16807N.f139792a
                            return r7
                        L_0x0077:
                            androidx.room.x r0 = r6.f44321e
                            androidx.room.r r0 = r0.getInvalidationTracker()
                            androidx.room.f$a$a$a$b r1 = r6.f44322f
                            r0.p(r1)
                            throw r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C7009f.a.C0758a.C0759a.C0760a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/f$a$a$a$b", "Landroidx/room/r$c;", "", "", "tables", "LXH/N;", "c", "(Ljava/util/Set;)V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.room.f$a$a$a$b */
                public static final class b extends r.c {

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C16434j<C16807N> f44326b;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    b(String[] strArr, C16434j<C16807N> jVar) {
                        super(strArr);
                        this.f44326b = jVar;
                    }

                    public void c(Set<String> set) {
                        this.f44326b.k(C16807N.f139792a);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0759a(boolean z10, x xVar, C16533h<R> hVar, String[] strArr, Callable<R> callable, C17164e<? super C0759a> eVar) {
                    super(2, eVar);
                    this.f44314e = z10;
                    this.f44315f = xVar;
                    this.f44316g = hVar;
                    this.f44317h = strArr;
                    this.f44318i = callable;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    C0759a aVar = new C0759a(this.f44314e, this.f44315f, this.f44316g, this.f44317h, this.f44318i, eVar);
                    aVar.f44313d = obj;
                    return aVar;
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0759a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    C17168i iVar;
                    Object f10 = C17187b.f();
                    int i10 = this.f44312c;
                    if (i10 == 0) {
                        y.b(obj);
                        Q q10 = (Q) this.f44313d;
                        C16434j b10 = C16437m.b(-1, (C16428d) null, (C17642l) null, 6, (Object) null);
                        b bVar = new b(this.f44317h, b10);
                        b10.k(C16807N.f139792a);
                        I i11 = (I) q10.getCoroutineContext().get(I.f44244c);
                        if (i11 == null || (iVar = i11.b()) == null) {
                            iVar = this.f44314e ? C7010g.b(this.f44315f) : C7010g.a(this.f44315f);
                        }
                        C16434j b11 = C16437m.b(0, (C16428d) null, (C17642l) null, 7, (Object) null);
                        F0 unused = C16314k.d(q10, iVar, (T) null, new C0760a(this.f44315f, bVar, b10, this.f44318i, b11, (C17164e) null), 2, (Object) null);
                        C16533h<R> hVar = this.f44316g;
                        this.f44312c = 1;
                        if (C16534i.w(hVar, b11, this) == f10) {
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
            C0758a(boolean z10, x xVar, String[] strArr, Callable<R> callable, C17164e<? super C0758a> eVar) {
                super(2, eVar);
                this.f44308e = z10;
                this.f44309f = xVar;
                this.f44310g = strArr;
                this.f44311h = callable;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0758a aVar = new C0758a(this.f44308e, this.f44309f, this.f44310g, this.f44311h, eVar);
                aVar.f44307d = obj;
                return aVar;
            }

            public final Object invoke(C16533h<R> hVar, C17164e<? super C16807N> eVar) {
                return ((C0758a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f44306c;
                if (i10 == 0) {
                    y.b(obj);
                    C0759a aVar = new C0759a(this.f44308e, this.f44309f, (C16533h) this.f44307d, this.f44310g, this.f44311h, (C17164e<? super C0759a>) null);
                    this.f44306c = 1;
                    if (S.f(aVar, this) == f10) {
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

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"R", "LQJ/Q;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.room.f$a$b */
        static final class b extends l implements p<Q, C17164e<? super R>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f44327c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Callable<R> f44328d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Callable<R> callable, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f44328d = callable;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f44328d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super R> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f44327c == 0) {
                    y.b(obj);
                    return this.f44328d.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$c */
        static final class c extends C17544u implements C17642l<Throwable, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ CancellationSignal f44329c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F0 f44330d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(CancellationSignal cancellationSignal, F0 f02) {
                super(1);
                this.f44329c = cancellationSignal;
                this.f44330d = f02;
            }

            public final void a(Throwable th2) {
                CancellationSignal cancellationSignal = this.f44329c;
                if (cancellationSignal != null) {
                    Q4.b.a(cancellationSignal);
                }
                F0.a.a(this.f44330d, (CancellationException) null, 1, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.room.f$a$d */
        static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f44331c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Callable<R> f44332d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16320n<R> f44333e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(Callable<R> callable, C16320n<? super R> nVar, C17164e<? super d> eVar) {
                super(2, eVar);
                this.f44332d = callable;
                this.f44333e = nVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new d(this.f44332d, this.f44333e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f44331c == 0) {
                    y.b(obj);
                    try {
                        this.f44333e.resumeWith(x.b(this.f44332d.call()));
                    } catch (Throwable th2) {
                        C16320n<R> nVar = this.f44333e;
                        x.a aVar = x.f139812b;
                        nVar.resumeWith(x.b(y.a(th2)));
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <R> C16532g<R> a(x xVar, boolean z10, String[] strArr, Callable<R> callable) {
            return C16534i.H(new C0758a(z10, xVar, strArr, callable, (C17164e<? super C0758a>) null));
        }

        public final <R> Object b(x xVar, boolean z10, CancellationSignal cancellationSignal, Callable<R> callable, C17164e<? super R> eVar) {
            C17165f b10;
            if (xVar.isOpenInternal() && xVar.inTransaction()) {
                return callable.call();
            }
            I i10 = (I) eVar.getContext().get(I.f44244c);
            if (i10 == null || (b10 = i10.b()) == null) {
                b10 = z10 ? C7010g.b(xVar) : C7010g.a(xVar);
            }
            C17165f fVar = b10;
            C16324p pVar = new C16324p(C17187b.c(eVar), 1);
            pVar.C();
            pVar.K(new c(cancellationSignal, C16314k.d(C16342y0.f137687a, fVar, (T) null, new d(callable, pVar, (C17164e<? super d>) null), 2, (Object) null)));
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10;
        }

        public final <R> Object c(x xVar, boolean z10, Callable<R> callable, C17164e<? super R> eVar) {
            C17165f fVar;
            if (xVar.isOpenInternal() && xVar.inTransaction()) {
                return callable.call();
            }
            I i10 = (I) eVar.getContext().get(I.f44244c);
            if (i10 == null || (fVar = i10.b()) == null) {
                fVar = z10 ? C7010g.b(xVar) : C7010g.a(xVar);
            }
            return C16310i.g(fVar, new b(callable, (C17164e<? super b>) null), eVar);
        }

        private a() {
        }
    }

    public static final <R> C16532g<R> a(x xVar, boolean z10, String[] strArr, Callable<R> callable) {
        return f44305a.a(xVar, z10, strArr, callable);
    }

    public static final <R> Object b(x xVar, boolean z10, CancellationSignal cancellationSignal, Callable<R> callable, C17164e<? super R> eVar) {
        return f44305a.b(xVar, z10, cancellationSignal, callable, eVar);
    }

    public static final <R> Object c(x xVar, boolean z10, Callable<R> callable, C17164e<? super R> eVar) {
        return f44305a.c(xVar, z10, callable, eVar);
    }
}
