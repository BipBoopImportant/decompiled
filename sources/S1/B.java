package S1;

import YH.C16877v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LS1/B;", "", "", "LS1/A;", "settings", "<init>", "([LS1/A;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "getNeedsDensity$ui_text_release", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final List<A> f13314a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13315b;

    public B(A... aArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z10 = false;
        for (A a10 : aArr) {
            String c10 = a10.c();
            Object obj = linkedHashMap.get(c10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c10, obj);
            }
            ((List) obj).add(a10);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                C16877v.E(arrayList, list);
            } else {
                throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + C16877v.G0(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null) + ']').toString());
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f13314a = arrayList2;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (((A) arrayList2.get(i10)).a()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        this.f13315b = z10;
    }

    public final List<A> a() {
        return this.f13314a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && C17542s.e(this.f13314a, ((B) obj).f13314a);
    }

    public int hashCode() {
        return this.f13314a.hashCode();
    }
}
