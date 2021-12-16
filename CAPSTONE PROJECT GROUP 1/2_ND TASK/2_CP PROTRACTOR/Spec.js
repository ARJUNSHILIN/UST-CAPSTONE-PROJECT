const { browser, element, By, by } = require("protractor");

describe('Should navigate to Demo Page', () => {

	browser.ignoreSynchronization=true;
	browser.get('https://www.urbanladder.com/');
	browser.sleep(2000)

	it('Url verification', () => {
		browser.getCurrentUrl().then((url) => {
			expect(url).toBe('https://www.urbanladder.com/');		
		});
		console.log("Url verification is Succesfull")
	});

	it('Login', () => {
		
		browser.actions().mouseMove(element(by.xpath("//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span"))).perform()
		browser.sleep(3000)
		element(By.linkText("Log In")).click()
		browser.sleep(7000); 
		browser.element(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input")).sendKeys("abc1111@gmail.com")
		browser.sleep(2000); 
		browser.element(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input")).sendKeys("Fk#mM!wGS9jvx4Z")
		browser.element(By.id("ul_site_login")).click()
		browser.sleep(5000); 
					
	});


	

	it('Module Heading verification', () => {

		browser.actions().click(element(by.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/span"))).perform()	
		var headng = browser.element(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/span"))
		expect(headng.getText()).toBe("Very Merry Sale")
		console.log("Module Heading verification is succesfull")
	});


	it('Module 1st Sub Heading verification', () => {

		browser.actions().click(element(by.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/span"))).perform()
		browser.actions().mouseMove(element(by.linkText('Living'))).perform()
		var subheadng1 =(element(by.linkText("Living")))
		expect(subheadng1.getText()).toBe("Living")
		console.log("Module 1st Sub Heading verification is succesfull")
		browser.sleep(3000)

		browser.actions().mouseMove(element(by.linkText('Fabric Sofas'))).perform()
		var ele1 =(element(by.linkText("Fabric Sofas")))
		expect(ele1.getText()).toBe("Fabric Sofas")
		console.log("Module 1st Sub Heading ele1 verification is succesfull")
		browser.sleep(3000)

		browser.actions().mouseMove(element(by.linkText('Living Storage'))).perform()
		var ele7 =(element(by.linkText("Living Storage")))
		expect(ele7.getText()).toBe("Living Storage")
		console.log("Module 7th Sub Heading ele1 verification is succesfull")
		browser.sleep(3000)
		
		
	});


	it('Module 3rd Sub Heading verification', () => {

		browser.actions().mouseMove(element(by.linkText('Others'))).perform()
		var subheadng3 =(element(by.linkText("Others")))
		expect(subheadng3.getText()).toBe("Others")
		console.log("Module 3rd Sub Heading verification is succesfull")
		browser.sleep(3000)

		browser.actions().mouseMove(element(by.linkText('Bedsheets'))).perform()
		var ele2 =(element(by.linkText("Bedsheets")))
		expect(ele2.getText()).toBe("Bedsheets")
		console.log("Module 3rd Sub Heading ele2 verification is succesfull")
		browser.sleep(3000)

		browser.actions().mouseMove(element(by.linkText('Curtains'))).perform()
		var ele5 =(element(by.linkText("Curtains")))
		expect(ele5.getText()).toBe("Curtains")
		console.log("Module 3rd Sub Heading ele5 verification is succesfull")
		browser.sleep(3000)
	
	});
	

	it('Navigate to 1st elemenent of 1st subheading Fabric sofas', async() => {

		browser.actions().mouseMove(element(by.linkText('Fabric Sofas'))).perform()
		element(by.linkText("Fabric Sofas")).click()
		console.log("Navigation to Fabric sofas is succesfull")
		
	
	});


	it('Navigate to checkbox and selecting first element', async() => {

		element(by.xpath("//*[@id='filters-form']/div[1]/div/div/ul/li[4]/div[1]/div")).click()
		browser.sleep(3000)
		element(by.id("filters_brand_name_By_Urban_Ladder")).click()
		browser.sleep(10000)	
	});


	
});

