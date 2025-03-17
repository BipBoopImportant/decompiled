package HJ;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LHJ/s;", "", "<init>", "()V", "LHJ/p;", "b", "LHJ/p;", "value", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.s  reason: case insensitive filesystem */
final class C15853s {

    /* renamed from: a  reason: collision with root package name */
    public static final C15853s f135349a = new C15853s();

    /* renamed from: b  reason: collision with root package name */
    public static final C15850p f135350b;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f135350b = new C15850p("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private C15853s() {
    }
}
