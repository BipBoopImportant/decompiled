package com.sugarcube.common;

import YH.C16870n;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.common.UiText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\t\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0002\b\u000b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0010\u0010\u0012\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\b\u0013¨\u0006\u0014"}, d2 = {"UiText", "Lcom/sugarcube/common/UiText;", "string", "", "id", "", "args", "", "", "(I[Ljava/lang/Object;)Lcom/sugarcube/common/UiText;", "", "UiTextStringResource", "count", "Lcom/sugarcube/common/PluralCount;", "UiText-ThRY43M", "(II)Lcom/sugarcube/common/UiText;", "UiText-qe8XlhI", "(II[Ljava/lang/Object;)Lcom/sugarcube/common/UiText;", "(IILjava/util/List;)Lcom/sugarcube/common/UiText;", "UiTextCompositeResource", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UiTextKt {
    public static final UiText UiText(String str) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        return new UiText.DynamicString(str);
    }

    /* renamed from: UiText-ThRY43M  reason: not valid java name */
    public static final UiText m42UiTextThRY43M(int i10, int i11) {
        return new UiText.PluralResource(i10, i11, (List) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: UiText-qe8XlhI  reason: not valid java name */
    public static final UiText m44UiTextqe8XlhI(int i10, int i11, Object... objArr) {
        C17542s.j(objArr, "args");
        return new UiText.PluralResource(i10, i11, C16870n.c1(objArr), (DefaultConstructorMarker) null);
    }

    public static final UiText UiTextCompositeResource(int i10, List<? extends UiText> list) {
        C17542s.j(list, "args");
        return new UiText.CompositeResource(i10, list);
    }

    public static final UiText UiTextStringResource(int i10, List<? extends Object> list) {
        C17542s.j(list, "args");
        return new UiText.StringResource(i10, list);
    }

    public static final UiText UiText(int i10) {
        return new UiText.StringResource(i10, (List) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: UiText-qe8XlhI  reason: not valid java name */
    public static final UiText m43UiTextqe8XlhI(int i10, int i11, List<? extends Object> list) {
        C17542s.j(list, "args");
        return new UiText.PluralResource(i10, i11, list, (DefaultConstructorMarker) null);
    }

    public static final UiText UiText(int i10, Object... objArr) {
        C17542s.j(objArr, "args");
        return new UiText.StringResource(i10, C16870n.c1(objArr));
    }
}
