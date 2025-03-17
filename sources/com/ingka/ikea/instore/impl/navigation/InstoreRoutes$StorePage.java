package com.ingka.ikea.instore.impl.navigation;

import Ht.h;
import android.net.Uri;
import fK.p;
import iK.C17395d;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 $2\u00020\u0001:\u0002\u001d%B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0016¨\u0006&"}, d2 = {"com/ingka/ikea/instore/impl/navigation/InstoreRoutes$StorePage", "", "", "action", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$StorePage;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$StorePage;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getAction$annotations", "()V", "c", "getProductId$annotations", "Companion", "$serializer", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InstoreRoutes$StorePage {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f96246c = "ikea://navigation/instore/store_page";

    /* renamed from: a  reason: collision with root package name */
    private final String f96247a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96248b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00068\u0006XD¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$StorePage$a;", "", "<init>", "()V", "LHt/h;", "action", "", "productId", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "a", "(LHt/h;Ljava/lang/String;)Landroid/net/Uri;", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$StorePage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "deeplinkBasePath", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Uri b(a aVar, h hVar, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return aVar.a(hVar, str);
        }

        public final Uri a(h hVar, String str) {
            C17542s.j(hVar, "action");
            Uri.Builder appendQueryParameter = Uri.parse(c()).buildUpon().appendQueryParameter("action", hVar.b());
            if (str != null) {
                appendQueryParameter.appendQueryParameter("productId", str);
            }
            return appendQueryParameter.build();
        }

        public final String c() {
            return InstoreRoutes$StorePage.f96246c;
        }

        public final KSerializer<InstoreRoutes$StorePage> serializer() {
            return InstoreRoutes$StorePage$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public InstoreRoutes$StorePage() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void d(InstoreRoutes$StorePage instoreRoutes$StorePage, C17395d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.z(serialDescriptor, 0) || !C17542s.e(instoreRoutes$StorePage.f96247a, h.OPEN_STORE_PAGE.b())) {
            dVar.y(serialDescriptor, 0, instoreRoutes$StorePage.f96247a);
        }
        if (dVar.z(serialDescriptor, 1) || instoreRoutes$StorePage.f96248b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, instoreRoutes$StorePage.f96248b);
        }
    }

    public final String b() {
        return this.f96247a;
    }

    public final String c() {
        return this.f96248b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstoreRoutes$StorePage)) {
            return false;
        }
        InstoreRoutes$StorePage instoreRoutes$StorePage = (InstoreRoutes$StorePage) obj;
        return C17542s.e(this.f96247a, instoreRoutes$StorePage.f96247a) && C17542s.e(this.f96248b, instoreRoutes$StorePage.f96248b);
    }

    public int hashCode() {
        int hashCode = this.f96247a.hashCode() * 31;
        String str = this.f96248b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f96247a;
        String str2 = this.f96248b;
        return "StorePage(action=" + str + ", productId=" + str2 + ")";
    }

    public /* synthetic */ InstoreRoutes$StorePage(int i10, String str, String str2, T0 t02) {
        this.f96247a = (i10 & 1) == 0 ? h.OPEN_STORE_PAGE.b() : str;
        if ((i10 & 2) == 0) {
            this.f96248b = null;
        } else {
            this.f96248b = str2;
        }
    }

    public InstoreRoutes$StorePage(String str, String str2) {
        C17542s.j(str, "action");
        this.f96247a = str;
        this.f96248b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstoreRoutes$StorePage(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? h.OPEN_STORE_PAGE.b() : str, (i10 & 2) != 0 ? null : str2);
    }
}
