package fK;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LfK/e;", "LfK/q;", "", "", "missingFields", "message", "", "cause", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fK.e  reason: case insensitive filesystem */
public final class C17252e extends q {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f143260a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17252e(List<String> list, String str, Throwable th2) {
        super(str, th2);
        C17542s.j(list, "missingFields");
        this.f143260a = list;
    }

    public final List<String> a() {
        return this.f143260a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17252e(java.util.List<java.lang.String> r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "missingFields"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "serialName"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field '"
            r0.append(r1)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "' is required for type with serial name '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "', but it was missing"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L_0x0055
        L_0x0037:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fields "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " are required for type with serial name '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "', but they were missing"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L_0x0055:
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fK.C17252e.<init>(java.util.List, java.lang.String):void");
    }
}
