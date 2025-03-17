package sB;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LsB/a;", "", "LsB/a$a;", "actionType", "", "listId", "listName", "productName", "<init>", "(LsB/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LsB/a$a;", "()LsB/a$a;", "b", "Ljava/lang/String;", "c", "d", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sB.a  reason: case insensitive filesystem */
public final class C15035a {

    /* renamed from: a  reason: collision with root package name */
    private final C3239a f130928a;

    /* renamed from: b  reason: collision with root package name */
    private final String f130929b;

    /* renamed from: c  reason: collision with root package name */
    private final String f130930c;

    /* renamed from: d  reason: collision with root package name */
    private final String f130931d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LsB/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", "REMOVE", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sB.a$a  reason: collision with other inner class name */
    public enum C3239a {
        ADD,
        REMOVE;

        static {
            C3239a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public C15035a(C3239a aVar, String str, String str2, String str3) {
        C17542s.j(aVar, "actionType");
        C17542s.j(str, "listId");
        C17542s.j(str2, "listName");
        this.f130928a = aVar;
        this.f130929b = str;
        this.f130930c = str2;
        this.f130931d = str3;
    }

    public final C3239a a() {
        return this.f130928a;
    }

    public final String b() {
        return this.f130929b;
    }

    public final String c() {
        return this.f130930c;
    }

    public final String d() {
        return this.f130931d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15035a)) {
            return false;
        }
        C15035a aVar = (C15035a) obj;
        return this.f130928a == aVar.f130928a && C17542s.e(this.f130929b, aVar.f130929b) && C17542s.e(this.f130930c, aVar.f130930c) && C17542s.e(this.f130931d, aVar.f130931d);
    }

    public int hashCode() {
        int hashCode = ((((this.f130928a.hashCode() * 31) + this.f130929b.hashCode()) * 31) + this.f130930c.hashCode()) * 31;
        String str = this.f130931d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C3239a aVar = this.f130928a;
        String str = this.f130929b;
        String str2 = this.f130930c;
        String str3 = this.f130931d;
        return "ModifyListAction(actionType=" + aVar + ", listId=" + str + ", listName=" + str2 + ", productName=" + str3 + ")";
    }
}
