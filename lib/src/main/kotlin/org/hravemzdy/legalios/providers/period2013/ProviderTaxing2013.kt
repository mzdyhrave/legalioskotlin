package org.hravemzdy.legalios.providers.period2013

import org.hravemzdy.legalios.providers.ProviderBase
import org.hravemzdy.legalios.providers.IProviderTaxing
import org.hravemzdy.legalios.interfaces.IPropsTaxing
import org.hravemzdy.legalios.interfaces.IPeriod
import org.hravemzdy.legalios.props.PropsTaxing
import java.math.BigDecimal

class ProviderTaxing2013 : ProviderBase(HistoryConstTaxing2013.VERSION_CODE), IProviderTaxing {

    override fun getProps(period: IPeriod): IPropsTaxing {
        return PropsTaxing(
            version,
            allowancePayer(period),
            allowanceDisab1st(period),
            allowanceDisab2nd(period),
            allowanceDisab3rd(period),
            allowanceStudy(period),
            allowanceChild1st(period),
            allowanceChild2nd(period),
            allowanceChild3rd(period),
            factorAdvances(period),
            factorWithhold(period),
            factorSolitary(period),
            minAmountOfTaxBonus(period),
            maxAmountOfTaxBonus(period),
            marginIncomeOfTaxBonus(period),
            marginIncomeOfRounding(period),
            marginIncomeOfWithhold(period),
            marginIncomeOfSolitary(period),
            marginIncomeOfWthEmp(period),
            marginIncomeOfWthAgr(period))
    }

    override fun allowancePayer(period: IPeriod): Int {
        return HistoryConstTaxing2013.ALLOWANCE_PAYER
    }

    override fun allowanceDisab1st(period: IPeriod): Int {
        return HistoryConstTaxing2013.ALLOWANCE_DISAB_1ST
    }

    override fun allowanceDisab2nd(period: IPeriod): Int {
        return HistoryConstTaxing2013.ALLOWANCE_DISAB_2ND
    }

    override fun allowanceDisab3rd(period: IPeriod): Int {
        return HistoryConstTaxing2013.ALLOWANCE_DISAB_3RD
    }

    override fun allowanceStudy(period: IPeriod): Int {
        return HistoryConstTaxing2013.ALLOWANCE_STUDY
    }

    override fun allowanceChild1st(period: IPeriod): Int {
        return HistoryConstTaxing2013.ALLOWANCE_CHILD_1ST
    }

    override fun allowanceChild2nd(period: IPeriod): Int {
        return HistoryConstTaxing2013.ALLOWANCE_CHILD_2ND
    }

    override fun allowanceChild3rd(period: IPeriod): Int {
        return HistoryConstTaxing2013.ALLOWANCE_CHILD_3RD
    }

    override fun factorAdvances(period: IPeriod): BigDecimal {
        return HistoryConstTaxing2013.FACTOR_ADVANCES
    }

    override fun factorWithhold(period: IPeriod): BigDecimal {
        return HistoryConstTaxing2013.FACTOR_WITHHOLD
    }

    override fun factorSolitary(period: IPeriod): BigDecimal {
        return HistoryConstTaxing2013.FACTOR_SOLITARY
    }

    override fun minAmountOfTaxBonus(period: IPeriod): Int {
        return HistoryConstTaxing2013.MIN_AMOUNT_OF_TAXBONUS
    }

    override fun maxAmountOfTaxBonus(period: IPeriod): Int {
        return HistoryConstTaxing2013.MAX_AMOUNT_OF_TAXBONUS
    }

    override fun marginIncomeOfTaxBonus(period: IPeriod): Int {
        return HistoryConstTaxing2013.MARGIN_INCOME_OF_TAXBONUS
    }

    override fun marginIncomeOfRounding(period: IPeriod): Int {
        return HistoryConstTaxing2013.MARGIN_INCOME_OF_ROUNDING
    }

    override fun marginIncomeOfWithhold(period: IPeriod): Int {
        return HistoryConstTaxing2013.MARGIN_INCOME_OF_WITHHOLD
    }

    override fun marginIncomeOfSolitary(period: IPeriod): Int {
        return HistoryConstTaxing2013.MARGIN_INCOME_OF_SOLITARY
    }

    override fun marginIncomeOfWthEmp(period: IPeriod): Int {
        return HistoryConstTaxing2013.MARGIN_INCOME_OF_WHT_EMP
    }

    override fun marginIncomeOfWthAgr(period: IPeriod): Int {
        return HistoryConstTaxing2013.MARGIN_INCOME_OF_WHT_AGR
    }
}