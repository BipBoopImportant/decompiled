package com.afterpay.android;

import QJ.C16342y0;
import QJ.Q;
import QJ.T;
import VJ.C16696b;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.content.Intent;
import com.afterpay.android.view.AfterpayCheckoutActivity;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nI.p;
import qI.C17784a;
import qI.C17785b;
import qI.C17787d;
import t6.C8832a;
import t6.C8833b;
import u6.C8881b;
import u6.C8882c;
import u6.C8883d;
import uI.C18064m;
import v6.C8891a;
import v6.d;
import v6.g;
import v6.i;
import v6.j;
import v6.k;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00142\u0006\u0010\r\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJE\u0010%\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b%\u0010&R/\u0010/\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8@@BX\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010!\u001a\u00020 8@X\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u0002028@X\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u0004\u0018\u00010 8@X\u0004¢\u0006\u0006\u001a\u0004\b6\u00101R\u0014\u0010:\u001a\u00020\b8@X\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8@X\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R(\u0010@\u001a\u0004\u0018\u00010?2\b\u0010(\u001a\u0004\u0018\u00010?8\u0000@BX\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b)\u0010BR\u0013\u0010#\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bC\u0010D\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Lcom/afterpay/android/Afterpay;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "checkoutUrl", "", "loadRedirectUrls", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/Intent;", "token", "Lkotlin/Function1;", "Lu6/c;", "LXH/N;", "complete", "l", "(Ljava/lang/String;LnI/l;LdI/e;)Ljava/lang/Object;", "Ljava/util/concurrent/CompletableFuture;", "m", "(Ljava/lang/String;LnI/l;)Ljava/util/concurrent/CompletableFuture;", "jwt", "customerId", "grantId", "Lu6/d;", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/l;)V", "minimumAmount", "maximumAmount", "currencyCode", "Ljava/util/Locale;", "locale", "Lt6/b;", "environment", "consumerLocale", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Lt6/b;Ljava/util/Locale;)V", "Lv6/f;", "<set-?>", "c", "LqI/d;", "d", "()Lv6/f;", "k", "(Lv6/f;)V", "configuration", "h", "()Ljava/util/Locale;", "Lv6/d;", "b", "()Lv6/d;", "brand", "g", "language", "e", "()Z", "enabled", "Lv6/a;", "i", "()Lv6/a;", "strings", "Lt6/a;", "checkoutV2Handler", "Lt6/a;", "()Lt6/a;", "f", "()Lt6/b;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Afterpay {

    /* renamed from: a  reason: collision with root package name */
    public static final Afterpay f45951a = new Afterpay();

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f45952b = {P.e(new A(Afterpay.class, "configuration", "getConfiguration$afterpay_release()Lcom/afterpay/android/internal/Configuration;", 0))};

    /* renamed from: c  reason: collision with root package name */
    private static final C17787d f45953c = new b((Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 7, 1})
    @f(c = "com.afterpay.android.Afterpay$signCashAppOrderTokenAsync$1", f = "Afterpay.kt", l = {117}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45954c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f45955d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C8882c, C16807N> f45956e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, C17642l<? super C8882c, C16807N> lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f45955d = str;
            this.f45956e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f45955d, this.f45956e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f45954c;
            if (i10 == 0) {
                y.b(obj);
                String str = this.f45955d;
                C17642l<C8882c, C16807N> lVar = this.f45956e;
                this.f45954c = 1;
                if (Afterpay.l(str, lVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/afterpay/android/Afterpay$b", "LqI/b;", "LuI/m;", "property", "oldValue", "newValue", "LXH/N;", "c", "(LuI/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b extends C17785b<v6.f> {
        public b(Object obj) {
            super(obj);
        }

        /* access modifiers changed from: protected */
        public void c(C18064m<?> mVar, v6.f fVar, v6.f fVar2) {
            C17542s.j(mVar, "property");
            v6.f fVar3 = fVar2;
            if (!C17542s.e(fVar3, fVar)) {
                g.f56913a.a(fVar3);
            }
        }
    }

    static {
        C17784a aVar = C17784a.f146467a;
    }

    private Afterpay() {
    }

    public static final Intent a(Context context, String str, boolean z10) {
        C17542s.j(context, "context");
        C17542s.j(str, "checkoutUrl");
        if (!f45951a.e()) {
            str = "LANGUAGE_NOT_SUPPORTED";
        }
        return i.e(i.f(new Intent(context, AfterpayCheckoutActivity.class), str), z10);
    }

    public static final void j(String str, String str2, String str3, Locale locale, C8833b bVar, Locale locale2) {
        String str4 = str;
        String str5 = str2;
        C17542s.j(str2, "maximumAmount");
        String str6 = str3;
        C17542s.j(str3, "currencyCode");
        Locale locale3 = locale;
        C17542s.j(locale, "locale");
        C17542s.j(bVar, "environment");
        Afterpay afterpay = f45951a;
        BigDecimal bigDecimal = str4 != null ? new BigDecimal(str) : null;
        BigDecimal bigDecimal2 = new BigDecimal(str2);
        Currency instance = Currency.getInstance(str3);
        C17542s.i(instance, "getInstance(currencyCode)");
        Object clone = locale.clone();
        C17542s.h(clone, "null cannot be cast to non-null type java.util.Locale");
        v6.f fVar = new v6.f(bigDecimal, bigDecimal2, instance, (Locale) clone, bVar, locale2);
        BigDecimal d10 = fVar.d();
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (d10.compareTo(bigDecimal3) >= 0) {
            BigDecimal e10 = fVar.e();
            if (e10 == null || (e10.compareTo(bigDecimal3) >= 0 && e10.compareTo(fVar.d()) <= 0)) {
                j jVar = j.f56916a;
                if (!jVar.j().contains(fVar.c())) {
                    Iterable<Locale> j10 = jVar.j();
                    ArrayList arrayList = new ArrayList(C16877v.y(j10, 10));
                    for (Locale country : j10) {
                        arrayList.add(country.getCountry());
                    }
                    throw new IllegalArgumentException("Locale contains an unsupported country: " + fVar.c().getCountry() + ". Supported countries include: " + C16877v.G0(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
                }
                afterpay.k(fVar);
                return;
            }
            throw new IllegalArgumentException("Minimum order amount is invalid");
        }
        throw new IllegalArgumentException("Maximum order amount is invalid");
    }

    private final void k(v6.f fVar) {
        f45953c.b(this, f45952b[0], fVar);
    }

    public static final Object l(String str, C17642l<? super C8882c, C16807N> lVar, C17164e<? super C16807N> eVar) {
        Object b10 = C8881b.f56850a.b(str, lVar, eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public static final CompletableFuture<C16807N> m(String str, C17642l<? super C8882c, C16807N> lVar) {
        C17542s.j(str, "token");
        C17542s.j(lVar, "complete");
        return C16696b.b(C16342y0.f137687a, (C17168i) null, (T) null, new a(str, lVar, (C17164e<? super a>) null), 3, (Object) null);
    }

    public static final void n(String str, String str2, String str3, C17642l<? super C8883d, C16807N> lVar) {
        C17542s.j(str, "jwt");
        C17542s.j(str2, "customerId");
        C17542s.j(str3, "grantId");
        C17542s.j(lVar, "complete");
        C8881b.f56850a.d(str, str2, str3, lVar);
    }

    public final d b() {
        return d.Companion.a(h());
    }

    public final C8832a c() {
        return null;
    }

    public final v6.f d() {
        return (v6.f) f45953c.a(this, f45952b[0]);
    }

    public final boolean e() {
        return g() != null;
    }

    public final C8833b f() {
        v6.f d10 = d();
        if (d10 != null) {
            return d10.b();
        }
        return null;
    }

    public final Locale g() {
        Locale locale;
        Locale h10 = h();
        v6.f d10 = d();
        if (d10 == null || (locale = d10.a()) == null) {
            locale = Locale.getDefault();
        }
        C17542s.i(locale, "configuration?.consumerL…le ?: Locale.getDefault()");
        return k.a(h10, locale);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Locale h() {
        /*
            r1 = this;
            v6.f r0 = r1.d()
            if (r0 == 0) goto L_0x000c
            java.util.Locale r0 = r0.c()
            if (r0 != 0) goto L_0x0012
        L_0x000c:
            v6.j r0 = v6.j.f56916a
            java.util.Locale r0 = r0.e()
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.Afterpay.h():java.util.Locale");
    }

    public final C8891a i() {
        return C8891a.Companion.a();
    }
}
