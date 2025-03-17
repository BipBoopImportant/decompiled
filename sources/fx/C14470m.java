package fx;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\fR\u0017\u0010 \u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lfx/m;", "", "", "barHeight", "highlightBarHeight", "", "a11yDescription", "<init>", "(FLjava/lang/Float;Ljava/lang/String;)V", "a", "(FLjava/lang/Float;Ljava/lang/String;)Lfx/m;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "d", "()F", "b", "Ljava/lang/Float;", "f", "()Ljava/lang/Float;", "c", "Ljava/lang/String;", "Z", "e", "()Z", "hasHighlightBar", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fx.m  reason: case insensitive filesystem */
public final class C14470m {

    /* renamed from: a  reason: collision with root package name */
    private final float f127117a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f127118b;

    /* renamed from: c  reason: collision with root package name */
    private final String f127119c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f127120d;

    public C14470m(float f10, Float f11, String str) {
        this.f127117a = f10;
        this.f127118b = f11;
        this.f127119c = str;
        this.f127120d = f11 != null;
    }

    public static /* synthetic */ C14470m b(C14470m mVar, float f10, Float f11, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = mVar.f127117a;
        }
        if ((i10 & 2) != 0) {
            f11 = mVar.f127118b;
        }
        if ((i10 & 4) != 0) {
            str = mVar.f127119c;
        }
        return mVar.a(f10, f11, str);
    }

    public final C14470m a(float f10, Float f11, String str) {
        return new C14470m(f10, f11, str);
    }

    public final String c() {
        return this.f127119c;
    }

    public final float d() {
        return this.f127117a;
    }

    public final boolean e() {
        return this.f127120d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14470m)) {
            return false;
        }
        C14470m mVar = (C14470m) obj;
        return Float.compare(this.f127117a, mVar.f127117a) == 0 && C17542s.e(this.f127118b, mVar.f127118b) && C17542s.e(this.f127119c, mVar.f127119c);
    }

    public final Float f() {
        return this.f127118b;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.f127117a) * 31;
        Float f10 = this.f127118b;
        int i10 = 0;
        int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str = this.f127119c;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        float f10 = this.f127117a;
        Float f11 = this.f127118b;
        String str = this.f127119c;
        return "BarData(barHeight=" + f10 + ", highlightBarHeight=" + f11 + ", a11yDescription=" + str + ")";
    }
}
