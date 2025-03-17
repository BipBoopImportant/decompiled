package Nl;

import Pl.c;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.ingka.ikea.appconfig.impl.config.MarketConfigDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LNl/a;", "", "a", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1688a f83833a = new C1688a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LNl/a$a;", "", "<init>", "()V", "Ltw/h;", "networkService", "LPl/c;", "c", "(Ltw/h;)LPl/c;", "LPl/a;", "b", "(Ltw/h;)LPl/a;", "Landroid/content/Context;", "context", "LKl/a;", "a", "(Landroid/content/Context;)LKl/a;", "Landroid/telephony/TelephonyManager;", "d", "(Landroid/content/Context;)Landroid/telephony/TelephonyManager;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nl.a$a  reason: collision with other inner class name */
    public static final class C1688a {
        public /* synthetic */ C1688a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Kl.a a(Context context) {
            C17542s.j(context, "context");
            return MarketConfigDatabase.f92869a.a(context).u();
        }

        public final Pl.a b(h hVar) {
            C17542s.j(hVar, "networkService");
            return (Pl.a) hVar.b(Pl.a.class);
        }

        public final c c(h hVar) {
            C17542s.j(hVar, "networkService");
            return (c) hVar.b(c.class);
        }

        public final TelephonyManager d(Context context) {
            C17542s.j(context, "context");
            Object systemService = context.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                return (TelephonyManager) systemService;
            }
            return null;
        }

        private C1688a() {
        }
    }
}
