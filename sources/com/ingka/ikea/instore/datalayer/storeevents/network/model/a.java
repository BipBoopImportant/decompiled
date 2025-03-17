package com.ingka.ikea.instore.datalayer.storeevents.network.model;

import HJ.C15854t;
import com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "rawValue", "Ljt/b$b;", "a", "(Ljava/lang/String;)Ljt/b$b;", "Ljt/b$g;", "d", "(Ljava/lang/String;)Ljt/b$g;", "Ljt/b$e;", "c", "(Ljava/lang/String;)Ljt/b$e;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$d;", "b", "(Ljava/lang/String;)Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$d;", "datalayer-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final b.C2233b a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1640381157:
                    if (str.equals("IKEA_BUSINESS_NETWORK_ONLY")) {
                        return b.C2233b.IKEA_BUSINESS_NETWORK_ONLY;
                    }
                    break;
                case -593997851:
                    if (str.equals("NO_RESTRICTIONS")) {
                        return b.C2233b.NO_RESTRICTIONS;
                    }
                    break;
                case -307060006:
                    if (str.equals("NO_RESTRICTIONS_BUSINESS")) {
                        return b.C2233b.NO_RESTRICTIONS_BUSINESS;
                    }
                    break;
                case 929776166:
                    if (str.equals("IKEA_FAMILY_ONLY")) {
                        return b.C2233b.IKEA_FAMILY_ONLY;
                    }
                    break;
            }
        }
        e eVar = e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Unknown rawValue: " + str, (Throwable) null);
                if (a10 == null) {
                    return null;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "mapLoyaltyEvent";
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        return null;
    }

    public static final RegistrationRemote.d b(String str) {
        if (C17542s.e(str, "REGISTERED")) {
            return RegistrationRemote.d.Registered;
        }
        if (C17542s.e(str, "WAITING_LIST")) {
            return RegistrationRemote.d.WaitingList;
        }
        return null;
    }

    public static final b.e c(String str) {
        C17542s.j(str, "rawValue");
        if (C17542s.e(str, "SMS")) {
            return b.e.SMS;
        }
        if (C17542s.e(str, "EMAIL")) {
            return b.e.EMAIL;
        }
        e eVar = e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Unknown rawValue: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "mapReminderType";
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        return null;
    }

    public static final b.g d(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 2448402) {
                if (hashCode != 108966002) {
                    if (hashCode == 1925346054 && str.equals("ACTIVE")) {
                        return b.g.ACTIVE;
                    }
                } else if (str.equals("FINISHED")) {
                    return b.g.FINISHED;
                }
            } else if (str.equals("PAST")) {
                return b.g.FINISHED;
            }
        }
        e eVar = e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Ignored rawValue: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "mapVisibilityState";
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        return null;
    }
}
