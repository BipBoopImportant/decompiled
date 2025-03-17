package com.ingka.ikea.liveshopping.impl.data.network.model;

import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import fK.p;
import hv.C11385a;
import hv.C11387c;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\bI\b\b\u0018\u0000 z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00027{Bõ\u0001\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b#\u0010$J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u00108\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010:R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010?\u0012\u0004\bB\u0010<\u001a\u0004\b@\u0010AR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010?\u0012\u0004\bD\u0010<\u001a\u0004\bC\u0010AR\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bH\u0010<\u001a\u0004\bG\u00100R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u00108\u0012\u0004\bK\u0010<\u001a\u0004\bJ\u0010:R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bL\u00108\u0012\u0004\bN\u0010<\u001a\u0004\bM\u0010:R \u0010\u000f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bO\u0010F\u0012\u0004\bQ\u0010<\u001a\u0004\bP\u00100R \u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010<\u001a\u0004\bT\u0010UR \u0010\u0012\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bW\u0010F\u0012\u0004\bY\u0010<\u001a\u0004\bX\u00100R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bZ\u00108\u0012\u0004\b\\\u0010<\u001a\u0004\b[\u0010:R\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b]\u0010F\u0012\u0004\b_\u0010<\u001a\u0004\b^\u00100R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b`\u0010F\u0012\u0004\bb\u0010<\u001a\u0004\ba\u00100R\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bc\u0010F\u0012\u0004\be\u0010<\u001a\u0004\bd\u00100R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bf\u00108\u0012\u0004\bh\u0010<\u001a\u0004\bg\u0010:R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bi\u00108\u0012\u0004\bk\u0010<\u001a\u0004\bj\u0010:R(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\bl\u0010?\u0012\u0004\bn\u0010<\u001a\u0004\bm\u0010AR\"\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bo\u0010F\u0012\u0004\bq\u0010<\u001a\u0004\bp\u00100R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010<\u001a\u0004\bt\u0010uR \u0010\u001d\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bw\u0010F\u0012\u0004\by\u0010<\u001a\u0004\bx\u00100¨\u0006|"}, d2 = {"Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;", "Lpp/b;", "Lhv/c;", "", "seen0", "", "business", "businessFeatured", "", "", "categories", "channels", "description", "family", "featured", "id", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "label", "live", "orgId", "scheduledStart", "startedDate", "comingSoon", "startingSoon", "productSkus", "state", "Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;", "statistics", "title", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;Ljava/lang/String;LjK/T0;)V", "Lhv/a;", "b", "(Ljava/lang/String;)Lhv/a;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()Lhv/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getBusiness", "()Ljava/lang/Boolean;", "getBusiness$annotations", "()V", "getBusinessFeatured", "getBusinessFeatured$annotations", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "getCategories$annotations", "getChannels", "getChannels$annotations", "e", "Ljava/lang/String;", "getDescription", "getDescription$annotations", "f", "getFamily", "getFamily$annotations", "g", "getFeatured", "getFeatured$annotations", "h", "getId", "getId$annotations", "i", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "j", "getLabel", "getLabel$annotations", "k", "getLive", "getLive$annotations", "l", "getOrgId", "getOrgId$annotations", "m", "getScheduledStart", "getScheduledStart$annotations", "n", "getStartedDate", "getStartedDate$annotations", "o", "getComingSoon", "getComingSoon$annotations", "p", "getStartingSoon", "getStartingSoon$annotations", "q", "getProductSkus", "getProductSkus$annotations", "r", "getState", "getState$annotations", "s", "Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;", "getStatistics", "()Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;", "getStatistics$annotations", "t", "getTitle", "getTitle$annotations", "Companion", "$serializer", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShowRemote implements C11768b<C11387c> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    public static final int f96505u = 8;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final KSerializer<Object>[] f96506v;

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f96507a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f96508b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f96509c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f96510d;

    /* renamed from: e  reason: collision with root package name */
    private final String f96511e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f96512f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f96513g;

    /* renamed from: h  reason: collision with root package name */
    private final String f96514h;

    /* renamed from: i  reason: collision with root package name */
    private final ImageRemote f96515i;

    /* renamed from: j  reason: collision with root package name */
    private final String f96516j;

    /* renamed from: k  reason: collision with root package name */
    private final Boolean f96517k;

    /* renamed from: l  reason: collision with root package name */
    private final String f96518l;

    /* renamed from: m  reason: collision with root package name */
    private final String f96519m;

    /* renamed from: n  reason: collision with root package name */
    private final String f96520n;

    /* renamed from: o  reason: collision with root package name */
    private final Boolean f96521o;

    /* renamed from: p  reason: collision with root package name */
    private final Boolean f96522p;

    /* renamed from: q  reason: collision with root package name */
    private final List<String> f96523q;

    /* renamed from: r  reason: collision with root package name */
    private final String f96524r;

    /* renamed from: s  reason: collision with root package name */
    private final StatisticsRemote f96525s;

    /* renamed from: t  reason: collision with root package name */
    private final String f96526t;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "SHOW_ENDED", "Ljava/lang/String;", "SHOW_SCHEDULED", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShowRemote> serializer() {
            return ShowRemote$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        f96506v = new KSerializer[]{null, null, new C17451f(y02), new C17451f(y02), null, null, null, null, null, null, null, null, null, null, null, null, new C17451f(y02), null, null, null};
    }

    public /* synthetic */ ShowRemote(int i10, Boolean bool, Boolean bool2, List list, List list2, String str, Boolean bool3, Boolean bool4, String str2, ImageRemote imageRemote, String str3, Boolean bool5, String str4, String str5, String str6, Boolean bool6, Boolean bool7, List list3, String str7, StatisticsRemote statisticsRemote, String str8, T0 t02) {
        if (1048575 != (i10 & 1048575)) {
            E0.b(i10, 1048575, ShowRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96507a = bool;
        this.f96508b = bool2;
        this.f96509c = list;
        this.f96510d = list2;
        this.f96511e = str;
        this.f96512f = bool3;
        this.f96513g = bool4;
        this.f96514h = str2;
        this.f96515i = imageRemote;
        this.f96516j = str3;
        this.f96517k = bool5;
        this.f96518l = str4;
        this.f96519m = str5;
        this.f96520n = str6;
        this.f96521o = bool6;
        this.f96522p = bool7;
        this.f96523q = list3;
        this.f96524r = str7;
        this.f96525s = statisticsRemote;
        this.f96526t = str8;
    }

    private final C11385a b(String str) {
        return C17542s.e(str, "scheduled") ? C11385a.SCHEDULED : C17542s.e(str, "ended") ? C11385a.ENDED : C11385a.SCHEDULED;
    }

    public static final /* synthetic */ void d(ShowRemote showRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96506v;
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 0, iVar, showRemote.f96507a);
        dVar.B(serialDescriptor, 1, iVar, showRemote.f96508b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], showRemote.f96509c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], showRemote.f96510d);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 4, y02, showRemote.f96511e);
        dVar.B(serialDescriptor, 5, iVar, showRemote.f96512f);
        dVar.B(serialDescriptor, 6, iVar, showRemote.f96513g);
        dVar.y(serialDescriptor, 7, showRemote.f96514h);
        dVar.i(serialDescriptor, 8, ImageRemote$$serializer.INSTANCE, showRemote.f96515i);
        dVar.y(serialDescriptor, 9, showRemote.f96516j);
        dVar.B(serialDescriptor, 10, iVar, showRemote.f96517k);
        dVar.B(serialDescriptor, 11, y02, showRemote.f96518l);
        dVar.B(serialDescriptor, 12, y02, showRemote.f96519m);
        dVar.B(serialDescriptor, 13, y02, showRemote.f96520n);
        dVar.B(serialDescriptor, 14, iVar, showRemote.f96521o);
        dVar.B(serialDescriptor, 15, iVar, showRemote.f96522p);
        dVar.B(serialDescriptor, 16, kSerializerArr[16], showRemote.f96523q);
        dVar.B(serialDescriptor, 17, y02, showRemote.f96524r);
        dVar.B(serialDescriptor, 18, StatisticsRemote$$serializer.INSTANCE, showRemote.f96525s);
        dVar.y(serialDescriptor, 19, showRemote.f96526t);
    }

    public C11387c c() {
        Boolean bool = this.f96507a;
        Boolean bool2 = this.f96508b;
        List<String> list = this.f96509c;
        List<String> list2 = this.f96510d;
        String str = this.f96511e;
        Boolean bool3 = this.f96512f;
        Boolean bool4 = this.f96513g;
        String str2 = this.f96514h;
        Image c10 = this.f96515i.c();
        String str3 = this.f96516j;
        Boolean bool5 = this.f96517k;
        String str4 = this.f96518l;
        String str5 = this.f96519m;
        String str6 = this.f96520n;
        Boolean bool6 = this.f96521o;
        String str7 = str6;
        Boolean bool7 = this.f96522p;
        List<String> list3 = this.f96523q;
        Boolean bool8 = bool6;
        C11385a b10 = b(this.f96524r);
        StatisticsRemote statisticsRemote = this.f96525s;
        return new C11387c(bool, bool2, list, list2, str, bool3, bool4, str2, c10, str3, bool5, str4, str5, str7, bool8, bool7, list3, b10, statisticsRemote != null ? statisticsRemote.a() : null, this.f96526t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowRemote)) {
            return false;
        }
        ShowRemote showRemote = (ShowRemote) obj;
        return C17542s.e(this.f96507a, showRemote.f96507a) && C17542s.e(this.f96508b, showRemote.f96508b) && C17542s.e(this.f96509c, showRemote.f96509c) && C17542s.e(this.f96510d, showRemote.f96510d) && C17542s.e(this.f96511e, showRemote.f96511e) && C17542s.e(this.f96512f, showRemote.f96512f) && C17542s.e(this.f96513g, showRemote.f96513g) && C17542s.e(this.f96514h, showRemote.f96514h) && C17542s.e(this.f96515i, showRemote.f96515i) && C17542s.e(this.f96516j, showRemote.f96516j) && C17542s.e(this.f96517k, showRemote.f96517k) && C17542s.e(this.f96518l, showRemote.f96518l) && C17542s.e(this.f96519m, showRemote.f96519m) && C17542s.e(this.f96520n, showRemote.f96520n) && C17542s.e(this.f96521o, showRemote.f96521o) && C17542s.e(this.f96522p, showRemote.f96522p) && C17542s.e(this.f96523q, showRemote.f96523q) && C17542s.e(this.f96524r, showRemote.f96524r) && C17542s.e(this.f96525s, showRemote.f96525s) && C17542s.e(this.f96526t, showRemote.f96526t);
    }

    public int hashCode() {
        Boolean bool = this.f96507a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f96508b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.f96509c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f96510d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f96511e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.f96512f;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f96513g;
        int hashCode7 = (((((((hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31) + this.f96514h.hashCode()) * 31) + this.f96515i.hashCode()) * 31) + this.f96516j.hashCode()) * 31;
        Boolean bool5 = this.f96517k;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.f96518l;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f96519m;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f96520n;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool6 = this.f96521o;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f96522p;
        int hashCode13 = (hashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        List<String> list3 = this.f96523q;
        int hashCode14 = (hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str5 = this.f96524r;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        StatisticsRemote statisticsRemote = this.f96525s;
        if (statisticsRemote != null) {
            i10 = statisticsRemote.hashCode();
        }
        return ((hashCode15 + i10) * 31) + this.f96526t.hashCode();
    }

    public String toString() {
        Boolean bool = this.f96507a;
        Boolean bool2 = this.f96508b;
        List<String> list = this.f96509c;
        List<String> list2 = this.f96510d;
        String str = this.f96511e;
        Boolean bool3 = this.f96512f;
        Boolean bool4 = this.f96513g;
        String str2 = this.f96514h;
        ImageRemote imageRemote = this.f96515i;
        String str3 = this.f96516j;
        Boolean bool5 = this.f96517k;
        String str4 = this.f96518l;
        String str5 = this.f96519m;
        String str6 = this.f96520n;
        Boolean bool6 = this.f96521o;
        Boolean bool7 = this.f96522p;
        List<String> list3 = this.f96523q;
        String str7 = this.f96524r;
        StatisticsRemote statisticsRemote = this.f96525s;
        String str8 = this.f96526t;
        return "ShowRemote(business=" + bool + ", businessFeatured=" + bool2 + ", categories=" + list + ", channels=" + list2 + ", description=" + str + ", family=" + bool3 + ", featured=" + bool4 + ", id=" + str2 + ", image=" + imageRemote + ", label=" + str3 + ", live=" + bool5 + ", orgId=" + str4 + ", scheduledStart=" + str5 + ", startedDate=" + str6 + ", comingSoon=" + bool6 + ", startingSoon=" + bool7 + ", productSkus=" + list3 + ", state=" + str7 + ", statistics=" + statisticsRemote + ", title=" + str8 + ")";
    }
}
