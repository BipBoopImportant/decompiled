package com.ingka.ikea.appconfig.impl.service.network;

import Pl.b;
import Rl.e;
import Rl.g;
import Rl.h;
import YH.C16877v;
import com.ingka.ikea.appconfig.model.GiftCardConfiguration;
import com.ingka.ikea.appconfig.model.MapServiceData;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.C17446c0;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kp.C11522d;

@p
@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 {2\u00020\u0001:\u0002|:Bé\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013\u0012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001f\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u00104R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010?\u0012\u0004\bB\u0010>\u001a\u0004\b@\u0010AR\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010?\u0012\u0004\bE\u0010>\u001a\u0004\bD\u0010AR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010;\u0012\u0004\bG\u0010>\u001a\u0004\bF\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010>\u001a\u0004\bJ\u0010KR\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bM\u0010;\u0012\u0004\bO\u0010>\u001a\u0004\bN\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\bP\u0010;\u0012\u0004\bQ\u0010>R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010>\u001a\u0004\bT\u0010UR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bW\u0010X\u0012\u0004\b[\u0010>\u001a\u0004\bY\u0010ZR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010>\u001a\u0004\b^\u0010_R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0012\n\u0004\ba\u0010b\u0012\u0004\be\u0010>\u001a\u0004\bc\u0010dR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bf\u0010;\u0012\u0004\bh\u0010>\u001a\u0004\bg\u00104R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\f\n\u0004\bi\u0010j\u0012\u0004\bk\u0010>R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0004¢\u0006\f\n\u0004\bl\u0010S\u0012\u0004\bm\u0010>R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0004¢\u0006\f\n\u0004\bn\u0010o\u0012\u0004\bp\u0010>R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\f\n\u0004\bq\u0010]\u0012\u0004\br\u0010>R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\f\n\u0004\bs\u0010]\u0012\u0004\bt\u0010>R*\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001f8\u0002X\u0004¢\u0006\f\n\u0004\bu\u0010v\u0012\u0004\bw\u0010>R\u0011\u0010z\u001a\u00020x8F¢\u0006\u0006\u001a\u0004\bC\u0010y¨\u0006}"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote;", "", "", "seen0", "", "calendar", "Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;", "currency", "secondaryCurrency", "dateFormat", "Lcom/ingka/ikea/appconfig/impl/service/network/PriceRemote;", "price", "emptyListCarouselData", "_measurementSystem", "", "Lcom/ingka/ikea/appconfig/impl/service/network/UrlRemote;", "urls", "Lcom/ingka/ikea/appconfig/impl/service/network/HlpRemote;", "hostedLoginPage", "", "showEnergyLabelCartList", "Lcom/ingka/ikea/appconfig/impl/service/network/MapServiceRemote;", "mapService", "legalInformationFooter", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote;", "zipCodePickerConfig", "searchHints", "Lcom/ingka/ikea/appconfig/impl/service/network/GiftCardConfigurationRemote;", "giftCardConfiguration", "extendedAnalyticsTrackingEnabled", "familyAndRegularPriceSameSize", "", "Lcom/ingka/ikea/appconfig/impl/service/network/RemoteMediaRemote;", "assets", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;Ljava/lang/String;Lcom/ingka/ikea/appconfig/impl/service/network/PriceRemote;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/appconfig/impl/service/network/HlpRemote;Ljava/lang/Boolean;Lcom/ingka/ikea/appconfig/impl/service/network/MapServiceRemote;Ljava/lang/String;Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote;Ljava/util/List;Lcom/ingka/ikea/appconfig/impl/service/network/GiftCardConfigurationRemote;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "marketCode", "languageCode", "LRl/e;", "b", "(Ljava/lang/String;Ljava/lang/String;)LRl/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCalendar", "getCalendar$annotations", "()V", "Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;", "getCurrency", "()Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;", "getCurrency$annotations", "c", "getSecondaryCurrency", "getSecondaryCurrency$annotations", "getDateFormat", "getDateFormat$annotations", "e", "Lcom/ingka/ikea/appconfig/impl/service/network/PriceRemote;", "getPrice", "()Lcom/ingka/ikea/appconfig/impl/service/network/PriceRemote;", "getPrice$annotations", "f", "getEmptyListCarouselData", "getEmptyListCarouselData$annotations", "g", "get_measurementSystem$annotations", "h", "Ljava/util/List;", "getUrls", "()Ljava/util/List;", "getUrls$annotations", "i", "Lcom/ingka/ikea/appconfig/impl/service/network/HlpRemote;", "getHostedLoginPage", "()Lcom/ingka/ikea/appconfig/impl/service/network/HlpRemote;", "getHostedLoginPage$annotations", "j", "Ljava/lang/Boolean;", "getShowEnergyLabelCartList", "()Ljava/lang/Boolean;", "getShowEnergyLabelCartList$annotations", "k", "Lcom/ingka/ikea/appconfig/impl/service/network/MapServiceRemote;", "getMapService", "()Lcom/ingka/ikea/appconfig/impl/service/network/MapServiceRemote;", "getMapService$annotations", "l", "getLegalInformationFooter", "getLegalInformationFooter$annotations", "m", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote;", "getZipCodePickerConfig$annotations", "n", "getSearchHints$annotations", "o", "Lcom/ingka/ikea/appconfig/impl/service/network/GiftCardConfigurationRemote;", "getGiftCardConfiguration$annotations", "p", "getExtendedAnalyticsTrackingEnabled$annotations", "q", "getFamilyAndRegularPriceSameSize$annotations", "r", "Ljava/util/Map;", "getAssets$annotations", "LRl/g;", "()LRl/g;", "measurementSystem", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MarketConfigRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final KSerializer<Object>[] f92929s;

    /* renamed from: a  reason: collision with root package name */
    private final String f92930a;

    /* renamed from: b  reason: collision with root package name */
    private final CurrencyRemote f92931b;

    /* renamed from: c  reason: collision with root package name */
    private final CurrencyRemote f92932c;

    /* renamed from: d  reason: collision with root package name */
    private final String f92933d;

    /* renamed from: e  reason: collision with root package name */
    private final PriceRemote f92934e;

    /* renamed from: f  reason: collision with root package name */
    private final String f92935f;

    /* renamed from: g  reason: collision with root package name */
    private final String f92936g;

    /* renamed from: h  reason: collision with root package name */
    private final List<UrlRemote> f92937h;

    /* renamed from: i  reason: collision with root package name */
    private final HlpRemote f92938i;

    /* renamed from: j  reason: collision with root package name */
    private final Boolean f92939j;

    /* renamed from: k  reason: collision with root package name */
    private final MapServiceRemote f92940k;

    /* renamed from: l  reason: collision with root package name */
    private final String f92941l;

    /* renamed from: m  reason: collision with root package name */
    private final PostalCodePickerConfigRemote f92942m;

    /* renamed from: n  reason: collision with root package name */
    private final List<String> f92943n;

    /* renamed from: o  reason: collision with root package name */
    private final GiftCardConfigurationRemote f92944o;

    /* renamed from: p  reason: collision with root package name */
    private final Boolean f92945p;

    /* renamed from: q  reason: collision with root package name */
    private final Boolean f92946q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<String, RemoteMediaRemote> f92947r;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MarketConfigRemote> serializer() {
            return MarketConfigRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C17451f fVar = new C17451f(UrlRemote$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        f92929s = new KSerializer[]{null, null, null, null, null, null, null, fVar, null, null, null, null, null, new C17451f(y02), null, null, null, new C17446c0(y02, C17294a.u(RemoteMediaRemote$$serializer.INSTANCE))};
    }

    public /* synthetic */ MarketConfigRemote(int i10, String str, CurrencyRemote currencyRemote, CurrencyRemote currencyRemote2, String str2, PriceRemote priceRemote, String str3, String str4, List list, HlpRemote hlpRemote, Boolean bool, MapServiceRemote mapServiceRemote, String str5, PostalCodePickerConfigRemote postalCodePickerConfigRemote, List list2, GiftCardConfigurationRemote giftCardConfigurationRemote, Boolean bool2, Boolean bool3, Map map, T0 t02) {
        if (262143 != (i10 & 262143)) {
            E0.b(i10, 262143, MarketConfigRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92930a = str;
        this.f92931b = currencyRemote;
        this.f92932c = currencyRemote2;
        this.f92933d = str2;
        this.f92934e = priceRemote;
        this.f92935f = str3;
        this.f92936g = str4;
        this.f92937h = list;
        this.f92938i = hlpRemote;
        this.f92939j = bool;
        this.f92940k = mapServiceRemote;
        this.f92941l = str5;
        this.f92942m = postalCodePickerConfigRemote;
        this.f92943n = list2;
        this.f92944o = giftCardConfigurationRemote;
        this.f92945p = bool2;
        this.f92946q = bool3;
        this.f92947r = map;
    }

    public static final /* synthetic */ void d(MarketConfigRemote marketConfigRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f92929s;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, marketConfigRemote.f92930a);
        CurrencyRemote$$serializer currencyRemote$$serializer = CurrencyRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 1, currencyRemote$$serializer, marketConfigRemote.f92931b);
        dVar.B(serialDescriptor, 2, currencyRemote$$serializer, marketConfigRemote.f92932c);
        dVar.B(serialDescriptor, 3, y02, marketConfigRemote.f92933d);
        dVar.B(serialDescriptor, 4, PriceRemote$$serializer.INSTANCE, marketConfigRemote.f92934e);
        dVar.B(serialDescriptor, 5, y02, marketConfigRemote.f92935f);
        dVar.B(serialDescriptor, 6, y02, marketConfigRemote.f92936g);
        dVar.B(serialDescriptor, 7, kSerializerArr[7], marketConfigRemote.f92937h);
        dVar.B(serialDescriptor, 8, HlpRemote$$serializer.INSTANCE, marketConfigRemote.f92938i);
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 9, iVar, marketConfigRemote.f92939j);
        dVar.B(serialDescriptor, 10, MapServiceRemote$$serializer.INSTANCE, marketConfigRemote.f92940k);
        dVar.B(serialDescriptor, 11, y02, marketConfigRemote.f92941l);
        dVar.B(serialDescriptor, 12, PostalCodePickerConfigRemote$$serializer.INSTANCE, marketConfigRemote.f92942m);
        dVar.i(serialDescriptor, 13, kSerializerArr[13], marketConfigRemote.f92943n);
        dVar.B(serialDescriptor, 14, GiftCardConfigurationRemote$$serializer.INSTANCE, marketConfigRemote.f92944o);
        dVar.B(serialDescriptor, 15, iVar, marketConfigRemote.f92945p);
        dVar.B(serialDescriptor, 16, iVar, marketConfigRemote.f92946q);
        dVar.B(serialDescriptor, 17, kSerializerArr[17], marketConfigRemote.f92947r);
    }

    public final e b(String str, String str2) {
        List list;
        List n10;
        C17542s.j(str, "marketCode");
        C17542s.j(str2, "languageCode");
        g c10 = c();
        try {
            String str3 = this.f92930a;
            if (str3 != null) {
                CurrencyRemote currencyRemote = this.f92931b;
                if (currencyRemote != null) {
                    C11522d d10 = currencyRemote.d();
                    String str4 = this.f92933d;
                    if (str4 != null) {
                        PriceRemote priceRemote = this.f92934e;
                        if (priceRemote != null) {
                            h a10 = priceRemote.a();
                            String str5 = this.f92935f;
                            if (str5 != null) {
                                List<UrlRemote> list2 = this.f92937h;
                                if (list2 != null) {
                                    Iterable<UrlRemote> iterable = list2;
                                    list = new ArrayList(C16877v.y(iterable, 10));
                                    for (UrlRemote a11 : iterable) {
                                        list.add(a11.a());
                                    }
                                } else {
                                    list = C16877v.n();
                                }
                                HlpRemote hlpRemote = this.f92938i;
                                if (hlpRemote != null) {
                                    Rl.a b10 = hlpRemote.b();
                                    Rl.a c11 = this.f92938i.c();
                                    boolean d11 = this.f92938i.d();
                                    Boolean bool = this.f92939j;
                                    if (bool != null) {
                                        boolean booleanValue = bool.booleanValue();
                                        MapServiceRemote mapServiceRemote = this.f92940k;
                                        MapServiceData a12 = mapServiceRemote != null ? mapServiceRemote.a() : null;
                                        String str6 = this.f92941l;
                                        PostalCodePickerConfigRemote postalCodePickerConfigRemote = this.f92942m;
                                        if (postalCodePickerConfigRemote != null) {
                                            PostalCodePickerConfig b11 = postalCodePickerConfigRemote.b();
                                            List<String> list3 = this.f92943n;
                                            GiftCardConfigurationRemote giftCardConfigurationRemote = this.f92944o;
                                            GiftCardConfiguration local = giftCardConfigurationRemote != null ? giftCardConfigurationRemote.toLocal() : null;
                                            Boolean bool2 = this.f92945p;
                                            if (bool2 != null) {
                                                boolean booleanValue2 = bool2.booleanValue();
                                                Boolean bool3 = this.f92946q;
                                                boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                                                Map<String, RemoteMediaRemote> map = this.f92947r;
                                                if (map != null) {
                                                    n10 = b.b(map);
                                                    if (n10 == null) {
                                                    }
                                                    return new e(str, str2, str3, d10, str4, a10, str5, c10, list, b10, c11, d11, booleanValue, a12, str6, b11, list3, local, booleanValue2, booleanValue3, n10);
                                                }
                                                n10 = C16877v.n();
                                                return new e(str, str2, str3, d10, str4, a10, str5, c10, list, b10, c11, d11, booleanValue, a12, str6, b11, list3, local, booleanValue2, booleanValue3, n10);
                                            }
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Could not create Market Config object", e10);
        }
    }

    public final g c() {
        return g.Companion.a(this.f92936g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketConfigRemote)) {
            return false;
        }
        MarketConfigRemote marketConfigRemote = (MarketConfigRemote) obj;
        return C17542s.e(this.f92930a, marketConfigRemote.f92930a) && C17542s.e(this.f92931b, marketConfigRemote.f92931b) && C17542s.e(this.f92932c, marketConfigRemote.f92932c) && C17542s.e(this.f92933d, marketConfigRemote.f92933d) && C17542s.e(this.f92934e, marketConfigRemote.f92934e) && C17542s.e(this.f92935f, marketConfigRemote.f92935f) && C17542s.e(this.f92936g, marketConfigRemote.f92936g) && C17542s.e(this.f92937h, marketConfigRemote.f92937h) && C17542s.e(this.f92938i, marketConfigRemote.f92938i) && C17542s.e(this.f92939j, marketConfigRemote.f92939j) && C17542s.e(this.f92940k, marketConfigRemote.f92940k) && C17542s.e(this.f92941l, marketConfigRemote.f92941l) && C17542s.e(this.f92942m, marketConfigRemote.f92942m) && C17542s.e(this.f92943n, marketConfigRemote.f92943n) && C17542s.e(this.f92944o, marketConfigRemote.f92944o) && C17542s.e(this.f92945p, marketConfigRemote.f92945p) && C17542s.e(this.f92946q, marketConfigRemote.f92946q) && C17542s.e(this.f92947r, marketConfigRemote.f92947r);
    }

    public int hashCode() {
        String str = this.f92930a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CurrencyRemote currencyRemote = this.f92931b;
        int hashCode2 = (hashCode + (currencyRemote == null ? 0 : currencyRemote.hashCode())) * 31;
        CurrencyRemote currencyRemote2 = this.f92932c;
        int hashCode3 = (hashCode2 + (currencyRemote2 == null ? 0 : currencyRemote2.hashCode())) * 31;
        String str2 = this.f92933d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceRemote priceRemote = this.f92934e;
        int hashCode5 = (hashCode4 + (priceRemote == null ? 0 : priceRemote.hashCode())) * 31;
        String str3 = this.f92935f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f92936g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<UrlRemote> list = this.f92937h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        HlpRemote hlpRemote = this.f92938i;
        int hashCode9 = (hashCode8 + (hlpRemote == null ? 0 : hlpRemote.hashCode())) * 31;
        Boolean bool = this.f92939j;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        MapServiceRemote mapServiceRemote = this.f92940k;
        int hashCode11 = (hashCode10 + (mapServiceRemote == null ? 0 : mapServiceRemote.hashCode())) * 31;
        String str5 = this.f92941l;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PostalCodePickerConfigRemote postalCodePickerConfigRemote = this.f92942m;
        int hashCode13 = (((hashCode12 + (postalCodePickerConfigRemote == null ? 0 : postalCodePickerConfigRemote.hashCode())) * 31) + this.f92943n.hashCode()) * 31;
        GiftCardConfigurationRemote giftCardConfigurationRemote = this.f92944o;
        int hashCode14 = (hashCode13 + (giftCardConfigurationRemote == null ? 0 : giftCardConfigurationRemote.hashCode())) * 31;
        Boolean bool2 = this.f92945p;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f92946q;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Map<String, RemoteMediaRemote> map = this.f92947r;
        if (map != null) {
            i10 = map.hashCode();
        }
        return hashCode16 + i10;
    }

    public String toString() {
        String str = this.f92930a;
        CurrencyRemote currencyRemote = this.f92931b;
        CurrencyRemote currencyRemote2 = this.f92932c;
        String str2 = this.f92933d;
        PriceRemote priceRemote = this.f92934e;
        String str3 = this.f92935f;
        String str4 = this.f92936g;
        List<UrlRemote> list = this.f92937h;
        HlpRemote hlpRemote = this.f92938i;
        Boolean bool = this.f92939j;
        MapServiceRemote mapServiceRemote = this.f92940k;
        String str5 = this.f92941l;
        PostalCodePickerConfigRemote postalCodePickerConfigRemote = this.f92942m;
        List<String> list2 = this.f92943n;
        GiftCardConfigurationRemote giftCardConfigurationRemote = this.f92944o;
        Boolean bool2 = this.f92945p;
        Boolean bool3 = this.f92946q;
        Map<String, RemoteMediaRemote> map = this.f92947r;
        return "MarketConfigRemote(calendar=" + str + ", currency=" + currencyRemote + ", secondaryCurrency=" + currencyRemote2 + ", dateFormat=" + str2 + ", price=" + priceRemote + ", emptyListCarouselData=" + str3 + ", _measurementSystem=" + str4 + ", urls=" + list + ", hostedLoginPage=" + hlpRemote + ", showEnergyLabelCartList=" + bool + ", mapService=" + mapServiceRemote + ", legalInformationFooter=" + str5 + ", zipCodePickerConfig=" + postalCodePickerConfigRemote + ", searchHints=" + list2 + ", giftCardConfiguration=" + giftCardConfigurationRemote + ", extendedAnalyticsTrackingEnabled=" + bool2 + ", familyAndRegularPriceSameSize=" + bool3 + ", assets=" + map + ")";
    }
}
