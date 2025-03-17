package com.ingka.ikea.discover.impl;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import aq.C11079a;
import fK.p;
import jK.C17487x0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/discover/impl/h;", "Lcom/ingka/ikea/discover/impl/a;", "Laq/a$f;", "<init>", "()V", "d", "()Laq/a$f;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h implements a<C11079a.f> {
    public static final h INSTANCE = new h();

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ C16824o<KSerializer<Object>> f95565a = C16825p.a(s.PUBLICATION, new g());

    private h() {
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new C17487x0("com.ingka.ikea.discover.impl.RecommendationCarouselRemote", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer c() {
        return f95565a.getValue();
    }

    /* renamed from: d */
    public C11079a.f toLocal() {
        return C11079a.f.f90400a;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof h);
    }

    public int hashCode() {
        return -1497880811;
    }

    public final KSerializer<h> serializer() {
        return c();
    }

    public String toString() {
        return "RecommendationCarouselRemote";
    }
}
