package com.ingka.ikea.core.remotemodel;

import HJ.C15854t;
import YH.C16877v;
import com.ingka.ikea.core.model.Media;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 +2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002,\u001dBI\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001e\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010 R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010'\u0012\u0004\b*\u0010\"\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/ImageRemoteLegacy;", "Lpp/b;", "Lcom/ingka/ikea/core/model/Media;", "", "seen0", "", "imageUrl", "altText", "type", "", "Lcom/ingka/ikea/core/remotemodel/InfoDotWithCoordinatesRemote;", "infoDots", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "Lcom/ingka/ikea/InfoDotWithCoordinates;", "b", "(Ljava/util/List;)Lcom/ingka/ikea/InfoDotWithCoordinates;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/core/remotemodel/ImageRemoteLegacy;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()Lcom/ingka/ikea/core/model/Media;", "a", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "getImageUrl$annotations", "()V", "getAltText", "getAltText$annotations", "getType", "getType$annotations", "Ljava/util/List;", "getInfoDots", "()Ljava/util/List;", "getInfoDots$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageRemoteLegacy implements C11768b<Media> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f95192e = {null, null, null, new C17451f(InfoDotWithCoordinatesRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95193a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95194b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95195c;

    /* renamed from: d  reason: collision with root package name */
    private final List<InfoDotWithCoordinatesRemote> f95196d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/ImageRemoteLegacy$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/ImageRemoteLegacy;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ImageRemoteLegacy> serializer() {
            return ImageRemoteLegacy$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ImageRemoteLegacy(int i10, String str, String str2, String str3, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, ImageRemoteLegacy$$serializer.INSTANCE.getDescriptor());
        }
        this.f95193a = str;
        this.f95194b = str2;
        this.f95195c = str3;
        this.f95196d = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.ingka.ikea.InfoDotWithCoordinates} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ingka.ikea.InfoDotWithCoordinates b(java.util.List<com.ingka.ikea.InfoDotWithCoordinates> r6) {
        /*
            r5 = this;
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0048
        L_0x000f:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x001b
        L_0x0019:
            r0 = r1
            goto L_0x0048
        L_0x001b:
            r2 = r1
            com.ingka.ikea.InfoDotWithCoordinates r2 = (com.ingka.ikea.InfoDotWithCoordinates) r2
            com.ingka.ikea.InfoDot r2 = r2.b()
            java.lang.String r2 = r2.c()
            int r2 = r2.length()
        L_0x002a:
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.ingka.ikea.InfoDotWithCoordinates r4 = (com.ingka.ikea.InfoDotWithCoordinates) r4
            com.ingka.ikea.InfoDot r4 = r4.b()
            java.lang.String r4 = r4.c()
            int r4 = r4.length()
            if (r2 <= r4) goto L_0x0041
            r1 = r3
            r2 = r4
        L_0x0041:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x002a
            goto L_0x0019
        L_0x0048:
            com.ingka.ikea.InfoDotWithCoordinates r0 = (com.ingka.ikea.InfoDotWithCoordinates) r0
            if (r0 != 0) goto L_0x0053
            java.lang.Object r6 = YH.C16877v.w0(r6)
            r0 = r6
            com.ingka.ikea.InfoDotWithCoordinates r0 = (com.ingka.ikea.InfoDotWithCoordinates) r0
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.ImageRemoteLegacy.b(java.util.List):com.ingka.ikea.InfoDotWithCoordinates");
    }

    public static final /* synthetic */ void d(ImageRemoteLegacy imageRemoteLegacy, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95192e;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, imageRemoteLegacy.f95193a);
        dVar.B(serialDescriptor, 1, y02, imageRemoteLegacy.f95194b);
        dVar.B(serialDescriptor, 2, y02, imageRemoteLegacy.f95195c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], imageRemoteLegacy.f95196d);
    }

    public Media c() {
        String str;
        String str2 = this.f95195c;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<ImageRemoteLegacy> cls = ImageRemoteLegacy.class;
        String str4 = null;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -483805558) {
                if (hashCode != 100313435) {
                    if (hashCode == 112202875 && str2.equals("video")) {
                        String str5 = this.f95193a;
                        if (str5 != null) {
                            String str6 = this.f95194b;
                            if (str6 != null) {
                                return new Media.Video(str5, str6);
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (str2.equals("image")) {
                    String str7 = this.f95193a;
                    if (str7 != null) {
                        String str8 = this.f95194b;
                        if (str8 != null) {
                            return new Media.Image(str7, str8);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (str2.equals("info_image")) {
                Collection collection = this.f95196d;
                if (collection == null || collection.isEmpty()) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("INFO_IMAGE_TYPE must have info dots");
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str9 = null;
                    String str10 = null;
                    for (C11819b bVar : arrayList) {
                        if (str9 == null) {
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                break;
                            }
                            str9 = C11820c.a(a10);
                        }
                        if (str10 == null) {
                            String name = cls.getName();
                            C17542s.g(name);
                            str = str3;
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                        } else {
                            str = str3;
                        }
                        bVar.a(eVar, str10, false, illegalArgumentException, str9);
                        str3 = str;
                    }
                    String str11 = this.f95193a;
                    if (str11 != null) {
                        String str12 = this.f95194b;
                        if (str12 != null) {
                            return new Media.Image(str11, str12);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                Iterable<InfoDotWithCoordinatesRemote> iterable = this.f95196d;
                ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
                for (InfoDotWithCoordinatesRemote a11 : iterable) {
                    arrayList2.add(a11.a());
                }
                String str13 = this.f95193a;
                if (str13 != null) {
                    String str14 = this.f95194b;
                    if (str14 != null) {
                        return new Media.InfoImage(str13, str14, arrayList2, b(arrayList2).b().a());
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        String str15 = str3;
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unknown Media type: " + this.f95195c);
        e eVar2 = e.ERROR;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList3.add(next2);
            }
        }
        String str16 = null;
        String str17 = null;
        for (C11819b bVar2 : arrayList3) {
            if (str16 == null) {
                String a12 = C11818a.a(str4, illegalArgumentException2);
                if (a12 == null) {
                    break;
                }
                str16 = C11820c.a(a12);
            }
            if (str17 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', str4, 2, str4), '.', str4, 2, str4);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str17 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str15) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            bVar2.a(eVar2, str17, false, illegalArgumentException2, str16);
            str4 = null;
        }
        return null;
    }
}
