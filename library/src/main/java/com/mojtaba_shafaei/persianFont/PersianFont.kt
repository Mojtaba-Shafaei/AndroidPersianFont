package com.mojtaba_shafaei.persianFont

import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_BLACK
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_BOLD
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_LIGHT
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_MEDIUM
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_NORMAL
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRAN_SANS_FA_NUM
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRAN_SANS_FA_NUM_BLACK
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRAN_SANS_FA_NUM_BOLD
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRAN_SANS_FA_NUM_LIGHT
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRAN_SANS_FA_NUM_MEDIUM
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRAN_SANS_FA_NUM_ULTRA_LIGHT
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRAN_SANS_ULTRA_LIGHT
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_BLACK
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_BOLD
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_EXTRA_BLACK
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_EXTRA_BOLD
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_LIGHT
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_MEDIUM
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_REGULAR
import com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_THIN

import android.content.Context
import android.graphics.Typeface

import java.util.HashMap

/**
 * Created by mojtaba on 8/22/17.
 */

object PersianFont {

    private val cache = HashMap<FontEnum, Typeface>()

    //<editor-fold desc="iran sans">
    fun IRAN_SANS_ULTRA_LIGHT(context: Context): Typeface {
        var lvTypeface = cache[IRAN_SANS_ULTRA_LIGHT]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile_UltraLight.ttf")
            cache[IRAN_SANS_ULTRA_LIGHT] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRANSANS_LIGHT(context: Context): Typeface {
        var lvTypeface = cache[IRANSANS_LIGHT]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile_Light.ttf")
            cache[IRANSANS_LIGHT] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRANSANS_NORMAL(context: Context): Typeface {
        var lvTypeface = cache[IRANSANS_NORMAL]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile.ttf")
            cache[IRANSANS_NORMAL] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRANSANS_MEDIUM(context: Context): Typeface {
        var lvTypeface = cache[IRANSANS_MEDIUM]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile_Medium.ttf")
            cache[IRANSANS_MEDIUM] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRANSANS_BOLD(context: Context): Typeface {
        var lvTypeface = cache[IRANSANS_BOLD]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile_Bold.ttf")
            cache[IRANSANS_BOLD] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRANSANS_BLACK(context: Context): Typeface {
        var lvTypeface = cache[IRANSANS_BLACK]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile_Black.ttf")
            cache[IRANSANS_BLACK] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }
    //</editor-fold>

    //<editor-fold desc="Fa num">
    fun IRAN_SANS_FA_NUM(context: Context): Typeface {
        var lvTypeface = cache[IRAN_SANS_FA_NUM]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile(FaNum).ttf")
            cache[IRAN_SANS_FA_NUM] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRAN_SANS_FA_NUM_BLACK(context: Context): Typeface {
        var lvTypeface = cache[IRAN_SANS_FA_NUM_BLACK]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile(FaNum)_Black.ttf")
            cache[IRAN_SANS_FA_NUM_BLACK] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRAN_SANS_FA_NUM_BOLD(context: Context): Typeface {
        var lvTypeface = cache[IRAN_SANS_FA_NUM_BOLD]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile(FaNum)_Bold.ttf")
            cache[IRAN_SANS_FA_NUM_BOLD] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRAN_SANS_FA_NUM_LIGHT(context: Context): Typeface {
        var lvTypeface = cache[IRAN_SANS_FA_NUM_LIGHT]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile(FaNum)_Light.ttf")
            cache[IRAN_SANS_FA_NUM_LIGHT] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRAN_SANS_FA_NUM_MEDIUM(context: Context): Typeface {
        var lvTypeface = cache[IRAN_SANS_FA_NUM_MEDIUM]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile(FaNum)_Medium.ttf")
            cache[IRAN_SANS_FA_NUM_MEDIUM] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun IRAN_SANS_FA_NUM_ULTRA_LIGHT(context: Context): Typeface {
        var lvTypeface = cache[IRAN_SANS_FA_NUM_ULTRA_LIGHT]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANSansMobile(FaNum)_UltraLight.ttf")
            cache[IRAN_SANS_FA_NUM_ULTRA_LIGHT] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }
    //</editor-fold>

    //<editor-fold desc="Yekan">
    fun YEKAN_REGULAR(context: Context): Typeface {
        var lvTypeface = cache[YEKAN_REGULAR]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANYekanMobileRegular.ttf")
            cache[YEKAN_REGULAR] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun YEKAN_LIGHT(context: Context): Typeface {
        var lvTypeface = cache[YEKAN_LIGHT]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANYekanMobileLight.ttf")
            cache[YEKAN_LIGHT] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun YEKAN_BOLD(context: Context): Typeface {
        var lvTypeface = cache[YEKAN_BOLD]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANYekanMobileBold.ttf")
            cache[YEKAN_BOLD] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun YEKAN_BLACK(context: Context): Typeface {
        var lvTypeface = cache[YEKAN_BLACK]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANYekanMobileBlack.ttf")
            cache[YEKAN_BLACK] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun YEKAN_EXTRA_BLACK(context: Context): Typeface {
        var lvTypeface = cache[YEKAN_EXTRA_BLACK]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANYekanMobileExtraBlack.ttf")
            cache[YEKAN_EXTRA_BLACK] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun YEKAN_EXTRA_BOLD(context: Context): Typeface {
        var lvTypeface = cache[YEKAN_EXTRA_BOLD]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANYekanMobileExtraBold.ttf")
            cache[YEKAN_EXTRA_BOLD] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun YEKAN_MEDIUM(context: Context): Typeface {
        var lvTypeface = cache[YEKAN_MEDIUM]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANYekanMobileMedium.ttf")
            cache[YEKAN_MEDIUM] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }

    fun YEKAN_THIN(context: Context): Typeface {
        var lvTypeface = cache[YEKAN_THIN]
        if (lvTypeface == null) {
            lvTypeface = Typeface.createFromAsset(context.assets, "fonts/" + "IRANYekanMobileThin.ttf")
            cache[YEKAN_THIN] = lvTypeface
            return lvTypeface
        }
        return lvTypeface
    }
    //</editor-fold>

    operator fun get(context: Context, type: FontEnum): Typeface {
        when (type) {
            IRAN_SANS_ULTRA_LIGHT -> return IRAN_SANS_ULTRA_LIGHT(context)

            IRANSANS_LIGHT -> return IRANSANS_LIGHT(context)

            IRANSANS_MEDIUM -> return IRANSANS_MEDIUM(context)

            IRANSANS_BOLD -> return IRANSANS_BOLD(context)

            IRANSANS_BLACK -> return IRANSANS_BLACK(context)

            YEKAN_REGULAR -> return YEKAN_REGULAR(context)

            YEKAN_LIGHT -> return YEKAN_LIGHT(context)

            YEKAN_BOLD -> return YEKAN_BOLD(context)

            YEKAN_BLACK -> return YEKAN_BLACK(context)

            YEKAN_EXTRA_BLACK -> return YEKAN_EXTRA_BLACK(context)

            YEKAN_EXTRA_BOLD -> return YEKAN_EXTRA_BOLD(context)

            YEKAN_MEDIUM -> return YEKAN_MEDIUM(context)

            YEKAN_THIN -> return YEKAN_THIN(context)

            IRANSANS_NORMAL -> return IRANSANS_NORMAL(context)
            else -> return IRANSANS_NORMAL(context)
        }
    }

    enum class FontEnum {
        IRAN_SANS_ULTRA_LIGHT, IRANSANS_LIGHT, IRANSANS_NORMAL, IRANSANS_MEDIUM, IRANSANS_BOLD, IRANSANS_BLACK, IRAN_SANS_FA_NUM, IRAN_SANS_FA_NUM_BLACK, IRAN_SANS_FA_NUM_BOLD, IRAN_SANS_FA_NUM_LIGHT, IRAN_SANS_FA_NUM_MEDIUM, IRAN_SANS_FA_NUM_ULTRA_LIGHT, YEKAN_REGULAR, YEKAN_LIGHT, YEKAN_BOLD, YEKAN_BLACK, YEKAN_EXTRA_BLACK, YEKAN_EXTRA_BOLD, YEKAN_MEDIUM, YEKAN_THIN
    }//
    //
}
