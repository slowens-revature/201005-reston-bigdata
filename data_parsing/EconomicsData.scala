package data_parsing

case class EconomicsData(
                          name: String = null,
                          year: Int = 2000,
                          gdp_constPrices: Long = 0,
                          gdp_constPrices_delta: Double = 0,
                          gdp_currentPrices: Long = 0,
                          gdp_currentPrices_usd: Long = 0,
                          gdp_currentPrices_ppp: Long = 0,            //ppp = purchasing power parity
                          gdp_deflator: Int = 0,
                          gdp_perCap_constPrices: Long = 0,
                          gdp_perCap_constPrices_ppp: Double = 0,
                          gdp_perCap_currentPrices: Long = 0,
                          gdp_perCap_currentPrices_usd: Long = 0,
                          gdp_perCap_currentPrices_ppp: Double = 0,
                          output_gap_pGDP: Double = 0,
                          gdp_ppp_frac_of_total_world: Double = 0,
                          implied_ppp: Double = 0,                    //National Currency per current international dollar
                          total_investment: Double = 0,               //as percent of GDP
                          gross_national_savings: Double = 0,         //as percent of GDP
                          inflation_avgConsumerPrices: Double = 0,
                          inflation_avgConsumerPrices_delta: Double = 0,
                          inflation_eopConsumerPrices: Double = 0,
                          inflation_eopConsumerPrices_delta: Double = 0,
                          vol_imports_goods_and_services_delta: Double = 0,
                          vol_imports_goods_delta: Double = 0,
                          vol_exports_goods_and_services_delta: Double = 0,
                          vol_exports_goods_delta: Double = 0,
                          unemployment_rate: Double = 0,
                          employed_persons: Long = 0,
                          population: Long = 0,
                          government_revenue_currency: Long = 0,
                          government_revenue_percent: Double = 0,
                          government_total_expenditure_currency: Long = 0,
                          government_total_expenditure_percent: Double = 0,
                          government_net_lb_currency: Long = 0,
                          government_net_lb_percent: Double = 0,
                          government_structural_balance_currency: Long = 0,
                          government_structural_balance_percent_pGDP: Double = 0,
                          government_primary_net_lb_currency: Long = 0,
                          government_primary_net_lb_percent: Double = 0,
                          government_net_debt_currency: Long = 0,
                          government_net_debt_percent: Double = 0,
                          government_gross_debt_currency: Long = 0,
                          government_gross_debt_percent: Double = 0,
                          gdp_of_fiscal_year: Long = 0,
                          current_account_balance_usd: Long = 0,
                          current_account_balance_percentGDP: Double = 0
                        ) {}
