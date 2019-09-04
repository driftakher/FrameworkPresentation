Feature: eBay Project for Presentation
@mousehover
Scenario: Demonstrate login feature with mousehover feature
Given I can access the eBay page
When  I click on sign in
And I gave valid id
And I gave valid password
And I click on Sign In Button
And I mousehover to electronics to camera & photo
Then I can access camera & photo page

@dropdown
Scenario: Demonstrate login feature with dropdown feature
Given I can access the eBay page
When  I click on sign in
And I gave valid id
And I gave valid password
And I click on Sign In Button
And I click on dropdown manu SHOP BY CATEGORY
And I click on Computer & Tablets
Then I can access Computer & Tablets page