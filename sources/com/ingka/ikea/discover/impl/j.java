package com.ingka.ikea.discover.impl;

import kK.C17519h;
import kotlin.Metadata;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/discover/impl/j;", "LkK/h;", "Lcom/ingka/ikea/discover/impl/i;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "LfK/d;", "b", "(Lkotlinx/serialization/json/JsonElement;)LfK/d;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j extends C17519h<i<?>> {

    /* renamed from: c  reason: collision with root package name */
    public static final j f95567c = new j();

    private j() {
        super(P.b(i.class));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r3 = kK.j.j(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fK.C17251d<com.ingka.ikea.discover.impl.i<?>> b(kotlinx.serialization.json.JsonElement r3) {
        /*
            r2 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            kotlinx.serialization.json.JsonObject r3 = kK.j.i(r3)
            java.lang.String r0 = "type"
            java.lang.Object r3 = r3.get(r0)
            kotlinx.serialization.json.JsonElement r3 = (kotlinx.serialization.json.JsonElement) r3
            if (r3 == 0) goto L_0x001e
            kotlinx.serialization.json.JsonPrimitive r3 = kK.j.j(r3)
            if (r3 == 0) goto L_0x001e
            java.lang.String r3 = r3.b()
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x0064
            int r0 = r3.hashCode()
            r1 = -1824377264(0xffffffff93423650, float:-2.451302E-27)
            if (r0 == r1) goto L_0x0054
            r1 = 73234372(0x45d77c4, float:2.6033419E-36)
            if (r0 == r1) goto L_0x0045
            r1 = 408508623(0x185958cf, float:2.809143E-24)
            if (r0 == r1) goto L_0x0035
            goto L_0x0064
        L_0x0035:
            java.lang.String r0 = "PRODUCT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x003e
            goto L_0x0064
        L_0x003e:
            com.ingka.ikea.discover.impl.ProductRemote$a r3 = com.ingka.ikea.discover.impl.ProductRemote.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            goto L_0x006a
        L_0x0045:
            java.lang.String r0 = "MEDIA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            com.ingka.ikea.discover.impl.StoryMediaRemote$a r3 = com.ingka.ikea.discover.impl.StoryMediaRemote.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            goto L_0x006a
        L_0x0054:
            java.lang.String r0 = "TEASER"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            com.ingka.ikea.discover.impl.TeaserRemote$a r3 = com.ingka.ikea.discover.impl.TeaserRemote.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            goto L_0x006a
        L_0x0064:
            com.ingka.ikea.discover.impl.UnknownStoryCardRemote$a r3 = com.ingka.ikea.discover.impl.UnknownStoryCardRemote.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.discover.impl.j.b(kotlinx.serialization.json.JsonElement):fK.d");
    }
}
