package g2;

import android.util.Log;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.C5519c;
import l2.e;
import l2.i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Lg2/B;", "", "Lc2/h;", "value", "", "symbol", "debugName", "<init>", "(Lc2/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "b", "()Z", "Ll2/c;", "a", "()Ll2/c;", "Lc2/h;", "Ljava/lang/String;", "c", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.B  reason: case insensitive filesystem */
public final class C5359B {

    /* renamed from: a  reason: collision with root package name */
    private h f23485a;

    /* renamed from: b  reason: collision with root package name */
    private String f23486b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23487c;

    public /* synthetic */ C5359B(h hVar, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, str, str2);
    }

    public final C5519c a() {
        h hVar = this.f23485a;
        if (hVar != null) {
            return new e(hVar.G());
        }
        String str = this.f23486b;
        if (str != null) {
            return i.M(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.f23487c + ". Using WrapContent.");
        return i.M("wrap");
    }

    public final boolean b() {
        return this.f23485a == null && this.f23486b == null;
    }

    private C5359B(h hVar, String str, String str2) {
        this.f23485a = hVar;
        this.f23486b = str;
        this.f23487c = str2;
    }
}
