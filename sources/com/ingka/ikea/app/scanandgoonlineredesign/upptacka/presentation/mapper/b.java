package com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper;

import Ez.f;
import Nj.c;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/b;", "", "<init>", "()V", "", "throwable", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError;", "a", "(Ljava/lang/Throwable;)Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {
    public final UiError a(Throwable th2) {
        C17542s.j(th2, "throwable");
        return th2 instanceof c.a.b ? new UiError(0, f.f109673M, f.f109672L, UiError.Type.WRONG_STORE, 1, (DefaultConstructorMarker) null) : th2 instanceof c.a.C1687a ? new UiError(0, 0, 0, (UiError.Type) null, 15, (DefaultConstructorMarker) null) : new UiError(0, 0, 0, (UiError.Type) null, 15, (DefaultConstructorMarker) null);
    }
}
