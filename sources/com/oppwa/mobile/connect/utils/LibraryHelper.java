package com.oppwa.mobile.connect.utils;

import com.oppwa.mobile.connect.provider.Connect;
import java.util.Optional;

public class LibraryHelper {
    public static boolean isAffirmAvailable = a.f122189m.c();
    public static boolean isAfterpayPacificAvailable = a.f122187k.c();
    public static boolean isCardIOAvailable = a.CARD_IO.c();
    public static boolean isCashAppPayAvailable = a.f122188l.c();
    public static boolean isIovationAvailable = a.IOVATION.c();
    public static boolean isKlarnaAvailable = a.KLARNA.c();
    public static boolean isPlayServicesBaseAvailable = a.GOOGLE_PLAY_SERVICES_BASE.c();
    public static boolean isPlayServicesWalletAvailable = a.GOOGLE_PLAY_SERVICES_WALLET.c();
    public static boolean isSamsungPayAvailable = a.f122186j.c();
    public static boolean isThreeDS2Available = a.THREEDS_IPWORKS.c();

    private static void a(StringBuilder sb2, a aVar) {
        sb2.append("  ");
        sb2.append(aVar.a());
        Optional.ofNullable(aVar.b()).ifPresent(new d(sb2));
        sb2.append(10);
    }

    public static String getLibrariesInfo() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mSDK version: ");
        sb2.append(Connect.getVersion());
        sb2.append("\n\nLibraries configuration:\n");
        for (a aVar : a.values()) {
            if (aVar.c()) {
                a(sb2, aVar);
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(StringBuilder sb2, String str) {
        sb2.append(" version: ");
        sb2.append(str);
    }
}
