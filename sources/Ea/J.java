package ea;

import HJ.C15854t;
import L9.a;
import L9.c;
import XH.C16814e;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001dBS\b\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\rBc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J+\u0010)\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010*J+\u0010+\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010*JC\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b,\u0010-J+\u0010.\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b2\u00101J+\u00103\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b4\u00101J\u000f\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b5\u00106J\u0011\u00107\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b7\u00106J-\u0010:\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\tH\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010=\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\b=\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048GX\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8GX\u0004¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010KR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020L8G¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100L8G¢\u0006\u0006\u001a\u0004\bO\u0010NR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u001e\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00170L8Ç\u0002¢\u0006\u0006\u001a\u0004\bQ\u0010NR\u0011\u0010R\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bT\u0010SR\u0011\u0010U\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0011\u0010V\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bV\u0010SR\u0011\u0010W\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bW\u0010SR\u001e\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00170L8Ç\u0002¢\u0006\u0006\u001a\u0004\bX\u0010NR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048GX\u0004¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bY\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bZ\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\b\\\u0010\u001bR\u0011\u0010^\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\b]\u00106R\u001a\u0010\u0003\u001a\u00020\u00028GX\u0004¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b_\u0010\u001bR\u0011\u0010c\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lcom/google/android/gms/libs/identity/ClientIdentity;", "LL9/a;", "", "uid", "", "packageName", "attributionTag", "listenerId", "", "LG9/b;", "clientFeatures", "impersonator", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "pid", "clientSdkVersion", "Lcom/google/android/gms/libs/identity/ClientType;", "clientType", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientType;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/libs/identity/Impersonator;", "asImpersonator", "(Landroid/content/Context;)Lcom/google/android/gms/libs/identity/Impersonator;", "", "permissions", "checkAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "checkPermissions", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/Impersonator;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "enforceAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)V", "enforceFirstParty", "(Landroid/content/Context;)V", "enforcePackageName", "enforcePermissions", "enforceZeroParty", "forAggregation", "()Lcom/google/android/gms/libs/identity/ClientIdentity;", "getImpersonator", "impersonatee", "impersonateeListenerId", "impersonate", "(Landroid/content/Context;Lcom/google/android/gms/libs/identity/ClientIdentity;Ljava/lang/String;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "feature", "supportsFeature", "(LG9/b;)Z", "name", "", "version", "(Ljava/lang/String;J)Z", "_clientSdkVersion", "Ljava/lang/Integer;", "_clientType", "Lcom/google/android/gms/libs/identity/ClientType;", "Ljava/lang/String;", "getAttributionTag", "Ljava/util/List;", "getClientFeatures", "()Ljava/util/List;", "Lkotlin/Function1;", "getClientSdkVersion", "()LnI/l;", "getClientType", "Lcom/google/android/gms/libs/identity/ClientIdentity;", "isFirstParty", "isImpersonatedIdentity", "()Z", "isMyProcess", "isMyUid", "isMyUser", "isSystemServer", "isZeroParty", "getListenerId", "getPackageName", "I", "getPid", "getRealIdentity", "realIdentity", "getUid", "Landroid/os/UserHandle;", "getUserHandle", "()Landroid/os/UserHandle;", "userHandle", "Companion", "java.com.google.android.gms.libs.identity_identity"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class J extends a {
    public static final Parcelable.Creator<J> CREATOR = new h0();

    /* renamed from: g  reason: collision with root package name */
    public static final C7835t f50913g = new C7835t((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f50914a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50915b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50916c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50917d;

    /* renamed from: e  reason: collision with root package name */
    private final List f50918e;

    /* renamed from: f  reason: collision with root package name */
    private final J f50919f;

    static {
        Process.myUid();
        Process.myPid();
    }

    @C16814e
    public J(int i10, String str, String str2, String str3, List list, J j10) {
        C17542s.j(str, "packageName");
        if (j10 == null || !j10.zza()) {
            this.f50914a = i10;
            this.f50915b = str;
            this.f50916c = str2;
            List list2 = null;
            this.f50917d = str3 == null ? j10 != null ? j10.f50917d : null : str3;
            if (list == null) {
                list = j10 != null ? j10.f50918e : list2;
                if (list == null) {
                    list = e0.s();
                    C17542s.i(list, "of(...)");
                }
            }
            C17542s.j(list, "<this>");
            e0 t10 = e0.t(list);
            C17542s.i(t10, "copyOf(...)");
            this.f50918e = t10;
            this.f50919f = j10;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J) {
            J j10 = (J) obj;
            return this.f50914a == j10.f50914a && C17542s.e(this.f50915b, j10.f50915b) && C17542s.e(this.f50916c, j10.f50916c) && C17542s.e(this.f50917d, j10.f50917d) && C17542s.e(this.f50919f, j10.f50919f) && C17542s.e(this.f50918e, j10.f50918e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f50914a), this.f50915b, this.f50916c, this.f50917d, this.f50919f});
    }

    public final String toString() {
        int length = this.f50915b.length() + 18;
        String str = this.f50916c;
        int i10 = 0;
        StringBuilder sb2 = new StringBuilder(length + (str != null ? str.length() : 0));
        sb2.append(this.f50914a);
        sb2.append("/");
        sb2.append(this.f50915b);
        String str2 = this.f50916c;
        if (str2 != null) {
            sb2.append("[");
            if (C15854t.W(str2, this.f50915b, false, 2, (Object) null)) {
                sb2.append(str2, this.f50915b.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        if (this.f50917d != null) {
            sb2.append("/");
            String str3 = this.f50917d;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            sb2.append(Integer.toHexString(i10));
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        int i11 = this.f50914a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.u(parcel, 3, this.f50915b, false);
        c.u(parcel, 4, this.f50916c, false);
        c.u(parcel, 6, this.f50917d, false);
        c.t(parcel, 7, this.f50919f, i10, false);
        c.y(parcel, 8, this.f50918e, false);
        c.b(parcel, a10);
    }

    public final boolean zza() {
        return this.f50919f != null;
    }
}
