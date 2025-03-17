package BJ;

import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

/* renamed from: BJ.e  reason: case insensitive filesystem */
public abstract class C15470e<K, T> extends C15466a<K, T> {

    /* renamed from: a  reason: collision with root package name */
    private C15468c<T> f133308a;

    protected C15470e(C15468c<T> cVar) {
        C17542s.j(cVar, "arrayMap");
        this.f133308a = cVar;
    }

    private final String p(C15468c<T> cVar, int i10, String str) {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i10 + " but it isn't an `" + str + '`');
        sb2.append(10);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Type: ");
        sb3.append(cVar.getClass());
        sb2.append(sb3.toString());
        sb2.append(10);
        StringBuilder sb4 = new StringBuilder();
        Map<String, Integer> b10 = i().b();
        sb4.append("[");
        sb4.append(10);
        ArrayList arrayList = new ArrayList(C16877v.y(cVar, 10));
        int i11 = 0;
        for (T next : cVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            Iterator it = b10.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Number) ((Map.Entry) obj).getValue()).intValue() == i11) {
                    break;
                }
            }
            sb4.append("  " + ((Map.Entry) obj) + '[' + i11 + "]: " + next);
            sb4.append(10);
            arrayList.add(sb4);
            i11 = i12;
        }
        sb4.append("]");
        sb4.append(10);
        String sb5 = sb4.toString();
        sb2.append("Content: " + sb5);
        sb2.append(10);
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final C15468c<T> b() {
        return this.f133308a;
    }

    /* access modifiers changed from: protected */
    public final void k(String str, T t10) {
        C17542s.j(str, "keyQualifiedName");
        C17542s.j(t10, "value");
        int e10 = i().e(str);
        int a10 = this.f133308a.a();
        if (a10 != 0) {
            if (a10 == 1) {
                C15468c<T> cVar = this.f133308a;
                try {
                    C17542s.h(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    C15480o oVar = (C15480o) cVar;
                    if (oVar.i() == e10) {
                        this.f133308a = new C15480o(t10, e10);
                        return;
                    }
                    C15469d dVar = new C15469d();
                    this.f133308a = dVar;
                    dVar.b(oVar.i(), oVar.k());
                } catch (ClassCastException e11) {
                    throw new IllegalStateException(p(cVar, 1, "OneElementArrayMap"), e11);
                }
            }
            this.f133308a.b(e10, t10);
            return;
        }
        C15468c<T> cVar2 = this.f133308a;
        if (cVar2 instanceof C15474i) {
            this.f133308a = new C15480o(t10, e10);
            return;
        }
        throw new IllegalStateException(p(cVar2, 0, "EmptyArrayMap"));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15470e() {
        /*
            r2 = this;
            BJ.i r0 = BJ.C15474i.f133321a
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BJ.C15470e.<init>():void");
    }
}
