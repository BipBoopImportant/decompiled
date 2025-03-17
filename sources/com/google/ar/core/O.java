package com.google.ar.core;

import java.util.Map;

final class O {

    /* renamed from: a  reason: collision with root package name */
    final Map f67695a = new N();

    O() {
    }

    static /* synthetic */ String b(byte b10, int i10, String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + b10);
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    public final synchronized AugmentedFace a(long j10, Session session) {
        Map map = this.f67695a;
        Long valueOf = Long.valueOf(j10);
        AugmentedFace augmentedFace = (AugmentedFace) map.get(valueOf);
        if (augmentedFace != null) {
            return augmentedFace;
        }
        AugmentedFace augmentedFace2 = new AugmentedFace(j10, session);
        this.f67695a.put(valueOf, augmentedFace2);
        return augmentedFace2;
    }
}
