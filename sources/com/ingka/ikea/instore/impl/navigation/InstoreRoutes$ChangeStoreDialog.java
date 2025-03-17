package com.ingka.ikea.instore.impl.navigation;

import android.net.Uri;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import rw.g;

@p
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 )2\u00020\u0001:\u0002\u001e*BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0017R \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001f\u0012\u0004\b'\u0010\"\u001a\u0004\b#\u0010\u0017R \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001f\u0012\u0004\b(\u0010\"\u001a\u0004\b&\u0010\u0017¨\u0006+"}, d2 = {"com/ingka/ikea/instore/impl/navigation/InstoreRoutes$ChangeStoreDialog", "", "", "seen0", "", "storeId", "productId", "changeStoreConfirmedUri", "changeStoreDeniedUri", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$ChangeStoreDialog;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$ChangeStoreDialog;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "getStoreId$annotations", "()V", "b", "d", "getProductId$annotations", "c", "getChangeStoreConfirmedUri$annotations", "getChangeStoreDeniedUri$annotations", "Companion", "$serializer", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InstoreRoutes$ChangeStoreDialog {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f96241e = "ikea://navigation/instore/store_page/appLinkChangeStore";

    /* renamed from: a  reason: collision with root package name */
    private final String f96242a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96243b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96244c;

    /* renamed from: d  reason: collision with root package name */
    private final String f96245d;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$ChangeStoreDialog$a;", "", "<init>", "()V", "", "storeId", "productId", "changeStoreConfirmedUri", "changeStoreDeniedUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$ChangeStoreDialog;", "serializer", "()Lkotlinx/serialization/KSerializer;", "deeplinkBasePath", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String str, String str2, String str3, String str4) {
            C17542s.j(str, "storeId");
            C17542s.j(str3, "changeStoreConfirmedUri");
            C17542s.j(str4, "changeStoreDeniedUri");
            Uri.Builder appendPath = Uri.parse(b()).buildUpon().appendPath(str).appendPath(str3).appendPath(str4);
            C17542s.i(appendPath, "appendPath(...)");
            return g.a(appendPath, "productId", str2).build();
        }

        public final String b() {
            return InstoreRoutes$ChangeStoreDialog.f96241e;
        }

        public final KSerializer<InstoreRoutes$ChangeStoreDialog> serializer() {
            return InstoreRoutes$ChangeStoreDialog$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ InstoreRoutes$ChangeStoreDialog(int i10, String str, String str2, String str3, String str4, T0 t02) {
        if (13 != (i10 & 13)) {
            E0.b(i10, 13, InstoreRoutes$ChangeStoreDialog$$serializer.INSTANCE.getDescriptor());
        }
        this.f96242a = str;
        if ((i10 & 2) == 0) {
            this.f96243b = null;
        } else {
            this.f96243b = str2;
        }
        this.f96244c = str3;
        this.f96245d = str4;
    }

    public static final /* synthetic */ void f(InstoreRoutes$ChangeStoreDialog instoreRoutes$ChangeStoreDialog, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, instoreRoutes$ChangeStoreDialog.f96242a);
        if (dVar.z(serialDescriptor, 1) || instoreRoutes$ChangeStoreDialog.f96243b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, instoreRoutes$ChangeStoreDialog.f96243b);
        }
        dVar.y(serialDescriptor, 2, instoreRoutes$ChangeStoreDialog.f96244c);
        dVar.y(serialDescriptor, 3, instoreRoutes$ChangeStoreDialog.f96245d);
    }

    public final String b() {
        return this.f96244c;
    }

    public final String c() {
        return this.f96245d;
    }

    public final String d() {
        return this.f96243b;
    }

    public final String e() {
        return this.f96242a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstoreRoutes$ChangeStoreDialog)) {
            return false;
        }
        InstoreRoutes$ChangeStoreDialog instoreRoutes$ChangeStoreDialog = (InstoreRoutes$ChangeStoreDialog) obj;
        return C17542s.e(this.f96242a, instoreRoutes$ChangeStoreDialog.f96242a) && C17542s.e(this.f96243b, instoreRoutes$ChangeStoreDialog.f96243b) && C17542s.e(this.f96244c, instoreRoutes$ChangeStoreDialog.f96244c) && C17542s.e(this.f96245d, instoreRoutes$ChangeStoreDialog.f96245d);
    }

    public int hashCode() {
        int hashCode = this.f96242a.hashCode() * 31;
        String str = this.f96243b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f96244c.hashCode()) * 31) + this.f96245d.hashCode();
    }

    public String toString() {
        String str = this.f96242a;
        String str2 = this.f96243b;
        String str3 = this.f96244c;
        String str4 = this.f96245d;
        return "ChangeStoreDialog(storeId=" + str + ", productId=" + str2 + ", changeStoreConfirmedUri=" + str3 + ", changeStoreDeniedUri=" + str4 + ")";
    }
}
