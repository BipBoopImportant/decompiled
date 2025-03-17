package a9;

import kotlin.jvm.internal.C17542s;
import l8.C8537a;

/* renamed from: a9.q3  reason: case insensitive filesystem */
public final class C6913q3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f42809a;

    /* renamed from: b  reason: collision with root package name */
    public final C8537a[] f42810b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f42811c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f42812d;

    public C6913q3(String str, C8537a[] aVarArr, boolean z10, Long l10, int i10) {
        aVarArr = (i10 & 2) != 0 ? new C8537a[0] : aVarArr;
        z10 = (i10 & 4) != 0 ? false : z10;
        l10 = (i10 & 8) != 0 ? null : l10;
        C17542s.j(str, "screenName");
        C17542s.j(aVarArr, "customVars");
        this.f42809a = str;
        this.f42810b = aVarArr;
        this.f42811c = z10;
        this.f42812d = l10;
    }
}
