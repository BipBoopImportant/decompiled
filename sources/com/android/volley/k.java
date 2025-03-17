package com.android.volley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f46225a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f46226b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f46227c;

    /* renamed from: d  reason: collision with root package name */
    public final List<g> f46228d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f46229e;

    /* renamed from: f  reason: collision with root package name */
    public final long f46230f;

    @Deprecated
    public k(int i10, byte[] bArr, Map<String, String> map, boolean z10, long j10) {
        this(i10, bArr, map, a(map), z10, j10);
    }

    private static List<g> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new g((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> b(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g next : list) {
            treeMap.put(next.a(), next.b());
        }
        return treeMap;
    }

    public k(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, b(list), list, z10, j10);
    }

    @Deprecated
    public k(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }

    private k(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f46225a = i10;
        this.f46226b = bArr;
        this.f46227c = map;
        if (list == null) {
            this.f46228d = null;
        } else {
            this.f46228d = Collections.unmodifiableList(list);
        }
        this.f46229e = z10;
        this.f46230f = j10;
    }
}
