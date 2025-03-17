package com.google.firebase.perf.network;

import Bc.g;
import com.google.firebase.perf.util.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

public final class a extends HttpURLConnection {

    /* renamed from: a  reason: collision with root package name */
    private final c f68608a;

    a(HttpURLConnection httpURLConnection, l lVar, g gVar) {
        super(httpURLConnection.getURL());
        this.f68608a = new c(httpURLConnection, lVar, gVar);
    }

    public void addRequestProperty(String str, String str2) {
        this.f68608a.a(str, str2);
    }

    public void connect() {
        this.f68608a.b();
    }

    public void disconnect() {
        this.f68608a.c();
    }

    public boolean equals(Object obj) {
        return this.f68608a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f68608a.d();
    }

    public int getConnectTimeout() {
        return this.f68608a.e();
    }

    public Object getContent() {
        return this.f68608a.f();
    }

    public String getContentEncoding() {
        return this.f68608a.h();
    }

    public int getContentLength() {
        return this.f68608a.i();
    }

    public long getContentLengthLong() {
        return this.f68608a.j();
    }

    public String getContentType() {
        return this.f68608a.k();
    }

    public long getDate() {
        return this.f68608a.l();
    }

    public boolean getDefaultUseCaches() {
        return this.f68608a.m();
    }

    public boolean getDoInput() {
        return this.f68608a.n();
    }

    public boolean getDoOutput() {
        return this.f68608a.o();
    }

    public InputStream getErrorStream() {
        return this.f68608a.p();
    }

    public long getExpiration() {
        return this.f68608a.q();
    }

    public String getHeaderField(int i10) {
        return this.f68608a.r(i10);
    }

    public long getHeaderFieldDate(String str, long j10) {
        return this.f68608a.t(str, j10);
    }

    public int getHeaderFieldInt(String str, int i10) {
        return this.f68608a.u(str, i10);
    }

    public String getHeaderFieldKey(int i10) {
        return this.f68608a.v(i10);
    }

    public long getHeaderFieldLong(String str, long j10) {
        return this.f68608a.w(str, j10);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f68608a.x();
    }

    public long getIfModifiedSince() {
        return this.f68608a.y();
    }

    public InputStream getInputStream() {
        return this.f68608a.z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f68608a.A();
    }

    public long getLastModified() {
        return this.f68608a.B();
    }

    public OutputStream getOutputStream() {
        return this.f68608a.C();
    }

    public Permission getPermission() {
        return this.f68608a.D();
    }

    public int getReadTimeout() {
        return this.f68608a.E();
    }

    public String getRequestMethod() {
        return this.f68608a.F();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.f68608a.G();
    }

    public String getRequestProperty(String str) {
        return this.f68608a.H(str);
    }

    public int getResponseCode() {
        return this.f68608a.I();
    }

    public String getResponseMessage() {
        return this.f68608a.J();
    }

    public URL getURL() {
        return this.f68608a.K();
    }

    public boolean getUseCaches() {
        return this.f68608a.L();
    }

    public int hashCode() {
        return this.f68608a.hashCode();
    }

    public void setAllowUserInteraction(boolean z10) {
        this.f68608a.M(z10);
    }

    public void setChunkedStreamingMode(int i10) {
        this.f68608a.N(i10);
    }

    public void setConnectTimeout(int i10) {
        this.f68608a.O(i10);
    }

    public void setDefaultUseCaches(boolean z10) {
        this.f68608a.P(z10);
    }

    public void setDoInput(boolean z10) {
        this.f68608a.Q(z10);
    }

    public void setDoOutput(boolean z10) {
        this.f68608a.R(z10);
    }

    public void setFixedLengthStreamingMode(int i10) {
        this.f68608a.S(i10);
    }

    public void setIfModifiedSince(long j10) {
        this.f68608a.U(j10);
    }

    public void setInstanceFollowRedirects(boolean z10) {
        this.f68608a.V(z10);
    }

    public void setReadTimeout(int i10) {
        this.f68608a.W(i10);
    }

    public void setRequestMethod(String str) {
        this.f68608a.X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f68608a.Y(str, str2);
    }

    public void setUseCaches(boolean z10) {
        this.f68608a.Z(z10);
    }

    public String toString() {
        return this.f68608a.toString();
    }

    public boolean usingProxy() {
        return this.f68608a.b0();
    }

    public Object getContent(Class[] clsArr) {
        return this.f68608a.g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f68608a.s(str);
    }

    public void setFixedLengthStreamingMode(long j10) {
        this.f68608a.T(j10);
    }
}
