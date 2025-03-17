package a9;

import com.contentsquare.android.sdk.C7156v0;
import com.contentsquare.android.sdk.k1;
import kotlin.jvm.internal.C17542s;

public final class D3 {

    /* renamed from: a  reason: collision with root package name */
    public final k1 f41952a;

    /* renamed from: b  reason: collision with root package name */
    public final k1 f41953b;

    /* renamed from: c  reason: collision with root package name */
    public final C7156v0 f41954c;

    /* renamed from: d  reason: collision with root package name */
    public final L4 f41955d;

    /* renamed from: e  reason: collision with root package name */
    public final L4 f41956e;

    public D3() {
        this((k1.a) null, (k1) null, (C7156v0) null, (L4) null, (L4) null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D3)) {
            return false;
        }
        D3 d32 = (D3) obj;
        return C17542s.e(this.f41952a, d32.f41952a) && C17542s.e(this.f41953b, d32.f41953b) && C17542s.e(this.f41954c, d32.f41954c) && C17542s.e(this.f41955d, d32.f41955d) && C17542s.e(this.f41956e, d32.f41956e);
    }

    public final int hashCode() {
        k1 k1Var = this.f41952a;
        int i10 = 0;
        int hashCode = (k1Var == null ? 0 : k1Var.hashCode()) * 31;
        k1 k1Var2 = this.f41953b;
        int hashCode2 = (hashCode + (k1Var2 == null ? 0 : k1Var2.hashCode())) * 31;
        C7156v0 v0Var = this.f41954c;
        int hashCode3 = (hashCode2 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        L4 l42 = this.f41955d;
        int hashCode4 = (hashCode3 + (l42 == null ? 0 : l42.hashCode())) * 31;
        L4 l43 = this.f41956e;
        if (l43 != null) {
            i10 = l43.hashCode();
        }
        return hashCode4 + i10;
    }

    public final String toString() {
        return "DialogState(titleText=" + this.f41952a + ", summaryText=" + this.f41953b + ", progressType=" + this.f41954c + ", primaryButton=" + this.f41955d + ", secondaryButton=" + this.f41956e + ')';
    }

    public D3(k1.a aVar, k1 k1Var, C7156v0 v0Var, L4 l42, L4 l43, int i10) {
        aVar = (i10 & 1) != 0 ? null : aVar;
        k1Var = (i10 & 2) != 0 ? null : k1Var;
        v0Var = (i10 & 4) != 0 ? null : v0Var;
        l42 = (i10 & 8) != 0 ? null : l42;
        l43 = (i10 & 16) != 0 ? null : l43;
        this.f41952a = aVar;
        this.f41953b = k1Var;
        this.f41954c = v0Var;
        this.f41955d = l42;
        this.f41956e = l43;
    }
}
