package ru;

import HJ.C15854t;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001\tB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/a;", "", "", "poiId", "", "label", "icon", "<init>", "(Ljava/lang/String;II)V", "a", "(Ljava/lang/String;II)Lru/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "I", "getLabel", "c", "Lru/a$a;", "Lru/a$a;", "getType", "()Lru/a$a;", "type", "wayfinding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ru.a  reason: case insensitive filesystem */
public final class C11847a {

    /* renamed from: a  reason: collision with root package name */
    private final String f102151a;

    /* renamed from: b  reason: collision with root package name */
    private final int f102152b;

    /* renamed from: c  reason: collision with root package name */
    private final int f102153c;

    /* renamed from: d  reason: collision with root package name */
    private final C2436a f102154d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "POI", "DEPARTMENT", "wayfinding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ru.a$a  reason: collision with other inner class name */
    public enum C2436a {
        POI,
        DEPARTMENT;

        static {
            C2436a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public C11847a(String str, int i10, int i11) {
        C17542s.j(str, "poiId");
        this.f102151a = str;
        this.f102152b = i10;
        this.f102153c = i11;
        this.f102154d = C15854t.W(str, "POI", false, 2, (Object) null) ? C2436a.POI : C2436a.DEPARTMENT;
    }

    public static /* synthetic */ C11847a b(C11847a aVar, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = aVar.f102151a;
        }
        if ((i12 & 2) != 0) {
            i10 = aVar.f102152b;
        }
        if ((i12 & 4) != 0) {
            i11 = aVar.f102153c;
        }
        return aVar.a(str, i10, i11);
    }

    public final C11847a a(String str, int i10, int i11) {
        C17542s.j(str, "poiId");
        return new C11847a(str, i10, i11);
    }

    public final int c() {
        return this.f102153c;
    }

    public final String d() {
        return this.f102151a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11847a)) {
            return false;
        }
        C11847a aVar = (C11847a) obj;
        return C17542s.e(this.f102151a, aVar.f102151a) && this.f102152b == aVar.f102152b && this.f102153c == aVar.f102153c;
    }

    public int hashCode() {
        return (((this.f102151a.hashCode() * 31) + Integer.hashCode(this.f102152b)) * 31) + Integer.hashCode(this.f102153c);
    }

    public String toString() {
        String str = this.f102151a;
        int i10 = this.f102152b;
        int i11 = this.f102153c;
        return "PoiData(poiId=" + str + ", label=" + i10 + ", icon=" + i11 + ")";
    }
}
