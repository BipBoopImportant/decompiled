package com.auth0.android.provider;

import HJ.C15854t;
import XH.C16807N;
import android.text.TextUtils;
import com.auth0.android.request.internal.Jwt;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v7.C8892a;
import v7.C8893b;
import v7.C8894c;
import v7.C8895d;
import v7.C8896e;
import v7.C8897f;
import v7.C8898g;
import v7.C8899h;
import v7.C8901j;
import v7.m;
import v7.n;
import v7.o;
import v7.p;
import v7.q;
import v7.r;
import v7.s;
import v7.t;
import v7.v;
import v7.w;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/auth0/android/provider/k;", "", "<init>", "()V", "Lcom/auth0/android/request/internal/Jwt;", "token", "Lcom/auth0/android/provider/j;", "verifyOptions", "", "verifySignature", "LXH/N;", "a", "(Lcom/auth0/android/request/internal/Jwt;Lcom/auth0/android/provider/j;Z)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f46358a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/auth0/android/provider/k$a;", "", "<init>", "()V", "", "DEFAULT_CLOCK_SKEW", "I", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void a(Jwt jwt, j jVar, boolean z10) {
        int i10;
        C16807N n10;
        C17542s.j(jwt, "token");
        C17542s.j(jVar, "verifyOptions");
        if (z10) {
            o h10 = jVar.h();
            if (h10 != null) {
                h10.d(jwt);
                n10 = C16807N.f139792a;
            } else {
                n10 = null;
            }
            if (n10 == null) {
                throw new v();
            }
        }
        if (TextUtils.isEmpty(jwt.g())) {
            throw new n();
        } else if (!C17542s.e(jwt.g(), jVar.d())) {
            throw new m(jVar.d(), jwt.g());
        } else if (!TextUtils.isEmpty(jwt.m())) {
            List<String> b10 = jwt.b();
            if (b10.isEmpty()) {
                throw new C8893b();
            } else if (b10.contains(jVar.a())) {
                Calendar instance = Calendar.getInstance();
                Date b11 = jVar.b() != null ? jVar.b() : instance.getTime();
                if (jVar.c() != null) {
                    Integer c10 = jVar.c();
                    C17542s.g(c10);
                    i10 = c10.intValue();
                } else {
                    i10 = 60;
                }
                if (jwt.e() != null) {
                    instance.setTime(jwt.e());
                    instance.add(13, i10);
                    Date time = instance.getTime();
                    C17542s.g(b11);
                    if (b11.after(time)) {
                        long j10 = (long) 1000;
                        throw new C8901j(b11.getTime() / j10, Long.valueOf(time.getTime() / j10));
                    } else if (jwt.f() != null) {
                        if (jVar.f() != null) {
                            String i11 = jwt.i();
                            if (TextUtils.isEmpty(i11)) {
                                throw new p();
                            } else if (!C17542s.e(jVar.f(), i11)) {
                                throw new o(jVar.f(), i11);
                            }
                        }
                        String g10 = jVar.g();
                        if (g10 != null) {
                            if (C15854t.W(g10, "org_", false, 2, (Object) null)) {
                                String j11 = jwt.j();
                                if (TextUtils.isEmpty(j11)) {
                                    throw new r();
                                } else if (!C17542s.e(g10, j11)) {
                                    throw new q(g10, j11);
                                }
                            } else {
                                String k10 = jwt.k();
                                if (!TextUtils.isEmpty(k10)) {
                                    String lowerCase = g10.toLowerCase(Locale.ROOT);
                                    C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    if (!C17542s.e(lowerCase, k10)) {
                                        throw new s(g10, k10);
                                    }
                                } else {
                                    throw new t();
                                }
                            }
                        }
                        if (b10.size() > 1) {
                            String d10 = jwt.d();
                            if (TextUtils.isEmpty(d10)) {
                                throw new C8897f();
                            } else if (!C17542s.e(jVar.a(), d10)) {
                                throw new C8896e(jVar.a(), d10);
                            }
                        }
                        if (jVar.e() != null) {
                            Date c11 = jwt.c();
                            if (c11 != null) {
                                instance.setTime(c11);
                                Integer e10 = jVar.e();
                                C17542s.g(e10);
                                instance.add(13, e10.intValue());
                                instance.add(13, i10);
                                Date time2 = instance.getTime();
                                if (b11.after(time2)) {
                                    long time3 = b11.getTime();
                                    long j12 = (long) 1000;
                                    throw new C8894c(time3 / j12, Long.valueOf(time2.getTime() / j12));
                                }
                                return;
                            }
                            throw new C8895d();
                        }
                    } else {
                        throw new C8899h();
                    }
                } else {
                    throw new C8898g();
                }
            } else {
                throw new C8892a(jVar.a(), jwt.b());
            }
        } else {
            throw new w();
        }
    }
}
