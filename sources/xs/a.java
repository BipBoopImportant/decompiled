package Xs;

import Zj.g;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"LXs/a;", "LZj/g;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LXH/N;", "n", "()V", "", "m", "()Z", "c", "a", "installreferrer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends g {

    /* renamed from: c  reason: collision with root package name */
    public static final C1913a f89274c = new C1913a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LXs/a$a;", "", "<init>", "()V", "", "REFERRER_HANDLED", "Ljava/lang/String;", "installreferrer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xs.a$a  reason: collision with other inner class name */
    public static final class C1913a {
        public /* synthetic */ C1913a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1913a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, "install_referrer_storage");
        C17542s.j(context, "context");
    }

    public final boolean m() {
        return h("referrerHandled", false);
    }

    public final void n() {
        e("referrerHandled", Boolean.TRUE);
    }
}
