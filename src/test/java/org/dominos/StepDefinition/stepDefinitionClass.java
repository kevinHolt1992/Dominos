package org.dominos.StepDefinition;



import java.util.Iterator;

import org.dominos.base.Base;
import org.openqa.selenium.WebDriver;

import POM.POM;
import Runner.RunnerClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefinitionClass extends Base{
	public static WebDriver driver= RunnerClass.driver1;
	
	POM ob= new POM(driver);

	@Given("the user has to open dominos web page having internet connection")
	public void the_user_has_to_open_dominos_web_page_having_internet_connection() {
	    Url(driver,"https://www.dominos.co.in/");
	    maxi(driver);
	}

	@When("user click on our menu")
	public void user_click_on_our_menu() {
		click(ob.getHomePageOurMenu());
	    
	}

	@When("dominos menu page is visible")
	public void dominos_menu_page_is_visible() {
		click(ob.getOurMenuPageViewAll());
	
	}

	@Then("click on view all button over veg pizza")
	public void click_on_view_all_button_over_veg_pizza() throws InterruptedException {
		click(ob.getBtnHomePageOrderNow());
		Thread.sleep(5000);
		click(ob.getBtnDontAllow());
		Thread.sleep(5000);
		click(ob.getTxtsearchclk());
		Thread.sleep(5000);
		sendkeys(ob.getTxtSearch(), "600119");
		Thread.sleep(5000);
		click(ob.getBtselectLocation());
		Thread.sleep(5000);
	}

	@Given("the user is on dominos recomended page click on veg pizza menu")
	public void the_user_is_on_dominos_recomended_page_click_on_veg_pizza_menu() throws InterruptedException {
		click(ob.getTagVegPizza());
		Thread.sleep(6000);
		
	}

	@When("veg pizza options are avaliable go to margherita pizaa")
	public void veg_pizza_options_are_avaliable_go_to_margherita_pizaa() throws InterruptedException {
		scroolto(driver, ob.getBtnmarAddtocart());
		click(ob.getBtnmarAddtocart());
		Thread.sleep(7000);
		if(ob.getBtnoThanks().isDisplayed())
		{
		jsclick(ob.getBtnoThanks(), driver);
		
		}
		
		
	}

	@When("click add to cart and make two orders of marghrita")
	public void click_add_to_cart_and_make_two_orders_of_marghrita() throws InterruptedException {
		Thread.sleep(2000);
		click(ob.getBtnmarAdd());
		Thread.sleep(3000);
			
	}

	@When("go to veggi paradise pizaa and add two orders of veggi paradise")
	public void go_to_veggi_paradise_pizaa_and_add_two_orders_of_veggi_paradise() throws InterruptedException {
		click(ob.getBtnPaneerAddtocart());Thread.sleep(3000);
		click(ob.getBtnpaneerAdd());Thread.sleep(3000);
	}

	@Then("Click on beverages tab")
	public void click_on_beverages_tab() {
		click(ob.getTagBeverages()); 
	
	}

	@Given("the user comes to beverages tab")
	public void the_user_comes_to_beverages_tab() throws InterruptedException {
		
		Thread.sleep(5000);

	}

	@When("user selects pepsi 475ml")
	public void user_selects_pepsi_475ml() {
		click(ob.getBtpepsiAddToCart());
		
	
	}

	@When("click on add to cart and add twelve orders of pepsi")
	public void click_on_add_to_cart_and_add_twelve_orders_of_pepsi() {
	    
		for(int i =1;i<12;i++)
		{
			click(ob.getBtnPepsiAdd());
		}
	}

	@When("reduce orders to six orders on pepsi")
	public void reduce_orders_to_six_orders_on_pepsi() throws InterruptedException {
	   Thread.sleep(5000);
	   for(int i=12;i>6;i--)
	   {
		   click(ob.getBtnPepsiminus());
	   }
	   Thread.sleep(5000);
	}

	@Then("click on check out button and exit window")
	public void click_on_check_out_button_and_exit_window() throws InterruptedException {
	
		click(ob.getBtnCheckout());
		Thread.sleep(5000);
		driver.close();
	}
}
