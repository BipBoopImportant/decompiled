package jK;

import hK.C17335a;
import kotlinx.serialization.KSerializer;
import nI.C17642l;

/* renamed from: jK.j0  reason: case insensitive filesystem */
public final /* synthetic */ class C17460j0 implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KSerializer f144119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KSerializer f144120b;

    public /* synthetic */ C17460j0(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f144119a = kSerializer;
        this.f144120b = kSerializer2;
    }

    public final Object invoke(Object obj) {
        return C17462k0.h(this.f144119a, this.f144120b, (C17335a) obj);
    }
}
