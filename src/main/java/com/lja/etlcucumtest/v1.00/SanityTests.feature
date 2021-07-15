# Author: LJA 
# Version: 1.00
# Comment:
# 17/2/2020 - created
#

@SanityTests
Feature: Sanity Tests

  Scenario: End of Run One test 1
    Given Run one has ended
    When All phone numbers are removed
    Then The Employee record id left is 11

 Scenario: End of run one test 2
    Given Run one has ended
    When One enters code 1234
    Then The door opens 

 # Scenario: End of Run one 
 #   Given Run one has eneded
 #   Then the incident table is empty

 

