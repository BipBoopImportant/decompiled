package com.ingka.ikea.discover.impl;

import aq.C11079a;
import fK.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import pp.C11768b;

@p(with = b.class)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u0004*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005\u0001\t\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/discover/impl/a;", "Laq/a;", "T", "Lpp/b;", "Companion", "a", "Lcom/ingka/ikea/discover/impl/CampaignsRemote;", "Lcom/ingka/ikea/discover/impl/InspirationRoomsRemote;", "Lcom/ingka/ikea/discover/impl/d;", "Lcom/ingka/ikea/discover/impl/f;", "Lcom/ingka/ikea/discover/impl/h;", "Lcom/ingka/ikea/discover/impl/StoriesRemote;", "Lcom/ingka/ikea/discover/impl/StoryRemote;", "Lcom/ingka/ikea/discover/impl/UnknownDiscoveryRemote;", "Lcom/ingka/ikea/discover/impl/VisualMessageRemote;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a<T extends C11079a> extends C11768b<T> {
    public static final C2124a Companion = C2124a.f95561a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/discover/impl/a$a;", "", "<init>", "()V", "T", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lcom/ingka/ikea/discover/impl/a;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.discover.impl.a$a  reason: collision with other inner class name */
    public static final class C2124a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C2124a f95561a = new C2124a();

        private C2124a() {
        }

        public final <T> KSerializer<a<T>> serializer(KSerializer<T> kSerializer) {
            C17542s.j(kSerializer, "typeSerial0");
            return b.f95562c;
        }
    }
}
