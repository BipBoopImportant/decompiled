package R8;

import HJ.C15850p;
import HJ.C15854t;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16877v;
import android.util.LruCache;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001:\u00015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0016\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0013\u001a\u00028\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\t*\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u000fJ+\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020#2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%R,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)R\u001b\u00101\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00104\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100¨\u00066"}, d2 = {"LR8/c;", "", "<init>", "()V", "", "jsonPath", "LR8/c$a;", "m", "(Ljava/lang/String;)LR8/c$a;", "", "i", "(Ljava/lang/String;)Ljava/util/List;", "s", "", "q", "(Ljava/lang/String;)Z", "K", "V", "Landroid/util/LruCache;", "key", "Lkotlin/Function0;", "block", "l", "(Landroid/util/LruCache;Ljava/lang/Object;LnI/a;)Ljava/lang/Object;", "p", "(Ljava/util/List;)Ljava/util/List;", "o", "LR8/b;", "json", "allowObjectNodes", "j", "(Ljava/lang/String;LR8/b;Z)Ljava/lang/String;", "paths", "LdI/i;", "context", "LXH/N;", "f", "(Ljava/util/List;LdI/i;)V", "b", "Landroid/util/LruCache;", "getCache", "()Landroid/util/LruCache;", "getCache$annotations", "cache", "LHJ/p;", "c", "LXH/o;", "h", "()LHJ/p;", "bracketsRegex", "d", "n", "validTokenRegex", "a", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f39739a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final LruCache<String, a> f39740b = new LruCache<>(225);

    /* renamed from: c  reason: collision with root package name */
    private static final C16824o f39741c = C16825p.b(b.f39745c);

    /* renamed from: d  reason: collision with root package name */
    private static final C16824o f39742d = C16825p.b(f.f39750c);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"LR8/c$a;", "", "", "isPathValid", "", "", "tokens", "<init>", "(ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f39743a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f39744b;

        public a(boolean z10, List<String> list) {
            C17542s.j(list, "tokens");
            this.f39743a = z10;
            this.f39744b = list;
        }

        public final List<String> a() {
            return this.f39744b;
        }

        public final boolean b() {
            return this.f39743a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f39743a == aVar.f39743a && C17542s.e(this.f39744b, aVar.f39744b);
        }

        public int hashCode() {
            boolean z10 = this.f39743a;
            if (z10) {
                z10 = true;
            }
            return this.f39744b.hashCode() + ((z10 ? 1 : 0) * true);
        }

        public String toString() {
            return "CachedPath(isPathValid=" + this.f39743a + ", tokens=" + this.f39744b + ')';
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LHJ/p;", "b", "()LHJ/p;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17631a<C15850p> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f39745c = new b();

        public b() {
            super(0);
        }

        /* renamed from: b */
        public final C15850p invoke() {
            return new C15850p("[\\[\\]]");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.error.analysis.util.JSONPath$buildCache$1", f = "JSONPath.kt", l = {}, m = "invokeSuspend")
    /* renamed from: R8.c$c  reason: collision with other inner class name */
    public static final class C0639c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f39746c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<String> f39747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0639c(List<String> list, C17164e<? super C0639c> eVar) {
            super(2, eVar);
            this.f39747d = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0639c(this.f39747d, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f39746c == 0) {
                y.b(obj);
                List<String> list = this.f39747d;
                if (list != null) {
                    for (String b10 : list) {
                        a unused = c.f39739a.m(b10);
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C0639c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LR8/c$a;", "b", "()LR8/c$a;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends C17544u implements C17631a<a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f39748c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f39748c = str;
        }

        /* renamed from: b */
        public final a invoke() {
            c cVar = c.f39739a;
            return new a(true, cVar.p(cVar.i(this.f39748c)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LR8/c$a;", "b", "()LR8/c$a;"}, k = 3, mv = {1, 8, 0})
    public static final class e extends C17544u implements C17631a<a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f39749c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f39749c = str;
        }

        /* renamed from: b */
        public final a invoke() {
            c cVar = c.f39739a;
            List a10 = cVar.i(this.f39749c);
            boolean z10 = false;
            if (cVar.q(this.f39749c) && !C15854t.G(this.f39749c, ".", false, 2, (Object) null)) {
                if (!(a10 instanceof Collection) || !a10.isEmpty()) {
                    Iterator it = a10.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!c.f39739a.n().i((String) it.next())) {
                            break;
                        }
                    }
                }
                z10 = true;
            }
            return new a(z10, z10 ? c.f39739a.p(a10) : C16877v.n());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LHJ/p;", "b", "()LHJ/p;"}, k = 3, mv = {1, 8, 0})
    public static final class f extends C17544u implements C17631a<C15850p> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f39750c = new f();

        public f() {
            super(0);
        }

        /* renamed from: b */
        public final C15850p invoke() {
            return new C15850p("^([0-9]\\d*|[\\w-]+|('([^']*)'|\"([^\"]*)\"))$");
        }
    }

    private c() {
    }

    public static /* synthetic */ void g(c cVar, List list, C17168i iVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = C16311i0.b();
        }
        cVar.f(list, iVar);
    }

    private final C15850p h() {
        return (C15850p) f39741c.getValue();
    }

    /* access modifiers changed from: private */
    public final List<String> i(String str) {
        List list;
        List<String> m10 = h().m(C15854t.O0(str, "$"), 0);
        ArrayList arrayList = new ArrayList();
        for (String next : m10) {
            if (C15854t.W(next, "'", false, 2, (Object) null) || C15854t.e1(next, '\"', false, 2, (Object) null)) {
                list = C16877v.e(next);
            } else {
                List Y02 = C15854t.Y0(next, new String[]{"."}, false, 0, 6, (Object) null);
                list = new ArrayList();
                for (Object next2 : Y02) {
                    if (((String) next2).length() > 0) {
                        list.add(next2);
                    }
                }
            }
            C16877v.E(arrayList, list);
        }
        return arrayList;
    }

    public static /* synthetic */ String k(c cVar, String str, b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return cVar.j(str, bVar, z10);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [nI.a<? extends V>, nI.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> V l(android.util.LruCache<K, V> r3, K r4, nI.C17631a<? extends V> r5) {
        /*
            r2 = this;
            android.util.LruCache<java.lang.String, R8.c$a> r0 = f39740b
            monitor-enter(r0)
            java.lang.Object r1 = r3.get(r4)     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r5.invoke()     // Catch:{ all -> 0x0011 }
            r3.put(r4, r1)     // Catch:{ all -> 0x0011 }
            goto L_0x0013
        L_0x0011:
            r3 = move-exception
            goto L_0x0015
        L_0x0013:
            monitor-exit(r0)
            return r1
        L_0x0015:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.c.l(android.util.LruCache, java.lang.Object, nI.a):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final a m(String str) {
        return (a) l(f39740b, str, new e(str));
    }

    /* access modifiers changed from: private */
    public final C15850p n() {
        return (C15850p) f39742d.getValue();
    }

    /* access modifiers changed from: private */
    public final List<String> p(List<String> list) {
        ArrayList arrayList = new ArrayList(C16877v.y(list, 10));
        for (String Q02 : list) {
            arrayList.add(C15854t.Q0(C15854t.Q0(Q02, "'"), "\""));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final boolean q(String str) {
        Character ch2;
        Stack stack = new Stack();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '[') {
                stack.push(Character.valueOf(charAt));
            } else if (charAt == ']' && (stack.isEmpty() || (ch2 = (Character) stack.pop()) == null || ch2.charValue() != '[')) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public final void f(List<String> list, C17168i iVar) {
        C17542s.j(iVar, "context");
        F0 unused = C16314k.d(S.a(iVar), (C17168i) null, (T) null, new C0639c(list, (C17164e<? super C0639c>) null), 3, (Object) null);
    }

    public final String j(String str, b bVar, boolean z10) {
        Object obj;
        Integer t10;
        C17542s.j(str, "jsonPath");
        if (C15854t.v0(str) || bVar == null || !o(str)) {
            return null;
        }
        List<String> a10 = ((a) l(f39740b, str, new d(str))).a();
        Object b10 = bVar.b();
        if (b10 == null) {
            b10 = bVar.a();
        }
        for (String next : a10) {
            if (obj instanceof JSONObject) {
                obj = ((JSONObject) obj).opt(next);
            } else if (!(obj instanceof JSONArray) || (t10 = C15854t.t(next)) == null) {
                obj = null;
            } else {
                int intValue = t10.intValue();
                C17542s.h(obj, "null cannot be cast to non-null type org.json.JSONArray");
                obj = ((JSONArray) obj).opt(intValue);
            }
        }
        if ((((obj instanceof JSONObject) || (obj instanceof JSONArray)) && !z10) || obj == null) {
            return null;
        }
        return obj.toString();
    }

    public final boolean o(String str) {
        C17542s.j(str, "jsonPath");
        return m(str).b();
    }
}
