package com.contentsquare.android.api.bridge.flutter;

import D8.c;
import X8.b;
import a9.C6969x4;
import a9.G1;
import a9.H1;
import a9.Z3;
import android.app.Activity;
import android.view.View;
import com.contentsquare.android.internal.features.initialize.ContentsquareModule;
import com.contentsquare.android.sdk.E;
import com.contentsquare.android.sdk.G0;
import com.google.protobuf.B;
import d9.F;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;
import u8.C8886a;

public class FlutterInterface {
    private static final String FLUTTER_VIEW = "FlutterView";
    private static final c LOGGER = new c("FlutterInterface");
    private static final String PARSING_ERROR_MESSAGE = "Error while parsing %s";
    static a sBridgeEventProcessorNonStatic = new a();
    static c sFlutterBridgeSrEventProcessor = new c();
    private static boolean sIsFirstFlutterEventAdded = false;
    static f sSrListener;

    public static class a {
        public void a(String str, JSONObject jSONObject) {
            ContentsquareModule b10;
            Activity activity;
            if (Z3.f42414e == null) {
                Z3.f42414e = new Z3();
            }
            Z3 z32 = Z3.f42414e;
            if (!((z32.f42417c != null && str.equals(z32.f42416b)) || (b10 = ContentsquareModule.b()) == null || (activity = b10.d().f42433a.get()) == null)) {
                z32.f42416b = str;
                z32.a(activity, str);
            }
            C6969x4 x4Var = z32.f42417c;
            if (x4Var != null) {
                z32.f42415a.d(G0.a.a(jSONObject, x4Var));
            }
        }
    }

    @SafeVarargs
    public static void excludeExternalView(Class<? extends View>... clsArr) {
        G1.c(clsArr);
    }

    public static boolean isFirstFlutterEventAdded() {
        return sIsFirstFlutterEventAdded;
    }

    public static void registerExternalView(View view, a aVar) {
        WeakHashMap<View, a> weakHashMap = E.f46944g;
        C17542s.j(view, "view");
        C17542s.j(aVar, "externalViewGraphListener");
        E.f46944g.put(view, aVar);
    }

    public static void sendCrashReports(List<byte[]> list) {
        b i10 = b.i();
        C8886a e10 = C8886a.e();
        v8.b bVar = e10 != null ? new v8.b(e10.f()) : null;
        if (i10 == null || bVar == null) {
            LOGGER.h("Unable to initialize flutter crash processor");
        } else {
            new e(new d(bVar, i10)).b(list);
        }
    }

    public static void sendEvent(String str) {
        c cVar = LOGGER;
        cVar.f("sendEvent: " + str);
        try {
            sBridgeEventProcessorNonStatic.a(FLUTTER_VIEW, new JSONObject(str));
        } catch (JSONException e10) {
            c cVar2 = LOGGER;
            H1.a(cVar2, "Send event error while parsing " + str, e10);
        }
    }

    public static void sendSessionReplayProtoDataList(List<byte[]> list) {
        if (sSrListener != null) {
            ArrayList arrayList = new ArrayList();
            for (byte[] next : list) {
                try {
                    arrayList.add(F.B(next));
                } catch (B e10) {
                    c cVar = LOGGER;
                    H1.a(cVar, "Send error while parsing proto data at  index: " + list.indexOf(next), e10);
                }
            }
            sFlutterBridgeSrEventProcessor.b(arrayList, sSrListener);
        }
    }

    public static void setOnFlutterEventListener(f fVar) {
        sSrListener = fVar;
    }

    public static void setsIsFirstFlutterEventAdded(boolean z10) {
        sIsFirstFlutterEventAdded = z10;
    }

    public static void unRegisterExternalView(View view) {
        WeakHashMap<View, a> weakHashMap = E.f46944g;
        C17542s.j(view, "view");
        E.f46944g.remove(view);
    }
}
