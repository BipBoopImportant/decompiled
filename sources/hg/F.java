package hg;

import XH.t;
import androidx.lifecycle.f0;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.appconfig.model.ZipInValidation;
import gE.C14514a;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.C10038a;
import sf.C10242c;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lhg/F;", "Landroidx/lifecycle/f0;", "LIl/a;", "appConfigApi", "Lsf/c;", "appUserDataRepository", "LgE/a;", "zipSelectorAnalytics", "<init>", "(LIl/a;Lsf/c;LgE/a;)V", "", "preSelectedPostalCode", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "LXH/N;", "G", "(Ljava/lang/String;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;Lsf/c;LgE/a;)V", "", "F", "()Z", "Lme/a$a$b;", "C", "()Lme/a$a$b;", "Lme/a$d;", "H", "(Lme/a$d;)V", "m", "LIl/a;", "n", "Lsf/c;", "o", "LgE/a;", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "E", "()Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "postalCodePickerConfig", "D", "()Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class F extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final Il.a f73598m;

    /* renamed from: n  reason: collision with root package name */
    private final C10242c f73599n;

    /* renamed from: o  reason: collision with root package name */
    private final C14514a f73600o;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73601a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f73602b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b[] r0 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r2 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.MANUAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r3 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.NATIVE_GOOGLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r3 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.ADDRESS_LOOKUP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f73601a = r0
                com.ingka.ikea.appconfig.model.ZipInValidation$b[] r0 = com.ingka.ikea.appconfig.model.ZipInValidation.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.appconfig.model.ZipInValidation$b r3 = com.ingka.ikea.appconfig.model.ZipInValidation.b.START     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.ingka.ikea.appconfig.model.ZipInValidation$b r1 = com.ingka.ikea.appconfig.model.ZipInValidation.b.END     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f73602b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.F.a.<clinit>():void");
        }
    }

    public F(Il.a aVar, C10242c cVar, C14514a aVar2) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(aVar2, "zipSelectorAnalytics");
        this.f73598m = aVar;
        this.f73599n = cVar;
        this.f73600o = aVar2;
    }

    private final void G(String str, UserPostalCodeAddress userPostalCodeAddress, C10242c cVar, C14514a aVar) {
        if (UserPostalCodeAddress.f70222e.b(userPostalCodeAddress, cVar, (Pattern) null) && !C17542s.e(str, userPostalCodeAddress.d())) {
            aVar.a();
        }
    }

    public final C10038a.C1374a.b C() {
        ZipInValidation.b a10;
        ZipInValidation j10 = E().j();
        if (j10 == null || (a10 = j10.a()) == null) {
            return null;
        }
        int i10 = a.f73602b[a10.ordinal()];
        if (i10 == 1) {
            return C10038a.C1374a.b.START;
        }
        if (i10 == 2) {
            return C10038a.C1374a.b.END;
        }
        throw new t();
    }

    public final UserPostalCodeAddress D() {
        return this.f73599n.l();
    }

    public final PostalCodePickerConfig E() {
        return this.f73598m.v();
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F() {
        /*
            r5 = this;
            com.ingka.ikea.appconfig.model.PostalCodePickerConfig r0 = r5.E()
            com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r0 = r0.i()
            int[] r1 = hg.F.a.f73601a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x0059
            r4 = 2
            if (r0 == r4) goto L_0x0046
            r4 = 3
            if (r0 != r4) goto L_0x0040
            com.ingka.ikea.app.base.UserPostalCodeAddress r0 = r5.D()
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r0.d()
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            if (r0 == 0) goto L_0x009c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0031
            goto L_0x009c
        L_0x0031:
            com.ingka.ikea.app.base.UserPostalCodeAddress r0 = r5.D()
            if (r0 == 0) goto L_0x003b
            java.util.ArrayList r2 = r0.a()
        L_0x003b:
            if (r2 == 0) goto L_0x009c
        L_0x003d:
            r1 = r3
            goto L_0x009c
        L_0x0040:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0046:
            com.ingka.ikea.app.base.UserPostalCodeAddress r0 = r5.D()
            if (r0 == 0) goto L_0x0050
            java.lang.String r2 = r0.d()
        L_0x0050:
            if (r2 == 0) goto L_0x009c
            int r0 = r2.length()
            if (r0 != 0) goto L_0x003d
            goto L_0x009c
        L_0x0059:
            com.ingka.ikea.appconfig.model.PostalCodePickerConfig r0 = r5.E()
            java.util.List r0 = r0.c()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007e
            com.ingka.ikea.app.base.UserPostalCodeAddress r0 = r5.D()
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r0.c()
            goto L_0x0075
        L_0x0074:
            r0 = r2
        L_0x0075:
            if (r0 == 0) goto L_0x0080
            int r0 = r0.length()
            if (r0 != 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r0 = r3
            goto L_0x0081
        L_0x0080:
            r0 = r1
        L_0x0081:
            com.ingka.ikea.app.base.UserPostalCodeAddress r4 = r5.D()
            if (r4 == 0) goto L_0x008b
            java.lang.String r2 = r4.d()
        L_0x008b:
            if (r2 == 0) goto L_0x0096
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r2 = r1
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            if (r2 != 0) goto L_0x009c
            if (r0 == 0) goto L_0x009c
            goto L_0x003d
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.F.F():boolean");
    }

    public final void H(C10038a.d dVar) {
        ArrayList arrayList;
        C17542s.j(dVar, "postalCodeAddress");
        UserPostalCodeAddress D10 = D();
        String d10 = D10 != null ? D10.d() : null;
        String c10 = dVar.c();
        Map<String, String> a10 = dVar.a();
        if (a10 != null) {
            ArrayList arrayList2 = new ArrayList(a10.size());
            for (Map.Entry next : a10.entrySet()) {
                arrayList2.add(new UserPostalCodeAddress.AdditionalValue((String) next.getKey(), (String) next.getValue()));
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        G(d10, new UserPostalCodeAddress(c10, (String) null, arrayList, 2, (DefaultConstructorMarker) null), this.f73599n, this.f73600o);
    }
}
