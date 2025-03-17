package Yy;

import QJ.Q;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006H@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00198V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LYy/b;", "LRy/b;", "LRy/c;", "dataSource", "<init>", "(LRy/c;)V", "", "areTermsAndConditionsAccepted", "LXH/N;", "i", "(Z)V", "h", "()Z", "allItemsScanned", "j", "d", "f", "()V", "c", "(LdI/e;)Ljava/lang/Object;", "value", "b", "(ZLdI/e;)Ljava/lang/Object;", "a", "LRy/c;", "", "e", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "userEmail", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements Ry.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Ry.c f118215a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityImpl$areTermsAndConditionsAccepted$1", f = "ScanAndGoCapabilityImpl.kt", l = {49}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118216c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f118217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f118217d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f118217d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118216c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Boolean> i11 = this.f118217d.f118215a.i();
                this.f118216c = 1;
                obj = C16534i.B(i11, this);
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityImpl$clearAll$1", f = "ScanAndGoCapabilityImpl.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: Yy.b$b  reason: collision with other inner class name */
    static final class C2940b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118218c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f118219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2940b(b bVar, C17164e<? super C2940b> eVar) {
            super(2, eVar);
            this.f118219d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2940b(this.f118219d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2940b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118218c;
            if (i10 == 0) {
                y.b(obj);
                Ry.c a10 = this.f118219d.f118215a;
                this.f118218c = 1;
                if (a10.a(this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityImpl$getHasAcknowledgedAllItems$1", f = "ScanAndGoCapabilityImpl.kt", l = {57}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118220c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f118221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f118221d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f118221d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118220c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Boolean> d10 = this.f118221d.f118215a.d();
                this.f118220c = 1;
                obj = C16534i.B(d10, this);
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityImpl$setHasAcknowledgedAllItems$1", f = "ScanAndGoCapabilityImpl.kt", l = {53}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118222c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f118223d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f118224e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, boolean z10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f118223d = bVar;
            this.f118224e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f118223d, this.f118224e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118222c;
            if (i10 == 0) {
                y.b(obj);
                Ry.c a10 = this.f118223d.f118215a;
                boolean z10 = this.f118224e;
                this.f118222c = 1;
                if (a10.f(z10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityImpl$setTermsAndConditionsAccepted$1", f = "ScanAndGoCapabilityImpl.kt", l = {45}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118225c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f118226d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f118227e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, boolean z10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f118226d = bVar;
            this.f118227e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f118226d, this.f118227e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118225c;
            if (i10 == 0) {
                y.b(obj);
                Ry.c a10 = this.f118226d.f118215a;
                boolean z10 = this.f118227e;
                this.f118225c = 1;
                if (a10.h(z10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityImpl$userEmail$1", f = "ScanAndGoCapabilityImpl.kt", l = {23}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118228c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f118229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f118229d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f118229d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super String> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118228c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<String> e10 = this.f118229d.f118215a.e();
                this.f118228c = 1;
                obj = C16534i.B(e10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            return str == null ? "" : str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityImpl$userEmail$2", f = "ScanAndGoCapabilityImpl.kt", l = {25}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118230c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f118231d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f118232e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, String str, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f118231d = bVar;
            this.f118232e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f118231d, this.f118232e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118230c;
            if (i10 == 0) {
                y.b(obj);
                Ry.c a10 = this.f118231d.f118215a;
                String str = this.f118232e;
                this.f118230c = 1;
                if (a10.g(str, this) == f10) {
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

    public b(Ry.c cVar) {
        C17542s.j(cVar, "dataSource");
        this.f118215a = cVar;
    }

    public Object b(boolean z10, C17164e<? super C16807N> eVar) {
        Object b10 = this.f118215a.b(z10, eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public Object c(C17164e<? super Boolean> eVar) {
        return this.f118215a.c(eVar);
    }

    public boolean d() {
        return ((Boolean) C16312j.b((C17168i) null, new c(this, (C17164e<? super c>) null), 1, (Object) null)).booleanValue();
    }

    public String e() {
        return (String) C16312j.b((C17168i) null, new f(this, (C17164e<? super f>) null), 1, (Object) null);
    }

    public void f() {
        Object unused = C16312j.b((C17168i) null, new C2940b(this, (C17164e<? super C2940b>) null), 1, (Object) null);
    }

    public void g(String str) {
        C17542s.j(str, "value");
        Object unused = C16312j.b((C17168i) null, new g(this, str, (C17164e<? super g>) null), 1, (Object) null);
    }

    public boolean h() {
        return ((Boolean) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null)).booleanValue();
    }

    public void i(boolean z10) {
        Object unused = C16312j.b((C17168i) null, new e(this, z10, (C17164e<? super e>) null), 1, (Object) null);
    }

    public void j(boolean z10) {
        Object unused = C16312j.b((C17168i) null, new d(this, z10, (C17164e<? super d>) null), 1, (Object) null);
    }
}
