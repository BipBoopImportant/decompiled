package com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper;

import Nj.a;
import Nj.c;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/c;", "", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/b;", "loadProductsFailure", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/a;", "importProductsFailure", "<init>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/b;Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/a;)V", "", "t", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError;", "a", "(Ljava/lang/Throwable;)Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/b;", "b", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f92283a;

    /* renamed from: b  reason: collision with root package name */
    private final a f92284b;

    public c(b bVar, a aVar) {
        C17542s.j(bVar, "loadProductsFailure");
        C17542s.j(aVar, "importProductsFailure");
        this.f92283a = bVar;
        this.f92284b = aVar;
    }

    public final UiError a(Throwable th2) {
        C17542s.j(th2, "t");
        return th2 instanceof c.a ? this.f92283a.a(th2) : th2 instanceof a.C1684a ? this.f92284b.a(th2) : new UiError(0, 0, 0, (UiError.Type) null, 15, (DefaultConstructorMarker) null);
    }
}
