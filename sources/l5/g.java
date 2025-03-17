package L5;

import L5.c;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\t\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0003R2\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006#"}, d2 = {"LL5/g;", "LL5/i;", "<init>", "()V", "LXH/N;", "e", "LL5/c$b;", "key", "LL5/c$c;", "b", "(LL5/c$b;)LL5/c$c;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "size", "c", "(LL5/c$b;Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "level", "a", "(I)V", "d", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "LL5/g$b;", "Ljava/util/LinkedHashMap;", "getCache$coil_base_release", "()Ljava/util/LinkedHashMap;", "getCache$coil_base_release$annotations", "cache", "I", "operationsSinceCleanUp", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f38295c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<c.b, ArrayList<b>> f38296a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f38297b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LL5/g$a;", "", "<init>", "()V", "", "CLEAN_UP_INTERVAL", "I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"LL5/g$b;", "", "", "identityHashCode", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "size", "<init>", "(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V", "a", "I", "c", "()I", "b", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f38298a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Bitmap> f38299b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, Object> f38300c;

        /* renamed from: d  reason: collision with root package name */
        private final int f38301d;

        public b(int i10, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i11) {
            this.f38298a = i10;
            this.f38299b = weakReference;
            this.f38300c = map;
            this.f38301d = i11;
        }

        public final WeakReference<Bitmap> a() {
            return this.f38299b;
        }

        public final Map<String, Object> b() {
            return this.f38300c;
        }

        public final int c() {
            return this.f38298a;
        }

        public final int d() {
            return this.f38301d;
        }
    }

    private final void e() {
        int i10 = this.f38297b;
        this.f38297b = i10 + 1;
        if (i10 >= 10) {
            d();
        }
    }

    public synchronized void a(int i10) {
        if (i10 >= 10 && i10 != 20) {
            d();
        }
    }

    public synchronized c.C0603c b(c.b bVar) {
        try {
            ArrayList arrayList = this.f38296a.get(bVar);
            c.C0603c cVar = null;
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
                Bitmap bitmap = bVar2.a().get();
                c.C0603c cVar2 = bitmap != null ? new c.C0603c(bitmap, bVar2.b()) : null;
                if (cVar2 != null) {
                    cVar = cVar2;
                    break;
                }
                i10++;
            }
            e();
            return cVar;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void c(c.b bVar, Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
        try {
            LinkedHashMap<c.b, ArrayList<b>> linkedHashMap = this.f38296a;
            ArrayList<b> arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(bVar, arrayList);
            }
            ArrayList arrayList2 = arrayList;
            int identityHashCode = System.identityHashCode(bitmap);
            b bVar2 = new b(identityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(bVar2);
                    break;
                }
                b bVar3 = (b) arrayList2.get(i11);
                if (i10 < bVar3.d()) {
                    i11++;
                } else if (bVar3.c() == identityHashCode && bVar3.a().get() == bitmap) {
                    arrayList2.set(i11, bVar2);
                } else {
                    arrayList2.add(i11, bVar2);
                }
            }
            e();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r2 = r2.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r8 = this;
            r0 = 0
            r8.f38297b = r0
            java.util.LinkedHashMap<L5.c$b, java.util.ArrayList<L5.g$b>> r1 = r8.f38296a
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
            L5.g$b r2 = (L5.g.b) r2
            if (r2 == 0) goto L_0x0035
            java.lang.ref.WeakReference r2 = r2.a()
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
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
            L5.g$b r7 = (L5.g.b) r7
            java.lang.ref.WeakReference r7 = r7.a()
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
        throw new UnsupportedOperationException("Method not decompiled: L5.g.d():void");
    }
}
