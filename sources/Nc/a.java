package Nc;

import Nc.b;
import android.util.Log;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014RT\u0010\u0018\u001aB\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r \u0016* \u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r\u0018\u00010\u00100\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"LNc/a;", "", "<init>", "()V", "LNc/b$a;", "subscriberName", "LXH/N;", "a", "(LNc/b$a;)V", "LNc/b;", "subscriber", "e", "(LNc/b;)V", "LNc/a$a;", "b", "(LNc/b$a;)LNc/a$a;", "", "c", "(LdI/e;)Ljava/lang/Object;", "d", "(LNc/b$a;)LNc/b;", "", "kotlin.jvm.PlatformType", "Ljava/util/Map;", "dependencies", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f61986a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<b.a, C1040a> f61987b = Collections.synchronizedMap(new LinkedHashMap());

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LNc/a$a;", "", "LbK/a;", "mutex", "LNc/b;", "subscriber", "<init>", "(LbK/a;LNc/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LbK/a;", "()LbK/a;", "b", "LNc/b;", "()LNc/b;", "c", "(LNc/b;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Nc.a$a  reason: collision with other inner class name */
    private static final class C1040a {

        /* renamed from: a  reason: collision with root package name */
        private final C17052a f61988a;

        /* renamed from: b  reason: collision with root package name */
        private b f61989b;

        public C1040a(C17052a aVar, b bVar) {
            C17542s.j(aVar, "mutex");
            this.f61988a = aVar;
            this.f61989b = bVar;
        }

        public final C17052a a() {
            return this.f61988a;
        }

        public final b b() {
            return this.f61989b;
        }

        public final void c(b bVar) {
            this.f61989b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1040a)) {
                return false;
            }
            C1040a aVar = (C1040a) obj;
            return C17542s.e(this.f61988a, aVar.f61988a) && C17542s.e(this.f61989b, aVar.f61989b);
        }

        public int hashCode() {
            int hashCode = this.f61988a.hashCode() * 31;
            b bVar = this.f61989b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f61988a + ", subscriber=" + this.f61989b + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1040a(C17052a aVar, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i10 & 2) != 0 ? null : bVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {124}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f61990c;

        /* renamed from: d  reason: collision with root package name */
        Object f61991d;

        /* renamed from: e  reason: collision with root package name */
        Object f61992e;

        /* renamed from: f  reason: collision with root package name */
        Object f61993f;

        /* renamed from: g  reason: collision with root package name */
        Object f61994g;

        /* renamed from: h  reason: collision with root package name */
        Object f61995h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f61996i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f61997j;

        /* renamed from: k  reason: collision with root package name */
        int f61998k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f61997j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61996i = obj;
            this.f61998k |= Integer.MIN_VALUE;
            return this.f61997j.c(this);
        }
    }

    private a() {
    }

    public static final void a(b.a aVar) {
        C17542s.j(aVar, "subscriberName");
        if (aVar != b.a.PERFORMANCE) {
            Map<b.a, C1040a> map = f61987b;
            if (map.containsKey(aVar)) {
                Log.d("SessionsDependencies", "Dependency " + aVar + " already added.");
                return;
            }
            C17542s.i(map, "dependencies");
            map.put(aVar, new C1040a(g.a(true), (b) null, 2, (DefaultConstructorMarker) null));
            Log.d("SessionsDependencies", "Dependency to " + aVar + " added.");
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    private final C1040a b(b.a aVar) {
        Map<b.a, C1040a> map = f61987b;
        C17542s.i(map, "dependencies");
        C1040a aVar2 = map.get(aVar);
        if (aVar2 != null) {
            C17542s.i(aVar2, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return aVar2;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(b bVar) {
        C17542s.j(bVar, "subscriber");
        b.a b10 = bVar.b();
        C1040a b11 = f61986a.b(b10);
        if (b11.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + b10 + " already registered.");
            return;
        }
        b11.c(bVar);
        Log.d("SessionsDependencies", "Subscriber " + b10 + " registered.");
        C17052a.C3460a.c(b11.a(), (Object) null, 1, (Object) null);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: Nc.b$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super java.util.Map<Nc.b.a, ? extends Nc.b>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof Nc.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Nc.a$b r0 = (Nc.a.b) r0
            int r1 = r0.f61998k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f61998k = r1
            goto L_0x0018
        L_0x0013:
            Nc.a$b r0 = new Nc.a$b
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f61996i
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f61998k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r2 = r0.f61995h
            java.lang.Object r5 = r0.f61994g
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f61993f
            bK.a r6 = (bK.C17052a) r6
            java.lang.Object r7 = r0.f61992e
            Nc.b$a r7 = (Nc.b.a) r7
            java.lang.Object r8 = r0.f61991d
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f61990c
            java.util.Map r9 = (java.util.Map) r9
            XH.y.b(r11)
            goto L_0x00a2
        L_0x0040:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0048:
            XH.y.b(r11)
            java.util.Map<Nc.b$a, Nc.a$a> r11 = f61987b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.C17542s.i(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = YH.X.e(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L_0x006b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00b5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            Nc.b$a r7 = (Nc.b.a) r7
            java.lang.Object r11 = r11.getValue()
            Nc.a$a r11 = (Nc.a.C1040a) r11
            bK.a r6 = r11.a()
            r0.f61990c = r5
            r0.f61991d = r8
            r0.f61992e = r7
            r0.f61993f = r6
            r0.f61994g = r5
            r0.f61995h = r2
            r0.f61998k = r3
            java.lang.Object r11 = r6.e(r4, r0)
            if (r11 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r9 = r5
        L_0x00a2:
            Nc.a r11 = f61986a     // Catch:{ all -> 0x00b0 }
            Nc.b r11 = r11.d(r7)     // Catch:{ all -> 0x00b0 }
            r6.d(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L_0x006b
        L_0x00b0:
            r11 = move-exception
            r6.d(r4)
            throw r11
        L_0x00b5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Nc.a.c(dI.e):java.lang.Object");
    }

    public final b d(b.a aVar) {
        C17542s.j(aVar, "subscriberName");
        b b10 = b(aVar).b();
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
