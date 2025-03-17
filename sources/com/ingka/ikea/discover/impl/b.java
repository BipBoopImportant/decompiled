package com.ingka.ikea.discover.impl;

import kK.C17519h;
import kotlin.Metadata;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/discover/impl/b;", "LkK/h;", "Lcom/ingka/ikea/discover/impl/a;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "LfK/d;", "b", "(Lkotlinx/serialization/json/JsonElement;)LfK/d;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b extends C17519h<a<?>> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f95562c = new b();

    private b() {
        super(P.b(a.class));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r2 = kK.j.j(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fK.C17251d<com.ingka.ikea.discover.impl.a<?>> b(kotlinx.serialization.json.JsonElement r2) {
        /*
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            kotlinx.serialization.json.JsonObject r2 = kK.j.i(r2)
            java.lang.String r0 = "type"
            java.lang.Object r2 = r2.get(r0)
            kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
            if (r2 == 0) goto L_0x001e
            kotlinx.serialization.json.JsonPrimitive r2 = kK.j.j(r2)
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = r2.b()
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            if (r2 == 0) goto L_0x00ae
            int r0 = r2.hashCode()
            switch(r0) {
                case -2102624474: goto L_0x009e;
                case -1550896829: goto L_0x008e;
                case -1166283725: goto L_0x007e;
                case -844927512: goto L_0x006e;
                case -55528613: goto L_0x005e;
                case -38910685: goto L_0x004e;
                case 79233237: goto L_0x003c;
                case 256632158: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x00ae
        L_0x002a:
            java.lang.String r0 = "KREATIV"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0034
            goto L_0x00ae
        L_0x0034:
            com.ingka.ikea.discover.impl.d r2 = com.ingka.ikea.discover.impl.d.INSTANCE
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            goto L_0x00b4
        L_0x003c:
            java.lang.String r0 = "STORY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0046
            goto L_0x00ae
        L_0x0046:
            com.ingka.ikea.discover.impl.StoryRemote$a r2 = com.ingka.ikea.discover.impl.StoryRemote.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            goto L_0x00b4
        L_0x004e:
            java.lang.String r0 = "INSPIRATION_ROOMS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0057
            goto L_0x00ae
        L_0x0057:
            com.ingka.ikea.discover.impl.InspirationRoomsRemote$a r2 = com.ingka.ikea.discover.impl.InspirationRoomsRemote.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            goto L_0x00b4
        L_0x005e:
            java.lang.String r0 = "LIVE_SHOPPING"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0067
            goto L_0x00ae
        L_0x0067:
            com.ingka.ikea.discover.impl.f r2 = com.ingka.ikea.discover.impl.f.INSTANCE
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            goto L_0x00b4
        L_0x006e:
            java.lang.String r0 = "VISUAL_MESSAGE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0077
            goto L_0x00ae
        L_0x0077:
            com.ingka.ikea.discover.impl.VisualMessageRemote$a r2 = com.ingka.ikea.discover.impl.VisualMessageRemote.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            goto L_0x00b4
        L_0x007e:
            java.lang.String r0 = "STORIES"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0087
            goto L_0x00ae
        L_0x0087:
            com.ingka.ikea.discover.impl.StoriesRemote$a r2 = com.ingka.ikea.discover.impl.StoriesRemote.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            goto L_0x00b4
        L_0x008e:
            java.lang.String r0 = "CAMPAIGNS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0097
            goto L_0x00ae
        L_0x0097:
            com.ingka.ikea.discover.impl.CampaignsRemote$a r2 = com.ingka.ikea.discover.impl.CampaignsRemote.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            goto L_0x00b4
        L_0x009e:
            java.lang.String r0 = "RECOMMENDATION_CAROUSEL"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00a7
            goto L_0x00ae
        L_0x00a7:
            com.ingka.ikea.discover.impl.h r2 = com.ingka.ikea.discover.impl.h.INSTANCE
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            goto L_0x00b4
        L_0x00ae:
            com.ingka.ikea.discover.impl.UnknownDiscoveryRemote$a r2 = com.ingka.ikea.discover.impl.UnknownDiscoveryRemote.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
        L_0x00b4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.discover.impl.b.b(kotlinx.serialization.json.JsonElement):fK.d");
    }
}
