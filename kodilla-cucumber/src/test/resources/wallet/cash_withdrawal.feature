Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Unsuccessful withdrawal more than wallet balance
    Given I have deposited $50 in my wallet
    When I request $100
    Then $0 should be dispensed
    And the balance of my wallet should be $50

  Scenario: Successful withdrawal of exactly the wallet balance
    Given I have deposited $100 in my wallet
    When I request $100
    Then $100 should be dispensed
    And the balance of my wallet should be $0

  Scenario: Withdrawal when the wallet is empty
    Given my wallet is empty
    When I request $50
    Then $0 should be dispensed
    And the balance of my wallet should be $0

  Scenario: Withdrawal of $0
    Given I have deposited $200 in my wallet
    When I request $0
    Then $0 should be dispensed
    And the balance of my wallet should be $200