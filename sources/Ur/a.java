package Ur;

import HJ.C15850p;
import HJ.C15854t;
import TJ.C16532g;
import XH.t;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import tv.C11996a;
import tv.C11997b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\n\bJ4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H¦\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LUr/a;", "", "LTJ/g;", "", "enabledKillSwitch", "LUr/a$a;", "deliveryType", "LUr/a$b;", "a", "(LTJ/g;LTJ/g;)LTJ/g;", "b", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LUr/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "", "b", "()Z", "HOME", "COLLECT", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ur.a$a  reason: collision with other inner class name */
    public enum C1858a {
        HOME,
        COLLECT;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ur.a$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1859a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f88419a = null;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    Ur.a$a[] r0 = Ur.a.C1858a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Ur.a$a r1 = Ur.a.C1858a.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Ur.a$a r1 = Ur.a.C1858a.COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f88419a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Ur.a.C1858a.C1859a.<clinit>():void");
            }
        }

        static {
            C1858a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        public final boolean b() {
            int i10 = C1859a.f88419a[ordinal()];
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            throw new t();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LUr/a$b;", "", "<init>", "()V", "a", "b", "c", "LUr/a$b$a;", "LUr/a$b$b;", "LUr/a$b$c;", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001:\u0004&\u001f\u001d B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001d\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b \u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010%R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b&\u0010%R\u0017\u0010.\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b*\u0010-¨\u0006/"}, d2 = {"LUr/a$b$a;", "LUr/a$b;", "", "allowedPaymentMethodsJson", "LUr/a$b$a$d;", "terms", "", "Ltv/a;", "allowedCardAuthMethods", "Ltv/b;", "allowedCardNetworks", "LUr/a$b$a$b;", "fiscalCodeConfig", "LUr/a$b$a$c;", "taxRequirementsConfig", "LUr/a$b$a$a;", "countriesOfOrigin", "<init>", "(Ljava/lang/String;LUr/a$b$a$d;Ljava/util/List;Ljava/util/List;LUr/a$b$a$b;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LUr/a$b$a$d;", "h", "()LUr/a$b$a$d;", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "LUr/a$b$a$b;", "()LUr/a$b$a$b;", "f", "g", "Z", "()Z", "hasTaxRequirements", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ur.a$b$a  reason: collision with other inner class name */
        public static final class C1860a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f88420a;

            /* renamed from: b  reason: collision with root package name */
            private final d f88421b;

            /* renamed from: c  reason: collision with root package name */
            private final List<C11996a> f88422c;

            /* renamed from: d  reason: collision with root package name */
            private final List<C11997b> f88423d;

            /* renamed from: e  reason: collision with root package name */
            private final C1862b f88424e;

            /* renamed from: f  reason: collision with root package name */
            private final List<c> f88425f;

            /* renamed from: g  reason: collision with root package name */
            private final List<C1861a> f88426g;

            /* renamed from: h  reason: collision with root package name */
            private final boolean f88427h;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"LUr/a$b$a$a;", "", "", "displayText", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ur.a$b$a$a  reason: collision with other inner class name */
            public static final class C1861a {

                /* renamed from: a  reason: collision with root package name */
                private final String f88428a;

                /* renamed from: b  reason: collision with root package name */
                private final String f88429b;

                public C1861a(String str, String str2) {
                    C17542s.j(str, "displayText");
                    C17542s.j(str2, "code");
                    this.f88428a = str;
                    this.f88429b = str2;
                }

                public final String a() {
                    return this.f88429b;
                }

                public final String b() {
                    return this.f88428a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1861a)) {
                        return false;
                    }
                    C1861a aVar = (C1861a) obj;
                    return C17542s.e(this.f88428a, aVar.f88428a) && C17542s.e(this.f88429b, aVar.f88429b);
                }

                public int hashCode() {
                    return (this.f88428a.hashCode() * 31) + this.f88429b.hashCode();
                }

                public String toString() {
                    String str = this.f88428a;
                    String str2 = this.f88429b;
                    return "CountryOfOrigin(displayText=" + str + ", code=" + str2 + ")";
                }
            }

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0014\u0010\r¨\u0006\u0018"}, d2 = {"LUr/a$b$a$b;", "", "", "label", "validationRegex", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "input", "", "c", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getValidationRegex", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ur.a$b$a$b  reason: collision with other inner class name */
            public static final class C1862b {

                /* renamed from: a  reason: collision with root package name */
                private final String f88430a;

                /* renamed from: b  reason: collision with root package name */
                private final String f88431b;

                /* renamed from: c  reason: collision with root package name */
                private final String f88432c;

                public C1862b(String str, String str2, String str3) {
                    C17542s.j(str, "label");
                    C17542s.j(str2, "validationRegex");
                    C17542s.j(str3, "errorMessage");
                    this.f88430a = str;
                    this.f88431b = str2;
                    this.f88432c = str3;
                }

                public final String a() {
                    return this.f88432c;
                }

                public final String b() {
                    return this.f88430a;
                }

                public final boolean c(String str) {
                    C17542s.j(str, "input");
                    boolean i10 = new C15850p(this.f88431b).i(str);
                    e eVar = e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a("Google Pay - validateInput(FISCAL_CODE): " + i10, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = C1862b.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar.a(eVar, str5, false, (Throwable) null, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                    return i10;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1862b)) {
                        return false;
                    }
                    C1862b bVar = (C1862b) obj;
                    return C17542s.e(this.f88430a, bVar.f88430a) && C17542s.e(this.f88431b, bVar.f88431b) && C17542s.e(this.f88432c, bVar.f88432c);
                }

                public int hashCode() {
                    return (((this.f88430a.hashCode() * 31) + this.f88431b.hashCode()) * 31) + this.f88432c.hashCode();
                }

                public String toString() {
                    String str = this.f88430a;
                    String str2 = this.f88431b;
                    String str3 = this.f88432c;
                    return "FiscalCodeConfig(label=" + str + ", validationRegex=" + str2 + ", errorMessage=" + str3 + ")";
                }
            }

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"LUr/a$b$a$c;", "", "", "label", "type", "validationRegex", "", "requiresCountry", "requiresInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "input", "f", "(Ljava/lang/String;)Z", "country", "e", "g", "(Ljava/lang/String;Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "getValidationRegex", "Z", "()Z", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ur.a$b$a$c */
            public static final class c {

                /* renamed from: a  reason: collision with root package name */
                private final String f88433a;

                /* renamed from: b  reason: collision with root package name */
                private final String f88434b;

                /* renamed from: c  reason: collision with root package name */
                private final String f88435c;

                /* renamed from: d  reason: collision with root package name */
                private final boolean f88436d;

                /* renamed from: e  reason: collision with root package name */
                private final boolean f88437e;

                public c(String str, String str2, String str3, boolean z10, boolean z11) {
                    C17542s.j(str, "label");
                    C17542s.j(str2, "type");
                    C17542s.j(str3, "validationRegex");
                    this.f88433a = str;
                    this.f88434b = str2;
                    this.f88435c = str3;
                    this.f88436d = z10;
                    this.f88437e = z11;
                }

                public final String a() {
                    return this.f88433a;
                }

                public final boolean b() {
                    return this.f88436d;
                }

                public final boolean c() {
                    return this.f88437e;
                }

                public final String d() {
                    return this.f88434b;
                }

                public final boolean e(String str) {
                    if (this.f88436d) {
                        return str != null && (C15854t.v0(str) ^ true);
                    }
                    return true;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return C17542s.e(this.f88433a, cVar.f88433a) && C17542s.e(this.f88434b, cVar.f88434b) && C17542s.e(this.f88435c, cVar.f88435c) && this.f88436d == cVar.f88436d && this.f88437e == cVar.f88437e;
                }

                public final boolean f(String str) {
                    C17542s.j(str, "input");
                    return new C15850p(this.f88435c).i(str);
                }

                public final boolean g(String str, String str2) {
                    C17542s.j(str, "input");
                    return !this.f88437e || (f(str) && e(str2));
                }

                public int hashCode() {
                    return (((((((this.f88433a.hashCode() * 31) + this.f88434b.hashCode()) * 31) + this.f88435c.hashCode()) * 31) + Boolean.hashCode(this.f88436d)) * 31) + Boolean.hashCode(this.f88437e);
                }

                public String toString() {
                    String str = this.f88433a;
                    String str2 = this.f88434b;
                    String str3 = this.f88435c;
                    boolean z10 = this.f88436d;
                    boolean z11 = this.f88437e;
                    return "TaxIdOption(label=" + str + ", type=" + str2 + ", validationRegex=" + str3 + ", requiresCountry=" + z10 + ", requiresInput=" + z11 + ")";
                }
            }

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"LUr/a$b$a$d;", "", "", "termsAndConditions", "privacyPolicy", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ur.a$b$a$d */
            public static final class d {

                /* renamed from: a  reason: collision with root package name */
                private final String f88438a;

                /* renamed from: b  reason: collision with root package name */
                private final String f88439b;

                public d(String str, String str2) {
                    C17542s.j(str, "termsAndConditions");
                    this.f88438a = str;
                    this.f88439b = str2;
                }

                public final String a() {
                    return this.f88439b;
                }

                public final String b() {
                    return this.f88438a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return C17542s.e(this.f88438a, dVar.f88438a) && C17542s.e(this.f88439b, dVar.f88439b);
                }

                public int hashCode() {
                    int hashCode = this.f88438a.hashCode() * 31;
                    String str = this.f88439b;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    String str = this.f88438a;
                    String str2 = this.f88439b;
                    return "Terms(termsAndConditions=" + str + ", privacyPolicy=" + str2 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1860a(String str, d dVar, List<? extends C11996a> list, List<? extends C11997b> list2, C1862b bVar, List<c> list3, List<C1861a> list4) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "allowedPaymentMethodsJson");
                C17542s.j(dVar, "terms");
                C17542s.j(list, "allowedCardAuthMethods");
                C17542s.j(list2, "allowedCardNetworks");
                this.f88420a = str;
                this.f88421b = dVar;
                this.f88422c = list;
                this.f88423d = list2;
                this.f88424e = bVar;
                this.f88425f = list3;
                this.f88426g = list4;
                boolean z10 = false;
                if (list3 != null && (!list3.isEmpty())) {
                    z10 = true;
                }
                this.f88427h = z10;
            }

            public final List<C11996a> a() {
                return this.f88422c;
            }

            public final List<C11997b> b() {
                return this.f88423d;
            }

            public final String c() {
                return this.f88420a;
            }

            public final List<C1861a> d() {
                return this.f88426g;
            }

            public final C1862b e() {
                return this.f88424e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1860a)) {
                    return false;
                }
                C1860a aVar = (C1860a) obj;
                return C17542s.e(this.f88420a, aVar.f88420a) && C17542s.e(this.f88421b, aVar.f88421b) && C17542s.e(this.f88422c, aVar.f88422c) && C17542s.e(this.f88423d, aVar.f88423d) && C17542s.e(this.f88424e, aVar.f88424e) && C17542s.e(this.f88425f, aVar.f88425f) && C17542s.e(this.f88426g, aVar.f88426g);
            }

            public final boolean f() {
                return this.f88427h;
            }

            public final List<c> g() {
                return this.f88425f;
            }

            public final d h() {
                return this.f88421b;
            }

            public int hashCode() {
                int hashCode = ((((((this.f88420a.hashCode() * 31) + this.f88421b.hashCode()) * 31) + this.f88422c.hashCode()) * 31) + this.f88423d.hashCode()) * 31;
                C1862b bVar = this.f88424e;
                int i10 = 0;
                int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                List<c> list = this.f88425f;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                List<C1861a> list2 = this.f88426g;
                if (list2 != null) {
                    i10 = list2.hashCode();
                }
                return hashCode3 + i10;
            }

            public String toString() {
                String str = this.f88420a;
                d dVar = this.f88421b;
                List<C11996a> list = this.f88422c;
                List<C11997b> list2 = this.f88423d;
                C1862b bVar = this.f88424e;
                List<c> list3 = this.f88425f;
                List<C1861a> list4 = this.f88426g;
                return "Content(allowedPaymentMethodsJson=" + str + ", terms=" + dVar + ", allowedCardAuthMethods=" + list + ", allowedCardNetworks=" + list2 + ", fiscalCodeConfig=" + bVar + ", taxRequirementsConfig=" + list3 + ", countriesOfOrigin=" + list4 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUr/a$b$b;", "LUr/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ur.a$b$b  reason: collision with other inner class name */
        public static final class C1863b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1863b f88440a = new C1863b();

            private C1863b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1863b);
            }

            public int hashCode() {
                return -793666077;
            }

            public String toString() {
                return "Disabled";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUr/a$b$c;", "LUr/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "gpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f88441a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1638374736;
            }

            public String toString() {
                return "Pending";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    C16532g<b> a(C16532g<Boolean> gVar, C16532g<? extends C1858a> gVar2);
}
