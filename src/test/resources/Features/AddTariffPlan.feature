#Author: Naveenkumar15
Feature: AddTariffPlan feature

  @Addtariff
  Scenario: AddTariffPlan scenario
    Given The user is in AddTariffPlan page
    When The user Fill in the Tariff details
    And The user clicks the Tariffsubmit button
    Then The user should see the Tariffsuccess message
