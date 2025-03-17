package XH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\u001f"}, d2 = {"LXH/m;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "b", "(III)I", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "(LXH/m;)I", "I", "getMajor", "getMinor", "c", "getPatch", "d", "version", "e", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.m  reason: case insensitive filesystem */
public final class C16822m implements Comparable<C16822m> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f139802e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final C16822m f139803f = C16823n.a();

    /* renamed from: a  reason: collision with root package name */
    private final int f139804a;

    /* renamed from: b  reason: collision with root package name */
    private final int f139805b;

    /* renamed from: c  reason: collision with root package name */
    private final int f139806c;

    /* renamed from: d  reason: collision with root package name */
    private final int f139807d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LXH/m$a;", "", "<init>", "()V", "", "MAX_COMPONENT_VALUE", "I", "LXH/m;", "CURRENT", "LXH/m;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XH.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C16822m(int i10, int i11, int i12) {
        this.f139804a = i10;
        this.f139805b = i11;
        this.f139806c = i12;
        this.f139807d = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    /* renamed from: a */
    public int compareTo(C16822m mVar) {
        C17542s.j(mVar, "other");
        return this.f139807d - mVar.f139807d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C16822m mVar = obj instanceof C16822m ? (C16822m) obj : null;
        if (mVar == null) {
            return false;
        }
        return this.f139807d == mVar.f139807d;
    }

    public int hashCode() {
        return this.f139807d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f139804a);
        sb2.append('.');
        sb2.append(this.f139805b);
        sb2.append('.');
        sb2.append(this.f139806c);
        return sb2.toString();
    }

    public C16822m(int i10, int i11) {
        this(i10, i11, 0);
    }
}
