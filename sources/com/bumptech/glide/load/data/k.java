package com.bumptech.glide.load.data;

import F7.b;
import L7.x;
import com.bumptech.glide.load.data.e;
import java.io.InputStream;

public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final x f46595a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final b f46596a;

        public a(b bVar) {
            this.f46596a = bVar;
        }

        public Class<InputStream> a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f46596a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        x xVar = new x(inputStream, bVar);
        this.f46595a = xVar;
        xVar.mark(5242880);
    }

    public void b() {
        this.f46595a.e();
    }

    public void c() {
        this.f46595a.d();
    }

    /* renamed from: d */
    public InputStream a() {
        this.f46595a.reset();
        return this.f46595a;
    }
}
