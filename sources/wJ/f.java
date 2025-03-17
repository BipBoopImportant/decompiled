package Wj;

import GJ.C15765h;
import GJ.C15768k;
import H2.k;
import QJ.C16297b0;
import QJ.C16310i;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.util.SparseArray;
import dI.C17164e;
import dI.C17169j;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import ya.b;
import ya.c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001a!B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\t*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\b\u0012\u0004\u0012\u00020\b0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007*\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010 8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b!\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R0\u00104\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c00\u0012\u0006\u0012\u0004\u0018\u0001010/8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"LWj/f;", "LWj/b;", "LWj/g;", "LQJ/Q;", "scope", "<init>", "(LQJ/Q;)V", "Lya/b$a;", "Lza/a;", "LGJ/h;", "m", "(Lya/b$a;)LGJ/h;", "detections", "", "LWj/f$a;", "k", "(LGJ/h;Lya/b$a;)Ljava/util/List;", "", "", "i", "()Ljava/util/Map;", "LWj/f$b;", "o", "(Ljava/util/Map;)LWj/f$b;", "h", "(LWj/f$b;)Lya/b$a;", "a", "(Lya/b$a;)Lya/b$a;", "LXH/N;", "release", "()V", "LQJ/Q;", "Lya/b$b;", "b", "Lya/b$b;", "j", "()Lya/b$b;", "(Lya/b$b;)V", "processor", "", "c", "Ljava/util/List;", "candidates", "LQJ/F0;", "d", "LQJ/F0;", "job", "Lkotlin/Function2;", "LdI/e;", "", "e", "LnI/p;", "callback", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements b, g {

    /* renamed from: a  reason: collision with root package name */
    private final Q f88869a;

    /* renamed from: b  reason: collision with root package name */
    private b.C0937b<za.a> f88870b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f88871c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private F0 f88872d;

    /* renamed from: e  reason: collision with root package name */
    private final p<Q, C17164e<? super C16807N>, Object> f88873e = new c(this, (C17164e<? super c>) null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"LWj/f$a;", "", "Lza/a;", "barcode", "Lya/c$b;", "metadata", "", "isOperational", "<init>", "(Lza/a;Lya/c$b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lza/a;", "()Lza/a;", "b", "Lya/c$b;", "()Lya/c$b;", "c", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final za.a f88874a;

        /* renamed from: b  reason: collision with root package name */
        private final c.b f88875b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f88876c;

        public a(za.a aVar, c.b bVar, boolean z10) {
            C17542s.j(aVar, "barcode");
            C17542s.j(bVar, "metadata");
            this.f88874a = aVar;
            this.f88875b = bVar;
            this.f88876c = z10;
        }

        public final za.a a() {
            return this.f88874a;
        }

        public final c.b b() {
            return this.f88875b;
        }

        public final boolean c() {
            return this.f88876c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f88874a, aVar.f88874a) && C17542s.e(this.f88875b, aVar.f88875b) && this.f88876c == aVar.f88876c;
        }

        public int hashCode() {
            return (((this.f88874a.hashCode() * 31) + this.f88875b.hashCode()) * 31) + Boolean.hashCode(this.f88876c);
        }

        public String toString() {
            za.a aVar = this.f88874a;
            c.b bVar = this.f88875b;
            boolean z10 = this.f88876c;
            return "ScannedResult(barcode=" + aVar + ", metadata=" + bVar + ", isOperational=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\f¨\u0006\u0016"}, d2 = {"LWj/f$b;", "", "LWj/f$a;", "result", "", "count", "<init>", "(LWj/f$a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWj/f$a;", "b", "()LWj/f$a;", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final a f88877a;

        /* renamed from: b  reason: collision with root package name */
        private final int f88878b;

        public b(a aVar, int i10) {
            C17542s.j(aVar, "result");
            this.f88877a = aVar;
            this.f88878b = i10;
        }

        public final int a() {
            return this.f88878b;
        }

        public final a b() {
            return this.f88877a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f88877a, bVar.f88877a) && this.f88878b == bVar.f88878b;
        }

        public int hashCode() {
            return (this.f88877a.hashCode() * 31) + Integer.hashCode(this.f88878b);
        }

        public String toString() {
            a aVar = this.f88877a;
            int i10 = this.f88878b;
            return "TopResult(result=" + aVar + ", count=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scannerbase.filter.MajorityFilter$callback$1", f = "MajorityFilter.kt", l = {40}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88879c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f88880d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f88880d = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f88880d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            b.C0937b<za.a> j10;
            Object f10 = C17187b.f();
            int i10 = this.f88879c;
            if (i10 == 0) {
                y.b(obj);
                this.f88879c = 1;
                if (C16297b0.b(1000, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = this.f88880d;
            b.a e10 = fVar.h(fVar.o(fVar.i()));
            if (!(e10 == null || (j10 = this.f88880d.j()) == null)) {
                j10.a(e10);
            }
            this.f88880d.release();
            return C16807N.f139792a;
        }
    }

    public f(Q q10) {
        C17542s.j(q10, "scope");
        this.f88869a = q10;
    }

    /* access modifiers changed from: private */
    public final b.a<za.a> h(b bVar) {
        if (bVar == null) {
            return null;
        }
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, bVar.b().a());
        return new b.a<>(sparseArray, bVar.b().b(), bVar.b().c());
    }

    /* access modifiers changed from: private */
    public final Map<a, Integer> i() {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a aVar : C16877v.t1(this.f88871c)) {
            Iterator it = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((a) obj).a().f58576b, aVar.a().f58576b)) {
                    break;
                }
            }
            a aVar2 = (a) obj;
            if (aVar2 != null) {
                aVar = aVar2;
            }
            Integer num = (Integer) linkedHashMap.get(aVar);
            linkedHashMap.put(aVar, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
        return linkedHashMap;
    }

    private final List<a> k(C15765h<? extends za.a> hVar, b.a<za.a> aVar) {
        return C15768k.a0(C15768k.T(hVar, new d(aVar)));
    }

    /* access modifiers changed from: private */
    public static final a l(b.a aVar, za.a aVar2) {
        if (aVar2 == null) {
            return null;
        }
        c.b c10 = aVar.c();
        C17542s.i(c10, "getFrameMetadata(...)");
        return new a(aVar2, c10, aVar.a());
    }

    private final C15765h<za.a> m(b.a<za.a> aVar) {
        SparseArray<za.a> b10 = aVar.b();
        C17542s.i(b10, "getDetectedItems(...)");
        return C15768k.H(C15768k.h(k.b(b10)), new e());
    }

    /* access modifiers changed from: private */
    public static final boolean n(za.a aVar) {
        Vj.a a10 = Vj.a.f88655c.a(aVar.f58575a);
        String str = aVar.f58576b;
        C17542s.i(str, "rawValue");
        return a10.c(str);
    }

    /* access modifiers changed from: private */
    public final b o(Map<a, Integer> map) {
        Object obj;
        Iterator it = C16877v.t1(map.entrySet()).iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Map.Entry) obj).getValue()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((Map.Entry) next).getValue()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return new b((a) entry.getKey(), ((Number) entry.getValue()).intValue());
        }
        return null;
    }

    public b.a<za.a> a(b.a<za.a> aVar) {
        b o10;
        C17542s.j(aVar, "detections");
        SparseArray<za.a> b10 = aVar.b();
        C17542s.i(b10, "getDetectedItems(...)");
        if (b10.size() == 0) {
            return aVar;
        }
        if (this.f88871c.isEmpty() && this.f88872d == null) {
            this.f88872d = C16310i.c(this.f88869a, C17169j.f142968a, T.DEFAULT, this.f88873e);
        }
        this.f88871c.addAll(k(m(aVar), aVar));
        aVar.b().clear();
        if (this.f88871c.size() < 5 || (o10 = o(i())) == null || o10.a() < 5) {
            return aVar;
        }
        release();
        b.a<za.a> h10 = h(o10);
        return h10 == null ? aVar : h10;
    }

    public void b(b.C0937b<za.a> bVar) {
        this.f88870b = bVar;
    }

    public b.C0937b<za.a> j() {
        return this.f88870b;
    }

    public void release() {
        this.f88871c.clear();
        F0 f02 = this.f88872d;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f88872d = null;
    }
}
