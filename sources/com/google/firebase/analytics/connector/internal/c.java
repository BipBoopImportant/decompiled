package com.google.firebase.analytics.connector.internal;

import Ib.a;
import K9.C6620s;
import android.os.Bundle;
import kb.C9967v;
import kb.C9970y;
import sa.D;
import sa.H;
import sa.J;
import sa.Z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final C9970y<String> f68162a = C9970y.J("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b  reason: collision with root package name */
    private static final C9967v<String> f68163b = C9967v.J("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    private static final C9967v<String> f68164c = C9967v.H("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    private static final C9967v<String> f68165d = C9967v.G("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    private static final C9967v<String> f68166e = new C9967v.a().i(J.f56089a).i(J.f56090b).k();

    /* renamed from: f  reason: collision with root package name */
    private static final C9967v<String> f68167f = C9967v.G("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static a.c a(Bundle bundle) {
        C6620s.l(bundle);
        a.c cVar = new a.c();
        Class cls = String.class;
        cVar.f60994a = (String) C6620s.l((String) D.a(bundle, "origin", cls, null));
        cVar.f60995b = (String) C6620s.l((String) D.a(bundle, "name", cls, null));
        cVar.f60996c = D.a(bundle, "value", Object.class, null);
        cVar.f60997d = (String) D.a(bundle, "trigger_event_name", cls, null);
        Class cls2 = Long.class;
        cVar.f60998e = ((Long) D.a(bundle, "trigger_timeout", cls2, 0L)).longValue();
        cVar.f60999f = (String) D.a(bundle, "timed_out_event_name", cls, null);
        Class cls3 = Bundle.class;
        cVar.f61000g = (Bundle) D.a(bundle, "timed_out_event_params", cls3, null);
        cVar.f61001h = (String) D.a(bundle, "triggered_event_name", cls, null);
        cVar.f61002i = (Bundle) D.a(bundle, "triggered_event_params", cls3, null);
        cVar.f61003j = ((Long) D.a(bundle, "time_to_live", cls2, 0L)).longValue();
        cVar.f61004k = (String) D.a(bundle, "expired_event_name", cls, null);
        cVar.f61005l = (Bundle) D.a(bundle, "expired_event_params", cls3, null);
        cVar.f61007n = ((Boolean) D.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f61006m = ((Long) D.a(bundle, "creation_timestamp", cls2, 0L)).longValue();
        cVar.f61008o = ((Long) D.a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        return cVar;
    }

    public static Bundle b(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f60994a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f60995b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f60996c;
        if (obj != null) {
            D.b(bundle, obj);
        }
        String str3 = cVar.f60997d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f60998e);
        String str4 = cVar.f60999f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.f61000g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.f61001h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.f61002i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f61003j);
        String str6 = cVar.f61004k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.f61005l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f61006m);
        bundle.putBoolean("active", cVar.f61007n);
        bundle.putLong("triggered_timestamp", cVar.f61008o);
        return bundle;
    }

    public static String c(String str) {
        String a10 = H.a(str);
        return a10 != null ? a10 : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean e(String str, Bundle bundle) {
        if (f68163b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        C9967v<String> vVar = f68165d;
        int size = vVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = vVar.get(i10);
            i10++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f68166e.contains(str2)) {
            return false;
        }
        C9967v<String> vVar = f68167f;
        int size = vVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = vVar.get(i10);
            i10++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f60994a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f60996c;
        if ((obj != null && Z.a(obj) == null) || !j(str) || !f(str, cVar.f60995b)) {
            return false;
        }
        String str2 = cVar.f61004k;
        if (str2 != null && (!e(str2, cVar.f61005l) || !h(str, cVar.f61004k, cVar.f61005l))) {
            return false;
        }
        String str3 = cVar.f61001h;
        if (str3 != null && (!e(str3, cVar.f61002i) || !h(str, cVar.f61001h, cVar.f61002i))) {
            return false;
        }
        String str4 = cVar.f60999f;
        if (str4 != null) {
            return e(str4, cVar.f61000g) && h(str, cVar.f60999f, cVar.f61000g);
        }
        return true;
    }

    public static boolean h(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!j(str) || bundle == null) {
            return false;
        }
        C9967v<String> vVar = f68165d;
        int size = vVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = vVar.get(i10);
            i10++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c10 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean i(String str) {
        return !f68162a.contains(str);
    }

    public static boolean j(String str) {
        return !f68164c.contains(str);
    }
}
