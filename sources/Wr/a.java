package Wr;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LWr/a;", "", "a", "gpay-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1905a f89158a = new C1905a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LWr/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LVr/a;", "a", "(Landroid/content/Context;)LVr/a;", "gpay-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wr.a$a  reason: collision with other inner class name */
    public static final class C1905a {
        public /* synthetic */ C1905a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Vr.a a(Context context) {
            C17542s.j(context, "context");
            PaymentsClient a10 = b.a(context, new b.a.C0825a().b(1).a());
            C17542s.i(a10, "getPaymentsClient(...)");
            return new Vr.b(a10);
        }

        private C1905a() {
        }
    }
}
