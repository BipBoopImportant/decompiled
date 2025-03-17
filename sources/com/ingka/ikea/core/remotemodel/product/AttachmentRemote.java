package com.ingka.ikea.core.remotemodel.product;

import HJ.C15854t;
import com.ingka.ikea.core.model.product.Attachment;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11690a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rp.C11839a;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-\u0016BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010 \u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/AttachmentRemote;", "", "", "seen0", "", "type", "name", "articleNo", "url", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/product/AttachmentRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/Attachment;", "a", "()Lcom/ingka/ikea/core/model/product/Attachment;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "getName", "getName$annotations", "c", "getArticleNo", "getArticleNo$annotations", "d", "getUrl", "getUrl$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AttachmentRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95240a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95241b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95242c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95243d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/AttachmentRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/AttachmentRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<AttachmentRemote> serializer() {
            return AttachmentRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AttachmentRemote(int i10, String str, String str2, String str3, String str4, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, AttachmentRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95240a = str;
        this.f95241b = str2;
        this.f95242c = str3;
        this.f95243d = str4;
    }

    public static final /* synthetic */ void b(AttachmentRemote attachmentRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, attachmentRemote.f95240a);
        dVar.B(serialDescriptor, 1, y02, attachmentRemote.f95241b);
        dVar.B(serialDescriptor, 2, y02, attachmentRemote.f95242c);
        dVar.B(serialDescriptor, 3, y02, attachmentRemote.f95243d);
    }

    public final Attachment a() {
        T t10;
        C11690a aVar;
        Iterator<T> it = C11839a.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((C11839a) t10).j(), this.f95240a)) {
                break;
            }
        }
        C11839a aVar2 = (C11839a) t10;
        if (aVar2 == null || (aVar = C11690a.valueOf(aVar2.name())) == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid type received " + this.f95240a);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = AttachmentRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            aVar = C11690a.OTHER_DOCUMENTS;
        }
        String str5 = this.f95241b;
        if (str5 != null) {
            String str6 = this.f95242c;
            if (str6 != null) {
                String str7 = this.f95243d;
                if (str7 != null) {
                    return new Attachment(aVar, str5, str6, str7);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentRemote)) {
            return false;
        }
        AttachmentRemote attachmentRemote = (AttachmentRemote) obj;
        return C17542s.e(this.f95240a, attachmentRemote.f95240a) && C17542s.e(this.f95241b, attachmentRemote.f95241b) && C17542s.e(this.f95242c, attachmentRemote.f95242c) && C17542s.e(this.f95243d, attachmentRemote.f95243d);
    }

    public int hashCode() {
        String str = this.f95240a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95241b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95242c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95243d;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f95240a;
        String str2 = this.f95241b;
        String str3 = this.f95242c;
        String str4 = this.f95243d;
        return "AttachmentRemote(type=" + str + ", name=" + str2 + ", articleNo=" + str3 + ", url=" + str4 + ")";
    }
}
