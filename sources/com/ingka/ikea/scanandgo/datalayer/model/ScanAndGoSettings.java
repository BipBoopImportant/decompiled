package com.ingka.ikea.scanandgo.datalayer.model;

import androidx.recyclerview.widget.RecyclerView;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17458i0;
import jK.E0;
import jK.J;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import rz.N;

@p
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\b\u0018\u0000 M2\u00020\u0001:\u0002N0B«\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019B­\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J¾\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010*R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bG\u0010CR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\bI\u0010CR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010A\u001a\u0004\b<\u0010CR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\bK\u0010CR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u0010A\u001a\u0004\b:\u0010CR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bL\u0010A\u001a\u0004\b@\u0010CR\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b;\u0010A\u001a\u0004\bL\u0010CR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\bJ\u0010CR\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bH\u0010C¨\u0006O"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "", "", "countryCode", "", "languageCodes", "Lrz/N;", "scanAndGoVersion", "storeName", "", "timeout", "", "digitalReceipt", "Lcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;", "upptacka", "isCouponEnabled", "isPtagLinksSupported", "caasEnabled", "isCoworkerDiscountEnabled", "caasCheckoutEnabled", "caasFullserveEnabled", "showTotalPricesInclVat", "fullserveTimeSlotsEnabled", "fullserveEarlyPaymentEnabled", "<init>", "(Ljava/lang/String;Ljava/util/List;Lrz/N;Ljava/lang/String;Ljava/lang/Long;ZLcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;ZZZZZZZZZ)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lrz/N;Ljava/lang/String;Ljava/lang/Long;ZLcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;ZZZZZZZZZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "t", "(Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "(Ljava/lang/String;Ljava/util/List;Lrz/N;Ljava/lang/String;Ljava/lang/Long;ZLcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;ZZZZZZZZZ)Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "Ljava/util/List;", "k", "()Ljava/util/List;", "c", "Lrz/N;", "l", "()Lrz/N;", "d", "n", "e", "Ljava/lang/Long;", "o", "()Ljava/lang/Long;", "f", "Z", "h", "()Z", "Lcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;", "p", "()Lcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;", "q", "i", "s", "j", "r", "m", "Companion", "$serializer", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoSettings {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final KSerializer<Object>[] f120143q = {null, new C17451f(Y0.f144077a), J.b("com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoVersion", N.values()), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f120144a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f120145b;

    /* renamed from: c  reason: collision with root package name */
    private final N f120146c;

    /* renamed from: d  reason: collision with root package name */
    private final String f120147d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f120148e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f120149f;

    /* renamed from: g  reason: collision with root package name */
    private final UpptackaSettings f120150g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f120151h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f120152i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f120153j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f120154k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f120155l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f120156m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f120157n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f120158o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f120159p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ScanAndGoSettings> serializer() {
            return ScanAndGoSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ScanAndGoSettings(int i10, String str, List list, N n10, String str2, Long l10, boolean z10, UpptackaSettings upptackaSettings, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, T0 t02) {
        int i11 = i10;
        if (188 != (i11 & 188)) {
            E0.b(i10, 188, ScanAndGoSettings$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f120144a = null;
        } else {
            this.f120144a = str;
        }
        if ((i11 & 2) == 0) {
            this.f120145b = null;
        } else {
            this.f120145b = list;
        }
        this.f120146c = n10;
        this.f120147d = str2;
        this.f120148e = l10;
        this.f120149f = z10;
        if ((i11 & 64) == 0) {
            this.f120150g = null;
        } else {
            this.f120150g = upptackaSettings;
        }
        this.f120151h = z11;
        if ((i11 & 256) == 0) {
            this.f120152i = false;
        } else {
            this.f120152i = z12;
        }
        if ((i11 & 512) == 0) {
            this.f120153j = false;
        } else {
            this.f120153j = z13;
        }
        if ((i11 & 1024) == 0) {
            this.f120154k = false;
        } else {
            this.f120154k = z14;
        }
        if ((i11 & RecyclerView.n.FLAG_MOVED) == 0) {
            this.f120155l = false;
        } else {
            this.f120155l = z15;
        }
        if ((i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.f120156m = false;
        } else {
            this.f120156m = z16;
        }
        if ((i11 & 8192) == 0) {
            this.f120157n = false;
        } else {
            this.f120157n = z17;
        }
        if ((i11 & 16384) == 0) {
            this.f120158o = false;
        } else {
            this.f120158o = z18;
        }
        if ((i11 & 32768) == 0) {
            this.f120159p = false;
        } else {
            this.f120159p = z19;
        }
    }

    public static /* synthetic */ ScanAndGoSettings c(ScanAndGoSettings scanAndGoSettings, String str, List list, N n10, String str2, Long l10, boolean z10, UpptackaSettings upptackaSettings, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i10, Object obj) {
        ScanAndGoSettings scanAndGoSettings2 = scanAndGoSettings;
        int i11 = i10;
        return scanAndGoSettings.b((i11 & 1) != 0 ? scanAndGoSettings2.f120144a : str, (i11 & 2) != 0 ? scanAndGoSettings2.f120145b : list, (i11 & 4) != 0 ? scanAndGoSettings2.f120146c : n10, (i11 & 8) != 0 ? scanAndGoSettings2.f120147d : str2, (i11 & 16) != 0 ? scanAndGoSettings2.f120148e : l10, (i11 & 32) != 0 ? scanAndGoSettings2.f120149f : z10, (i11 & 64) != 0 ? scanAndGoSettings2.f120150g : upptackaSettings, (i11 & 128) != 0 ? scanAndGoSettings2.f120151h : z11, (i11 & 256) != 0 ? scanAndGoSettings2.f120152i : z12, (i11 & 512) != 0 ? scanAndGoSettings2.f120153j : z13, (i11 & 1024) != 0 ? scanAndGoSettings2.f120154k : z14, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? scanAndGoSettings2.f120155l : z15, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? scanAndGoSettings2.f120156m : z16, (i11 & 8192) != 0 ? scanAndGoSettings2.f120157n : z17, (i11 & 16384) != 0 ? scanAndGoSettings2.f120158o : z18, (i11 & 32768) != 0 ? scanAndGoSettings2.f120159p : z19);
    }

    public static final /* synthetic */ void t(ScanAndGoSettings scanAndGoSettings, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120143q;
        if (dVar.z(serialDescriptor, 0) || scanAndGoSettings.f120144a != null) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, scanAndGoSettings.f120144a);
        }
        if (dVar.z(serialDescriptor, 1) || scanAndGoSettings.f120145b != null) {
            dVar.B(serialDescriptor, 1, kSerializerArr[1], scanAndGoSettings.f120145b);
        }
        dVar.i(serialDescriptor, 2, kSerializerArr[2], scanAndGoSettings.f120146c);
        dVar.y(serialDescriptor, 3, scanAndGoSettings.f120147d);
        dVar.B(serialDescriptor, 4, C17458i0.f144113a, scanAndGoSettings.f120148e);
        dVar.x(serialDescriptor, 5, scanAndGoSettings.f120149f);
        if (dVar.z(serialDescriptor, 6) || scanAndGoSettings.f120150g != null) {
            dVar.B(serialDescriptor, 6, UpptackaSettings$$serializer.INSTANCE, scanAndGoSettings.f120150g);
        }
        dVar.x(serialDescriptor, 7, scanAndGoSettings.f120151h);
        if (dVar.z(serialDescriptor, 8) || scanAndGoSettings.f120152i) {
            dVar.x(serialDescriptor, 8, scanAndGoSettings.f120152i);
        }
        if (dVar.z(serialDescriptor, 9) || scanAndGoSettings.f120153j) {
            dVar.x(serialDescriptor, 9, scanAndGoSettings.f120153j);
        }
        if (dVar.z(serialDescriptor, 10) || scanAndGoSettings.f120154k) {
            dVar.x(serialDescriptor, 10, scanAndGoSettings.f120154k);
        }
        if (dVar.z(serialDescriptor, 11) || scanAndGoSettings.f120155l) {
            dVar.x(serialDescriptor, 11, scanAndGoSettings.f120155l);
        }
        if (dVar.z(serialDescriptor, 12) || scanAndGoSettings.f120156m) {
            dVar.x(serialDescriptor, 12, scanAndGoSettings.f120156m);
        }
        if (dVar.z(serialDescriptor, 13) || scanAndGoSettings.f120157n) {
            dVar.x(serialDescriptor, 13, scanAndGoSettings.f120157n);
        }
        if (dVar.z(serialDescriptor, 14) || scanAndGoSettings.f120158o) {
            dVar.x(serialDescriptor, 14, scanAndGoSettings.f120158o);
        }
        if (dVar.z(serialDescriptor, 15) || scanAndGoSettings.f120159p) {
            dVar.x(serialDescriptor, 15, scanAndGoSettings.f120159p);
        }
    }

    public final ScanAndGoSettings b(String str, List<String> list, N n10, String str2, Long l10, boolean z10, UpptackaSettings upptackaSettings, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        String str3 = str;
        C17542s.j(n10, "scanAndGoVersion");
        C17542s.j(str2, "storeName");
        return new ScanAndGoSettings(str, list, n10, str2, l10, z10, upptackaSettings, z11, z12, z13, z14, z15, z16, z17, z18, z19);
    }

    public final boolean d() {
        return this.f120155l;
    }

    public final boolean e() {
        return this.f120153j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoSettings)) {
            return false;
        }
        ScanAndGoSettings scanAndGoSettings = (ScanAndGoSettings) obj;
        return C17542s.e(this.f120144a, scanAndGoSettings.f120144a) && C17542s.e(this.f120145b, scanAndGoSettings.f120145b) && this.f120146c == scanAndGoSettings.f120146c && C17542s.e(this.f120147d, scanAndGoSettings.f120147d) && C17542s.e(this.f120148e, scanAndGoSettings.f120148e) && this.f120149f == scanAndGoSettings.f120149f && C17542s.e(this.f120150g, scanAndGoSettings.f120150g) && this.f120151h == scanAndGoSettings.f120151h && this.f120152i == scanAndGoSettings.f120152i && this.f120153j == scanAndGoSettings.f120153j && this.f120154k == scanAndGoSettings.f120154k && this.f120155l == scanAndGoSettings.f120155l && this.f120156m == scanAndGoSettings.f120156m && this.f120157n == scanAndGoSettings.f120157n && this.f120158o == scanAndGoSettings.f120158o && this.f120159p == scanAndGoSettings.f120159p;
    }

    public final boolean f() {
        return this.f120156m;
    }

    public final String g() {
        return this.f120144a;
    }

    public final boolean h() {
        return this.f120149f;
    }

    public int hashCode() {
        String str = this.f120144a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.f120145b;
        int hashCode2 = (((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f120146c.hashCode()) * 31) + this.f120147d.hashCode()) * 31;
        Long l10 = this.f120148e;
        int hashCode3 = (((hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31) + Boolean.hashCode(this.f120149f)) * 31;
        UpptackaSettings upptackaSettings = this.f120150g;
        if (upptackaSettings != null) {
            i10 = upptackaSettings.hashCode();
        }
        return ((((((((((((((((((hashCode3 + i10) * 31) + Boolean.hashCode(this.f120151h)) * 31) + Boolean.hashCode(this.f120152i)) * 31) + Boolean.hashCode(this.f120153j)) * 31) + Boolean.hashCode(this.f120154k)) * 31) + Boolean.hashCode(this.f120155l)) * 31) + Boolean.hashCode(this.f120156m)) * 31) + Boolean.hashCode(this.f120157n)) * 31) + Boolean.hashCode(this.f120158o)) * 31) + Boolean.hashCode(this.f120159p);
    }

    public final boolean i() {
        return this.f120159p;
    }

    public final boolean j() {
        return this.f120158o;
    }

    public final List<String> k() {
        return this.f120145b;
    }

    public final N l() {
        return this.f120146c;
    }

    public final boolean m() {
        return this.f120157n;
    }

    public final String n() {
        return this.f120147d;
    }

    public final Long o() {
        return this.f120148e;
    }

    public final UpptackaSettings p() {
        return this.f120150g;
    }

    public final boolean q() {
        return this.f120151h;
    }

    public final boolean r() {
        return this.f120154k;
    }

    public final boolean s() {
        return this.f120152i;
    }

    public String toString() {
        String str = this.f120144a;
        List<String> list = this.f120145b;
        N n10 = this.f120146c;
        String str2 = this.f120147d;
        Long l10 = this.f120148e;
        boolean z10 = this.f120149f;
        UpptackaSettings upptackaSettings = this.f120150g;
        boolean z11 = this.f120151h;
        boolean z12 = this.f120152i;
        boolean z13 = this.f120153j;
        boolean z14 = this.f120154k;
        boolean z15 = this.f120155l;
        boolean z16 = this.f120156m;
        boolean z17 = this.f120157n;
        boolean z18 = this.f120158o;
        boolean z19 = this.f120159p;
        return "ScanAndGoSettings(countryCode=" + str + ", languageCodes=" + list + ", scanAndGoVersion=" + n10 + ", storeName=" + str2 + ", timeout=" + l10 + ", digitalReceipt=" + z10 + ", upptacka=" + upptackaSettings + ", isCouponEnabled=" + z11 + ", isPtagLinksSupported=" + z12 + ", caasEnabled=" + z13 + ", isCoworkerDiscountEnabled=" + z14 + ", caasCheckoutEnabled=" + z15 + ", caasFullserveEnabled=" + z16 + ", showTotalPricesInclVat=" + z17 + ", fullserveTimeSlotsEnabled=" + z18 + ", fullserveEarlyPaymentEnabled=" + z19 + ")";
    }

    public ScanAndGoSettings(String str, List<String> list, N n10, String str2, Long l10, boolean z10, UpptackaSettings upptackaSettings, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        C17542s.j(n10, "scanAndGoVersion");
        C17542s.j(str2, "storeName");
        this.f120144a = str;
        this.f120145b = list;
        this.f120146c = n10;
        this.f120147d = str2;
        this.f120148e = l10;
        this.f120149f = z10;
        this.f120150g = upptackaSettings;
        this.f120151h = z11;
        this.f120152i = z12;
        this.f120153j = z13;
        this.f120154k = z14;
        this.f120155l = z15;
        this.f120156m = z16;
        this.f120157n = z17;
        this.f120158o = z18;
        this.f120159p = z19;
    }
}
