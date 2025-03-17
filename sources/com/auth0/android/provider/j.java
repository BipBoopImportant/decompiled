package com.auth0.android.provider;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0014R$\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u000e\u0010\u001c\"\u0004\b \u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b\r\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/auth0/android/provider/j;", "", "", "issuer", "audience", "Lcom/auth0/android/provider/o;", "signatureVerifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/auth0/android/provider/o;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "Lcom/auth0/android/provider/o;", "h", "()Lcom/auth0/android/provider/o;", "g", "m", "(Ljava/lang/String;)V", "organization", "e", "f", "l", "nonce", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "k", "(Ljava/lang/Integer;)V", "maxAge", "j", "clockSkew", "Ljava/util/Date;", "Ljava/util/Date;", "()Ljava/util/Date;", "i", "(Ljava/util/Date;)V", "clock", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f46350a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46351b;

    /* renamed from: c  reason: collision with root package name */
    private final o f46352c;

    /* renamed from: d  reason: collision with root package name */
    private String f46353d;

    /* renamed from: e  reason: collision with root package name */
    private String f46354e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f46355f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f46356g;

    /* renamed from: h  reason: collision with root package name */
    private Date f46357h;

    public j(String str, String str2, o oVar) {
        C17542s.j(str, "issuer");
        C17542s.j(str2, "audience");
        this.f46350a = str;
        this.f46351b = str2;
        this.f46352c = oVar;
    }

    public final String a() {
        return this.f46351b;
    }

    public final Date b() {
        return this.f46357h;
    }

    public final Integer c() {
        return this.f46356g;
    }

    public final String d() {
        return this.f46350a;
    }

    public final Integer e() {
        return this.f46355f;
    }

    public final String f() {
        return this.f46354e;
    }

    public final String g() {
        return this.f46353d;
    }

    public final o h() {
        return this.f46352c;
    }

    public final void i(Date date) {
        this.f46357h = date;
    }

    public final void j(Integer num) {
        this.f46356g = num;
    }

    public final void k(Integer num) {
        this.f46355f = num;
    }

    public final void l(String str) {
        this.f46354e = str;
    }

    public final void m(String str) {
        this.f46353d = str;
    }
}
