package com.ingka.ikea.core.remotemodel;

import HJ.C15854t;
import com.ingka.ikea.core.model.Media;
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
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*\u0015B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/Media;", "", "seen0", "", "imageUrl", "altText", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/MediaRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/core/model/Media;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getImageUrl$annotations", "()V", "getAltText", "getAltText$annotations", "c", "getType", "getType$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaRemote implements C11768b<Media> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95219a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95220b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95221c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/MediaRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MediaRemote> serializer() {
            return MediaRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MediaRemote(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, MediaRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95219a = str;
        this.f95220b = str2;
        this.f95221c = str3;
    }

    public static final /* synthetic */ void b(MediaRemote mediaRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, mediaRemote.f95219a);
        dVar.B(serialDescriptor, 1, y02, mediaRemote.f95220b);
        dVar.B(serialDescriptor, 2, y02, mediaRemote.f95221c);
    }

    public Media a() {
        Media media;
        String str = this.f95221c;
        if (C17542s.e(str, "image")) {
            String str2 = this.f95219a;
            if (str2 != null) {
                String str3 = this.f95220b;
                if (str3 != null) {
                    media = new Media.Image(str2, str3);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (C17542s.e(str, "video")) {
            String str4 = this.f95219a;
            if (str4 != null) {
                String str5 = this.f95220b;
                if (str5 != null) {
                    media = new Media.Video(str4, str5);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown MediaRemote type: " + this.f95221c);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar : arrayList) {
                if (str6 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str6 = C11820c.a(a10);
                }
                String str8 = str6;
                if (str7 == null) {
                    String name = MediaRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str9 = str7;
                bVar.a(eVar, str9, false, illegalArgumentException, str8);
                str6 = str8;
                str7 = str9;
            }
            String str10 = this.f95219a;
            if (str10 != null) {
                String str11 = this.f95220b;
                if (str11 != null) {
                    media = new Media.Image(str10, str11);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return media;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaRemote)) {
            return false;
        }
        MediaRemote mediaRemote = (MediaRemote) obj;
        return C17542s.e(this.f95219a, mediaRemote.f95219a) && C17542s.e(this.f95220b, mediaRemote.f95220b) && C17542s.e(this.f95221c, mediaRemote.f95221c);
    }

    public int hashCode() {
        String str = this.f95219a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95220b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95221c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f95219a;
        String str2 = this.f95220b;
        String str3 = this.f95221c;
        return "MediaRemote(imageUrl=" + str + ", altText=" + str2 + ", type=" + str3 + ")";
    }
}
