package com.ingka.ikea.core.remotemodel.product;

import com.ingka.ikea.core.model.product.AvailabilityType;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.J;
import jK.T0;
import jK.Y0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11691b;
import op.C11703n;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 -2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002.\u001bBW\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010!\u0012\u0004\b$\u0010 \u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001c\u0012\u0004\b(\u0010 \u001a\u0004\b'\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001c\u0012\u0004\b*\u0010 \u001a\u0004\b)\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001c\u0012\u0004\b,\u0010 \u001a\u0004\b+\u0010\u001e¨\u0006/"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/AvailabilityRemote;", "Lpp/b;", "Lop/b;", "", "seen0", "", "prefix", "Lop/n;", "status", "store", "suffix", "text", "type2", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lop/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "i", "(Lcom/ingka/ikea/core/remotemodel/product/AvailabilityRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "h", "()Lop/b;", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getPrefix$annotations", "()V", "Lop/n;", "c", "()Lop/n;", "getStatus$annotations", "d", "getStore$annotations", "e", "getSuffix$annotations", "f", "getText$annotations", "g", "getType2$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvailabilityRemote implements C11768b<C11691b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f95244g = {null, J.b("com.ingka.ikea.core.model.product.StockStatus", C11703n.values()), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95245a;

    /* renamed from: b  reason: collision with root package name */
    private final C11703n f95246b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95247c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95248d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95249e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95250f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/AvailabilityRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/AvailabilityRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<AvailabilityRemote> serializer() {
            return AvailabilityRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AvailabilityRemote(int i10, String str, C11703n nVar, String str2, String str3, String str4, String str5, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, AvailabilityRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95245a = str;
        this.f95246b = nVar;
        this.f95247c = str2;
        this.f95248d = str3;
        this.f95249e = str4;
        this.f95250f = str5;
    }

    public static final /* synthetic */ void i(AvailabilityRemote availabilityRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95244g;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, availabilityRemote.f95245a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], availabilityRemote.f95246b);
        dVar.B(serialDescriptor, 2, y02, availabilityRemote.f95247c);
        dVar.B(serialDescriptor, 3, y02, availabilityRemote.f95248d);
        dVar.B(serialDescriptor, 4, y02, availabilityRemote.f95249e);
        dVar.B(serialDescriptor, 5, y02, availabilityRemote.f95250f);
    }

    public final String b() {
        return this.f95245a;
    }

    public final C11703n c() {
        return this.f95246b;
    }

    public final String d() {
        return this.f95247c;
    }

    public final String e() {
        return this.f95248d;
    }

    public final String f() {
        return this.f95249e;
    }

    public final String g() {
        return this.f95250f;
    }

    public C11691b h() {
        T t10;
        Iterator<T> it = AvailabilityType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((AvailabilityType) t10).name(), this.f95250f)) {
                break;
            }
        }
        AvailabilityType availabilityType = (AvailabilityType) t10;
        if (availabilityType == null) {
            return null;
        }
        String str = this.f95245a;
        C11703n nVar = this.f95246b;
        if (nVar != null) {
            return new C11691b(str, nVar, this.f95247c, this.f95248d, this.f95249e, availabilityType);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
