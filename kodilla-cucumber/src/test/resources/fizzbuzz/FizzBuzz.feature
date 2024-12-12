Feature: FizzBuzz game

  Scenario Outline: Determine the FizzBuzz result for a number
    Given a number <input>
    When I check the FizzBuzz result
    Then the result should be "<output>"

    Examples:
      | input | output     |
      | 3     | Fizz       |
      | 5     | Buzz       |
      | 15    | FizzBuzz   |
      | 6     | Fizz       |
      | 10    | Buzz       |
      | 30    | FizzBuzz   |
      | 7     | None       |
      | 1     | None       |