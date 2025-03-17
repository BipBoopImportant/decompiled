package El;

import G4.b;
import HJ.C15854t;
import android.app.Activity;
import android.content.Context;
import com.ingka.ikea.killswitch.model.BlockApp;
import com.ingka.ikea.killswitch.model.ConfigAlert;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LEl/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "configAlert", "", "b", "(Landroid/content/Context;Lcom/ingka/ikea/killswitch/model/ConfigAlert;)Z", "fteFinished", "c", "(Landroid/content/Context;Lcom/ingka/ikea/killswitch/model/ConfigAlert;Z)Z", "Lpw/b;", "blockMessageApi", "Lcom/ingka/ikea/killswitch/model/BlockApp;", "blockApp", "LXH/N;", "a", "(Landroid/content/Context;Lpw/b;Lcom/ingka/ikea/killswitch/model/BlockApp;Lcom/ingka/ikea/killswitch/model/ConfigAlert;Z)V", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80720a = new a();

    private a() {
    }

    private final boolean b(Context context, ConfigAlert configAlert) {
        return configAlert.d() > b.a(context).getLong("LAST_CONFIG_ALERT_TIME", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r4 = r5.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean c(android.content.Context r4, com.ingka.ikea.killswitch.model.ConfigAlert r5, boolean r6) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.ingka.ikea.killswitch.model.ConfigAlert$b r1 = r5.c()
            com.ingka.ikea.killswitch.model.ConfigAlert$b r2 = com.ingka.ikea.killswitch.model.ConfigAlert.b.PROMOTE_LOGIN
            if (r1 != r2) goto L_0x000f
            if (r6 != 0) goto L_0x000f
            return r0
        L_0x000f:
            boolean r4 = r3.b(r4, r5)
            if (r4 != 0) goto L_0x0016
            return r0
        L_0x0016:
            java.util.List r4 = r5.b()
            if (r4 == 0) goto L_0x0025
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0025
            r0 = 1
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: El.a.c(android.content.Context, com.ingka.ikea.killswitch.model.ConfigAlert, boolean):boolean");
    }

    public final void a(Context context, pw.b bVar, BlockApp blockApp, ConfigAlert configAlert, boolean z10) {
        boolean z11;
        ConfigAlert configAlert2;
        a aVar;
        boolean z12;
        Context context2 = context;
        pw.b bVar2 = bVar;
        C17542s.j(context2, "context");
        C17542s.j(bVar2, "blockMessageApi");
        if (blockApp != null) {
            aVar = this;
            configAlert2 = configAlert;
            z11 = z10;
            z12 = true;
        } else {
            z12 = false;
            aVar = this;
            configAlert2 = configAlert;
            z11 = z10;
        }
        boolean c10 = aVar.c(context2, configAlert2, z11);
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar3 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("disablementCheck, shouldBlockApp: " + z12 + ", shouldShowAlert: " + c10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar3.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (z12 || c10) {
            context2.startActivity(bVar2.a(context2));
            if (z12) {
                ((Activity) context2).finish();
            }
        }
    }
}
