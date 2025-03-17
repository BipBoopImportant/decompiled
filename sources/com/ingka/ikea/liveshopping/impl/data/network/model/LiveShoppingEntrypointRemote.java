package com.ingka.ikea.liveshopping.impl.data.network.model;

import KJ.C15985a;
import YH.C16877v;
import fK.p;
import hv.C11386b;
import hv.C11387c;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<%B]\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001dR \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u001dR \u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u001dR \u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010&\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001dR \u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010)\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/ingka/ikea/liveshopping/impl/data/network/model/LiveShoppingEntrypointRemote;", "Lpp/b;", "Lhv/b;", "", "seen0", "", "purpose", "title", "primaryActionTitle", "secondaryActionTitle", "Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;", "highlightedShow", "", "pastShows", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/liveshopping/impl/data/network/model/LiveShoppingEntrypointRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lhv/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPurpose", "getPurpose$annotations", "()V", "getTitle", "getTitle$annotations", "getPrimaryActionTitle", "getPrimaryActionTitle$annotations", "d", "getSecondaryActionTitle", "getSecondaryActionTitle$annotations", "e", "Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;", "getHighlightedShow", "()Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;", "getHighlightedShow$annotations", "f", "Ljava/util/List;", "getPastShows", "()Ljava/util/List;", "getPastShows$annotations", "Companion", "$serializer", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LiveShoppingEntrypointRemote implements C11768b<C11386b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f96496g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f96497h = {null, null, null, null, null, new C17451f(ShowRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f96498a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96499b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96500c;

    /* renamed from: d  reason: collision with root package name */
    private final String f96501d;

    /* renamed from: e  reason: collision with root package name */
    private final ShowRemote f96502e;

    /* renamed from: f  reason: collision with root package name */
    private final List<ShowRemote> f96503f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/liveshopping/impl/data/network/model/LiveShoppingEntrypointRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/liveshopping/impl/data/network/model/LiveShoppingEntrypointRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<LiveShoppingEntrypointRemote> serializer() {
            return LiveShoppingEntrypointRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LiveShoppingEntrypointRemote(int i10, String str, String str2, String str3, String str4, ShowRemote showRemote, List list, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, LiveShoppingEntrypointRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96498a = str;
        this.f96499b = str2;
        this.f96500c = str3;
        this.f96501d = str4;
        this.f96502e = showRemote;
        this.f96503f = list;
    }

    public static final /* synthetic */ void c(LiveShoppingEntrypointRemote liveShoppingEntrypointRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96497h;
        dVar.y(serialDescriptor, 0, liveShoppingEntrypointRemote.f96498a);
        dVar.y(serialDescriptor, 1, liveShoppingEntrypointRemote.f96499b);
        dVar.y(serialDescriptor, 2, liveShoppingEntrypointRemote.f96500c);
        dVar.y(serialDescriptor, 3, liveShoppingEntrypointRemote.f96501d);
        dVar.i(serialDescriptor, 4, ShowRemote$$serializer.INSTANCE, liveShoppingEntrypointRemote.f96502e);
        dVar.i(serialDescriptor, 5, kSerializerArr[5], liveShoppingEntrypointRemote.f96503f);
    }

    public C11386b b() {
        String str = this.f96498a;
        String str2 = this.f96499b;
        String str3 = this.f96500c;
        String str4 = this.f96501d;
        C11387c c10 = this.f96502e.c();
        Iterable<ShowRemote> iterable = this.f96503f;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ShowRemote c11 : iterable) {
            arrayList.add(c11.c());
        }
        return new C11386b(str, str2, str3, str4, c10, C15985a.h(arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveShoppingEntrypointRemote)) {
            return false;
        }
        LiveShoppingEntrypointRemote liveShoppingEntrypointRemote = (LiveShoppingEntrypointRemote) obj;
        return C17542s.e(this.f96498a, liveShoppingEntrypointRemote.f96498a) && C17542s.e(this.f96499b, liveShoppingEntrypointRemote.f96499b) && C17542s.e(this.f96500c, liveShoppingEntrypointRemote.f96500c) && C17542s.e(this.f96501d, liveShoppingEntrypointRemote.f96501d) && C17542s.e(this.f96502e, liveShoppingEntrypointRemote.f96502e) && C17542s.e(this.f96503f, liveShoppingEntrypointRemote.f96503f);
    }

    public int hashCode() {
        return (((((((((this.f96498a.hashCode() * 31) + this.f96499b.hashCode()) * 31) + this.f96500c.hashCode()) * 31) + this.f96501d.hashCode()) * 31) + this.f96502e.hashCode()) * 31) + this.f96503f.hashCode();
    }

    public String toString() {
        String str = this.f96498a;
        String str2 = this.f96499b;
        String str3 = this.f96500c;
        String str4 = this.f96501d;
        ShowRemote showRemote = this.f96502e;
        List<ShowRemote> list = this.f96503f;
        return "LiveShoppingEntrypointRemote(purpose=" + str + ", title=" + str2 + ", primaryActionTitle=" + str3 + ", secondaryActionTitle=" + str4 + ", highlightedShow=" + showRemote + ", pastShows=" + list + ")";
    }
}
