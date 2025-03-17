package Ub;

import Tb.C9273a;
import Tb.F;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fc.C9700a;
import hc.C9771d;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final C9700a f64139a = new C9771d().j(C9273a.f63459a).k(true).i();

    private interface a<T> {
        T a(JsonReader jsonReader);
    }

    private static F.e.d.f A(JsonReader jsonReader) {
        F.e.d.f.a a10 = F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("assignments")) {
                jsonReader.skipValue();
            } else {
                a10.b(n(jsonReader, new f()));
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.d.a.b.C1101d B(JsonReader jsonReader) {
        F.e.d.a.b.C1101d.C1102a a10 = F.e.d.a.b.C1101d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals(PlaceTypes.ADDRESS)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(jsonReader.nextLong());
                    break;
                case 1:
                    a10.c(jsonReader.nextString());
                    break;
                case 2:
                    a10.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    /* access modifiers changed from: private */
    public static F.e.d.a.b.C1103e C(JsonReader jsonReader) {
        F.e.d.a.b.C1103e.C1104a a10 = F.e.d.a.b.C1103e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(n(jsonReader, new i()));
                    break;
                case 1:
                    a10.d(jsonReader.nextString());
                    break;
                case 2:
                    a10.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    /* access modifiers changed from: private */
    public static F.d.b D(JsonReader jsonReader) {
        F.d.b.a a10 = F.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a10.c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a10.b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.d E(JsonReader jsonReader) {
        F.d.a a10 = F.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a10.b(n(jsonReader, new e()));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a10.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.C1110e F(JsonReader jsonReader) {
        F.e.C1110e.a a10 = F.e.C1110e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(jsonReader.nextString());
                    break;
                case 1:
                    a10.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a10.e(jsonReader.nextString());
                    break;
                case 3:
                    a10.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    /* access modifiers changed from: private */
    public static F.e.d.a.c G(JsonReader jsonReader) {
        F.e.d.a.c.C1107a a10 = F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.d(jsonReader.nextInt());
                    break;
                case 1:
                    a10.e(jsonReader.nextString());
                    break;
                case 2:
                    a10.b(jsonReader.nextBoolean());
                    break;
                case 3:
                    a10.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F H(JsonReader jsonReader) {
        F.b b10 = F.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = 11;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b10.j(E(jsonReader));
                    break;
                case 1:
                    b10.l(jsonReader.nextString());
                    break;
                case 2:
                    b10.c(jsonReader.nextString());
                    break;
                case 3:
                    b10.b(m(jsonReader));
                    break;
                case 4:
                    b10.d(jsonReader.nextString());
                    break;
                case 5:
                    b10.f(jsonReader.nextString());
                    break;
                case 6:
                    b10.h(jsonReader.nextString());
                    break;
                case 7:
                    b10.i(jsonReader.nextString());
                    break;
                case 8:
                    b10.g(jsonReader.nextString());
                    break;
                case 9:
                    b10.k(jsonReader.nextInt());
                    break;
                case 10:
                    b10.e(jsonReader.nextString());
                    break;
                case 11:
                    b10.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b10.a();
    }

    private static F.e.d.C1109e.b I(JsonReader jsonReader) {
        F.e.d.C1109e.b.a a10 = F.e.d.C1109e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("variantId")) {
                a10.c(jsonReader.nextString());
            } else if (!nextName.equals("rolloutId")) {
                jsonReader.skipValue();
            } else {
                a10.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e J(JsonReader jsonReader) {
        F.e.b a10 = F.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c10 = 11;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.m(jsonReader.nextLong());
                    break;
                case 1:
                    a10.c(jsonReader.nextString());
                    break;
                case 2:
                    a10.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a10.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    a10.e(q(jsonReader));
                    break;
                case 5:
                    a10.g(n(jsonReader, new d()));
                    break;
                case 6:
                    a10.l(F(jsonReader));
                    break;
                case 7:
                    a10.b(l(jsonReader));
                    break;
                case 8:
                    a10.n(K(jsonReader));
                    break;
                case 9:
                    a10.h(jsonReader.nextString());
                    break;
                case 10:
                    a10.d(jsonReader.nextBoolean());
                    break;
                case 11:
                    a10.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.f K(JsonReader jsonReader) {
        F.e.f.a a10 = F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                a10.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.a l(JsonReader jsonReader) {
        F.e.a.C1095a a10 = F.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.e(jsonReader.nextString());
                    break;
                case 1:
                    a10.b(jsonReader.nextString());
                    break;
                case 2:
                    a10.c(jsonReader.nextString());
                    break;
                case 3:
                    a10.g(jsonReader.nextString());
                    break;
                case 4:
                    a10.f(jsonReader.nextString());
                    break;
                case 5:
                    a10.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.a m(JsonReader jsonReader) {
        F.a.b a10 = F.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 8;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(n(jsonReader, new a()));
                    break;
                case 1:
                    a10.d(jsonReader.nextInt());
                    break;
                case 2:
                    a10.f(jsonReader.nextLong());
                    break;
                case 3:
                    a10.h(jsonReader.nextLong());
                    break;
                case 4:
                    a10.i(jsonReader.nextLong());
                    break;
                case 5:
                    a10.e(jsonReader.nextString());
                    break;
                case 6:
                    a10.g(jsonReader.nextInt());
                    break;
                case 7:
                    a10.j(jsonReader.nextString());
                    break;
                case 8:
                    a10.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static <T> List<T> n(JsonReader jsonReader, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: private */
    public static F.a.C1093a o(JsonReader jsonReader) {
        F.a.C1093a.C1094a a10 = F.a.C1093a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.d(jsonReader.nextString());
                    break;
                case 1:
                    a10.b(jsonReader.nextString());
                    break;
                case 2:
                    a10.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    /* access modifiers changed from: private */
    public static F.c p(JsonReader jsonReader) {
        F.c.a a10 = F.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a10.b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a10.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.c q(JsonReader jsonReader) {
        F.e.c.a a10 = F.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c10 = 8;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a10.e(jsonReader.nextString());
                    break;
                case 2:
                    a10.h(jsonReader.nextLong());
                    break;
                case 3:
                    a10.b(jsonReader.nextInt());
                    break;
                case 4:
                    a10.d(jsonReader.nextLong());
                    break;
                case 5:
                    a10.c(jsonReader.nextInt());
                    break;
                case 6:
                    a10.f(jsonReader.nextString());
                    break;
                case 7:
                    a10.j(jsonReader.nextInt());
                    break;
                case 8:
                    a10.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    /* access modifiers changed from: private */
    public static F.e.d r(JsonReader jsonReader) {
        F.e.d.b a10 = F.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(u(jsonReader));
                    break;
                case 1:
                    a10.e(A(jsonReader));
                    break;
                case 2:
                    a10.b(s(jsonReader));
                    break;
                case 3:
                    a10.d(y(jsonReader));
                    break;
                case 4:
                    a10.g(jsonReader.nextString());
                    break;
                case 5:
                    a10.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.d.a s(JsonReader jsonReader) {
        F.e.d.a.C1096a a10 = F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1405314732:
                    if (nextName.equals("appProcessDetails")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1332194002:
                    if (nextName.equals("background")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1847730860:
                    if (nextName.equals("currentProcessDetails")) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(n(jsonReader, new c()));
                    break;
                case 1:
                    a10.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 2:
                    a10.f(v(jsonReader));
                    break;
                case 3:
                    a10.g(n(jsonReader, new b()));
                    break;
                case 4:
                    a10.e(n(jsonReader, new b()));
                    break;
                case 5:
                    a10.h(jsonReader.nextInt());
                    break;
                case 6:
                    a10.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    /* access modifiers changed from: private */
    public static F.e.d.a.b.C1097a t(JsonReader jsonReader) {
        F.e.d.a.b.C1097a.C1098a a10 = F.e.d.a.b.C1097a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(jsonReader.nextString());
                    break;
                case 1:
                    a10.d(jsonReader.nextLong());
                    break;
                case 2:
                    a10.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a10.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.d.c u(JsonReader jsonReader) {
        F.e.d.c.a a10 = F.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a10.c(jsonReader.nextInt());
                    break;
                case 2:
                    a10.e(jsonReader.nextInt());
                    break;
                case 3:
                    a10.d(jsonReader.nextLong());
                    break;
                case 4:
                    a10.g(jsonReader.nextLong());
                    break;
                case 5:
                    a10.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.d.a.b v(JsonReader jsonReader) {
        F.e.d.a.b.C1099b a10 = F.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(m(jsonReader));
                    break;
                case 1:
                    a10.f(n(jsonReader, new g()));
                    break;
                case 2:
                    a10.e(B(jsonReader));
                    break;
                case 3:
                    a10.c(n(jsonReader, new h()));
                    break;
                case 4:
                    a10.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.d.a.b.c w(JsonReader jsonReader) {
        F.e.d.a.b.c.C1100a a10 = F.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(n(jsonReader, new i()));
                    break;
                case 1:
                    a10.e(jsonReader.nextString());
                    break;
                case 2:
                    a10.f(jsonReader.nextString());
                    break;
                case 3:
                    a10.b(w(jsonReader));
                    break;
                case 4:
                    a10.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    /* access modifiers changed from: private */
    public static F.e.d.a.b.C1103e.C1105b x(JsonReader jsonReader) {
        F.e.d.a.b.C1103e.C1105b.C1106a a10 = F.e.d.a.b.C1103e.C1105b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.d(jsonReader.nextLong());
                    break;
                case 1:
                    a10.f(jsonReader.nextString());
                    break;
                case 2:
                    a10.e(jsonReader.nextLong());
                    break;
                case 3:
                    a10.b(jsonReader.nextString());
                    break;
                case 4:
                    a10.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static F.e.d.C1108d y(JsonReader jsonReader) {
        F.e.d.C1108d.a a10 = F.e.d.C1108d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                a10.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    /* access modifiers changed from: private */
    public static F.e.d.C1109e z(JsonReader jsonReader) {
        F.e.d.C1109e.a a10 = F.e.d.C1109e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1536268810:
                    if (nextName.equals("parameterKey")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1027290370:
                    if (nextName.equals("templateVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1098747284:
                    if (nextName.equals("rolloutVariant")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1124454216:
                    if (nextName.equals("parameterValue")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(jsonReader.nextString());
                    break;
                case 1:
                    a10.e(jsonReader.nextLong());
                    break;
                case 2:
                    a10.d(I(jsonReader));
                    break;
                case 3:
                    a10.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public F L(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            F H10 = H(jsonReader);
            jsonReader.close();
            return H10;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public String M(F f10) {
        return f64139a.b(f10);
    }

    public F.e.d j(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            F.e.d r10 = r(jsonReader);
            jsonReader.close();
            return r10;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public String k(F.e.d dVar) {
        return f64139a.b(dVar);
    }
}
