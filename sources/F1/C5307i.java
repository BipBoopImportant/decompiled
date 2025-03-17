package f1;

import YH.C16877v;
import YH.X;
import f1.C5306h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R(\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR.\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00120\u001c0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Lf1/i;", "Lf1/h;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;LnI/l;)V", "value", "a", "(Ljava/lang/Object;)Z", "key", "e", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "Lf1/h$a;", "b", "(Ljava/lang/String;LnI/a;)Lf1/h$a;", "d", "()Ljava/util/Map;", "LnI/l;", "", "Ljava/util/Map;", "", "c", "valueProviders", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: f1.i  reason: case insensitive filesystem */
final class C5307i implements C5306h {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Object, Boolean> f23282a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<Object>> f23283b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<C17631a<Object>>> f23284c;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"f1/i$a", "Lf1/h$a;", "LXH/N;", "a", "()V", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f1.i$a */
    public static final class a implements C5306h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5307i f23285a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f23286b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<Object> f23287c;

        a(C5307i iVar, String str, C17631a<? extends Object> aVar) {
            this.f23285a = iVar;
            this.f23286b = str;
            this.f23287c = aVar;
        }

        public void a() {
            List list = (List) this.f23285a.f23284c.remove(this.f23286b);
            if (list != null) {
                list.remove(this.f23287c);
            }
            if (list != null && !list.isEmpty()) {
                this.f23285a.f23284c.put(this.f23286b, list);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = YH.X.z(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5307i(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r1, nI.C17642l<java.lang.Object, java.lang.Boolean> r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.f23282a = r2
            if (r1 == 0) goto L_0x000d
            java.util.Map r1 = YH.X.z(r1)
            if (r1 != 0) goto L_0x0012
        L_0x000d:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L_0x0012:
            r0.f23283b = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.f23284c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C5307i.<init>(java.util.Map, nI.l):void");
    }

    public boolean a(Object obj) {
        return this.f23282a.invoke(obj).booleanValue();
    }

    public C5306h.a b(String str, C17631a<? extends Object> aVar) {
        if (!C5308j.c(str)) {
            Map<String, List<C17631a<Object>>> map = this.f23284c;
            List<C17631a<Object>> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(aVar);
            return new a(this, str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    public Map<String, List<Object>> d() {
        Map<String, List<Object>> z10 = X.z(this.f23283b);
        for (Map.Entry next : this.f23284c.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            int i10 = 0;
            if (list.size() == 1) {
                Object invoke = ((C17631a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (a(invoke)) {
                    z10.put(str, C16877v.h(invoke));
                } else {
                    throw new IllegalStateException(C5301c.b(invoke).toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i10 < size) {
                    Object invoke2 = ((C17631a) list.get(i10)).invoke();
                    if (invoke2 == null || a(invoke2)) {
                        arrayList.add(invoke2);
                        i10++;
                    } else {
                        throw new IllegalStateException(C5301c.b(invoke2).toString());
                    }
                }
                z10.put(str, arrayList);
            }
        }
        return z10;
    }

    public Object e(String str) {
        List remove = this.f23283b.remove(str);
        if (remove == null || remove.isEmpty()) {
            return null;
        }
        if (remove.size() > 1) {
            this.f23283b.put(str, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }
}
