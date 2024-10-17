@Searchfunctionality

Feature: Search functionality

Background: 
Given user clicks on continue
    
Scenario Outline: User searches with a keyword
When user clicks on search icon
And user enters keyword "<Sheetname>" and rownumber <RowNumber>
And user clicks on Go
Then user is able to see information related to the keyword

Examples:

|Sheetname|RowNumber|
|SearchData|0|
