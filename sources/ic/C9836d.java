package ic;

/* renamed from: ic.d  reason: case insensitive filesystem */
public @interface C9836d {

    /* renamed from: ic.d$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
