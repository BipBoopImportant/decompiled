package com.ingka.ikea.app.stockinfo.network;

import HJ.C15854t;
import com.ingka.ikea.app.stockinfo.local.Status;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 32\u00020\u0001:\u00024\"BM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001bR \u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010(\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001bR \u0010\t\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010(\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010(\u0012\u0004\b2\u0010'\u001a\u0004\b1\u0010\u001b¨\u00065"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;", "", "", "seen0", "Lcom/ingka/ikea/app/stockinfo/network/d;", "code", "", "htmlText", "label", "description", "timestamp", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/stockinfo/network/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/stockinfo/local/Status;", "b", "()Lcom/ingka/ikea/app/stockinfo/local/Status;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/stockinfo/network/d;", "getCode", "()Lcom/ingka/ikea/app/stockinfo/network/d;", "getCode$annotations", "()V", "Ljava/lang/String;", "getHtmlText", "getHtmlText$annotations", "getLabel", "getLabel$annotations", "d", "getDescription", "getDescription$annotations", "e", "getTimestamp", "getTimestamp$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatusRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f92612f = {d.Companion.serializer(), 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    private final d f92613a;

    /* renamed from: b  reason: collision with root package name */
    private final String f92614b;

    /* renamed from: c  reason: collision with root package name */
    private final String f92615c;

    /* renamed from: d  reason: collision with root package name */
    private final String f92616d;

    /* renamed from: e  reason: collision with root package name */
    private final String f92617e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/StatusRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StatusRemote> serializer() {
            return StatusRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StatusRemote(int i10, d dVar, String str, String str2, String str3, String str4, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, StatusRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92613a = dVar;
        this.f92614b = str;
        this.f92615c = str2;
        this.f92616d = str3;
        this.f92617e = str4;
    }

    public static final /* synthetic */ void c(StatusRemote statusRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f92612f[0], statusRemote.f92613a);
        dVar.y(serialDescriptor, 1, statusRemote.f92614b);
        dVar.y(serialDescriptor, 2, statusRemote.f92615c);
        dVar.y(serialDescriptor, 3, statusRemote.f92616d);
        dVar.B(serialDescriptor, 4, Y0.f144077a, statusRemote.f92617e);
    }

    public final Status b() {
        try {
            d dVar = this.f92613a;
            String str = this.f92614b;
            String str2 = this.f92615c;
            String str3 = this.f92616d;
            String str4 = this.f92617e;
            if (str4 == null) {
                str4 = "";
            }
            return new Status(dVar, str, str2, str3, str4);
        } catch (IllegalArgumentException e10) {
            e eVar = e.ERROR;
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
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        break;
                    }
                    str5 = C11820c.a(a10);
                }
                String str7 = str5;
                if (str6 == null) {
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Could not parse status.";
                }
                String str8 = str6;
                bVar.a(eVar, str8, false, e10, str7);
                str5 = str7;
                str6 = str8;
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusRemote)) {
            return false;
        }
        StatusRemote statusRemote = (StatusRemote) obj;
        return this.f92613a == statusRemote.f92613a && C17542s.e(this.f92614b, statusRemote.f92614b) && C17542s.e(this.f92615c, statusRemote.f92615c) && C17542s.e(this.f92616d, statusRemote.f92616d) && C17542s.e(this.f92617e, statusRemote.f92617e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f92613a.hashCode() * 31) + this.f92614b.hashCode()) * 31) + this.f92615c.hashCode()) * 31) + this.f92616d.hashCode()) * 31;
        String str = this.f92617e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        d dVar = this.f92613a;
        String str = this.f92614b;
        String str2 = this.f92615c;
        String str3 = this.f92616d;
        String str4 = this.f92617e;
        return "StatusRemote(code=" + dVar + ", htmlText=" + str + ", label=" + str2 + ", description=" + str3 + ", timestamp=" + str4 + ")";
    }
}
