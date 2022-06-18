#Author: rph.granger@gmail.com
#Keywords Summary : Sampingan
Feature: Sampingan

  Background:
    Given Iam using "Chrome" for my browser
    Given Iam on "https://sampingan.co.id/learn" Page

  Scenario: As a user, I want to search about "Kerja"
    Given Iam on learn page with title "Welcome to the Sampingan library"
    Then I type on search input form "Kerja"
    And I click search
    And I can see result of the search
