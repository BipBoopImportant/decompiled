package oe;

import HJ.C15854t;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0015B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 ¨\u0006\""}, d2 = {"Loe/f;", "Loe/c;", "Loe/g;", "adjustTrackerContract", "Loe/i;", "adjustWrapper", "LQJ/M;", "dispatcher", "LQJ/Q;", "applicationScope", "Loe/d;", "adjustEngineConfig", "<init>", "(Loe/g;Loe/i;LQJ/M;LQJ/Q;Loe/d;)V", "LXH/N;", "f", "()V", "g", "h", "a", "Loe/g;", "b", "Loe/i;", "c", "LQJ/M;", "d", "LQJ/Q;", "getApplicationScope", "()LQJ/Q;", "e", "Loe/d;", "", "Z", "isInitialized", "adjust-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oe.f  reason: case insensitive filesystem */
public final class C10116f implements C10113c {

    /* renamed from: g  reason: collision with root package name */
    public static final b f75702g = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C10117g f75703a;

    /* renamed from: b  reason: collision with root package name */
    private final C10119i f75704b;

    /* renamed from: c  reason: collision with root package name */
    private final M f75705c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f75706d;

    /* renamed from: e  reason: collision with root package name */
    private final C10114d f75707e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f75708f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.adjust.impl.AdjustEngineImpl$1", f = "AdjustEngineImpl.kt", l = {29}, m = "invokeSuspend")
    /* renamed from: oe.f$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f75709c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f75710d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C10116f f75711e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: oe.f$a$a  reason: collision with other inner class name */
        static final class C1385a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Q f75712a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C10116f f75713b;

            C1385a(Q q10, C10116f fVar) {
                this.f75712a = q10;
                this.f75713b = fVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                String str;
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str2 == null) {
                        String a10 = C11818a.a("Adjust enabled: " + z10, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Adjust:Engine";
                    } else {
                        str = str3;
                    }
                    bVar.a(eVar2, str, false, (Throwable) null, str4);
                    str2 = str4;
                    str3 = str;
                }
                if (this.f75713b.f75708f) {
                    if (z10) {
                        this.f75713b.g();
                    } else {
                        this.f75713b.h();
                    }
                } else if (z10) {
                    this.f75713b.f();
                }
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C10116f fVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f75711e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f75711e, eVar);
            aVar.f75710d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f75709c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f75710d;
                C16532g<Boolean> b10 = this.f75711e.f75703a.b();
                C1385a aVar = new C1385a(q10, this.f75711e);
                this.f75710d = q10;
                this.f75709c = 1;
                if (b10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f75710d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loe/f$b;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "adjust-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oe.f$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C10116f(C10117g gVar, C10119i iVar, M m10, Q q10, C10114d dVar) {
        C17542s.j(gVar, "adjustTrackerContract");
        C17542s.j(iVar, "adjustWrapper");
        C17542s.j(m10, "dispatcher");
        C17542s.j(q10, "applicationScope");
        C17542s.j(dVar, "adjustEngineConfig");
        this.f75703a = gVar;
        this.f75704b = iVar;
        this.f75705c = m10;
        this.f75706d = q10;
        this.f75707e = dVar;
        F0 unused = C16314k.d(q10, m10, (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void f() {
        boolean z10;
        boolean z11;
        String c10 = this.f75703a.c();
        String a10 = this.f75707e.a();
        String str = null;
        if (a10.length() == 0) {
            IllegalStateException illegalStateException = new IllegalStateException("Adjust app token is empty");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            Iterator it = d.f102012a.a().iterator();
            while (true) {
                z11 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 != null) {
                        str2 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C10116f.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, z11, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
                z11 = z11;
            }
            return;
        }
        String b10 = this.f75707e.b();
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        Iterator it2 = d.f102012a.a().iterator();
        while (true) {
            z10 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((C11819b) next2).b(eVar2, true)) {
                arrayList2.add(next2);
            }
        }
        String str6 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str == null) {
                String a12 = C11818a.a("Init and start Adjust with sudoId: " + c10 + " appToken:" + a10 + " env:" + b10, (Throwable) null);
                if (a12 == null) {
                    break;
                }
                str = C11820c.a(a12);
            }
            if (str6 == null) {
                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Adjust:Engine";
            }
            String str7 = str6;
            bVar2.a(eVar2, str7, z10, (Throwable) null, str);
            str6 = str7;
            eVar2 = eVar2;
            z10 = z10;
        }
        this.f75704b.a(a10, b10);
        this.f75704b.addSessionCallbackParameter("sudo_id", c10);
        this.f75708f = true;
    }

    /* access modifiers changed from: private */
    public final void g() {
        String str;
        if (!this.f75704b.b()) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Enable Adjust", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Adjust:Engine";
                } else {
                    str = str3;
                }
                bVar.a(eVar, str, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str;
            }
            this.f75704b.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    public final void h() {
        String str;
        if (this.f75704b.b()) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Disable Adjust", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Adjust:Engine";
                } else {
                    str = str3;
                }
                bVar.a(eVar, str, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str;
            }
            this.f75704b.setEnabled(false);
        }
    }
}
