package F8;

import G8.e;
import android.content.Context;
import android.telephony.TelephonyDisplayInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001a"}, d2 = {"LF8/b;", "", "Landroid/content/Context;", "context", "LG8/e;", "buildInstantiable", "<init>", "(Landroid/content/Context;LG8/e;)V", "", "permission", "", "c", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/telephony/TelephonyDisplayInfo;", "telephonyDisplayInfo", "LF8/e;", "b", "(Landroid/telephony/TelephonyDisplayInfo;)LF8/e;", "", "networkSubtype", "a", "(I)LF8/e;", "d", "()Z", "Landroid/content/Context;", "LG8/e;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f35506a;

    /* renamed from: b  reason: collision with root package name */
    private final e f35507b;

    public b(Context context, e eVar) {
        C17542s.j(context, "context");
        C17542s.j(eVar, "buildInstantiable");
        this.f35506a = context;
        this.f35507b = eVar;
    }

    private final boolean c(Context context, String str) {
        return context.getApplicationContext().checkCallingOrSelfPermission(str) == 0;
    }

    public final e a(int i10) {
        if (i10 == 20) {
            return e.MOBILE_5G;
        }
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
                return e.MOBILE_2G;
            case 3:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return e.MOBILE_3G;
            case 13:
            case 15:
                return e.MOBILE_4G;
            default:
                return e.CONNECTIVITY_ERROR;
        }
    }

    public final e b(TelephonyDisplayInfo telephonyDisplayInfo) {
        C17542s.j(telephonyDisplayInfo, "telephonyDisplayInfo");
        int a10 = telephonyDisplayInfo.getOverrideNetworkType();
        return a10 != 1 ? (a10 == 2 || a10 == 3 || a10 == 5) ? e.MOBILE_5G : a(telephonyDisplayInfo.getNetworkType()) : e.MOBILE_4G;
    }

    public final boolean d() {
        Context context;
        String str = "android.permission.READ_PHONE_STATE";
        if (this.f35507b.e(33)) {
            return c(this.f35506a, str) || c(this.f35506a, "android.permission.READ_BASIC_PHONE_STATE");
        }
        if (this.f35507b.e(24)) {
            context = this.f35506a;
        } else {
            context = this.f35506a;
            str = "android.permission.ACCESS_NETWORK_STATE";
        }
        return c(context, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Context context, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new e() : eVar);
    }
}
