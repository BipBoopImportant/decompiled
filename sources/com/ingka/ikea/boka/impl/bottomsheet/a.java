package com.ingka.ikea.boka.impl.bottomsheet;

import HJ.C15854t;
import QJ.C16297b0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/boka/impl/bottomsheet/a;", "Landroidx/lifecycle/f0;", "LXm/a;", "bookingUrlRepository", "<init>", "(LXm/a;)V", "LXH/N;", "C", "()V", "m", "LXm/a;", "LTJ/B;", "Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;", "n", "LTJ/B;", "_state", "LTJ/P;", "o", "LTJ/P;", "getState", "()LTJ/P;", "state", "a", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Xm.a f93258m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16505B<C2078a> f93259n;

    /* renamed from: o  reason: collision with root package name */
    private final C16519P<C2078a> f93260o;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;", "", "b", "c", "a", "Lcom/ingka/ikea/boka/impl/bottomsheet/a$a$a;", "Lcom/ingka/ikea/boka/impl/bottomsheet/a$a$b;", "Lcom/ingka/ikea/boka/impl/bottomsheet/a$a$c;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.boka.impl.bottomsheet.a$a  reason: collision with other inner class name */
    public interface C2078a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/boka/impl/bottomsheet/a$a$a;", "Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.boka.impl.bottomsheet.a$a$a  reason: collision with other inner class name */
        public static final class C2079a implements C2078a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2079a f93261a = new C2079a();

            private C2079a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2079a);
            }

            public int hashCode() {
                return -2089824518;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/boka/impl/bottomsheet/a$a$b;", "Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.boka.impl.bottomsheet.a$a$b */
        public static final class b implements C2078a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f93262a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -755996242;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/boka/impl/bottomsheet/a$a$c;", "Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;", "", "bookingUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.boka.impl.bottomsheet.a$a$c */
        public static final class c implements C2078a {

            /* renamed from: a  reason: collision with root package name */
            private final String f93263a;

            public c(String str) {
                C17542s.j(str, "bookingUrl");
                this.f93263a = str;
            }

            public final String a() {
                return this.f93263a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f93263a, ((c) obj).f93263a);
            }

            public int hashCode() {
                return this.f93263a.hashCode();
            }

            public String toString() {
                String str = this.f93263a;
                return "Ready(bookingUrl=" + str + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/boka/impl/bottomsheet/a$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f93264a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, a aVar2) {
            super(aVar);
            this.f93264a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            a aVar = this.f93264a;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Failed to get booking url", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = aVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            C16505B i10 = this.f93264a.f93259n;
            do {
                value = i10.getValue();
                C2078a aVar2 = (C2078a) value;
            } while (!i10.e(value, C2078a.C2079a.f93261a));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.boka.impl.bottomsheet.BokaBottomSheetViewModel$getBookingUrl$3", f = "BokaBottomSheetViewModel.kt", l = {50, 57}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93265c;

        /* renamed from: d  reason: collision with root package name */
        Object f93266d;

        /* renamed from: e  reason: collision with root package name */
        Object f93267e;

        /* renamed from: f  reason: collision with root package name */
        Object f93268f;

        /* renamed from: g  reason: collision with root package name */
        Object f93269g;

        /* renamed from: h  reason: collision with root package name */
        Object f93270h;

        /* renamed from: i  reason: collision with root package name */
        Object f93271i;

        /* renamed from: j  reason: collision with root package name */
        Object f93272j;

        /* renamed from: k  reason: collision with root package name */
        Object f93273k;

        /* renamed from: l  reason: collision with root package name */
        Object f93274l;

        /* renamed from: m  reason: collision with root package name */
        Object f93275m;

        /* renamed from: n  reason: collision with root package name */
        Object f93276n;

        /* renamed from: o  reason: collision with root package name */
        int f93277o;

        /* renamed from: p  reason: collision with root package name */
        int f93278p;

        /* renamed from: q  reason: collision with root package name */
        int f93279q;

        /* renamed from: r  reason: collision with root package name */
        int f93280r;

        /* renamed from: s  reason: collision with root package name */
        int f93281s;

        /* renamed from: t  reason: collision with root package name */
        int f93282t;

        /* renamed from: u  reason: collision with root package name */
        int f93283u;

        /* renamed from: v  reason: collision with root package name */
        private /* synthetic */ Object f93284v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ a f93285w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f93285w = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f93285w, eVar);
            cVar.f93284v = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            a aVar;
            C16505B i10;
            Object value;
            Object obj2;
            Q q10;
            Object obj3;
            int i11;
            ArrayList arrayList;
            Object obj4;
            Object obj5;
            String str;
            String str2;
            ArrayList arrayList2;
            Object obj6;
            Object value2;
            Object f10 = C17187b.f();
            int i12 = this.f93283u;
            if (i12 == 0) {
                y.b(obj);
                q10 = (Q) this.f93284v;
                Xm.a h10 = this.f93285w.f93258m;
                this.f93284v = q10;
                this.f93283u = 1;
                obj2 = h10.a(this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i12 == 1) {
                q10 = (Q) this.f93284v;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else if (i12 == 2) {
                Iterator it = (Iterator) this.f93275m;
                Iterable iterable = (Iterable) this.f93274l;
                String str3 = (String) this.f93273k;
                String str4 = (String) this.f93272j;
                e eVar = (e) this.f93271i;
                Q q11 = (Q) this.f93270h;
                Q q12 = (Q) this.f93269g;
                Throwable th2 = (Throwable) this.f93268f;
                aVar = (a) this.f93267e;
                a aVar2 = (a) this.f93266d;
                Q q13 = (Q) this.f93284v;
                y.b(obj);
                i10 = aVar.f93259n;
                do {
                    value = i10.getValue();
                    C2078a aVar3 = (C2078a) value;
                } while (!i10.e(value, C2078a.C2079a.f93261a));
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar4 = this.f93285w;
            Throwable e10 = x.e(obj2);
            String str5 = DslKt.INDICATOR_BACKGROUND;
            String str6 = DslKt.MAIN_THREAD_NAME;
            String str7 = "Kt";
            char c10 = '$';
            int i13 = 0;
            if (e10 == null) {
                Zm.a aVar5 = (Zm.a) obj2;
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList3.add(next);
                    }
                }
                String str8 = null;
                String str9 = null;
                for (C11819b bVar : arrayList3) {
                    if (str8 == null) {
                        String a10 = C11818a.a("Got booking url: " + aVar5, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str8 = C11820c.a(a10);
                    }
                    if (str9 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, str7);
                        }
                        str9 = (C15854t.b0(Thread.currentThread().getName(), str6, true) ? DslKt.INDICATOR_MAIN : str5) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar2, str9, false, (Throwable) null, str8);
                    c10 = '$';
                }
                C16505B i14 = aVar4.f93259n;
                do {
                    value2 = i14.getValue();
                    C2078a aVar6 = (C2078a) value2;
                } while (!i14.e(value2, new C2078a.c(aVar5.a())));
                return C16807N.f139792a;
            }
            e eVar3 = e.WARN;
            ArrayList arrayList4 = new ArrayList();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar3, false)) {
                    arrayList4.add(next2);
                }
            }
            Iterator it2 = arrayList4.iterator();
            Object obj7 = arrayList4;
            String str10 = null;
            String str11 = null;
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = f10;
                    i11 = i13;
                    arrayList = arrayList4;
                    obj4 = obj7;
                    break;
                }
                obj7 = it2.next();
                C11819b bVar2 = (C11819b) obj7;
                if (str10 == null) {
                    String a11 = C11818a.a("Failed to fetch booking url", e10);
                    if (a11 == null) {
                        obj3 = f10;
                        arrayList = arrayList4;
                        obj4 = obj7;
                        i11 = 0;
                        break;
                    }
                    str10 = C11820c.a(a11);
                }
                String str12 = str10;
                if (str11 == null) {
                    String name2 = q10.getClass().getName();
                    C17542s.g(name2);
                    arrayList2 = arrayList4;
                    str2 = str5;
                    obj6 = null;
                    obj5 = f10;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, str7);
                    }
                    str = (C15854t.b0(Thread.currentThread().getName(), str6, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    obj5 = f10;
                    arrayList2 = arrayList4;
                    str2 = str5;
                    obj6 = null;
                    str = str11;
                }
                Object obj8 = obj6;
                str11 = str;
                bVar2.a(eVar3, str11, false, e10, str12);
                i13 = 0;
                arrayList4 = arrayList2;
                str7 = str7;
                str10 = str12;
                str5 = str2;
                f10 = obj5;
                str6 = str6;
            }
            this.f93284v = q10;
            this.f93265c = obj2;
            this.f93266d = aVar4;
            this.f93267e = aVar4;
            this.f93268f = e10;
            this.f93269g = q10;
            this.f93270h = q10;
            this.f93271i = eVar3;
            this.f93272j = str10;
            this.f93273k = str11;
            this.f93274l = arrayList;
            this.f93275m = it2;
            this.f93276n = obj4;
            this.f93277o = i11;
            this.f93278p = i11;
            this.f93279q = i11;
            this.f93280r = i11;
            this.f93281s = i11;
            this.f93282t = i11;
            this.f93283u = 2;
            Object obj9 = obj3;
            if (C16297b0.b(400, this) == obj9) {
                return obj9;
            }
            aVar = aVar4;
            i10 = aVar.f93259n;
            do {
                value = i10.getValue();
                C2078a aVar32 = (C2078a) value;
            } while (!i10.e(value, C2078a.C2079a.f93261a));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;", "it", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.boka.impl.bottomsheet.BokaBottomSheetViewModel$state$1", f = "BokaBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<C2078a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93286c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f93287d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f93288e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f93288e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f93288e, eVar);
            dVar.f93287d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(C2078a aVar, C17164e<? super C16807N> eVar) {
            return ((d) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93286c == 0) {
                y.b(obj);
                C2078a aVar = (C2078a) this.f93287d;
                a aVar2 = this.f93288e;
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("BokaBottomSheetViewModel: emitting state: " + aVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar2.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(Xm.a aVar) {
        C17542s.j(aVar, "bookingUrlRepository");
        this.f93258m = aVar;
        C16505B<C2078a> a10 = C16521S.a(C2078a.b.f93262a);
        this.f93259n = a10;
        this.f93260o = C16534i.c0(C16534i.R(a10, new d(this, (C17164e<? super d>) null)), g0.a(this), ip.f.a(), a10.getValue());
        C();
    }

    private final void C() {
        C2078a value;
        C16505B<C2078a> b10 = this.f93259n;
        do {
            value = b10.getValue();
            C2078a aVar = value;
        } while (!b10.e(value, C2078a.b.f93262a));
        F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }

    public final C16519P<C2078a> getState() {
        return this.f93260o;
    }
}
