package f6;

import T5.n;
import f6.C7853d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0002\t\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u0003RV\u0010\"\u001a>\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d0\u001aj\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d`\u001e8\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010$¨\u0006&"}, d2 = {"Lf6/h;", "Lf6/j;", "<init>", "()V", "LXH/N;", "c", "Lf6/d$b;", "key", "Lf6/d$c;", "b", "(Lf6/d$b;)Lf6/d$c;", "LT5/n;", "image", "", "", "", "extras", "", "size", "e", "(Lf6/d$b;LT5/n;Ljava/util/Map;J)V", "", "d", "(Lf6/d$b;)Z", "clear", "a", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lf6/h$b;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "getCache$coil_core_release", "()Ljava/util/LinkedHashMap;", "cache", "", "I", "operationsSinceCleanUp", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f6.h  reason: case insensitive filesystem */
public final class C7857h implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f51197c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<C7853d.b, ArrayList<b>> f51198a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f51199b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf6/h$a;", "", "<init>", "()V", "", "CLEAN_UP_INTERVAL", "I", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: f6.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lf6/h$b;", "", "Ljava/lang/ref/WeakReference;", "LT5/n;", "Lcoil3/util/WeakReference;", "image", "", "", "extras", "", "size", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/util/Map;J)V", "a", "Ljava/lang/ref/WeakReference;", "b", "()Ljava/lang/ref/WeakReference;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "J", "()J", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: f6.h$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<n> f51200a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f51201b;

        /* renamed from: c  reason: collision with root package name */
        private final long f51202c;

        public b(WeakReference<n> weakReference, Map<String, ? extends Object> map, long j10) {
            this.f51200a = weakReference;
            this.f51201b = map;
            this.f51202c = j10;
        }

        public final Map<String, Object> a() {
            return this.f51201b;
        }

        public final WeakReference<n> b() {
            return this.f51200a;
        }

        public final long c() {
            return this.f51202c;
        }
    }

    private final void c() {
        int i10 = this.f51199b;
        this.f51199b = i10 + 1;
        if (i10 >= 10) {
            a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r2 = r2.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            r0 = 0
            r8.f51199b = r0
            java.util.LinkedHashMap<f6.d$b, java.util.ArrayList<f6.h$b>> r1 = r8.f51198a
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = 1
            if (r3 > r4) goto L_0x003c
            java.lang.Object r2 = YH.C16877v.y0(r2)
            f6.h$b r2 = (f6.C7857h.b) r2
            if (r2 == 0) goto L_0x0035
            java.lang.ref.WeakReference r2 = r2.b()
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r2.get()
            T5.n r2 = (T5.n) r2
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 != 0) goto L_0x000d
            r1.remove()
            goto L_0x000d
        L_0x003c:
            int r3 = r2.size()
            r4 = r0
            r5 = r4
        L_0x0042:
            if (r4 >= r3) goto L_0x005e
            int r6 = r4 - r5
            java.lang.Object r7 = r2.get(r6)
            f6.h$b r7 = (f6.C7857h.b) r7
            java.lang.ref.WeakReference r7 = r7.b()
            java.lang.Object r7 = r7.get()
            if (r7 != 0) goto L_0x005b
            r2.remove(r6)
            int r5 = r5 + 1
        L_0x005b:
            int r4 = r4 + 1
            goto L_0x0042
        L_0x005e:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x000d
            r1.remove()
            goto L_0x000d
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C7857h.a():void");
    }

    public C7853d.c b(C7853d.b bVar) {
        ArrayList arrayList = this.f51198a.get(bVar);
        C7853d.c cVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            b bVar2 = (b) arrayList.get(i10);
            n nVar = bVar2.b().get();
            C7853d.c cVar2 = nVar != null ? new C7853d.c(nVar, bVar2.a()) : null;
            if (cVar2 != null) {
                cVar = cVar2;
                break;
            }
            i10++;
        }
        c();
        return cVar;
    }

    public void clear() {
        this.f51199b = 0;
        this.f51198a.clear();
    }

    public boolean d(C7853d.b bVar) {
        return this.f51198a.remove(bVar) != null;
    }

    public void e(C7853d.b bVar, n nVar, Map<String, ? extends Object> map, long j10) {
        LinkedHashMap<C7853d.b, ArrayList<b>> linkedHashMap = this.f51198a;
        ArrayList<b> arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        b bVar2 = new b(new WeakReference(nVar), map, j10);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                b bVar3 = (b) arrayList2.get(i10);
                if (j10 < bVar3.c()) {
                    i10++;
                } else if (bVar3.b().get() == nVar) {
                    arrayList2.set(i10, bVar2);
                } else {
                    arrayList2.add(i10, bVar2);
                }
            }
        } else {
            arrayList2.add(bVar2);
        }
        c();
    }
}
