#Author: Rosa Quelal rquelal@espol.edu.ec

Feature: Get insurance premium value

  Scenario: Single Men
    Given Is a man 
    And Is 20 years old 
    And Is single
    When Calculate the premium
    Then Show the Insurance premium

  Scenario Outline: Married Women
    Given Is a woman 
    And Is <age> years old 
    And Is married
    When Calculate the premium
    Then Show the Insurance premium

  Examples: 
      | age  |
      |  25  |
      |  45  |
      |  70  |

