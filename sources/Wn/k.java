package Wn;

import Ae.e;
import Ae.j;
import HJ.C15854t;
import Nd.c;
import Nn.C10800c;
import Nn.C10808k;
import Nn.C10812o;
import Nn.C10813p;
import Nn.M;
import Nn.u;
import Rg.a;
import Wn.b;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import YH.X;
import Yn.P;
import android.os.Bundle;
import com.ingka.ikea.analytics.Interaction$Component;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.sugarcube.core.logger.DslKt;
import ho.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jo.C11435a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import ne.C10089a;
import ne.C10090b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 s2\u00020\u0001:\u0002XUB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010$\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020\u000f*\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020\u000f*\u00020,H\u0002¢\u0006\u0004\b-\u0010.J/\u00101\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J=\u00109\u001a\u00020\u00122\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0!H\u0016¢\u0006\u0004\b9\u0010:J-\u0010=\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010;\u001a\u0004\u0018\u00010/2\b\u0010<\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b=\u0010>JE\u0010F\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010/2\b\u0010E\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bF\u0010GJ+\u0010H\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010@\u001a\u00020?2\b\u0010D\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\bH\u0010IJ-\u0010L\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010J\u001a\u0004\u0018\u00010/2\b\u0010K\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\bL\u0010>J+\u0010O\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bO\u0010PJ#\u0010Q\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0012H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u000fH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00122\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J'\u0010_\u001a\u00020\u00122\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001a0!2\b\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u00122\u0006\u0010a\u001a\u00020MH\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\u00122\u0006\u0010d\u001a\u00020MH\u0016¢\u0006\u0004\be\u0010cJ\u0019\u0010g\u001a\u00020\u00122\b\u0010f\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bg\u0010YJ\u0017\u0010i\u001a\u00020\u00122\u0006\u00104\u001a\u00020hH\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u00122\u0006\u00104\u001a\u00020hH\u0016¢\u0006\u0004\bk\u0010jJ\u001f\u0010m\u001a\u00020\u00122\u0006\u00104\u001a\u00020h2\u0006\u0010l\u001a\u00020MH\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00122\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u00122\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bs\u0010tJ'\u0010v\u001a\u00020\u00122\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020,2\u0006\u0010u\u001a\u00020AH\u0016¢\u0006\u0004\bv\u0010wJ-\u0010z\u001a\u00020\u00122\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0!2\u0006\u0010C\u001a\u00020,2\u0006\u0010u\u001a\u00020AH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\u0012H\u0016¢\u0006\u0004\b|\u0010VJ\u000f\u0010}\u001a\u00020\u0012H\u0016¢\u0006\u0004\b}\u0010VJ\u0017\u0010\u001a\u00020\u00122\u0006\u0010~\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010YJ$\u0010\u0001\u001a\u00020\u00122\u0006\u0010~\u001a\u00020\u000f2\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J/\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u000f2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00102\u0007\u0010\u0001\u001a\u00020MH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010VJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010VJ\u001c\u0010\u0001\u001a\u00020\u00122\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020MH\u0016¢\u0006\u0005\b\u0001\u0010cJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010VJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010VJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010VJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010VJ\u001b\u0010\u0001\u001a\u00020\u00122\u0007\u00104\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bU\u0010\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0007\n\u0005\bX\u0010\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0007\n\u0005\bS\u0010\u0001¨\u0006\u0001"}, d2 = {"LWn/k;", "LWn/b;", "LAe/e;", "analytics", "LNd/c;", "abTesting", "Lne/a;", "adjustTracker", "LBe/a;", "contentsquareTracker", "<init>", "(LAe/e;LNd/c;Lne/a;LBe/a;)V", "LWn/b$a$b;", "selectedDelivery", "", "", "", "parameters", "LXH/N;", "N", "(LWn/b$a$b;Ljava/util/Map;)V", "Ljo/a;", "deliveryArrangementHolder", "LWn/k$b;", "S", "(Ljo/a;)LWn/k$b;", "Lho/b;", "deliveryOption", "LXH/v;", "LRg/c;", "LWn/j;", "T", "(Lho/b;)LXH/v;", "", "LMn/a;", "items", "currency", "", "Landroid/os/Bundle;", "P", "(Ljava/util/List;Ljava/lang/String;)[Landroid/os/Bundle;", "LNn/M;", "R", "(LNn/M;)Ljava/lang/String;", "LNn/p;", "Q", "(LNn/p;)Ljava/lang/String;", "", "totalValue", "A", "(Ljava/lang/String;Ljava/util/List;D)V", "LRg/a;", "type", "transactionId", "LWn/b$a;", "checkoutDeliveryInfo", "successfulPspBrandNames", "y", "(LRg/a;Ljava/lang/String;Ljava/lang/String;LWn/b$a;Ljava/util/List;)V", "deliveryPriceHome", "deliveryPriceCollect", "K", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "LYn/P;", "deliveryMethod", "LNn/u;", "fulfillmentServiceType", "deliveryServiceType", "deliveryCost", "fulfilmentTime", "p", "(Ljava/lang/String;LYn/P;LNn/u;LNn/p;Ljava/lang/Double;Ljava/lang/String;)V", "w", "(Ljava/lang/String;LYn/P;Ljava/lang/Double;)V", "cheapestDeliveryPrice", "rangeOfDaysDeliveryPrice", "J", "", "excludingTax", "j", "(Ljava/lang/String;Ljava/lang/Boolean;Lho/b;)V", "l", "(Ljava/lang/String;LWn/b$a;)V", "d", "(Lho/b;)V", "a", "()V", "editParam", "b", "(Ljava/lang/String;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "n", "(Lcom/ingka/ikea/analytics/Interaction$Component;)V", "deliveryOptions", "t", "(Ljava/util/List;Ljava/lang/Boolean;)V", "isCollapsed", "I", "(Z)V", "isDeliveryCollapsed", "D", "errorCode", "G", "LWn/b$b;", "h", "(LWn/b$b;)V", "s", "success", "B", "(LWn/b$b;Z)V", "o", "(LYn/P;)V", "Lho/b$a;", "collectDeliveryOption", "e", "(Lho/b$a;)V", "serviceType", "E", "(LYn/P;LNn/p;LNn/u;)V", "LWn/a;", "unavailableItems", "C", "(Ljava/util/List;LNn/p;LNn/u;)V", "f", "v", "transportType", "x", "LNn/c;", "capability", "c", "(Ljava/lang/String;LNn/c;)V", "key", "fieldValue", "isFrontend", "z", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "k", "g", "LWn/s;", "origin", "r", "(LWn/s;)V", "viewAllOnMapPossible", "m", "H", "u", "F", "i", "LRg/a$a;", "q", "(LRg/a$a;)V", "LAe/e;", "LNd/c;", "Lne/a;", "LBe/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f89090e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f89091f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f89092a;

    /* renamed from: b  reason: collision with root package name */
    private final Nd.c f89093b;

    /* renamed from: c  reason: collision with root package name */
    private final C10089a f89094c;

    /* renamed from: d  reason: collision with root package name */
    private final Be.a f89095d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\t"}, d2 = {"LWn/k$a;", "", "<init>", "()V", "", "DELIVERY_DATE_PATTERN", "Ljava/lang/String;", "DELIVERY_DATE_TO_FROM_FORMAT", "a", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001d\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\t¨\u0006 "}, d2 = {"LWn/k$a$a;", "Lne/b;", "", "transactionId", "", "revenue", "<init>", "(Ljava/lang/String;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "f", "D", "d", "()Ljava/lang/Double;", "g", "b", "debugToken", "h", "c", "releaseToken", "i", "a", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Wn.k$a$a  reason: collision with other inner class name */
        private static final class C1900a extends C10090b {

            /* renamed from: i  reason: collision with root package name */
            public static final C1901a f89096i = new C1901a((DefaultConstructorMarker) null);

            /* renamed from: e  reason: collision with root package name */
            private final String f89097e;

            /* renamed from: f  reason: collision with root package name */
            private final double f89098f;

            /* renamed from: g  reason: collision with root package name */
            private final String f89099g = "a4jajd";

            /* renamed from: h  reason: collision with root package name */
            private final String f89100h = "rbbxhx";

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LWn/k$a$a$a;", "", "<init>", "()V", "", "DEBUG_TOKEN", "Ljava/lang/String;", "RELEASE_TOKEN", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Wn.k$a$a$a  reason: collision with other inner class name */
            public static final class C1901a {
                public /* synthetic */ C1901a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C1901a() {
                }
            }

            public C1900a(String str, double d10) {
                C17542s.j(str, "transactionId");
                this.f89097e = str;
                this.f89098f = d10;
            }

            public String b() {
                return this.f89099g;
            }

            public String c() {
                return this.f89100h;
            }

            public Double d() {
                return Double.valueOf(this.f89098f);
            }

            public String e() {
                return this.f89097e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1900a)) {
                    return false;
                }
                C1900a aVar = (C1900a) obj;
                return C17542s.e(this.f89097e, aVar.f89097e) && Double.compare(this.f89098f, aVar.f89098f) == 0;
            }

            public int hashCode() {
                return (this.f89097e.hashCode() * 31) + Double.hashCode(this.f89098f);
            }

            public String toString() {
                String str = this.f89097e;
                double d10 = this.f89098f;
                return "AppSalesAdjustEvent(transactionId=" + str + ", revenue=" + d10 + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"LWn/k$b;", "", "", "fulfilmentMethod", "fulfilmentDeliveryDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f89101a;

        /* renamed from: b  reason: collision with root package name */
        private final String f89102b;

        public b(String str, String str2) {
            C17542s.j(str, "fulfilmentMethod");
            this.f89101a = str;
            this.f89102b = str2;
        }

        public final String a() {
            return this.f89102b;
        }

        public final String b() {
            return this.f89101a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f89101a, bVar.f89101a) && C17542s.e(this.f89102b, bVar.f89102b);
        }

        public int hashCode() {
            int hashCode = this.f89101a.hashCode() * 31;
            String str = this.f89102b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f89101a;
            String str2 = this.f89102b;
            return "DeliveryData(fulfilmentMethod=" + str + ", fulfilmentDeliveryDate=" + str2 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f89103a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f89104b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f89105c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f89106d;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0076 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007f */
        static {
            /*
                Wn.b$b[] r0 = Wn.b.C1897b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Wn.b$b r2 = Wn.b.C1897b.ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Wn.b$b r3 = Wn.b.C1897b.UPDATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f89103a = r0
                Nn.N[] r0 = Nn.N.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.N r3 = Nn.N.AUTHORITY_TO_LEAVE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                Nn.N r3 = Nn.N.WHEELCHAIR     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                f89104b = r0
                Nn.P[] r0 = Nn.P.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.P r3 = Nn.P.PARCEL     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                Nn.P r3 = Nn.P.TRUCK     // Catch:{ NoSuchFieldError -> 0x004b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                f89105c = r0
                Nn.p[] r0 = Nn.C10813p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.p r3 = Nn.C10813p.HOME     // Catch:{ NoSuchFieldError -> 0x005c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                Nn.p r1 = Nn.C10813p.PICKUP_STORE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                Nn.p r1 = Nn.C10813p.PICKUP     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                Nn.p r1 = Nn.C10813p.CLICK_AND_COLLECT_STORE     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                Nn.p r1 = Nn.C10813p.CLICK_AND_COLLECT_NEAR_YOU     // Catch:{ NoSuchFieldError -> 0x007f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                Nn.p r1 = Nn.C10813p.LOCKER     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                f89106d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Wn.k.c.<clinit>():void");
        }
    }

    public k(e eVar, Nd.c cVar, C10089a aVar, Be.a aVar2) {
        C17542s.j(eVar, "analytics");
        C17542s.j(cVar, "abTesting");
        C17542s.j(aVar, "adjustTracker");
        C17542s.j(aVar2, "contentsquareTracker");
        this.f89092a = eVar;
        this.f89093b = cVar;
        this.f89094c = aVar;
        this.f89095d = aVar2;
    }

    private final void N(b.a.C1896b bVar, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (bVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Ignoring tracking a purchase with no selectedDelivery");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = k.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            return;
        }
        String a11 = j.Companion.a(bVar.c());
        Iterable<C11435a> a12 = bVar.a();
        ArrayList<b> arrayList2 = new ArrayList<>(C16877v.y(a12, 10));
        for (C11435a S10 : a12) {
            arrayList2.add(S(S10));
        }
        int size = arrayList2.size();
        String G02 = C16877v.G0(arrayList2, ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new f(), 30, (Object) null);
        ArrayList arrayList3 = new ArrayList();
        for (b a13 : arrayList2) {
            String a14 = a13.a();
            if (a14 != null) {
                arrayList3.add(a14);
            }
        }
        String G03 = C16877v.G0(arrayList3, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
        map2.put("fulfilment_type", Q(bVar.b()));
        map2.put("fulfilment_service", a11);
        map2.put("fulfilment_method", G02);
        map2.put("fulfilment_delivery_date", G03);
        map2.put("fulfilment_quantity", Integer.valueOf(size));
    }

    /* access modifiers changed from: private */
    public static final CharSequence O(b bVar) {
        C17542s.j(bVar, "it");
        return bVar.b();
    }

    private final Bundle[] P(List<Mn.a> list, String str) {
        Iterable<Mn.a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Mn.a aVar : iterable) {
            arrayList.add(D2.d.b(C16796C.a("item_id", aVar.b()), C16796C.a("quantity", Integer.valueOf(aVar.c())), C16796C.a("price", Double.valueOf(aVar.a() / ((double) aVar.c()))), C16796C.a("currency", str)));
        }
        return (Bundle[]) arrayList.toArray(new Bundle[0]);
    }

    private final String Q(C10813p pVar) {
        Rg.c cVar;
        switch (c.f89106d[pVar.ordinal()]) {
            case 1:
                cVar = Rg.c.HOME;
                break;
            case 2:
            case 3:
                cVar = Rg.c.PUP;
                break;
            case 4:
                cVar = Rg.c.CLICK_COLLECT_STORE;
                break;
            case 5:
                cVar = Rg.c.CLICK_COLLECT_NEAR_YOU;
                break;
            case 6:
                cVar = Rg.c.LOCKER;
                break;
            default:
                throw new t();
        }
        return cVar.b();
    }

    private final String R(M m10) {
        Locale locale = Locale.US;
        String format = String.format("(%s:%s)", Arrays.copyOf(new Object[]{new SimpleDateFormat("yyyy-MM-dd", locale).format(m10.c()), new SimpleDateFormat("yyyy-MM-dd", locale).format(m10.f())}, 2));
        C17542s.i(format, "format(...)");
        return format;
    }

    private final b S(C11435a aVar) {
        i iVar;
        int i10 = c.f89105c[aVar.k().ordinal()];
        if (i10 == 1) {
            iVar = i.PARCEL;
        } else if (i10 == 2) {
            iVar = i.TRUCK;
        } else {
            throw new t();
        }
        M i11 = aVar.i();
        return new b(iVar.b(), i11 != null ? R(i11) : null);
    }

    private final v<Rg.c, j> T(ho.b bVar) {
        Rg.c cVar;
        u uVar;
        boolean z10 = bVar instanceof b.a;
        if (z10) {
            C10808k i10 = ((b.a) bVar).i();
            if (i10 instanceof C10808k.b) {
                cVar = Rg.c.LOCKER;
            } else if (i10 instanceof C10808k.c) {
                cVar = Rg.c.PUP;
            } else if (i10 instanceof C10808k.d) {
                cVar = Rg.c.CLICK_COLLECT_STORE;
            } else if (i10 instanceof C10808k.a) {
                cVar = Rg.c.CLICK_COLLECT_NEAR_YOU;
            } else {
                throw new t();
            }
        } else if (bVar instanceof b.C2205b) {
            cVar = Rg.c.HOME;
        } else {
            throw new t();
        }
        if (z10) {
            C10812o oVar = (C10812o) C16877v.y0(((b.a) bVar).i().a());
            if (oVar == null || (uVar = oVar.k()) == null) {
                uVar = u.STANDARD;
            }
        } else if (bVar instanceof b.C2205b) {
            uVar = ((b.C2205b) bVar).i().k();
        } else {
            throw new t();
        }
        return new v<>(cVar, j.Companion.b(uVar));
    }

    /* access modifiers changed from: private */
    public static final CharSequence U(b bVar) {
        C17542s.j(bVar, "it");
        return bVar.b();
    }

    public void A(String str, List<Mn.a> list, double d10) {
        C17542s.j(list, "items");
        this.f89092a.track("begin_checkout", X.m(C16796C.a("currency", str), C16796C.a("value", Double.valueOf(d10)), C16796C.a("items", P(list, str))));
        this.f89093b.d(Nd.b.VISITED_BEGIN_CHECKOUT, Boolean.TRUE);
        c.a.a(this.f89093b, "begin_checkout", (Map) null, (Map) null, 6, (Object) null);
    }

    public void B(b.C1897b bVar, boolean z10) {
        String str;
        C17542s.j(bVar, "type");
        j jVar = z10 ? j.ACTION_SUCCESS : j.ACTION_FAIL;
        int i10 = c.f89103a[bVar.ordinal()];
        if (i10 == 1) {
            str = "add_new_address";
        } else if (i10 == 2) {
            str = "update_address";
        } else {
            throw new t();
        }
        e.c.c(this.f89092a, jVar.b(), X.f(C16796C.a("component_value", str)), Interaction$Component.CHECKOUT_PROFILE_ADDRESS_SELECTED, (e.b) null, 8, (Object) null);
    }

    public void C(List<a> list, C10813p pVar, u uVar) {
        C17542s.j(list, "unavailableItems");
        C17542s.j(pVar, "deliveryServiceType");
        C17542s.j(uVar, "serviceType");
        for (a aVar : list) {
            this.f89092a.track(r.CHECKOUT_PROGRESS_UNAVAILABLE_CLICK.b(), X.m(C16796C.a("item_id", aVar.a()), C16796C.a("quantity", Integer.valueOf(aVar.b())), C16796C.a("fulfilment_type", Q(pVar)), C16796C.a("fulfilment_service", j.Companion.a(uVar))));
        }
    }

    public void D(boolean z10) {
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "to_payment"), C16796C.a("checkout_option_value", z10 ? "collapsed_delivery" : "regular"), C16796C.a("checkout_step", 2)));
        c.a.a(this.f89093b, "to_payment", (Map) null, (Map) null, 6, (Object) null);
    }

    public void E(P p10, C10813p pVar, u uVar) {
        C17542s.j(p10, "deliveryMethod");
        C17542s.j(pVar, "deliveryServiceType");
        C17542s.j(uVar, "serviceType");
        this.f89092a.track(r.UNAVAILABLE_ITEMS.b(), X.m(C16796C.a("type", "checkout_progress"), C16796C.a("fulfilment_option", h.Companion.a(p10)), C16796C.a("fulfilment_type", Q(pVar)), C16796C.a("fulfilment_service", j.Companion.a(uVar))));
    }

    public void F() {
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "google_pay_option"), C16796C.a("checkout_step", 1)));
    }

    public void G(String str) {
        e.c.a(this.f89092a, "checkout_pre_select_delivery", Ae.d.SYS_ERROR, str, (Map) null, 8, (Object) null);
    }

    public void H() {
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "view_all_on_map"), C16796C.a("checkout_step", 1)));
    }

    public void I(boolean z10) {
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "address_view"), C16796C.a("checkout_option_value", z10 ? t.COLLAPSED.b() : t.EXPANDED.b()), C16796C.a("checkout_step", 1)));
    }

    public void J(String str, Double d10, Double d11) {
        Map p10 = X.p(C16796C.a("checkout_option", "displayed_delivery_options"), C16796C.a("fulfilment_value", d10), C16796C.a("currency", str), C16796C.a("checkout_step", 1));
        if (d11 != null) {
            p10.put("fulfilment_value_range_of_days", d11);
        }
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), p10);
    }

    public void K(String str, Double d10, Double d11) {
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "fulfilment_viewed"), C16796C.a("delivery_value", d10), C16796C.a("pickup_value", d11), C16796C.a("currency", str), C16796C.a("checkout_step", 1)));
    }

    public void a() {
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "edit_delivery_time"), C16796C.a("checkout_step", 1)));
    }

    public void b(String str) {
        C17542s.j(str, "editParam");
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "edit_collapsed_checkout"), C16796C.a("checkout_option_value", str), C16796C.a("checkout_step", 1)));
        c.a.a(this.f89093b, "edit_collapsed_checkout", (Map) null, (Map) null, 6, (Object) null);
    }

    public void c(String str, C10800c cVar) {
        String str2;
        C17542s.j(str, "transportType");
        C17542s.j(cVar, "capability");
        int i10 = c.f89104b[cVar.b().ordinal()];
        if (i10 == 1) {
            str2 = "contactless_delivery";
        } else if (i10 == 2) {
            str2 = "wheelchair_delivery";
        } else {
            throw new t();
        }
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", str2), C16796C.a("checkout_option_value", cVar.a() ? "yes" : "no"), C16796C.a("fulfilment_method", str), C16796C.a("checkout_step", 1)));
    }

    public void d(ho.b bVar) {
        C17542s.j(bVar, "deliveryOption");
        v<Rg.c, j> T10 = T(bVar);
        e.c.b(this.f89092a, Interaction$Component.SHOW_MORE_INFORMATION, (String) null, X.m(C16796C.a("fulfilment_type", T10.a().b()), C16796C.a("fulfilment_service", T10.b().b())), (e.b) null, 10, (Object) null);
    }

    public void e(b.a aVar) {
        C17542s.j(aVar, "collectDeliveryOption");
        this.f89092a.track(r.UNAVAILABLE_ITEMS.b(), X.m(C16796C.a("fulfilment_option", h.COLLECT.b()), C16796C.a("fulfilment_type", T(aVar).c().b())));
    }

    public void f() {
        this.f89092a.track(r.UNAVAILABLE_ITEMS_BUY.b(), (Map<String, ? extends Object>) null);
    }

    public void g() {
        this.f89092a.track(r.CHANGE_PICK_UP_POINT.b(), (Map<String, ? extends Object>) null);
    }

    public void h(b.C1897b bVar) {
        String str;
        C17542s.j(bVar, "type");
        int i10 = c.f89103a[bVar.ordinal()];
        if (i10 == 1) {
            str = "add_new_address";
        } else if (i10 == 2) {
            str = "update_address";
        } else {
            throw new t();
        }
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", Interaction$Component.CHECKOUT_PROFILE_ADDRESS_VIEWED.getValue()), C16796C.a("checkout_option_value", str)));
    }

    public void i() {
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "google_pay_option_click"), C16796C.a("checkout_step", 1)));
    }

    public void j(String str, Boolean bool, ho.b bVar) {
        C17542s.j(bVar, "deliveryOption");
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "delivery_option"), C16796C.a("checkout_option_value", T(bVar).b().b()), C16796C.a("fulfilment_value", bVar.e(Boolean.valueOf(!C17542s.e(bool, Boolean.TRUE)))), C16796C.a("currency", str), C16796C.a("checkout_step", 1)));
    }

    public void k() {
        this.f89092a.track(r.CHECKOUT_PROFILE_FETCH_FAILED.b(), (Map<String, ? extends Object>) null);
    }

    public void l(String str, b.a aVar) {
        b.a.C1896b c10 = aVar != null ? aVar.c() : null;
        if (c10 == null) {
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Unable to report progress, no selected delivery holder", (Throwable) null);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str3 == null) {
                    String name = k.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str3;
                bVar.a(eVar, str4, false, (Throwable) null, str2);
                str3 = str4;
            }
            return;
        }
        Double a11 = aVar.b().a();
        Iterable<C11435a> a12 = c10.a();
        ArrayList<b> arrayList2 = new ArrayList<>(C16877v.y(a12, 10));
        for (C11435a S10 : a12) {
            arrayList2.add(S(S10));
        }
        int size = arrayList2.size();
        String G02 = C16877v.G0(arrayList2, ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new g(), 30, (Object) null);
        ArrayList arrayList3 = new ArrayList();
        for (b a13 : arrayList2) {
            String a14 = a13.a();
            if (a14 != null) {
                arrayList3.add(a14);
            }
        }
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "estimated_delivery_date"), C16796C.a("checkout_option_value", C16877v.G0(arrayList3, ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null)), C16796C.a("fulfilment_quantity", Integer.valueOf(size)), C16796C.a("fulfilment_method", G02), C16796C.a("fulfilment_value", a11), C16796C.a("currency", str), C16796C.a("checkout_step", 1)));
    }

    public void m(boolean z10) {
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "view_locations_on_map"), C16796C.a("checkout_option_value", z10 ? "displayed" : "not_displayed"), C16796C.a("checkout_step", 1)));
    }

    public void n(Interaction$Component interaction$Component) {
        C17542s.j(interaction$Component, "component");
        e.c.c(this.f89092a, Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "compare_change_delivery_method"), C16796C.a("checkout_option_value", q.FULFILMENT_TYPE.b()), C16796C.a("checkout_step", 1)), interaction$Component, (e.b) null, 8, (Object) null);
        c.a.a(this.f89093b, "change_delivery_method", (Map) null, (Map) null, 6, (Object) null);
    }

    public void o(P p10) {
        C17542s.j(p10, "deliveryMethod");
        this.f89092a.track(r.UNAVAILABLE_ITEMS.b(), X.f(C16796C.a("fulfilment_option", h.Companion.a(p10))));
    }

    public void p(String str, P p10, u uVar, C10813p pVar, Double d10, String str2) {
        P p11 = p10;
        u uVar2 = uVar;
        C10813p pVar2 = pVar;
        C17542s.j(p11, "deliveryMethod");
        C17542s.j(uVar2, "fulfillmentServiceType");
        C17542s.j(pVar2, "deliveryServiceType");
        j b10 = j.Companion.b(uVar2);
        String str3 = str;
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "collapsed_fulfilment_viewed"), C16796C.a("checkout_option_value", h.Companion.a(p11)), C16796C.a("fulfilment_value", d10), C16796C.a("currency", str), C16796C.a("fulfilment_type", Q(pVar2)), C16796C.a("fulfilment_service", b10.b()), C16796C.a("fulfilment_time", str2), C16796C.a("checkout_step", 1)));
    }

    public void q(a.C1085a aVar) {
        String str;
        C17542s.j(aVar, "type");
        if (C17542s.e(aVar, a.C1085a.b.f63200a)) {
            str = "google_pay_regular_bottom_sheet_checkout";
        } else if (C17542s.e(aVar, a.C1085a.C1086a.f63198a)) {
            str = "google_pay_cart_bottom_sheet_checkout";
        } else {
            throw new t();
        }
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "to_payment"), C16796C.a("checkout_option_value", str), C16796C.a("checkout_step", 2)));
    }

    public void r(s sVar) {
        C17542s.j(sVar, "origin");
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "choose_pickup_origin"), C16796C.a("checkout_option_value", sVar.b()), C16796C.a("checkout_step", 1)));
    }

    public void s(b.C1897b bVar) {
        String str;
        C17542s.j(bVar, "type");
        int i10 = c.f89103a[bVar.ordinal()];
        if (i10 == 1) {
            str = "add_new_address";
        } else if (i10 == 2) {
            str = "update_address";
        } else {
            throw new t();
        }
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", Interaction$Component.CHECKOUT_PROFILE_ADDRESS_SELECTED.getValue()), C16796C.a("checkout_option_value", str), C16796C.a("checkout_step", 1)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ho.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(java.util.List<? extends ho.b> r11, java.lang.Boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "deliveryOptions"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            boolean r0 = r11.hasNext()
            r1 = 1
            if (r0 != 0) goto L_0x0014
            r11 = 0
            goto L_0x006c
        L_0x0014:
            java.lang.Object r0 = r11.next()
            boolean r2 = r11.hasNext()
            if (r2 != 0) goto L_0x0020
        L_0x001e:
            r11 = r0
            goto L_0x006c
        L_0x0020:
            r2 = r0
            ho.b r2 = (ho.b) r2
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.C17542s.e(r12, r3)
            r3 = r3 ^ r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Double r2 = r2.e(r3)
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r2 == 0) goto L_0x003e
            double r5 = r2.doubleValue()
            goto L_0x003f
        L_0x003e:
            r5 = r3
        L_0x003f:
            java.lang.Object r2 = r11.next()
            r7 = r2
            ho.b r7 = (ho.b) r7
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.C17542s.e(r12, r8)
            r8 = r8 ^ r1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.Double r7 = r7.e(r8)
            if (r7 == 0) goto L_0x005c
            double r7 = r7.doubleValue()
            goto L_0x005d
        L_0x005c:
            r7 = r3
        L_0x005d:
            int r9 = java.lang.Double.compare(r5, r7)
            if (r9 <= 0) goto L_0x0065
            r0 = r2
            r5 = r7
        L_0x0065:
            boolean r2 = r11.hasNext()
            if (r2 != 0) goto L_0x003f
            goto L_0x001e
        L_0x006c:
            ho.b r11 = (ho.b) r11
            if (r11 != 0) goto L_0x0071
            return
        L_0x0071:
            XH.v r0 = r10.T(r11)
            java.lang.Object r2 = r0.a()
            Rg.c r2 = (Rg.c) r2
            java.lang.Object r0 = r0.b()
            Wn.j r0 = (Wn.j) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r3)
            r12 = r12 ^ r1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            java.lang.Double r11 = r11.e(r12)
            java.lang.String r12 = "checkout_option"
            java.lang.String r3 = "delivery_cost_bottom_sheet"
            XH.v r12 = XH.C16796C.a(r12, r3)
            java.lang.String r3 = "fulfilment_type"
            java.lang.String r2 = r2.b()
            XH.v r2 = XH.C16796C.a(r3, r2)
            java.lang.String r3 = "fulfilment_service"
            java.lang.String r0 = r0.b()
            XH.v r0 = XH.C16796C.a(r3, r0)
            java.lang.String r3 = "fulfilment_value"
            XH.v r11 = XH.C16796C.a(r3, r11)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "checkout_step"
            XH.v r1 = XH.C16796C.a(r3, r1)
            XH.v[] r11 = new XH.v[]{r12, r2, r0, r11, r1}
            java.util.Map r11 = YH.X.m(r11)
            Ae.e r12 = r10.f89092a
            Rg.b r0 = Rg.b.CHECKOUT_PROGRESS
            java.lang.String r0 = r0.b()
            r12.track(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Wn.k.t(java.util.List, java.lang.Boolean):void");
    }

    public void u() {
        this.f89092a.track(r.AMBIGUOUS_AREA_CONFIRM.b(), (Map<String, ? extends Object>) null);
    }

    public void v() {
        this.f89092a.track(r.UNAVAILABLE_ITEMS_CHANGE_DELIVERY.b(), (Map<String, ? extends Object>) null);
    }

    public void w(String str, P p10, Double d10) {
        C17542s.j(p10, "deliveryMethod");
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "fulfilment_selected"), C16796C.a("checkout_option_value", h.Companion.a(p10)), C16796C.a("fulfilment_value", d10), C16796C.a("currency", str), C16796C.a("checkout_step", 1)));
    }

    public void x(String str) {
        C17542s.j(str, "transportType");
        this.f89092a.track(r.CHANGE_DELIVERY_TIME_SLOT.b(), X.f(C16796C.a("delivery_update_time_slot", str)));
        this.f89092a.track(Rg.b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "delivery_time_changed"), C16796C.a("checkout_option_value", str), C16796C.a("checkout_step", 1)));
    }

    public void y(Rg.a aVar, String str, String str2, b.a aVar2, List<String> list) {
        Rg.a aVar3 = aVar;
        String str3 = str;
        String str4 = str2;
        List<String> list2 = list;
        C17542s.j(aVar3, "type");
        C17542s.j(str3, "transactionId");
        C17542s.j(str4, "currency");
        C17542s.j(aVar2, "checkoutDeliveryInfo");
        C17542s.j(list2, "successfulPspBrandNames");
        if (aVar2.a() == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to track purchase, items are null");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str5 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str6 == null) {
                    String name = k.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str6, false, illegalArgumentException, str5);
            }
            return;
        }
        b.a.C1894a b10 = aVar2.b();
        double b11 = b10.b();
        int i10 = 0;
        for (Mn.a c10 : aVar2.a()) {
            i10 += c10.c();
        }
        v a11 = C16796C.a("transaction_id", str3);
        v a12 = C16796C.a("currency", str4);
        v a13 = C16796C.a("value", Double.valueOf(b11));
        v a14 = C16796C.a("tax", Double.valueOf(b10.d()));
        Double a15 = b10.a();
        Map p10 = X.p(a11, a12, a13, a14, C16796C.a("shipping", Double.valueOf(a15 != null ? a15.doubleValue() : 0.0d)), C16796C.a("quantity", Integer.valueOf(i10)));
        p10.put("value_inclTax", Double.valueOf(b11));
        p10.put("value_exclTax", b10.c());
        p10.put("items", P(aVar2.a(), str4));
        N(aVar2.c(), p10);
        if (aVar3 instanceof a.C1085a) {
            p10.put("payment_type", CheckoutConstants.PaymentBrands.GOOGLEPAY);
        } else if (C17542s.e(aVar3, a.b.f63202a)) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                p10.put("payment_type", C16877v.G0(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
            }
        } else {
            throw new t();
        }
        p10.put("checkout_type", aVar.a());
        this.f89092a.track("purchase", p10);
        this.f89093b.a(b11, aVar2.a().size(), str, c.b.ONLINE);
        this.f89094c.a(new a.C1900a(str3, b11));
        this.f89095d.b(str3, b11, str4);
    }

    public void z(String str, Object obj, boolean z10) {
        String str2;
        C17542s.j(str, "key");
        String str3 = obj instanceof String ? (String) obj : null;
        if (str3 != null && (str2 = str3.toString()) != null && !C15854t.v0(str2)) {
            this.f89092a.track(r.FIELD_VALIDATION_ERROR.b(), X.m(C16796C.a("field_key", str), C16796C.a("type", z10 ? "frontend" : "backend")));
        }
    }
}
