package com.ingka.ikea.appconfig.impl.service.network;

import HJ.C15854t;
import Rl.d;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002.\"B?\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001aR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/MarketRemote;", "Lpp/b;", "LRl/d;", "", "seen0", "", "code", "name", "", "Lcom/ingka/ikea/appconfig/impl/service/network/LanguageRemote;", "languages", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/appconfig/impl/service/network/MarketRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LRl/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "getCode$annotations", "()V", "getName", "getName$annotations", "Ljava/util/List;", "getLanguages", "()Ljava/util/List;", "getLanguages$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MarketRemote implements C11768b<d> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f92950d = {null, null, new C17451f(LanguageRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f92951a;

    /* renamed from: b  reason: collision with root package name */
    private final String f92952b;

    /* renamed from: c  reason: collision with root package name */
    private final List<LanguageRemote> f92953c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/MarketRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/MarketRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MarketRemote> serializer() {
            return MarketRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MarketRemote(int i10, String str, String str2, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, MarketRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92951a = str;
        this.f92952b = str2;
        this.f92953c = list;
    }

    public static final /* synthetic */ void c(MarketRemote marketRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f92950d;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, marketRemote.f92951a);
        dVar.B(serialDescriptor, 1, y02, marketRemote.f92952b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], marketRemote.f92953c);
    }

    public d b() {
        String str = this.f92951a;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        } else if (!C15854t.v0(str)) {
            String str2 = this.f92952b;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (!C15854t.v0(str2)) {
                List<LanguageRemote> list = this.f92953c;
                if (list != null) {
                    Iterable<LanguageRemote> iterable = list;
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (LanguageRemote a10 : iterable) {
                        arrayList.add(a10.a());
                    }
                    return new d(str, str2, arrayList);
                }
                throw new IllegalArgumentException("Required value was null.");
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketRemote)) {
            return false;
        }
        MarketRemote marketRemote = (MarketRemote) obj;
        return C17542s.e(this.f92951a, marketRemote.f92951a) && C17542s.e(this.f92952b, marketRemote.f92952b) && C17542s.e(this.f92953c, marketRemote.f92953c);
    }

    public int hashCode() {
        String str = this.f92951a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f92952b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<LanguageRemote> list = this.f92953c;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f92951a;
        String str2 = this.f92952b;
        List<LanguageRemote> list = this.f92953c;
        return "MarketRemote(code=" + str + ", name=" + str2 + ", languages=" + list + ")";
    }
}
