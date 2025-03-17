package com.google.firebase.perf.network;

import Bc.g;
import com.google.firebase.perf.util.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class b extends HttpsURLConnection {

    /* renamed from: a  reason: collision with root package name */
    private final c f68609a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpsURLConnection f68610b;

    b(HttpsURLConnection httpsURLConnection, l lVar, g gVar) {
        super(httpsURLConnection.getURL());
        this.f68610b = httpsURLConnection;
        this.f68609a = new c(httpsURLConnection, lVar, gVar);
    }

    public void addRequestProperty(String str, String str2) {
        this.f68609a.a(str, str2);
    }

    public void connect() {
        this.f68609a.b();
    }

    public void disconnect() {
        this.f68609a.c();
    }

    public boolean equals(Object obj) {
        return this.f68609a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f68609a.d();
    }

    public String getCipherSuite() {
        return this.f68610b.getCipherSuite();
    }

    public int getConnectTimeout() {
        return this.f68609a.e();
    }

    public Object getContent() {
        return this.f68609a.f();
    }

    public String getContentEncoding() {
        return this.f68609a.h();
    }

    public int getContentLength() {
        return this.f68609a.i();
    }

    public long getContentLengthLong() {
        return this.f68609a.j();
    }

    public String getContentType() {
        return this.f68609a.k();
    }

    public long getDate() {
        return this.f68609a.l();
    }

    public boolean getDefaultUseCaches() {
        return this.f68609a.m();
    }

    public boolean getDoInput() {
        return this.f68609a.n();
    }

    public boolean getDoOutput() {
        return this.f68609a.o();
    }

    public InputStream getErrorStream() {
        return this.f68609a.p();
    }

    public long getExpiration() {
        return this.f68609a.q();
    }

    public String getHeaderField(int i10) {
        return this.f68609a.r(i10);
    }

    public long getHeaderFieldDate(String str, long j10) {
        return this.f68609a.t(str, j10);
    }

    public int getHeaderFieldInt(String str, int i10) {
        return this.f68609a.u(str, i10);
    }

    public String getHeaderFieldKey(int i10) {
        return this.f68609a.v(i10);
    }

    public long getHeaderFieldLong(String str, long j10) {
        return this.f68609a.w(str, j10);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f68609a.x();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f68610b.getHostnameVerifier();
    }

    public long getIfModifiedSince() {
        return this.f68609a.y();
    }

    public InputStream getInputStream() {
        return this.f68609a.z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f68609a.A();
    }

    public long getLastModified() {
        return this.f68609a.B();
    }

    public Certificate[] getLocalCertificates() {
        return this.f68610b.getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.f68610b.getLocalPrincipal();
    }

    public OutputStream getOutputStream() {
        return this.f68609a.C();
    }

    public Principal getPeerPrincipal() {
        return this.f68610b.getPeerPrincipal();
    }

    public Permission getPermission() {
        return this.f68609a.D();
    }

    public int getReadTimeout() {
        return this.f68609a.E();
    }

    public String getRequestMethod() {
        return this.f68609a.F();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.f68609a.G();
    }

    public String getRequestProperty(String str) {
        return this.f68609a.H(str);
    }

    public int getResponseCode() {
        return this.f68609a.I();
    }

    public String getResponseMessage() {
        return this.f68609a.J();
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.f68610b.getSSLSocketFactory();
    }

    public Certificate[] getServerCertificates() {
        return this.f68610b.getServerCertificates();
    }

    public URL getURL() {
        return this.f68609a.K();
    }

    public boolean getUseCaches() {
        return this.f68609a.L();
    }

    public int hashCode() {
        return this.f68609a.hashCode();
    }

    public void setAllowUserInteraction(boolean z10) {
        this.f68609a.M(z10);
    }

    public void setChunkedStreamingMode(int i10) {
        this.f68609a.N(i10);
    }

    public void setConnectTimeout(int i10) {
        this.f68609a.O(i10);
    }

    public void setDefaultUseCaches(boolean z10) {
        this.f68609a.P(z10);
    }

    public void setDoInput(boolean z10) {
        this.f68609a.Q(z10);
    }

    public void setDoOutput(boolean z10) {
        this.f68609a.R(z10);
    }

    public void setFixedLengthStreamingMode(int i10) {
        this.f68609a.S(i10);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f68610b.setHostnameVerifier(hostnameVerifier);
    }

    public void setIfModifiedSince(long j10) {
        this.f68609a.U(j10);
    }

    public void setInstanceFollowRedirects(boolean z10) {
        this.f68609a.V(z10);
    }

    public void setReadTimeout(int i10) {
        this.f68609a.W(i10);
    }

    public void setRequestMethod(String str) {
        this.f68609a.X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f68609a.Y(str, str2);
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f68610b.setSSLSocketFactory(sSLSocketFactory);
    }

    public void setUseCaches(boolean z10) {
        this.f68609a.Z(z10);
    }

    public String toString() {
        return this.f68609a.toString();
    }

    public boolean usingProxy() {
        return this.f68609a.b0();
    }

    public Object getContent(Class[] clsArr) {
        return this.f68609a.g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f68609a.s(str);
    }

    public void setFixedLengthStreamingMode(long j10) {
        this.f68609a.T(j10);
    }
}
