package tF;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001a"}, d2 = {"LtF/p;", "", "", "resId", "", "formatArgs", "", "displayString", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tF.p  reason: case insensitive filesystem */
public final class C15091p {

    /* renamed from: d  reason: collision with root package name */
    public static final int f131201d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Integer f131202a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f131203b;

    /* renamed from: c  reason: collision with root package name */
    private final String f131204c;

    public C15091p() {
        this((Integer) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public final String a() {
        return this.f131204c;
    }

    public final List<Object> b() {
        return this.f131203b;
    }

    public final Integer c() {
        return this.f131202a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15091p)) {
            return false;
        }
        C15091p pVar = (C15091p) obj;
        return C17542s.e(this.f131202a, pVar.f131202a) && C17542s.e(this.f131203b, pVar.f131203b) && C17542s.e(this.f131204c, pVar.f131204c);
    }

    public int hashCode() {
        Integer num = this.f131202a;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Object> list = this.f131203b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f131204c;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        Integer num = this.f131202a;
        List<Object> list = this.f131203b;
        String str = this.f131204c;
        return "Label(resId=" + num + ", formatArgs=" + list + ", displayString=" + str + ")";
    }

    public C15091p(Integer num, List<? extends Object> list, String str) {
        this.f131202a = num;
        this.f131203b = list;
        this.f131204c = str;
        if (str == null && num == null) {
            throw new IllegalArgumentException("displayString or resId must be defined");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15091p(Integer num, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : str);
    }
}
