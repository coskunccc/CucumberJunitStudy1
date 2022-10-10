Feature: Calculatin basic maths
  I shoul be ablte to do simple maths with two numbers

@addition
  Scenario Outline: Adding two numbers
    Given calculator is open
    When numbers <number1> and <number2> added
    Then result should be <result>

    Examples:
      | number1 | number2 | result |
      | 3       | 6       | 9      |
      | 4       | -5      | -1     |
      | 0       | 7       | 7      |

