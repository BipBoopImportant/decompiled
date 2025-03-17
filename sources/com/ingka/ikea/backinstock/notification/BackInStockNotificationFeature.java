package com.ingka.ikea.backinstock.notification;

import HJ.C15854t;
import XH.C16796C;
import YH.X;
import android.content.Context;
import com.ingka.ikea.analytics.Interaction$Component;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pv.C11782b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 42\u00020\u0001:\u00025\u0010B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH@¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020!8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$R\u001a\u0010(\u001a\u00020\u000b8\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b\"\u0010'R\u001a\u0010-\u001a\u00020\u00158\u0016XD¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\u00020\u00158\u0016XD¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b.\u0010,R\u001a\u00103\u001a\u0002008\u0016XD¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b)\u00102¨\u00066"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature;", "LRx/a;", "Landroid/content/Context;", "applicationContext", "LZw/a;", "pipNavigation", "LkK/c;", "json", "<init>", "(Landroid/content/Context;LZw/a;LkK/c;)V", "", "", "data", "Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature$BackInStockData;", "j", "(Ljava/util/Map;)Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature$BackInStockData;", "a", "(Ljava/util/Map;)Ljava/lang/String;", "Lpv/b;", "e", "(Ljava/util/Map;)Lpv/b;", "", "featureVersion", "b", "(ILjava/util/Map;LdI/e;)Ljava/lang/Object;", "g", "(Ljava/util/Map;)Ljava/util/Map;", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "LZw/a;", "c", "LkK/c;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "d", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "analyticsComponent", "Ljava/lang/String;", "()Ljava/lang/String;", "persistableName", "f", "I", "getVersion", "()I", "version", "h", "notificationVisibility", "", "Z", "()Z", "sendPushAnalytics", "i", "BackInStockData", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackInStockNotificationFeature implements Rx.a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f93083i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f93084j = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f93085a;

    /* renamed from: b  reason: collision with root package name */
    private final Zw.a f93086b;

    /* renamed from: c  reason: collision with root package name */
    private final C17514c f93087c;

    /* renamed from: d  reason: collision with root package name */
    private final Interaction$Component f93088d = Interaction$Component.BACK_IN_STOCK_NOTIFY_ME;

    /* renamed from: e  reason: collision with root package name */
    private final String f93089e = "BackInStock";

    /* renamed from: f  reason: collision with root package name */
    private final int f93090f = 1;

    /* renamed from: g  reason: collision with root package name */
    private final int f93091g = 1;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f93092h;

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001bB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u0014R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature$BackInStockData;", "", "", "seen0", "", "itemNo", "storeId", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature$BackInStockData;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getItemNo$annotations", "()V", "b", "getStoreId$annotations", "Companion", "$serializer", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class BackInStockData {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93094a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93095b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature$BackInStockData$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature$BackInStockData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<BackInStockData> serializer() {
                return BackInStockNotificationFeature$BackInStockData$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BackInStockData(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, BackInStockNotificationFeature$BackInStockData$$serializer.INSTANCE.getDescriptor());
            }
            this.f93094a = str;
            this.f93095b = str2;
        }

        public static final /* synthetic */ void c(BackInStockData backInStockData, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, backInStockData.f93094a);
            dVar.y(serialDescriptor, 1, backInStockData.f93095b);
        }

        public final String a() {
            return this.f93094a;
        }

        public final String b() {
            return this.f93095b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BackInStockData)) {
                return false;
            }
            BackInStockData backInStockData = (BackInStockData) obj;
            return C17542s.e(this.f93094a, backInStockData.f93094a) && C17542s.e(this.f93095b, backInStockData.f93095b);
        }

        public int hashCode() {
            return (this.f93094a.hashCode() * 31) + this.f93095b.hashCode();
        }

        public String toString() {
            String str = this.f93094a;
            String str2 = this.f93095b;
            return "BackInStockData(itemNo=" + str + ", storeId=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature$a;", "", "<init>", "()V", "", "FEATURE_NAME", "Ljava/lang/String;", "CONTENT_KEY", "PURPOSE", "", "VERSION", "I", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public BackInStockNotificationFeature(Context context, Zw.a aVar, C17514c cVar) {
        C17542s.j(context, "applicationContext");
        C17542s.j(aVar, "pipNavigation");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f93085a = context;
        this.f93086b = aVar;
        this.f93087c = cVar;
    }

    private final BackInStockData j(Map<String, String> map) {
        String str = map.get("content");
        if (str == null) {
            return null;
        }
        C17514c cVar = this.f93087c;
        cVar.a();
        return (BackInStockData) cVar.c(BackInStockData.Companion.serializer(), str);
    }

    public String a(Map<String, String> map) {
        C17542s.j(map, "data");
        return "BackInStock";
    }

    public Object b(int i10, Map<String, String> map, C17164e<? super String> eVar) {
        String a10;
        BackInStockData j10 = j(map);
        if (j10 == null || (a10 = j10.a()) == null) {
            return null;
        }
        return this.f93086b.b(a10, Interaction$Component.PIP_BACK_IN_STOCK_NOTIFICATIONS).toString();
    }

    public Interaction$Component c() {
        return this.f93088d;
    }

    public String d() {
        return this.f93089e;
    }

    public C11782b e(Map<String, String> map) {
        C17542s.j(map, "data");
        return C11782b.a.f101386c;
    }

    public boolean f() {
        return this.f93092h;
    }

    public Map<String, String> g(Map<String, String> map) {
        C17542s.j(map, "data");
        BackInStockData j10 = j(map);
        if (j10 != null) {
            Map<String, String> f10 = X.f(C16796C.a("fulfilment", C15854t.v0(j10.b()) ? "home_delivery" : "cash_and_carry"));
            if (f10 != null) {
                return f10;
            }
        }
        return X.j();
    }

    public int getVersion() {
        return this.f93090f;
    }

    public int h() {
        return this.f93091g;
    }
}
