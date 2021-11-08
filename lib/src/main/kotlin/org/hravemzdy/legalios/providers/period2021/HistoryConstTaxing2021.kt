﻿package org.hravemzdy.legalios.providers.period2021

import org.hravemzdy.legalios.providers.period2020.HistoryConstTaxing2020
import java.math.BigDecimal

// ALLOWANCE_PAYER                  Částka slevy na poplatníka
//
// ALLOWANCE_DISAB_1ST              Částka slevy na invaliditu 1.stupně poplatníka
//
// ALLOWANCE_DISAB_2ND              Částka slevy na invaliditu 2.stupně poplatníka
//
// ALLOWANCE_DISAB_3RD              Částka slevy na invaliditu 3.stupně poplatníka
//
// ALLOWANCE_STUDY                  Částka slevy na poplatníka studenta
//
// ALLOWANCE_CHILD_1ST              Částka slevy na dítě 1.pořadí
//
// ALLOWANCE_CHILD_2ND              Částka slevy na dítě 2.pořadí
//
// ALLOWANCE_CHILD_3RD              Částka slevy na dítě 3.pořadí
//
// FACTOR_ADVANCES                  Sazba daně na zálohový příjem
//
// FACTOR_WITHHOLD                  Sazba daně na srážkový příjem
//
// FACTOR_SOLITARY                  Sazba daně na solidární zvýšení
//
// MIN_AMOUNT_OF_TAXBONUS           Minimální částka pro daňový bonus
//
// MAX_AMOUNT_OF_TAXBONUS           Maximální částka pro daňový bonus
//
// MARGIN_INCOME_OF_TAXBONUS        Minimální výše příjmu pro nároku na daňový bonus
//
// MARGIN_INCOME_OF_ROUNDING        Maximální výše příjmu pro zaokrouhlování
//
// MARGIN_INCOME_OF_WITHHOLD        Maximální výše příjmu pro srážkový příjem
//
// MARGIN_INCOME_OF_SOLITARY        Minimální výše příjmu pro solidární zvýšení daně
//
// MARGIN_INCOME_OF_WHT_AGR         hranice příjmu pro srážkovou daň pro zaměstnace v pracovním poměru (nepodepsal prohlášení)
//
// MARGIN_INCOME_OF_WHT_EMP         hranice příjmu pro srážkovou daň pro zaměstnace na dohodu (nepodepsal prohlášení)

object HistoryConstTaxing2021 {
    const val VERSION_CODE:Int = 2021

    const val ALLOWANCE_PAYER:Int = 2320
    const val ALLOWANCE_DISAB_1ST:Int = HistoryConstTaxing2020.ALLOWANCE_DISAB_1ST
    const val ALLOWANCE_DISAB_2ND:Int = HistoryConstTaxing2020.ALLOWANCE_DISAB_2ND
    const val ALLOWANCE_DISAB_3RD:Int = HistoryConstTaxing2020.ALLOWANCE_DISAB_3RD
    const val ALLOWANCE_STUDY:Int = HistoryConstTaxing2020.ALLOWANCE_STUDY
    const val ALLOWANCE_CHILD_1ST:Int = HistoryConstTaxing2020.ALLOWANCE_CHILD_1ST
    const val ALLOWANCE_CHILD_2ND:Int = HistoryConstTaxing2020.ALLOWANCE_CHILD_2ND
    const val ALLOWANCE_CHILD_3RD:Int = HistoryConstTaxing2020.ALLOWANCE_CHILD_3RD
    const val SETTLEMENT_CHILD_2ND:Int = 1860
    const val SETTLEMENT_CHILD_3RD:Int = 2320
    val FACTOR_ADVANCES:BigDecimal = HistoryConstTaxing2020.FACTOR_ADVANCES
    val FACTOR_WITHHOLD:BigDecimal = HistoryConstTaxing2020.FACTOR_WITHHOLD
    val FACTOR_SOLITARY:BigDecimal = BigDecimal.ZERO
    const val MIN_AMOUNT_OF_TAXBONUS:Int = HistoryConstTaxing2020.MIN_AMOUNT_OF_TAXBONUS
    const val MAX_AMOUNT_OF_TAXBONUS:Int = HistoryConstTaxing2020.MAX_AMOUNT_OF_TAXBONUS
    const val MARGIN_INCOME_OF_TAXBONUS:Int = (HistoryConstSalary2021.MIN_MONTHLY_WAGE / 2)
    const val MARGIN_INCOME_OF_ROUNDING:Int = HistoryConstTaxing2020.MARGIN_INCOME_OF_ROUNDING
    const val MARGIN_INCOME_OF_WITHHOLD:Int = HistoryConstTaxing2020.MARGIN_INCOME_OF_WITHHOLD
    const val MARGIN_INCOME_OF_SOLITARY:Int = 0
    const val MARGIN_INCOME_OF_WHT_EMP:Int = 3500
    const val MARGIN_INCOME_OF_WHT_AGR:Int = HistoryConstTaxing2020.MARGIN_INCOME_OF_WHT_AGR
}
