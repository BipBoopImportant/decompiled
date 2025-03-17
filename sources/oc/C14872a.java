package oC;

import gp.C11343b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LoC/a;", "", "Lgp/b$a;", "type", "", "taskName", "", "success", "", "timestamp", "<init>", "(Lgp/b$a;Ljava/lang/String;ZJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgp/b$a;", "getType", "()Lgp/b$a;", "b", "Ljava/lang/String;", "getTaskName", "c", "Z", "getSuccess", "()Z", "d", "J", "getTimestamp", "()J", "taskscheduler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oC.a  reason: case insensitive filesystem */
public final class C14872a {

    /* renamed from: a  reason: collision with root package name */
    private final C11343b.a f129974a;

    /* renamed from: b  reason: collision with root package name */
    private final String f129975b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f129976c;

    /* renamed from: d  reason: collision with root package name */
    private final long f129977d;

    public C14872a(C11343b.a aVar, String str, boolean z10, long j10) {
        C17542s.j(aVar, "type");
        C17542s.j(str, "taskName");
        this.f129974a = aVar;
        this.f129975b = str;
        this.f129976c = z10;
        this.f129977d = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14872a)) {
            return false;
        }
        C14872a aVar = (C14872a) obj;
        return this.f129974a == aVar.f129974a && C17542s.e(this.f129975b, aVar.f129975b) && this.f129976c == aVar.f129976c && this.f129977d == aVar.f129977d;
    }

    public int hashCode() {
        return (((((this.f129974a.hashCode() * 31) + this.f129975b.hashCode()) * 31) + Boolean.hashCode(this.f129976c)) * 31) + Long.hashCode(this.f129977d);
    }

    public String toString() {
        C11343b.a aVar = this.f129974a;
        String str = this.f129975b;
        boolean z10 = this.f129976c;
        long j10 = this.f129977d;
        return "TaskLog(type=" + aVar + ", taskName=" + str + ", success=" + z10 + ", timestamp=" + j10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14872a(C11343b.a aVar, String str, boolean z10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, z10, (i10 & 8) != 0 ? System.currentTimeMillis() : j10);
    }
}
