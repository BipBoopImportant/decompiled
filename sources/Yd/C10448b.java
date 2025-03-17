package yd;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\r\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Lyd/b;", "", "", "Lyd/P;", "supportedStatus", "<init>", "(Ljava/util/List;)V", "", "(Ljava/lang/String;)V", "b", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getSupportedStatus", "()Ljava/util/List;", "setSupportedStatus", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.b  reason: case insensitive filesystem */
public final class C10448b {

    /* renamed from: a  reason: collision with root package name */
    private List<? extends C10445P> f77915a;

    public C10448b() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final CharSequence c(C10445P p10) {
        C17542s.j(p10, "it");
        return p10.b();
    }

    public final String b() {
        return C16877v.G0(this.f77915a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C10447a(), 30, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10448b) && C17542s.e(this.f77915a, ((C10448b) obj).f77915a);
    }

    public int hashCode() {
        return this.f77915a.hashCode();
    }

    public String toString() {
        return "Config(supportedStatus=" + this.f77915a + ')';
    }

    public C10448b(List<? extends C10445P> list) {
        C17542s.j(list, "supportedStatus");
        this.f77915a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10448b(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends C10445P>) (i10 & 1) != 0 ? C16877v.n() : list);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10448b(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "supportedStatus"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r8
            java.util.List r8 = HJ.C15854t.Y0(r1, r2, r3, r4, r5, r6)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = YH.C16877v.y(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L_0x0025:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = HJ.C15854t.z1(r1)
            java.lang.String r1 = r1.toString()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "getDefault(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            yd.P r1 = yd.C10445P.valueOf(r1)
            r0.add(r1)
            goto L_0x0025
        L_0x0053:
            r7.<init>((java.util.List<? extends yd.C10445P>) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.C10448b.<init>(java.lang.String):void");
    }
}
