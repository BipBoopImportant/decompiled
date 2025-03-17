package ug;

import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import qI.C17787d;
import uI.C18064m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b9\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R+\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR+\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR+\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR+\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u001e\u0010\u000fR+\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b\u0006\u0010\r\"\u0004\b!\u0010\u000fR+\u0010&\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR+\u0010)\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u000b\u001a\u0004\b#\u0010\r\"\u0004\b(\u0010\u000fR+\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b*\u0010\u000fR+\u0010-\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0019\u0010\r\"\u0004\b,\u0010\u000fR+\u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b$\u0010\u000b\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR+\u00102\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b.\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b1\u0010\u000fR+\u00105\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b3\u0010\u000b\u001a\u0004\b'\u0010\r\"\u0004\b4\u0010\u000fR+\u00108\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b6\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b7\u0010\u000fR+\u0010:\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b6\u0010\r\"\u0004\b9\u0010\u000fR+\u0010=\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b;\u0010\u000b\u001a\u0004\b3\u0010\r\"\u0004\b<\u0010\u000fR+\u0010@\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b>\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u0004\b?\u0010\u000f¨\u0006A"}, d2 = {"Lug/l;", "Lug/k;", "LZj/h;", "labsStorage", "<init>", "(LZj/h;)V", "a", "LZj/h;", "", "<set-?>", "b", "LqI/d;", "p", "()Z", "setAdjustAnalytics", "(Z)V", "adjustAnalytics", "c", "j", "setCompleteKitchen", "completeKitchen", "d", "k", "setForcePushRegistrationFailure", "forcePushRegistrationFailure", "e", "getGeomagical", "setGeomagical", "geomagical", "f", "setGooglePayExpressCheckout", "googlePayExpressCheckout", "g", "setHomeProjects", "homeProjects", "h", "l", "setLiveShopping", "liveShopping", "i", "setPipV3", "pipV3", "setPtagScanningForAnyStore", "ptagScanningForAnyStore", "setRemoteSalesInCart", "remoteSalesInCart", "m", "setReplacementRecommendations", "replacementRecommendations", "setScanAndGoCaasCheckout", "scanAndGoCaasCheckout", "n", "setScanAndGoOnGoingOrdersScreen", "scanAndGoOnGoingOrdersScreen", "o", "setScanAndGoScannerMLKit", "scanAndGoScannerMLKit", "setShoppingListSimilarItems", "shoppingListSimilarItems", "q", "setVugcInspirationOnPip", "vugcInspirationOnPip", "r", "setWriteProductReview", "writeProductReview", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements k {

    /* renamed from: s  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f77033s;

    /* renamed from: a  reason: collision with root package name */
    private final Zj.h f77034a;

    /* renamed from: b  reason: collision with root package name */
    private final C17787d f77035b;

    /* renamed from: c  reason: collision with root package name */
    private final C17787d f77036c;

    /* renamed from: d  reason: collision with root package name */
    private final C17787d f77037d;

    /* renamed from: e  reason: collision with root package name */
    private final C17787d f77038e;

    /* renamed from: f  reason: collision with root package name */
    private final C17787d f77039f;

    /* renamed from: g  reason: collision with root package name */
    private final C17787d f77040g;

    /* renamed from: h  reason: collision with root package name */
    private final C17787d f77041h;

    /* renamed from: i  reason: collision with root package name */
    private final C17787d f77042i;

    /* renamed from: j  reason: collision with root package name */
    private final C17787d f77043j;

    /* renamed from: k  reason: collision with root package name */
    private final C17787d f77044k;

    /* renamed from: l  reason: collision with root package name */
    private final C17787d f77045l;

    /* renamed from: m  reason: collision with root package name */
    private final C17787d f77046m;

    /* renamed from: n  reason: collision with root package name */
    private final C17787d f77047n;

    /* renamed from: o  reason: collision with root package name */
    private final C17787d f77048o;

    /* renamed from: p  reason: collision with root package name */
    private final C17787d f77049p;

    /* renamed from: q  reason: collision with root package name */
    private final C17787d f77050q;

    /* renamed from: r  reason: collision with root package name */
    private final C17787d f77051r;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$a", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77052a = "adjustAnalytics";

        a() {
        }

        public String getKey() {
            return this.f77052a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$b", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77053a = "completeKitchen";

        b() {
        }

        public String getKey() {
            return this.f77053a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$c", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77054a = "forcePushRegistrationFailure";

        c() {
        }

        public String getKey() {
            return this.f77054a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$d", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77055a = "geomagical";

        d() {
        }

        public String getKey() {
            return this.f77055a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$e", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77056a = "googlePayExpressCheckout";

        e() {
        }

        public String getKey() {
            return this.f77056a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$f", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77057a = "homeProjects";

        f() {
        }

        public String getKey() {
            return this.f77057a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$g", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77058a = "liveShopping";

        g() {
        }

        public String getKey() {
            return this.f77058a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$h", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77059a = "pipV3";

        h() {
        }

        public String getKey() {
            return this.f77059a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$i", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77060a = "ptagScanningForAnyStore";

        i() {
        }

        public String getKey() {
            return this.f77060a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$j", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77061a = "remoteSalesInCart";

        j() {
        }

        public String getKey() {
            return this.f77061a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$k", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77062a = "replacementRecommendations";

        k() {
        }

        public String getKey() {
            return this.f77062a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$l", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ug.l$l  reason: collision with other inner class name */
    public static final class C1422l implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77063a = "scanAndGoCaasCheckout";

        C1422l() {
        }

        public String getKey() {
            return this.f77063a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$m", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77064a = "scanAndGoOnGoingOrdersScreen";

        m() {
        }

        public String getKey() {
            return this.f77064a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$n", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77065a = "scanAndGoScannerMLKit";

        n() {
        }

        public String getKey() {
            return this.f77065a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$o", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77066a = "shoppingListSimilarItems";

        o() {
        }

        public String getKey() {
            return this.f77066a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$p", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class p implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77067a = "vugcInspirationOnPip";

        p() {
        }

        public String getKey() {
            return this.f77067a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ug/l$q", "LZj/b;", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class q implements Zj.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77068a = "writeProductReview";

        q() {
        }

        public String getKey() {
            return this.f77068a;
        }
    }

    static {
        Class<l> cls = l.class;
        f77033s = new C18064m[]{P.e(new A(cls, "adjustAnalytics", "getAdjustAnalytics()Z", 0)), P.e(new A(cls, "completeKitchen", "getCompleteKitchen()Z", 0)), P.e(new A(cls, "forcePushRegistrationFailure", "getForcePushRegistrationFailure()Z", 0)), P.e(new A(cls, "geomagical", "getGeomagical()Z", 0)), P.e(new A(cls, "googlePayExpressCheckout", "getGooglePayExpressCheckout()Z", 0)), P.e(new A(cls, "homeProjects", "getHomeProjects()Z", 0)), P.e(new A(cls, "liveShopping", "getLiveShopping()Z", 0)), P.e(new A(cls, "pipV3", "getPipV3()Z", 0)), P.e(new A(cls, "ptagScanningForAnyStore", "getPtagScanningForAnyStore()Z", 0)), P.e(new A(cls, "remoteSalesInCart", "getRemoteSalesInCart()Z", 0)), P.e(new A(cls, "replacementRecommendations", "getReplacementRecommendations()Z", 0)), P.e(new A(cls, "scanAndGoCaasCheckout", "getScanAndGoCaasCheckout()Z", 0)), P.e(new A(cls, "scanAndGoOnGoingOrdersScreen", "getScanAndGoOnGoingOrdersScreen()Z", 0)), P.e(new A(cls, "scanAndGoScannerMLKit", "getScanAndGoScannerMLKit()Z", 0)), P.e(new A(cls, "shoppingListSimilarItems", "getShoppingListSimilarItems()Z", 0)), P.e(new A(cls, "vugcInspirationOnPip", "getVugcInspirationOnPip()Z", 0)), P.e(new A(cls, "writeProductReview", "getWriteProductReview()Z", 0))};
    }

    public l(Zj.h hVar) {
        C17542s.j(hVar, "labsStorage");
        this.f77034a = hVar;
        this.f77035b = Zj.a.a(hVar, new a(), false);
        this.f77036c = Zj.a.a(hVar, new b(), false);
        this.f77037d = Zj.a.a(hVar, new c(), false);
        this.f77038e = Zj.a.a(hVar, new d(), false);
        this.f77039f = Zj.a.a(hVar, new e(), false);
        this.f77040g = Zj.a.a(hVar, new f(), false);
        this.f77041h = Zj.a.a(hVar, new g(), false);
        this.f77042i = Zj.a.a(hVar, new h(), false);
        this.f77043j = Zj.a.a(hVar, new i(), false);
        this.f77044k = Zj.a.a(hVar, new j(), false);
        this.f77045l = Zj.a.a(hVar, new k(), false);
        this.f77046m = Zj.a.a(hVar, new C1422l(), false);
        this.f77047n = Zj.a.a(hVar, new m(), false);
        this.f77048o = Zj.a.a(hVar, new n(), false);
        this.f77049p = Zj.a.a(hVar, new o(), false);
        this.f77050q = Zj.a.a(hVar, new p(), false);
        this.f77051r = Zj.a.a(hVar, new q(), false);
    }

    public boolean a() {
        return ((Boolean) this.f77040g.a(this, f77033s[5])).booleanValue();
    }

    public boolean b() {
        return ((Boolean) this.f77043j.a(this, f77033s[8])).booleanValue();
    }

    public boolean c() {
        return ((Boolean) this.f77039f.a(this, f77033s[4])).booleanValue();
    }

    public boolean d() {
        return ((Boolean) this.f77048o.a(this, f77033s[13])).booleanValue();
    }

    public boolean e() {
        return ((Boolean) this.f77044k.a(this, f77033s[9])).booleanValue();
    }

    public boolean f() {
        return ((Boolean) this.f77051r.a(this, f77033s[16])).booleanValue();
    }

    public boolean g() {
        return ((Boolean) this.f77046m.a(this, f77033s[11])).booleanValue();
    }

    public boolean h() {
        return ((Boolean) this.f77042i.a(this, f77033s[7])).booleanValue();
    }

    public boolean i() {
        return ((Boolean) this.f77047n.a(this, f77033s[12])).booleanValue();
    }

    public boolean j() {
        return ((Boolean) this.f77036c.a(this, f77033s[1])).booleanValue();
    }

    public boolean k() {
        return ((Boolean) this.f77037d.a(this, f77033s[2])).booleanValue();
    }

    public boolean l() {
        return ((Boolean) this.f77041h.a(this, f77033s[6])).booleanValue();
    }

    public boolean m() {
        return ((Boolean) this.f77045l.a(this, f77033s[10])).booleanValue();
    }

    public boolean n() {
        return ((Boolean) this.f77050q.a(this, f77033s[15])).booleanValue();
    }

    public boolean o() {
        return ((Boolean) this.f77049p.a(this, f77033s[14])).booleanValue();
    }

    public boolean p() {
        return ((Boolean) this.f77035b.a(this, f77033s[0])).booleanValue();
    }
}
