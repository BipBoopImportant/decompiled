package com.oppwa.mobile.connect.provider.threeds.v2;

import com.oppwa.mobile.connect.provider.threeds.v2.model.ChallengeUiType;
import com.oppwa.mobile.connect.provider.threeds.v2.model.ThreeDSConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import qE.C14945e;

class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f122125a = {"UseSDKProcessingScreen"};

    static C14945e a(ThreeDSConfig threeDSConfig, C14945e.b bVar) {
        C14945e.a aVar = new C14945e.a(Collections.singletonList(bVar), "5453473256414E58524641464B4832383333000000000000000000000000000000000000000000004333474D424D33440000384B363133583034453956360000");
        a(aVar, threeDSConfig);
        C14945e b10 = aVar.b();
        a(b10, threeDSConfig);
        return b10;
    }

    static List<String> a(ThreeDSConfig threeDSConfig) {
        HashMap hashMap = new HashMap(threeDSConfig.getClientConfigParams());
        int i10 = ChallengeUiType.toInt(threeDSConfig.getChallengeUiTypes());
        hashMap.put("DeviceRenderingInterface", a(a(threeDSConfig.getChallengeUiTypes())));
        hashMap.put("DeviceRenderingUIType", a(i10));
        hashMap.put("SDKMaxTimeout", String.valueOf(threeDSConfig.getSdkMaxTimeout()));
        hashMap.put("MaskSensitive", "true");
        hashMap.put("LogLevel", String.valueOf(2));
        List asList = Arrays.asList(f122125a);
        ArrayList arrayList = new ArrayList();
        for (String str : hashMap.keySet()) {
            if (!asList.contains(str)) {
                arrayList.add(str + "=" + ((String) hashMap.get(str)));
            }
        }
        return arrayList;
    }

    private static void a(C14945e.a aVar, ThreeDSConfig threeDSConfig) {
        aVar.c(a(threeDSConfig));
        if (threeDSConfig.getDeviceParameterBlacklist() != null) {
            aVar.d(Arrays.asList(threeDSConfig.getDeviceParameterBlacklist()));
        }
        if (threeDSConfig.getTrustedAppStores() != null) {
            aVar.f(Arrays.asList(threeDSConfig.getTrustedAppStores()));
        }
        if (threeDSConfig.getMaliciousApps() != null) {
            aVar.e(Arrays.asList(threeDSConfig.getMaliciousApps()));
        }
        aVar.a(threeDSConfig.getAppSignature());
    }

    private static void a(C14945e eVar, ThreeDSConfig threeDSConfig) {
        for (String str : f122125a) {
            String clientConfigParam = threeDSConfig.getClientConfigParam(str);
            if (clientConfigParam != null) {
                eVar.a((String) null, str, clientConfigParam);
            }
        }
    }

    private static int a(EnumSet<ChallengeUiType> enumSet) {
        Iterator<ChallengeUiType> it = enumSet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = it.next() == ChallengeUiType.HTML ? i10 | 2 : i10 | 1;
        }
        return i10;
    }

    private static String a(int i10) {
        return String.format(Locale.US, "%02d", new Object[]{Integer.valueOf(i10)});
    }
}
