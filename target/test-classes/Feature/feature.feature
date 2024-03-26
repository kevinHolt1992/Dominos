Feature: Automating dominos web page for placing order without loging in
Scenario: to open menu page in dominos
Given the user has to open dominos web page having internet connection  
When user click on our menu  
And dominos menu page is visible
Then click on view all button over veg pizza
@selenium
Scenario: To add pizaas to cart from veg pizza tab
Given the user is on dominos recomended page click on veg pizza menu
When veg pizza options are avaliable go to margherita pizaa
And click add to cart and make two orders of marghrita
And go to veggi paradise pizaa and add two orders of veggi paradise
Then Click on beverages tab
Scenario: To add beverages from beverages menu
Given the user comes to beverages tab 
When user selects pepsi 475ml 
And click on add to cart and add twelve orders of pepsi
And reduce orders to six orders on pepsi
Then click on check out button and exit window 
