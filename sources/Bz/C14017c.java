package bz;

import XH.C16796C;
import YH.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ne.C10090b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0007R\u001a\u0010\u001c\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0007R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lbz/c;", "Lne/b;", "", "itemId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getItemId", "", "f", "Ljava/util/Map;", "params", "g", "b", "debugToken", "h", "c", "releaseToken", "i", "a", "()Ljava/util/Map;", "callbackParameters", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bz.c  reason: case insensitive filesystem */
public final class C14017c extends C10090b {

    /* renamed from: e  reason: collision with root package name */
    private final String f119020e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f119021f;

    /* renamed from: g  reason: collision with root package name */
    private final String f119022g = "ir5pud";

    /* renamed from: h  reason: collision with root package name */
    private final String f119023h = "fa478j";

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f119024i;

    public C14017c(String str) {
        C17542s.j(str, "itemId");
        this.f119020e = str;
        Map<String, String> f10 = X.f(C16796C.a("item_id", str));
        this.f119021f = f10;
        this.f119024i = f10;
    }

    public Map<String, String> a() {
        return this.f119024i;
    }

    public String b() {
        return this.f119022g;
    }

    public String c() {
        return this.f119023h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14017c) && C17542s.e(this.f119020e, ((C14017c) obj).f119020e);
    }

    public int hashCode() {
        return this.f119020e.hashCode();
    }

    public String toString() {
        String str = this.f119020e;
        return "ScanAndGoScanItemInStoreAdjustTrackerEvent(itemId=" + str + ")";
    }
}
