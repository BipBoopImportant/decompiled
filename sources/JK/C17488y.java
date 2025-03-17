package jK;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR*\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LjK/y;", "T", "LjK/U0;", "Lkotlin/Function1;", "LuI/d;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(LnI/l;)V", "", "key", "a", "(LuI/d;)Lkotlinx/serialization/KSerializer;", "LnI/l;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "LjK/m;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.y  reason: case insensitive filesystem */
final class C17488y<T> implements U0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C18055d<?>, KSerializer<T>> f144182a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, C17465m<T>> f144183b = new ConcurrentHashMap<>();

    public C17488y(C17642l<? super C18055d<?>, ? extends KSerializer<T>> lVar) {
        C17542s.j(lVar, "compute");
        this.f144182a = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = new jK.C17465m<>(r4.f144182a.invoke(r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlinx.serialization.KSerializer<T> a(uI.C18055d<java.lang.Object> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, jK.m<T>> r0 = r4.f144183b
            java.lang.Class r1 = mI.C17603a.b(r5)
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L_0x0026
            jK.m r2 = new jK.m
            nI.l<uI.d<?>, kotlinx.serialization.KSerializer<T>> r3 = r4.f144182a
            java.lang.Object r5 = r3.invoke(r5)
            kotlinx.serialization.KSerializer r5 = (kotlinx.serialization.KSerializer) r5
            r2.<init>(r5)
            java.lang.Object r5 = r0.putIfAbsent(r1, r2)
            if (r5 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r5
        L_0x0026:
            jK.m r2 = (jK.C17465m) r2
            kotlinx.serialization.KSerializer<T> r5 = r2.f144136a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jK.C17488y.a(uI.d):kotlinx.serialization.KSerializer");
    }
}
