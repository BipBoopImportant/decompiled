package com.oppwa.mobile.connect.utils;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParcelUtils {
    /* access modifiers changed from: private */
    public static /* synthetic */ Bundle a(Map map, Map map2) {
        Bundle bundle = new Bundle();
        map.forEach(new u(bundle));
        return bundle;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Bundle c(Map map, Map map2) {
        Bundle bundle = new Bundle();
        map.forEach(new p(bundle));
        return bundle;
    }

    public static Integer[] readIntegerArray(Parcel parcel) {
        return (Integer[]) Optional.ofNullable(parcel.readArray(Integer.class.getClassLoader())).map(new o()).orElse((Object) null);
    }

    public static Map<String, Integer> readIntegerMap(Parcel parcel) {
        return (Map) Optional.ofNullable(parcel.readBundle(ParcelUtils.class.getClassLoader())).map(new s()).orElse((Object) null);
    }

    public static <T extends Parcelable> Map<String, T> readParcelableMap(Parcel parcel) {
        return (Map) Optional.ofNullable(parcel.readBundle(ParcelUtils.class.getClassLoader())).map(new k()).orElse((Object) null);
    }

    public static Map<String, String> readStringMap(Parcel parcel) {
        return (Map) Optional.ofNullable(parcel.readBundle(ParcelUtils.class.getClassLoader())).map(new j()).orElse((Object) null);
    }

    public static void writeIntegerMap(Parcel parcel, Map<String, Integer> map) {
        parcel.writeBundle((Bundle) Optional.ofNullable(map).map(new n(map)).orElse((Object) null));
    }

    public static void writeParcelableMap(Parcel parcel, Map<String, ? extends Parcelable> map) {
        parcel.writeBundle((Bundle) Optional.ofNullable(map).map(new i(map)).orElse((Object) null));
    }

    public static void writeStringMap(Parcel parcel, Map<String, String> map) {
        parcel.writeBundle((Bundle) Optional.ofNullable(map).map(new l(map)).orElse((Object) null));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Bundle b(Map map, Map map2) {
        Bundle bundle = new Bundle();
        map.forEach(new r(bundle));
        return bundle;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map c(Bundle bundle) {
        HashMap hashMap = new HashMap();
        bundle.keySet().forEach(new m(hashMap, bundle));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map b(Bundle bundle) {
        HashMap hashMap = new HashMap();
        bundle.keySet().forEach(new v(hashMap, bundle));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        bundle.keySet().forEach(new t(bundle, hashMap));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer[] a(Object[] objArr) {
        return (Integer[]) Arrays.copyOf(objArr, objArr.length, Integer[].class);
    }
}
