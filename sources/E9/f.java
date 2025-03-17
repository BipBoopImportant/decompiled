package E9;

import E9.a;
import K9.C6619q;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.n2;
import com.google.android.gms.internal.clearcut.y2;
import java.util.Arrays;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public y2 f35291a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f35292b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f35293c;

    /* renamed from: d  reason: collision with root package name */
    private String[] f35294d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f35295e;

    /* renamed from: f  reason: collision with root package name */
    private byte[][] f35296f;

    /* renamed from: g  reason: collision with root package name */
    private ta.a[] f35297g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f35298h;

    /* renamed from: i  reason: collision with root package name */
    public final n2 f35299i;

    public f(y2 y2Var, n2 n2Var, a.c cVar, a.c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, ta.a[] aVarArr, boolean z10) {
        this.f35291a = y2Var;
        this.f35299i = n2Var;
        this.f35293c = iArr;
        this.f35294d = null;
        this.f35295e = iArr2;
        this.f35296f = null;
        this.f35297g = null;
        this.f35298h = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return C6619q.b(this.f35291a, fVar.f35291a) && Arrays.equals(this.f35292b, fVar.f35292b) && Arrays.equals(this.f35293c, fVar.f35293c) && Arrays.equals(this.f35294d, fVar.f35294d) && C6619q.b(this.f35299i, fVar.f35299i) && C6619q.b((Object) null, (Object) null) && C6619q.b((Object) null, (Object) null) && Arrays.equals(this.f35295e, fVar.f35295e) && Arrays.deepEquals(this.f35296f, fVar.f35296f) && Arrays.equals(this.f35297g, fVar.f35297g) && this.f35298h == fVar.f35298h;
        }
    }

    public final int hashCode() {
        return C6619q.c(this.f35291a, this.f35292b, this.f35293c, this.f35294d, this.f35299i, null, null, this.f35295e, this.f35296f, this.f35297g, Boolean.valueOf(this.f35298h));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f35291a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f35292b;
        sb2.append(bArr == null ? null : new String(bArr));
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f35293c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.f35294d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f35299i);
        sb2.append(", ExtensionProducer: ");
        sb2.append((Object) null);
        sb2.append(", VeProducer: ");
        sb2.append((Object) null);
        sb2.append(", ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f35295e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f35296f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.f35297g));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f35298h);
        sb2.append("]");
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 2, this.f35291a, i10, false);
        c.g(parcel, 3, this.f35292b, false);
        c.o(parcel, 4, this.f35293c, false);
        c.v(parcel, 5, this.f35294d, false);
        c.o(parcel, 6, this.f35295e, false);
        c.h(parcel, 7, this.f35296f, false);
        c.c(parcel, 8, this.f35298h);
        c.x(parcel, 9, this.f35297g, i10, false);
        c.b(parcel, a10);
    }

    f(y2 y2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, ta.a[] aVarArr) {
        this.f35291a = y2Var;
        this.f35292b = bArr;
        this.f35293c = iArr;
        this.f35294d = strArr;
        this.f35299i = null;
        this.f35295e = iArr2;
        this.f35296f = bArr2;
        this.f35297g = aVarArr;
        this.f35298h = z10;
    }
}
