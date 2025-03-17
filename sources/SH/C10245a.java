package sh;

import Il.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tw.g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0015"}, d2 = {"Lsh/a;", "Ltw/g;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LIl/a;", "", "i", "()Ljava/lang/String;", "retailCode", "languageCode", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sh.a  reason: case insensitive filesystem */
public final class C10245a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f76554a;

    public C10245a(a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f76554a = aVar;
    }

    public String a() {
        return this.f76554a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10245a) {
            C10245a aVar = (C10245a) obj;
            return C17542s.e(aVar.i(), i()) && C17542s.e(aVar.a(), a());
        }
    }

    public int hashCode() {
        return (i().hashCode() * 31) + a().hashCode();
    }

    public String i() {
        return this.f76554a.i();
    }
}
