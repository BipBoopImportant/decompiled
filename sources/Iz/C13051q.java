package Iz;

import Ae.e;
import Ae.j;
import EB.C12829a;
import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import Iz.C13053t;
import Iz.r;
import QJ.Q;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import YH.X;
import android.content.UriMatcher;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import org.slf4j.Marker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10242c;
import ug.k;
import up.C12074d;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 G2\u00020\u0001:\u000235BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0+2\u0006\u0010*\u001a\u00020)H@¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020)H@¢\u0006\u0004\b/\u0010-J\u0013\u00101\u001a\u00020\u0018*\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH@¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010E¨\u0006H"}, d2 = {"LIz/q;", "LZl/a;", "LRy/a;", "scanAndGoSettingsRepo", "LIz/r;", "scanAndGoDeepLinkExtractor", "LAe/e;", "analytics", "Lsf/c;", "appUserDataRepository", "Lup/d;", "userConsentRepository", "LOz/d;", "scanAndGoEnableUseCase", "Lug/k;", "labsFeatures", "LFB/a;", "localStoreSelectionRepository", "LZs/a;", "inStoreNavigation", "LIz/c;", "deepLinkParameterValidator", "<init>", "(LRy/a;LIz/r;LAe/e;Lsf/c;Lup/d;LOz/d;Lug/k;LFB/a;LZs/a;LIz/c;)V", "LAe/l;", "entryPoint", "Landroid/net/Uri;", "uri", "j", "(LAe/l;Landroid/net/Uri;)Landroid/net/Uri;", "LIz/t;", "params", "LIz/q$b;", "g", "(Landroid/net/Uri;LIz/t;)LIz/q$b;", "h", "(LIz/t;)LIz/q$b;", "parameters", "LXH/N;", "k", "(LIz/t;)V", "", "storeId", "LXH/x;", "f", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "i", "LIz/r$b;", "l", "(LIz/r$b;)LAe/l;", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "a", "(Landroid/net/Uri;)Z", "LRy/a;", "c", "LIz/r;", "d", "LAe/e;", "e", "Lsf/c;", "Lup/d;", "LOz/d;", "Lug/k;", "LFB/a;", "LZs/a;", "LIz/c;", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "m", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.q  reason: case insensitive filesystem */
public final class C13051q implements Zl.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f111070m = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final int f111071n = 8;

    /* renamed from: b  reason: collision with root package name */
    private final Ry.a f111072b;

    /* renamed from: c  reason: collision with root package name */
    private final r f111073c;

    /* renamed from: d  reason: collision with root package name */
    private final Ae.e f111074d;

    /* renamed from: e  reason: collision with root package name */
    private final C10242c f111075e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C12074d f111076f;

    /* renamed from: g  reason: collision with root package name */
    private final Oz.d f111077g;

    /* renamed from: h  reason: collision with root package name */
    private final k f111078h;

    /* renamed from: i  reason: collision with root package name */
    private final C12860a f111079i;

    /* renamed from: j  reason: collision with root package name */
    private final Zs.a f111080j;

    /* renamed from: k  reason: collision with root package name */
    private final C13037c f111081k;

    /* renamed from: l  reason: collision with root package name */
    private final UriMatcher f111082l;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"LIz/q$a;", "", "<init>", "()V", "", "PTAG_MATCH", "I", "SCAN_AND_GO_MATCH", "", "PTAG_WEB_DOMAIN_DEBUG", "Ljava/lang/String;", "PTAG_WEB_DOMAIN_PRODUCTION", "SCAN_AND_GO_HOST", "PARAM_STORE_ID", "PARAM_PRODUCT_ID", "PTAG_ADDITONAL_INFO_VALUE", "QR_CODE_FORMAT", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iz.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0014\u0010\u001e¨\u0006\u001f"}, d2 = {"LIz/q$b;", "", "", "marketCode", "languageCode", "storeId", "additionalInfo", "LIz/r$b;", "deepLinkAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LIz/r$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMarketCode", "b", "getLanguageCode", "c", "d", "getAdditionalInfo", "e", "LIz/r$b;", "()LIz/r$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iz.q$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f111083a;

        /* renamed from: b  reason: collision with root package name */
        private final String f111084b;

        /* renamed from: c  reason: collision with root package name */
        private final String f111085c;

        /* renamed from: d  reason: collision with root package name */
        private final String f111086d;

        /* renamed from: e  reason: collision with root package name */
        private final r.b f111087e;

        public b(String str, String str2, String str3, String str4, r.b bVar) {
            C17542s.j(str, "marketCode");
            C17542s.j(str2, "languageCode");
            C17542s.j(str3, "storeId");
            C17542s.j(str4, "additionalInfo");
            C17542s.j(bVar, "deepLinkAction");
            this.f111083a = str;
            this.f111084b = str2;
            this.f111085c = str3;
            this.f111086d = str4;
            this.f111087e = bVar;
        }

        public final r.b a() {
            return this.f111087e;
        }

        public final String b() {
            return this.f111085c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f111083a, bVar.f111083a) && C17542s.e(this.f111084b, bVar.f111084b) && C17542s.e(this.f111085c, bVar.f111085c) && C17542s.e(this.f111086d, bVar.f111086d) && this.f111087e == bVar.f111087e;
        }

        public int hashCode() {
            return (((((((this.f111083a.hashCode() * 31) + this.f111084b.hashCode()) * 31) + this.f111085c.hashCode()) * 31) + this.f111086d.hashCode()) * 31) + this.f111087e.hashCode();
        }

        public String toString() {
            String str = this.f111083a;
            String str2 = this.f111084b;
            String str3 = this.f111085c;
            String str4 = this.f111086d;
            r.b bVar = this.f111087e;
            return "EnableScanAndGo(marketCode=" + str + ", languageCode=" + str2 + ", storeId=" + str3 + ", additionalInfo=" + str4 + ", deepLinkAction=" + bVar + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iz.q$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f111088a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Iz.r$b[] r0 = Iz.r.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Iz.r$b r1 = Iz.r.b.START_INSTORE_PAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Iz.r$b r1 = Iz.r.b.START_PTAG     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Iz.r$b r1 = Iz.r.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f111088a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Iz.C13051q.c.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.navigation.ScanAndGoApplinkMapper", f = "ScanAndGoApplinkMapper.kt", l = {251}, m = "createParams-gIAlu-s")
    /* renamed from: Iz.q$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111089c;

        /* renamed from: d  reason: collision with root package name */
        Object f111090d;

        /* renamed from: e  reason: collision with root package name */
        Object f111091e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f111092f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13051q f111093g;

        /* renamed from: h  reason: collision with root package name */
        int f111094h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C13051q qVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f111093g = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111092f = obj;
            this.f111094h |= Integer.MIN_VALUE;
            Object c10 = this.f111093g.f((String) null, this);
            return c10 == C17187b.f() ? c10 : x.a(c10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.navigation.ScanAndGoApplinkMapper", f = "ScanAndGoApplinkMapper.kt", l = {261}, m = "isPtagScanningEnabled")
    /* renamed from: Iz.q$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111095c;

        /* renamed from: d  reason: collision with root package name */
        Object f111096d;

        /* renamed from: e  reason: collision with root package name */
        Object f111097e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f111098f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13051q f111099g;

        /* renamed from: h  reason: collision with root package name */
        int f111100h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C13051q qVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f111099g = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111098f = obj;
            this.f111100h |= Integer.MIN_VALUE;
            return this.f111099g.i((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.navigation.ScanAndGoApplinkMapper", f = "ScanAndGoApplinkMapper.kt", l = {57, 70, 79, 86, 90, 104}, m = "map")
    /* renamed from: Iz.q$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111101c;

        /* renamed from: d  reason: collision with root package name */
        Object f111102d;

        /* renamed from: e  reason: collision with root package name */
        Object f111103e;

        /* renamed from: f  reason: collision with root package name */
        Object f111104f;

        /* renamed from: g  reason: collision with root package name */
        Object f111105g;

        /* renamed from: h  reason: collision with root package name */
        Object f111106h;

        /* renamed from: i  reason: collision with root package name */
        Object f111107i;

        /* renamed from: j  reason: collision with root package name */
        int f111108j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f111109k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C13051q f111110l;

        /* renamed from: m  reason: collision with root package name */
        int f111111m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C13051q qVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f111110l = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111109k = obj;
            this.f111111m |= Integer.MIN_VALUE;
            return this.f111110l.b((Uri) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.navigation.ScanAndGoApplinkMapper$setMarketAndLanguageIfNeeded$1$1", f = "ScanAndGoApplinkMapper.kt", l = {236}, m = "invokeSuspend")
    /* renamed from: Iz.q$g */
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111112c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13051q f111113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C13051q qVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f111113d = qVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f111113d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111112c;
            if (i10 == 0) {
                y.b(obj);
                C12074d d10 = this.f111113d.f111076f;
                this.f111112c = 1;
                if (d10.a(this) == f10) {
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

    public C13051q(Ry.a aVar, r rVar, Ae.e eVar, C10242c cVar, C12074d dVar, Oz.d dVar2, k kVar, C12860a aVar2, Zs.a aVar3, C13037c cVar2) {
        C17542s.j(aVar, "scanAndGoSettingsRepo");
        C17542s.j(rVar, "scanAndGoDeepLinkExtractor");
        C17542s.j(eVar, "analytics");
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(dVar, "userConsentRepository");
        C17542s.j(dVar2, "scanAndGoEnableUseCase");
        C17542s.j(kVar, "labsFeatures");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        C17542s.j(aVar3, "inStoreNavigation");
        C17542s.j(cVar2, "deepLinkParameterValidator");
        this.f111072b = aVar;
        this.f111073c = rVar;
        this.f111074d = eVar;
        this.f111075e = cVar;
        this.f111076f = dVar;
        this.f111077g = dVar2;
        this.f111078h = kVar;
        this.f111079i = aVar2;
        this.f111080j = aVar3;
        this.f111081k = cVar2;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("ptag-info.dev.ikeadt.com", "/", 1);
        uriMatcher.addURI("ptag-info.ikea.com", "/", 1);
        uriMatcher.addURI("scanandgo", Marker.ANY_MARKER, 2);
        uriMatcher.addURI("www.ikea.com", "ikeaapp/scanandgo/*", 2);
        this.f111082l = uriMatcher;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.lang.String r6, dI.C17164e<? super XH.x<? extends Iz.C13053t>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Iz.C13051q.d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Iz.q$d r0 = (Iz.C13051q.d) r0
            int r1 = r0.f111094h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111094h = r1
            goto L_0x0018
        L_0x0013:
            Iz.q$d r0 = new Iz.q$d
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f111092f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111094h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f111091e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f111090d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f111089c
            Iz.q r6 = (Iz.C13051q) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0059
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            Iz.r r1 = r5.f111073c
            r0.f111089c = r5
            r0.f111090d = r6
            r0.f111091e = r7
            r0.f111094h = r4
            java.lang.String r7 = "PTAG"
            java.lang.Object r6 = r1.b(r6, r7, r0)
            if (r6 != r2) goto L_0x0059
            return r2
        L_0x0059:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Iz.C13051q.f(java.lang.String, dI.e):java.lang.Object");
    }

    private final b g(Uri uri, C13053t tVar) {
        C13053t tVar2 = tVar;
        String queryParameter = uri.getQueryParameter("in");
        if (queryParameter != null) {
            k(tVar2);
            if (tVar2 instanceof C13053t.a) {
                C13053t.a aVar = (C13053t.a) tVar2;
                this.f111079i.a(C12832d.b(C12832d.f109333f.a(aVar.f()), aVar.d(), (String) null, (String) null, false, (C12829a) null, 30, (Object) null));
            }
            b bVar = new b(tVar.c(), tVar.b(), tVar.d(), tVar.a(), r.b.START_PTAG);
            e.c.c(this.f111074d, j.PTAG_SCANNED.b(), X.m(C16796C.a("store_id", tVar.d()), C16796C.a("item_id", queryParameter), C16796C.a("app_location", "PTAG")), Interaction$Component.ENABLE_SHOP_AND_GO, (e.b) null, 8, (Object) null);
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final b h(C13053t tVar) {
        k(tVar);
        if (tVar instanceof C13053t.a) {
            this.f111079i.a(C12832d.f109333f.a(((C13053t.a) tVar).f()));
        }
        return new b(tVar.c(), tVar.b(), tVar.d(), tVar.a(), r.b.START_INSTORE_PAGE);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Iz.C13051q.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Iz.q$e r0 = (Iz.C13051q.e) r0
            int r1 = r0.f111100h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111100h = r1
            goto L_0x0018
        L_0x0013:
            Iz.q$e r0 = new Iz.q$e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f111098f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111100h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f111097e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f111096d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f111095c
            Iz.q r6 = (Iz.C13051q) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r7 = r1.j()
            goto L_0x0058
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            Ry.a r1 = r5.f111072b
            r0.f111095c = r5
            r0.f111096d = r6
            r0.f111097e = r7
            r0.f111100h = r4
            java.lang.Object r7 = r1.c(r6, r0)
            if (r7 != r2) goto L_0x0057
            return r2
        L_0x0057:
            r6 = r5
        L_0x0058:
            java.lang.Throwable r0 = XH.x.e(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0076
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r7 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r7
            boolean r7 = r7.s()
            if (r7 != 0) goto L_0x0071
            ug.k r6 = r6.f111078h
            boolean r6 = r6.b()
            if (r6 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r4 = r1
        L_0x0071:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        L_0x0076:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Iz.C13051q.i(java.lang.String, dI.e):java.lang.Object");
    }

    private final Uri j(Ae.l lVar, Uri uri) {
        Uri build = ow.c.a(Uri.parse("ikea://navigation/scanandgo/scanner/v1/product?entryPoint={entryPoint}&deeplink={deeplink}")).buildUpon().appendQueryParameter("entryPoint", lVar.b()).appendQueryParameter(Constants.DEEPLINK, uri.toString()).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    private final void k(C13053t tVar) {
        C10242c cVar = this.f111075e;
        if (!C17542s.e(cVar.c(), tVar.c())) {
            cVar.B(tVar.c());
            Object unused = C16312j.b((C17168i) null, new g(this, (C17164e<? super g>) null), 1, (Object) null);
            cVar.p(tVar.b());
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("User will be redirected via FTE, if logged in the user will be logged out", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    private final Ae.l l(r.b bVar) {
        int i10 = c.f111088a[bVar.ordinal()];
        if (i10 == 1) {
            return Ae.l.QR;
        }
        if (i10 == 2) {
            return Ae.l.PTAG;
        }
        if (i10 == 3) {
            return Ae.l.UNKNOWN;
        }
        throw new t();
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return Zl.b.a(this.f111082l, uri);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02d8, code lost:
        if (r2 == 2) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02da, code lost:
        if (r2 != 3) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02dc, code lost:
        r1 = new java.lang.IllegalArgumentException("Parsed unknown scanandgo applink: " + r5);
        r2 = qv.e.ERROR;
        r4 = new java.util.ArrayList();
        r3 = qv.d.f102012a.a().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0309, code lost:
        if (r3.hasNext() == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x030b, code lost:
        r5 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0317, code lost:
        if (((qv.C11819b) r5).b(r2, false) == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0319, code lost:
        r4.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x031d, code lost:
        r3 = r4.iterator();
        r4 = null;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0327, code lost:
        if (r3.hasNext() == false) goto L_0x039a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0329, code lost:
        r16 = (qv.C11819b) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0332, code lost:
        if (r4 != null) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0334, code lost:
        r4 = qv.C11818a.a((java.lang.String) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0338, code lost:
        if (r4 != null) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x033b, code lost:
        r4 = qv.C11820c.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033f, code lost:
        if (r5 != null) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0341, code lost:
        r5 = Iz.C13051q.class.getName();
        kotlin.jvm.internal.C17542s.g(r5);
        r7 = HJ.C15854t.o1(HJ.C15854t.s1(r5, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x035a, code lost:
        if (r7.length() != 0) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x035d, code lost:
        r5 = HJ.C15854t.P0(r7, "Kt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0371, code lost:
        if (HJ.C15854t.b0(java.lang.Thread.currentThread().getName(), com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME, true) == false) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0373, code lost:
        r6 = com.sugarcube.core.logger.DslKt.INDICATOR_MAIN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0376, code lost:
        r6 = com.sugarcube.core.logger.DslKt.INDICATOR_BACKGROUND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0378, code lost:
        r5 = r6 + com.sugarcube.core.logger.DslKt.INDICATOR_SEPARATOR + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x038c, code lost:
        r16.a(r2, r5, false, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03a8, code lost:
        throw new XH.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03a9, code lost:
        r2 = ow.c.a(android.net.Uri.parse("ikea://navigation/scanandgo/productInfoPage?rawValue={rawValue}&format={format}")).buildUpon().appendQueryParameter("rawValue", r5.toString()).appendQueryParameter("format", "256").build();
        kotlin.jvm.internal.C17542s.g(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d5, code lost:
        r1 = android.net.Uri.parse(r3.f111080j.a());
        kotlin.jvm.internal.C17542s.g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03eb, code lost:
        return Zl.a.C1929a.b(Zl.a.f89961a, (java.lang.Integer) null, (java.lang.String) null, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return Zl.a.C1929a.b(Zl.a.f89961a, (java.lang.Integer) null, (java.lang.String) null, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return r3.j(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x011b, code lost:
        r13 = XH.x.e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011f, code lost:
        if (r13 != null) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0121, code lost:
        r13 = (Iz.C13053t) r6;
        r14 = r12.f111081k;
        r3.f111101c = r12;
        r3.f111102d = r1;
        r3.f111103e = r2;
        r3.f111104f = r4;
        r3.f111105g = r13;
        r3.f111106h = r6;
        r3.f111107i = r13;
        r3.f111108j = 0;
        r3.f111111m = 2;
        r6 = r14.a(r13, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x013c, code lost:
        if (r6 != r5) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x013e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x013f, code lost:
        r15 = r1;
        r14 = r2;
        r1 = 0;
        r2 = r13;
        r24 = r6;
        r6 = r4;
        r4 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0148, code lost:
        r4 = (Iz.C13037c.a) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x014c, code lost:
        if ((r4 instanceof Iz.C13037c.a.b) == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0154, code lost:
        return ((Iz.C13037c.a.b) r4).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x015b, code lost:
        if (kotlin.jvm.internal.C17542s.e(r4, Iz.C13037c.a.C2685c.f111022a) != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0163, code lost:
        if (kotlin.jvm.internal.C17542s.e(r4, Iz.C13037c.a.C2684a.f111020a) == false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016d, code lost:
        return Zl.a.C1929a.b(Zl.a.f89961a, (java.lang.Integer) null, (java.lang.String) null, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0173, code lost:
        throw new XH.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0174, code lost:
        r3.f111101c = r12;
        r3.f111102d = r15;
        r3.f111103e = r14;
        r3.f111104f = r6;
        r3.f111105g = r2;
        r3.f111106h = r4;
        r3.f111107i = r13;
        r3.f111108j = r1;
        r3.f111111m = 3;
        r1 = r12.i(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x018b, code lost:
        if (r1 != r5) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x018d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x018e, code lost:
        r24 = r4;
        r4 = r1;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0199, code lost:
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x019b, code lost:
        r8 = r12;
        r4 = r2;
        r2 = r12.g(r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01be, code lost:
        throw new java.lang.IllegalArgumentException("Ptag handling for store " + r6 + " not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c1, code lost:
        if ((r13 instanceof Iz.r.a.C2692a) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01cb, code lost:
        return Zl.a.C1929a.b(Zl.a.f89961a, (java.lang.Integer) null, (java.lang.String) null, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01e3, code lost:
        throw new java.lang.IllegalArgumentException("Ptag handling for store " + r4 + " not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0203, code lost:
        if (XH.x.g(r4) == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0205, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0207, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0208, code lost:
        r6 = (Iz.C13053t) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x020a, code lost:
        if (r6 != null) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0214, code lost:
        return Zl.a.C1929a.b(Zl.a.f89961a, (java.lang.Integer) null, (java.lang.String) null, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0215, code lost:
        r7 = r8.f111081k;
        r3.f111101c = r8;
        r3.f111102d = r1;
        r3.f111103e = r2;
        r3.f111104f = r6;
        r3.f111105g = r6;
        r3.f111106h = r4;
        r3.f111111m = 5;
        r7 = r7.a(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x022a, code lost:
        if (r7 != r5) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x022c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022d, code lost:
        r24 = r7;
        r7 = r1;
        r1 = r4;
        r4 = r24;
        r25 = r6;
        r6 = r2;
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0238, code lost:
        r4 = (Iz.C13037c.a) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x023c, code lost:
        if ((r4 instanceof Iz.C13037c.a.b) == false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0244, code lost:
        return ((Iz.C13037c.a.b) r4).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024b, code lost:
        if (kotlin.jvm.internal.C17542s.e(r4, Iz.C13037c.a.C2685c.f111022a) != false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0253, code lost:
        if (kotlin.jvm.internal.C17542s.e(r4, Iz.C13037c.a.C2684a.f111020a) == false) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x025d, code lost:
        return Zl.a.C1929a.b(Zl.a.f89961a, (java.lang.Integer) null, (java.lang.String) null, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0263, code lost:
        throw new XH.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0264, code lost:
        r2 = r8.h(r2);
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x026a, code lost:
        r6 = r8.l(r2.a());
        r7 = r8.f111072b;
        r9 = r2.b();
        r3.f111101c = r8;
        r3.f111102d = r15;
        r3.f111103e = r14;
        r3.f111104f = r2;
        r3.f111105g = r6;
        r3.f111106h = r4;
        r3.f111107i = r1;
        r3.f111111m = 6;
        r4 = r7.d(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x028d, code lost:
        if (r4 != r5) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x028f, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0290, code lost:
        r1 = r6;
        r3 = r8;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0297, code lost:
        if (XH.x.e(r4) != null) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02be, code lost:
        if (XH.x.e(r3.f111077g.a(new EB.C12832d(r2.b(), ((com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r4).n(), (java.lang.String) null, false, (EB.C12829a) null, 28, (kotlin.jvm.internal.DefaultConstructorMarker) null), r1)) == null) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c8, code lost:
        return Zl.a.C1929a.b(Zl.a.f89961a, (java.lang.Integer) null, (java.lang.String) null, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c9, code lost:
        r2 = Iz.C13051q.c.f111088a[r2.a().ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d6, code lost:
        if (r2 == 1) goto L_0x03d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(android.net.Uri r27, dI.C17164e<? super android.net.Uri> r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            boolean r3 = r2 instanceof Iz.C13051q.f
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Iz.q$f r3 = (Iz.C13051q.f) r3
            int r4 = r3.f111111m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f111111m = r4
            goto L_0x001e
        L_0x0019:
            Iz.q$f r3 = new Iz.q$f
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f111109k
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f111111m
            java.lang.String r7 = " not supported"
            java.lang.String r8 = "Ptag handling for store "
            r9 = 0
            r10 = 2
            r11 = 1
            switch(r6) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00d6;
                case 2: goto L_0x00b0;
                case 3: goto L_0x008f;
                case 4: goto L_0x0072;
                case 5: goto L_0x0057;
                case 6: goto L_0x0038;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            java.lang.Object r1 = r3.f111105g
            Ae.l r1 = (Ae.l) r1
            java.lang.Object r2 = r3.f111104f
            Iz.q$b r2 = (Iz.C13051q.b) r2
            java.lang.Object r5 = r3.f111103e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r3.f111102d
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r3 = r3.f111101c
            Iz.q r3 = (Iz.C13051q) r3
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r4 = r4.j()
            goto L_0x0293
        L_0x0057:
            java.lang.Object r1 = r3.f111106h
            java.lang.Object r2 = r3.f111105g
            Iz.t r2 = (Iz.C13053t) r2
            java.lang.Object r2 = r3.f111104f
            Iz.t r2 = (Iz.C13053t) r2
            java.lang.Object r6 = r3.f111103e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r3.f111102d
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r8 = r3.f111101c
            Iz.q r8 = (Iz.C13051q) r8
            XH.y.b(r4)
            goto L_0x0238
        L_0x0072:
            java.lang.Object r1 = r3.f111103e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r3.f111102d
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r6 = r3.f111101c
            Iz.q r6 = (Iz.C13051q) r6
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r4 = r4.j()
            r8 = r6
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x01ff
        L_0x008f:
            java.lang.Object r1 = r3.f111107i
            Iz.t r1 = (Iz.C13053t) r1
            java.lang.Object r1 = r3.f111106h
            Iz.c$a r1 = (Iz.C13037c.a) r1
            java.lang.Object r2 = r3.f111105g
            Iz.t r2 = (Iz.C13053t) r2
            java.lang.Object r6 = r3.f111104f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r14 = r3.f111103e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r3.f111102d
            android.net.Uri r15 = (android.net.Uri) r15
            java.lang.Object r12 = r3.f111101c
            Iz.q r12 = (Iz.C13051q) r12
            XH.y.b(r4)
            goto L_0x0193
        L_0x00b0:
            int r1 = r3.f111108j
            java.lang.Object r2 = r3.f111107i
            Iz.t r2 = (Iz.C13053t) r2
            java.lang.Object r6 = r3.f111105g
            Iz.t r6 = (Iz.C13053t) r6
            java.lang.Object r12 = r3.f111104f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r3.f111103e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r3.f111102d
            android.net.Uri r15 = (android.net.Uri) r15
            java.lang.Object r13 = r3.f111101c
            Iz.q r13 = (Iz.C13051q) r13
            XH.y.b(r4)
            r24 = r13
            r13 = r2
            r2 = r6
            r6 = r12
            r12 = r24
            goto L_0x0148
        L_0x00d6:
            java.lang.Object r1 = r3.f111104f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.f111103e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r6 = r3.f111102d
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r12 = r3.f111101c
            Iz.q r12 = (Iz.C13051q) r12
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r4 = r4.j()
            r24 = r4
            r4 = r1
            r1 = r6
            r6 = r24
            goto L_0x011b
        L_0x00f6:
            XH.y.b(r4)
            android.content.UriMatcher r4 = r0.f111082l
            int r4 = r4.match(r1)
            if (r4 != r11) goto L_0x01ec
            java.lang.String r4 = "cc"
            java.lang.String r4 = r1.getQueryParameter(r4)
            if (r4 == 0) goto L_0x01e4
            r3.f111101c = r0
            r3.f111102d = r1
            r3.f111103e = r2
            r3.f111104f = r4
            r3.f111111m = r11
            java.lang.Object r6 = r0.f(r4, r3)
            if (r6 != r5) goto L_0x011a
            return r5
        L_0x011a:
            r12 = r0
        L_0x011b:
            java.lang.Throwable r13 = XH.x.e(r6)
            if (r13 != 0) goto L_0x01bf
            r13 = r6
            Iz.t r13 = (Iz.C13053t) r13
            Iz.c r14 = r12.f111081k
            r3.f111101c = r12
            r3.f111102d = r1
            r3.f111103e = r2
            r3.f111104f = r4
            r3.f111105g = r13
            r3.f111106h = r6
            r3.f111107i = r13
            r3.f111108j = r9
            r3.f111111m = r10
            java.lang.Object r6 = r14.a(r13, r3)
            if (r6 != r5) goto L_0x013f
            return r5
        L_0x013f:
            r15 = r1
            r14 = r2
            r1 = r9
            r2 = r13
            r24 = r6
            r6 = r4
            r4 = r24
        L_0x0148:
            Iz.c$a r4 = (Iz.C13037c.a) r4
            boolean r9 = r4 instanceof Iz.C13037c.a.b
            if (r9 == 0) goto L_0x0155
            Iz.c$a$b r4 = (Iz.C13037c.a.b) r4
            android.net.Uri r1 = r4.a()
            return r1
        L_0x0155:
            Iz.c$a$c r9 = Iz.C13037c.a.C2685c.f111022a
            boolean r9 = kotlin.jvm.internal.C17542s.e(r4, r9)
            if (r9 != 0) goto L_0x0174
            Iz.c$a$a r1 = Iz.C13037c.a.C2684a.f111020a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r4, r1)
            if (r1 == 0) goto L_0x016e
            Zl.a$a r1 = Zl.a.f89961a
            r2 = 3
            r3 = 0
            android.net.Uri r1 = Zl.a.C1929a.b(r1, r3, r3, r2, r3)
            return r1
        L_0x016e:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0174:
            r3.f111101c = r12
            r3.f111102d = r15
            r3.f111103e = r14
            r3.f111104f = r6
            r3.f111105g = r2
            r3.f111106h = r4
            r3.f111107i = r13
            r3.f111108j = r1
            r1 = 3
            r3.f111111m = r1
            java.lang.Object r1 = r12.i(r6, r3)
            if (r1 != r5) goto L_0x018e
            return r5
        L_0x018e:
            r24 = r4
            r4 = r1
            r1 = r24
        L_0x0193:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01a7
            Iz.q$b r4 = r12.g(r15, r2)
            r8 = r12
            r24 = r4
            r4 = r2
            r2 = r24
            goto L_0x026a
        L_0x01a7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r6)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bf:
            boolean r1 = r13 instanceof Iz.r.a.C2692a
            if (r1 != 0) goto L_0x01cc
            Zl.a$a r1 = Zl.a.f89961a
            r2 = 3
            r3 = 0
            android.net.Uri r1 = Zl.a.C1929a.b(r1, r3, r3, r2, r3)
            return r1
        L_0x01cc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01e4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        L_0x01ec:
            Iz.r r4 = r0.f111073c
            r3.f111101c = r0
            r3.f111102d = r1
            r3.f111103e = r2
            r6 = 4
            r3.f111111m = r6
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r5) goto L_0x01fe
            return r5
        L_0x01fe:
            r8 = r0
        L_0x01ff:
            boolean r6 = XH.x.g(r4)
            if (r6 == 0) goto L_0x0207
            r6 = 0
            goto L_0x0208
        L_0x0207:
            r6 = r4
        L_0x0208:
            Iz.t r6 = (Iz.C13053t) r6
            if (r6 != 0) goto L_0x0215
            Zl.a$a r1 = Zl.a.f89961a
            r2 = 3
            r3 = 0
            android.net.Uri r1 = Zl.a.C1929a.b(r1, r3, r3, r2, r3)
            return r1
        L_0x0215:
            Iz.c r7 = r8.f111081k
            r3.f111101c = r8
            r3.f111102d = r1
            r3.f111103e = r2
            r3.f111104f = r6
            r3.f111105g = r6
            r3.f111106h = r4
            r9 = 5
            r3.f111111m = r9
            java.lang.Object r7 = r7.a(r6, r3)
            if (r7 != r5) goto L_0x022d
            return r5
        L_0x022d:
            r24 = r7
            r7 = r1
            r1 = r4
            r4 = r24
            r25 = r6
            r6 = r2
            r2 = r25
        L_0x0238:
            Iz.c$a r4 = (Iz.C13037c.a) r4
            boolean r9 = r4 instanceof Iz.C13037c.a.b
            if (r9 == 0) goto L_0x0245
            Iz.c$a$b r4 = (Iz.C13037c.a.b) r4
            android.net.Uri r1 = r4.a()
            return r1
        L_0x0245:
            Iz.c$a$c r9 = Iz.C13037c.a.C2685c.f111022a
            boolean r9 = kotlin.jvm.internal.C17542s.e(r4, r9)
            if (r9 != 0) goto L_0x0264
            Iz.c$a$a r1 = Iz.C13037c.a.C2684a.f111020a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r4, r1)
            if (r1 == 0) goto L_0x025e
            Zl.a$a r1 = Zl.a.f89961a
            r2 = 3
            r3 = 0
            android.net.Uri r1 = Zl.a.C1929a.b(r1, r3, r3, r2, r3)
            return r1
        L_0x025e:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0264:
            Iz.q$b r2 = r8.h(r2)
            r14 = r6
            r15 = r7
        L_0x026a:
            Iz.r$b r6 = r2.a()
            Ae.l r6 = r8.l(r6)
            Ry.a r7 = r8.f111072b
            java.lang.String r9 = r2.b()
            r3.f111101c = r8
            r3.f111102d = r15
            r3.f111103e = r14
            r3.f111104f = r2
            r3.f111105g = r6
            r3.f111106h = r4
            r3.f111107i = r1
            r1 = 6
            r3.f111111m = r1
            java.lang.Object r4 = r7.d(r9, r3)
            if (r4 != r5) goto L_0x0290
            return r5
        L_0x0290:
            r1 = r6
            r3 = r8
            r5 = r15
        L_0x0293:
            java.lang.Throwable r6 = XH.x.e(r4)
            if (r6 != 0) goto L_0x03e3
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r4 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r4
            EB.d r6 = new EB.d
            java.lang.String r17 = r2.b()
            java.lang.String r18 = r4.n()
            r22 = 28
            r23 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            Oz.d r4 = r3.f111077g
            java.lang.Object r4 = r4.a(r6, r1)
            java.lang.Throwable r4 = XH.x.e(r4)
            if (r4 == 0) goto L_0x02c9
            Zl.a$a r1 = Zl.a.f89961a
            r2 = 0
            r4 = 3
            android.net.Uri r1 = Zl.a.C1929a.b(r1, r2, r2, r4, r2)
            return r1
        L_0x02c9:
            r4 = 3
            Iz.r$b r2 = r2.a()
            int[] r6 = Iz.C13051q.c.f111088a
            int r2 = r2.ordinal()
            r2 = r6[r2]
            if (r2 == r11) goto L_0x03d5
            if (r2 == r10) goto L_0x03a9
            if (r2 != r4) goto L_0x03a3
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parsed unknown scanandgo applink: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0305:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x031d
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            r7 = 0
            boolean r6 = r6.b(r2, r7)
            if (r6 == 0) goto L_0x0305
            r4.add(r5)
            goto L_0x0305
        L_0x031d:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = 0
        L_0x0323:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x039a
            java.lang.Object r6 = r3.next()
            r16 = r6
            qv.b r16 = (qv.C11819b) r16
            r6 = 0
            if (r4 != 0) goto L_0x033f
            java.lang.String r4 = qv.C11818a.a(r6, r1)
            if (r4 != 0) goto L_0x033b
            goto L_0x039a
        L_0x033b:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x033f:
            if (r5 != 0) goto L_0x038c
            java.lang.Class<Iz.q> r5 = Iz.C13051q.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            java.lang.String r7 = HJ.C15854t.s1(r5, r7, r6, r10, r6)
            r8 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r8, r6, r10, r6)
            int r6 = r7.length()
            if (r6 != 0) goto L_0x035d
            goto L_0x0363
        L_0x035d:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r7, r5)
        L_0x0363:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "main"
            boolean r6 = HJ.C15854t.b0(r6, r7, r11)
            if (r6 == 0) goto L_0x0376
            java.lang.String r6 = "m"
            goto L_0x0378
        L_0x0376:
            java.lang.String r6 = "b"
        L_0x0378:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "|"
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
        L_0x038c:
            r19 = 0
            r17 = r2
            r18 = r5
            r20 = r1
            r21 = r4
            r16.a(r17, r18, r19, r20, r21)
            goto L_0x0323
        L_0x039a:
            Zl.a$a r1 = Zl.a.f89961a
            r2 = 3
            r3 = 0
            android.net.Uri r1 = Zl.a.C1929a.b(r1, r3, r3, r2, r3)
            goto L_0x03e2
        L_0x03a3:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x03a9:
            java.lang.String r2 = "ikea://navigation/scanandgo/productInfoPage?rawValue={rawValue}&format={format}"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri r2 = ow.c.a(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r4 = "rawValue"
            java.lang.String r5 = r5.toString()
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r4, r5)
            java.lang.String r4 = "format"
            java.lang.String r5 = "256"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r4, r5)
            android.net.Uri r2 = r2.build()
            kotlin.jvm.internal.C17542s.g(r2)
            android.net.Uri r1 = r3.j(r1, r2)
            goto L_0x03e2
        L_0x03d5:
            Zs.a r1 = r3.f111080j
            java.lang.String r1 = r1.a()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            kotlin.jvm.internal.C17542s.g(r1)
        L_0x03e2:
            return r1
        L_0x03e3:
            Zl.a$a r1 = Zl.a.f89961a
            r2 = 3
            r3 = 0
            android.net.Uri r1 = Zl.a.C1929a.b(r1, r3, r3, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Iz.C13051q.b(android.net.Uri, dI.e):java.lang.Object");
    }
}
