package com.sugarcube.app.base.data.feature;

import W2.f;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import nI.p;

public final /* synthetic */ class c implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConcurrentHashMap f122940a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PreferencesDataStoreWrapper f122941b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f122942c;

    public /* synthetic */ c(ConcurrentHashMap concurrentHashMap, PreferencesDataStoreWrapper preferencesDataStoreWrapper, List list) {
        this.f122940a = concurrentHashMap;
        this.f122941b = preferencesDataStoreWrapper;
        this.f122942c = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return PreferencesDataStoreWrapper.readDataStore$lambda$2(this.f122940a, this.f122941b, this.f122942c, (f.a) obj, obj2);
    }
}
