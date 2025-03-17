package c7;

import QJ.F0;
import QJ.Q;
import QJ.T;
import QJ.Y;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc7/a;", "", "Value", "a", "(LdI/e;)Ljava/lang/Object;", "value", "LXH/N;", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: c7.a  reason: case insensitive filesystem */
public interface C7100a<Value> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: c7.a$a  reason: collision with other inner class name */
    public static final class C0797a {

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00018\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"c7/a$a$a", "Lc7/a;", "a", "(LdI/e;)Ljava/lang/Object;", "LQJ/Y;", "LQJ/Y;", "job", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: c7.a$a$a  reason: collision with other inner class name */
        public static final class C0798a implements C7100a<Value> {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public Y<? extends Value> f45748a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C7100a<Value> f45749b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.appmattus.certificatetransparency.datasource.DataSource$reuseInflight$1", f = "DataSource.kt", l = {55, 64}, m = "get")
            /* renamed from: c7.a$a$a$a  reason: collision with other inner class name */
            static final class C0799a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f45750c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C0798a f45751d;

                /* renamed from: e  reason: collision with root package name */
                int f45752e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0799a(C0798a aVar, C17164e<? super C0799a> eVar) {
                    super(eVar);
                    this.f45751d = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f45750c = obj;
                    this.f45752e |= Integer.MIN_VALUE;
                    return this.f45751d.a(this);
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Value", "LQJ/Q;", "LQJ/Y;", "<anonymous>", "(LQJ/Q;)LQJ/Y;"}, k = 3, mv = {2, 1, 0})
            @f(c = "com.appmattus.certificatetransparency.datasource.DataSource$reuseInflight$1$get$2", f = "DataSource.kt", l = {}, m = "invokeSuspend")
            /* renamed from: c7.a$a$a$b */
            static final class b extends l implements p<Q, C17164e<? super Y<? extends Value>>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f45753c;

                /* renamed from: d  reason: collision with root package name */
                private /* synthetic */ Object f45754d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0798a f45755e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C7100a<Value> f45756f;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "Value", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                @f(c = "com.appmattus.certificatetransparency.datasource.DataSource$reuseInflight$1$get$2$1", f = "DataSource.kt", l = {56}, m = "invokeSuspend")
                /* renamed from: c7.a$a$a$b$a  reason: collision with other inner class name */
                static final class C0800a extends l implements p<Q, C17164e<? super Value>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f45757c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ C7100a<Value> f45758d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0800a(C7100a<Value> aVar, C17164e<? super C0800a> eVar) {
                        super(2, eVar);
                        this.f45758d = aVar;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C0800a(this.f45758d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super Value> eVar) {
                        return ((C0800a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f45757c;
                        if (i10 == 0) {
                            y.b(obj);
                            C7100a<Value> aVar = this.f45758d;
                            this.f45757c = 1;
                            obj = aVar.a(this);
                            if (obj == f10) {
                                return f10;
                            }
                        } else if (i10 == 1) {
                            y.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return obj;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
                @f(c = "com.appmattus.certificatetransparency.datasource.DataSource$reuseInflight$1$get$2$2$2", f = "DataSource.kt", l = {61}, m = "invokeSuspend")
                /* renamed from: c7.a$a$a$b$b  reason: collision with other inner class name */
                static final class C0801b extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f45759c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ Y<Value> f45760d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0801b(Y<? extends Value> y10, C17164e<? super C0801b> eVar) {
                        super(2, eVar);
                        this.f45760d = y10;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C0801b(this.f45760d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C0801b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f45759c;
                        if (i10 == 0) {
                            y.b(obj);
                            Y<Value> y10 = this.f45760d;
                            this.f45759c = 1;
                            if (y10.j0(this) == f10) {
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
                b(C0798a aVar, C7100a<Value> aVar2, C17164e<? super b> eVar) {
                    super(2, eVar);
                    this.f45755e = aVar;
                    this.f45756f = aVar2;
                }

                /* access modifiers changed from: private */
                public static final C16807N j(C0798a aVar, Throwable th2) {
                    aVar.f45748a = null;
                    return C16807N.f139792a;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    b bVar = new b(this.f45755e, this.f45756f, eVar);
                    bVar.f45754d = obj;
                    return bVar;
                }

                public final Object invoke(Q q10, C17164e<? super Y<? extends Value>> eVar) {
                    return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    C17187b.f();
                    if (this.f45753c == 0) {
                        y.b(obj);
                        Q q10 = (Q) this.f45754d;
                        Y c10 = this.f45755e.f45748a;
                        if (c10 != null) {
                            return c10;
                        }
                        Y b10 = C16314k.b(q10, (C17168i) null, (T) null, new C0800a(this.f45756f, (C17164e<? super C0800a>) null), 3, (Object) null);
                        C0798a aVar = this.f45755e;
                        aVar.f45748a = b10;
                        b10.s(new C7101b(aVar));
                        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C0801b(b10, (C17164e<? super C0801b>) null), 3, (Object) null);
                        return b10;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            C0798a(C7100a<Value> aVar) {
                this.f45749b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[PHI: r7 
              PHI: (r7v2 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:18:0x0054, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(dI.C17164e<? super Value> r7) {
                /*
                    r6 = this;
                    boolean r0 = r7 instanceof c7.C7100a.C0797a.C0798a.C0799a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    c7.a$a$a$a r0 = (c7.C7100a.C0797a.C0798a.C0799a) r0
                    int r1 = r0.f45752e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f45752e = r1
                    goto L_0x0018
                L_0x0013:
                    c7.a$a$a$a r0 = new c7.a$a$a$a
                    r0.<init>(r6, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f45750c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f45752e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0038
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r7)
                    goto L_0x0057
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L_0x0034:
                    XH.y.b(r7)
                    goto L_0x004c
                L_0x0038:
                    XH.y.b(r7)
                    c7.a$a$a$b r7 = new c7.a$a$a$b
                    c7.a<Value> r2 = r6.f45749b
                    r5 = 0
                    r7.<init>(r6, r2, r5)
                    r0.f45752e = r4
                    java.lang.Object r7 = QJ.S.f(r7, r0)
                    if (r7 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    QJ.Y r7 = (QJ.Y) r7
                    r0.f45752e = r3
                    java.lang.Object r7 = r7.f(r0)
                    if (r7 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: c7.C7100a.C0797a.C0798a.a(dI.e):java.lang.Object");
            }
        }

        public static <Value> C7100a<Value> a(C7100a<Value> aVar) {
            return new C0798a(aVar);
        }
    }

    Object a(C17164e<? super Value> eVar);

    Object b(Value value, C17164e<? super C16807N> eVar);
}
