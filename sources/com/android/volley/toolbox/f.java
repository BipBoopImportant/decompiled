package com.android.volley.toolbox;

import com.android.volley.g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f46271a;

    /* renamed from: b  reason: collision with root package name */
    private final List<g> f46272b;

    /* renamed from: c  reason: collision with root package name */
    private final int f46273c;

    /* renamed from: d  reason: collision with root package name */
    private final InputStream f46274d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f46275e;

    public f(int i10, List<g> list) {
        this(i10, list, -1, (InputStream) null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f46274d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f46275e != null) {
            return new ByteArrayInputStream(this.f46275e);
        }
        return null;
    }

    public final int b() {
        return this.f46273c;
    }

    public final List<g> c() {
        return Collections.unmodifiableList(this.f46272b);
    }

    public final int d() {
        return this.f46271a;
    }

    public f(int i10, List<g> list, int i11, InputStream inputStream) {
        this.f46271a = i10;
        this.f46272b = list;
        this.f46273c = i11;
        this.f46274d = inputStream;
        this.f46275e = null;
    }
}
