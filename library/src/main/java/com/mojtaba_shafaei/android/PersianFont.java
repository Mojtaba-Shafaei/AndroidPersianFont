package com.mojtaba_shafaei.android;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.IntDef;
import android.support.v4.util.ArrayMap;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by mojtaba on 8/22/17.
 */

public class PersianFont {
    private final static ArrayMap<Integer, Typeface> cache = new ArrayMap<>();

    public static final int IRAN_SANS_ULTRA_LIGHT = 1;
    public static final int IRANSANS_LIGHT = 2;
    public static final int IRANSANS_NORMAL = 3;
    public static final int IRANSANS_MEDIUM = 4;
    public static final int IRANSANS_BOLD = 5;

    public static final int YEKAN_REGULAR = 10;
    public static final int YEKAN_LIGHT = 11;
    public static final int YEKAN_BOLD = 12;


    ////////////////////////////////////
    @Retention(RetentionPolicy.SOURCE)
    @Documented
    @IntDef({IRAN_SANS_ULTRA_LIGHT, IRANSANS_LIGHT, IRANSANS_NORMAL, IRANSANS_MEDIUM, IRANSANS_BOLD
            , YEKAN_REGULAR, YEKAN_LIGHT, YEKAN_BOLD})
    public @interface FontEnum {
    }
    ////////////////////////////////////

    public static Typeface IRAN_SANS_ULTRA_LIGHT(Context context) {
        if (cache.containsKey(IRAN_SANS_ULTRA_LIGHT)) {
            cache.put(IRAN_SANS_ULTRA_LIGHT, Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_UltraLight.ttf"));
        }
        return cache.get(IRAN_SANS_ULTRA_LIGHT);
    }

    public static Typeface IRANSANS_LIGHT(Context context) {
        if (!cache.containsKey(IRANSANS_LIGHT)) {
            cache.put(IRANSANS_LIGHT, Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Light.ttf"));
        }
        return cache.get(IRANSANS_LIGHT);
    }

    public static Typeface IRANSANS_NORMAL(Context context) {
        if (!cache.containsKey(IRANSANS_NORMAL)) {
            cache.put(IRANSANS_NORMAL, Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile.ttf"));
        }
        return cache.get(IRANSANS_NORMAL);
    }

    public static Typeface IRANSANS_MEDIUM(Context context) {
        if (!cache.containsKey(IRANSANS_MEDIUM)) {
            cache.put(IRANSANS_MEDIUM, Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Medium.ttf"));
        }
        return cache.get(IRANSANS_MEDIUM);
    }

    public static Typeface IRANSANS_BOLD(Context context) {
        if (!cache.containsKey(IRANSANS_BOLD)) {
            cache.put(IRANSANS_BOLD, Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Bold.ttf"));
        }
        return cache.get(IRANSANS_BOLD);
    }

    public static Typeface YEKAN_REGULAR(Context context) {
        if (!cache.containsKey(YEKAN_REGULAR)) {
            cache.put(YEKAN_REGULAR, Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileRegular.ttf"));
        }
        return cache.get(YEKAN_REGULAR);
    }

    public static Typeface YEKAN_LIGHT(Context context) {
        if (!cache.containsKey(YEKAN_LIGHT)) {
            cache.put(YEKAN_LIGHT, Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileLight.ttf"));
        }
        return cache.get(YEKAN_LIGHT);
    }

    public static Typeface YEKAN_BOLD(Context context) {
        if (!cache.containsKey(YEKAN_BOLD)) {
            cache.put(YEKAN_BOLD, Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileBold.ttf"));
        }
        return cache.get(YEKAN_BOLD);
    }

    public static Typeface get(Context context, @FontEnum int type) {
        switch (type) {
            case IRAN_SANS_ULTRA_LIGHT:
                return IRAN_SANS_ULTRA_LIGHT(context);

            case IRANSANS_LIGHT:
                return IRANSANS_LIGHT(context);

            case IRANSANS_NORMAL:
                return IRANSANS_NORMAL(context);

            case IRANSANS_MEDIUM:
                return IRANSANS_MEDIUM(context);

            case IRANSANS_BOLD:
                return IRANSANS_BOLD(context);

            case YEKAN_REGULAR:
                return YEKAN_REGULAR(context);

            case YEKAN_LIGHT:
                return YEKAN_LIGHT(context);

            case YEKAN_BOLD:
                return YEKAN_BOLD(context);

            default:
                return IRANSANS_NORMAL(context);
        }
    }
}
