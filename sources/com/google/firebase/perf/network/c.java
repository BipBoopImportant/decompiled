package com.google.firebase.perf.network;

import Ac.a;
import Bc.g;
import Dc.b;
import Dc.d;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

class c {

    /* renamed from: f  reason: collision with root package name */
    private static final a f68611f = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f68612a;

    /* renamed from: b  reason: collision with root package name */
    private final g f68613b;

    /* renamed from: c  reason: collision with root package name */
    private long f68614c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f68615d = -1;

    /* renamed from: e  reason: collision with root package name */
    private final l f68616e;

    public c(HttpURLConnection httpURLConnection, l lVar, g gVar) {
        this.f68612a = httpURLConnection;
        this.f68613b = gVar;
        this.f68616e = lVar;
        gVar.t(httpURLConnection.getURL().toString());
    }

    private void a0() {
        if (this.f68614c == -1) {
            this.f68616e.g();
            long e10 = this.f68616e.e();
            this.f68614c = e10;
            this.f68613b.n(e10);
        }
        String F10 = F();
        if (F10 != null) {
            this.f68613b.j(F10);
        } else if (o()) {
            this.f68613b.j("POST");
        } else {
            this.f68613b.j("GET");
        }
    }

    public boolean A() {
        return this.f68612a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f68612a.getLastModified();
    }

    public OutputStream C() {
        try {
            OutputStream outputStream = this.f68612a.getOutputStream();
            return outputStream != null ? new b(outputStream, this.f68613b, this.f68616e) : outputStream;
        } catch (IOException e10) {
            this.f68613b.r(this.f68616e.c());
            d.d(this.f68613b);
            throw e10;
        }
    }

    public Permission D() {
        try {
            return this.f68612a.getPermission();
        } catch (IOException e10) {
            this.f68613b.r(this.f68616e.c());
            d.d(this.f68613b);
            throw e10;
        }
    }

    public int E() {
        return this.f68612a.getReadTimeout();
    }

    public String F() {
        return this.f68612a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f68612a.getRequestProperties();
    }

    public String H(String str) {
        return this.f68612a.getRequestProperty(str);
    }

    public int I() {
        a0();
        if (this.f68615d == -1) {
            long c10 = this.f68616e.c();
            this.f68615d = c10;
            this.f68613b.s(c10);
        }
        try {
            int responseCode = this.f68612a.getResponseCode();
            this.f68613b.k(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f68613b.r(this.f68616e.c());
            d.d(this.f68613b);
            throw e10;
        }
    }

    public String J() {
        a0();
        if (this.f68615d == -1) {
            long c10 = this.f68616e.c();
            this.f68615d = c10;
            this.f68613b.s(c10);
        }
        try {
            String responseMessage = this.f68612a.getResponseMessage();
            this.f68613b.k(this.f68612a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f68613b.r(this.f68616e.c());
            d.d(this.f68613b);
            throw e10;
        }
    }

    public URL K() {
        return this.f68612a.getURL();
    }

    public boolean L() {
        return this.f68612a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f68612a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f68612a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f68612a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f68612a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f68612a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f68612a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f68612a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f68612a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f68612a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f68612a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f68612a.setReadTimeout(i10);
    }

    public void X(String str) {
        this.f68612a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f68613b.u(str2);
        }
        this.f68612a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f68612a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f68612a.addRequestProperty(str, str2);
    }

    public void b() {
        if (this.f68614c == -1) {
            this.f68616e.g();
            long e10 = this.f68616e.e();
            this.f68614c = e10;
            this.f68613b.n(e10);
        }
        try {
            this.f68612a.connect();
        } catch (IOException e11) {
            this.f68613b.r(this.f68616e.c());
            d.d(this.f68613b);
            throw e11;
        }
    }

    public boolean b0() {
        return this.f68612a.usingProxy();
    }

    public void c() {
        this.f68613b.r(this.f68616e.c());
        this.f68613b.b();
        this.f68612a.disconnect();
    }

    public boolean d() {
        return this.f68612a.getAllowUserInteraction();
    }

    public int e() {
        return this.f68612a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f68612a.equals(obj);
    }

    public Object f() {
        a0();
        this.f68613b.k(this.f68612a.getResponseCode());
        try {
            Object content = this.f68612a.getContent();
            if (content instanceof InputStream) {
                this.f68613b.o(this.f68612a.getContentType());
                return new Dc.a((InputStream) content, this.f68613b, this.f68616e);
            }
            this.f68613b.o(this.f68612a.getContentType());
            this.f68613b.p((long) this.f68612a.getContentLength());
            this.f68613b.r(this.f68616e.c());
            this.f68613b.b();
            return content;
        } catch (IOException e10) {
            this.f68613b.r(this.f68616e.c());
            d.d(this.f68613b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) {
        a0();
        this.f68613b.k(this.f68612a.getResponseCode());
        try {
            Object content = this.f68612a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f68613b.o(this.f68612a.getContentType());
                return new Dc.a((InputStream) content, this.f68613b, this.f68616e);
            }
            this.f68613b.o(this.f68612a.getContentType());
            this.f68613b.p((long) this.f68612a.getContentLength());
            this.f68613b.r(this.f68616e.c());
            this.f68613b.b();
            return content;
        } catch (IOException e10) {
            this.f68613b.r(this.f68616e.c());
            d.d(this.f68613b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f68612a.getContentEncoding();
    }

    public int hashCode() {
        return this.f68612a.hashCode();
    }

    public int i() {
        a0();
        return this.f68612a.getContentLength();
    }

    public long j() {
        a0();
        return this.f68612a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f68612a.getContentType();
    }

    public long l() {
        a0();
        return this.f68612a.getDate();
    }

    public boolean m() {
        return this.f68612a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f68612a.getDoInput();
    }

    public boolean o() {
        return this.f68612a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f68613b.k(this.f68612a.getResponseCode());
        } catch (IOException unused) {
            f68611f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f68612a.getErrorStream();
        return errorStream != null ? new Dc.a(errorStream, this.f68613b, this.f68616e) : errorStream;
    }

    public long q() {
        a0();
        return this.f68612a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f68612a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f68612a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f68612a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f68612a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f68612a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f68612a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        return this.f68612a.getHeaderFieldLong(str, j10);
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f68612a.getHeaderFields();
    }

    public long y() {
        return this.f68612a.getIfModifiedSince();
    }

    public InputStream z() {
        a0();
        this.f68613b.k(this.f68612a.getResponseCode());
        this.f68613b.o(this.f68612a.getContentType());
        try {
            InputStream inputStream = this.f68612a.getInputStream();
            return inputStream != null ? new Dc.a(inputStream, this.f68613b, this.f68616e) : inputStream;
        } catch (IOException e10) {
            this.f68613b.r(this.f68616e.c());
            d.d(this.f68613b);
            throw e10;
        }
    }
}
